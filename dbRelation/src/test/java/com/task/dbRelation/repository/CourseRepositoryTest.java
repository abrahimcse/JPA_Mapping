package com.task.dbRelation.repository;

import com.task.dbRelation.entity.Course;
import com.task.dbRelation.entity.Student;
import com.task.dbRelation.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.util.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourse(){
        List<Course> courses= courseRepository.findAll();
        System.out.println("course = " +courses);
    }
    public void saveCourseWithTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Niloy")
                .lastName("Ahmed")
                .build();
        Course course=Course.builder()
                .title("Python")
                .credit(9)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }

    @Test
    public void saveCourseWithStudentTeacher(){
        Teacher teacher=Teacher.builder()
                .firstName("Raju")
                .lastName("Ahmed")
                .build();

        Student student=Student.builder()
                .firstName("Abbas")
                .lastName("Uddin")
                .emailId("abbas@gmail.com")
                .build();

        Course course=Course.builder()
                .title("Machine Learning")
                .credit(7)
                .teacher(teacher)
                .build();
        course.addStudents(student);

        courseRepository.save(course);
    }


}