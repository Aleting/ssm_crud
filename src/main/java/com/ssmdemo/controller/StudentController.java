package com.ssmdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.ssmdemo.bean.Student;
import com.ssmdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;


    //删除员工,单个批量二合一
    //单个删除：1   批量删除：1-2-3
    @RequestMapping(value = "/stu/{ids}",method = RequestMethod.DELETE)
    @ResponseBody
    public com.qut.bean.Msg deleteStuById(@PathVariable("ids")String ids){
        if(ids.contains("-")){
            List<Integer> del_ids = new ArrayList<>();
            String[]  str_ids = ids.split("-");
            for (String string:str_ids){
                del_ids.add(Integer.parseInt(string));
            }
            studentService.deleteBatch(del_ids);
        }else {
            studentService.deleteStu(Integer.parseInt(ids));

        }
        return com.qut.bean.Msg.success();
    }

    //修改员工
    @RequestMapping(value = "/stu/{stId}",method = RequestMethod.PUT)
    @ResponseBody
    public com.qut.bean.Msg saveStu(Student student){
        studentService.updateStu(student);
        return com.qut.bean.Msg.success();
    }

    //@PathVariable在路径中取值
    @RequestMapping(value = "/stu/{id}",method = RequestMethod.GET)
    @ResponseBody
    public com.qut.bean.Msg getStu(@PathVariable("id") Integer id){
        Student student = studentService.getStu(id);
        return com.qut.bean.Msg.success().add("stu",student);

    }

    @RequestMapping("/checkUser")
    @ResponseBody
    public com.qut.bean.Msg checkuser(@RequestParam("stName") String stName){
        String regx = "(^[a-z0-9_-]{3,16}$)|(^[\\u2E80-\\u9FFF]{2,5})";
        if(!stName.matches(regx)){
            return com.qut.bean.Msg.fail().add("va_msg","必须是3-16位字母数字组合,或者2-5位汉字");
        }
        boolean b = studentService.checkUser(stName);
        if(b){
            return com.qut.bean.Msg.success();
        }else {
            return com.qut.bean.Msg.fail().add("va_msg","用户名已被注册");
        }
    }
    /*
    * @Valid是使用JSR303数据校验用的注解，校验返回的结果在result中
    * */
    @RequestMapping(value = "/student",method = RequestMethod.POST)
    @ResponseBody
    public com.qut.bean.Msg saveStu(@Valid Student student, BindingResult result){
        if (result.hasErrors()){
            Map<String,Object> map = new HashMap<>();
            //校验失败，应该返回失败，在模态框中显示
            List<FieldError> errors = result.getFieldErrors();
            for (FieldError fieldError : errors){
                System.out.println("错误的字段名："+fieldError.getField());
                System.out.println("错误信息："+fieldError.getDefaultMessage());
                map.put(fieldError.getField(),fieldError.getDefaultMessage());
            }
            return com.qut.bean.Msg.fail().add("errorfields",map);
        }else {
            studentService.saveStu(student);
            return com.qut.bean.Msg.success();
        }
    }
    /**
     * @RequestMapping正常工作需要导入jackson包
     * @param pn
     * @return
     */
    @RequestMapping("/stu")
    @ResponseBody
    public com.qut.bean.Msg getStudentJson(@RequestParam(value = "pn",defaultValue = "1") Integer pn){
        //引入PageHelper插件,传入页码，以及每页大小
        PageHelper.startPage(pn,5);
        List<Student> students = studentService.getStudentAll();
        //对结果进行封装,参数为封装的数组以及显示的页数
        PageInfo page = new PageInfo(students,5);
        return com.qut.bean.Msg.success().add("pageInfo",page);
    }

    //@RequestMapping("/stu")
    public String getStudent(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        //引入PageHelper插件,传入页码，以及每页大小
        PageHelper.startPage(pn,5);
        List<Student> students = studentService.getStudentAll();
        //对结果进行封装,参数为封装的数组以及显示的页数
        PageInfo page = new PageInfo(students,5);
        model.addAttribute("pageInfo",page);
        return "list";
    }
}
