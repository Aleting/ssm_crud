package com.ssmdemo.service;

import com.ssmdemo.bean.Student;
import com.ssmdemo.bean.StudentExample;
import com.ssmdemo.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public List<Student> getStudentAll(){
        return studentMapper.selectByExampleWithTeacher(null);
    }

    public void saveStu(Student student){
        studentMapper.insertSelective(student);
    }

    public boolean checkUser(String stName){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        criteria.andStNameEqualTo(stName);
        long count = studentMapper.countByExample(example);
        return count==0;
    }

    public Student getStu(Integer id){
        return studentMapper.selectByPrimaryKey(id);
    }
    public void updateStu(Student student){
        studentMapper.updateByPrimaryKeySelective(student);
    }
    public void deleteStu(Integer id){
        studentMapper.deleteByPrimaryKey(id);
    }
    public void deleteBatch(List<Integer> ids){
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        //会遍历数组中的值
        criteria.andStIdIn(ids);
        studentMapper.deleteByExample(example);
    }
}
