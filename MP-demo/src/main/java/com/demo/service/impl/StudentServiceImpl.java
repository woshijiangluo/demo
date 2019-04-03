package com.demo.service.impl;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.demo.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jiangluo
 * @since 2019-04-02
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
