package com.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@MapperScan("com.demo.mapper")
@SpringBootTest
public class MPTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void insertTest() {
        Student student = new Student();
        student.setId(1212);
        student.setStuName("蒋罗2");
        student.setStuNumber("134513");
        student.setAge(26);
        Integer inset1 = studentMapper.insert(student);
        System.out.println(student.getId());
    }

    @Test
    public void updateTest() {
        Student student = new Student();
        student.setId(1212);
        student.setStuName("蒋罗2222");
        Integer update1 = studentMapper.updateById(student);
        System.out.println(update1);
    }

    @Test
    public void selectTest() {
        Student student = studentMapper.selectById(1001);
        System.out.println(student.getStuName());
    }

    @Test
    public void deleteTest() {
        Integer delete1 = studentMapper.deleteById(1212);
        System.out.println(delete1);
    }

    @Test
    public void testWrapper() {
      /*  EntityWrapper<Student> qureyWrapper = new EntityWrapper<>();
        qureyWrapper.eq("id", "1001");
        System.out.println(qureyWrapper);*/

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", "1002");
        System.out.println(queryWrapper.getSqlSegment());

    }
}
