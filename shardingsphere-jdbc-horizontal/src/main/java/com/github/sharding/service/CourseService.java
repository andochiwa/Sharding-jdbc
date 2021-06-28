package com.github.sharding.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.sharding.entity.Course;
import com.github.sharding.mapper.CourseMapper;
import org.springframework.stereotype.Service;

/**
 * @author HAN
 * @version 1.0
 * @since 06-28-23:11
 */
@Service
public class CourseService extends ServiceImpl<CourseMapper, Course> {
}
