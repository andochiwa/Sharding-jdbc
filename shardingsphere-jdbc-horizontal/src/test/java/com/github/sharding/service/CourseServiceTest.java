package com.github.sharding.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.sharding.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * @author HAN
 * @version 1.0
 * @create 06-28-21:56
 */
@SpringBootTest
class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    void save() {
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Course course = new Course(null, "java", 100L + i, "normal");
            courses.add(course);
        }
        courseService.saveBatch(courses);
    }

    @Test
    void get() {
        QueryWrapper<Course> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1409515407451475969L);
        System.out.println(courseService.getOne(wrapper));
        wrapper.clear();
        wrapper.eq("id", 1409515409145974786L);
        System.out.println(courseService.getOne(wrapper));

    }
}
