package com.ssmdemo.test;


import com.ssmdemo.bean.Student;
import com.ssmdemo.dao.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
   //TeacherMapper teacherMapper;
    StudentMapper studentMapper;
    @Test
    public void test(){
        System.out.print(studentMapper);
        for(int i = 1 ;i<101;i++){
            studentMapper.insertSelective(new Student(i,"张三"+i,"m","545",1));
        }

        //teacherMapper.insertSelective(new Teacher(3,"张三","m",new BigDecimal(5000)));
    }
}
