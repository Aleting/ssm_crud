package com.ssmdemo.service;

import com.ssmdemo.bean.Teacher;
import com.ssmdemo.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    public List<Teacher> getTeacher(){
        return teacherMapper.selectByExample(null);
    }
}
