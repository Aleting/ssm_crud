package com.ssmdemo.dao;

import com.ssmdemo.bean.Student;
import com.ssmdemo.bean.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stId);

    //新定义的联合查询

    List<Student> selectByExampleWithTeacher(StudentExample example);

    Student selectByPrimaryKeyWithTeacher(Integer stId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}