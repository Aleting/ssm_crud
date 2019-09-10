package com.ssmdemo.controller;



import com.ssmdemo.bean.Teacher;
import com.ssmdemo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @RequestMapping("/teacher")
    @ResponseBody
    public com.qut.bean.Msg getTeacher(){
        List<Teacher> teachers = teacherService.getTeacher();
        return com.qut.bean.Msg.success().add("teacher",teachers);
    }
}
