package com.task.dbRelation.repository;

import com.task.dbRelation.entity.Course;
import com.task.dbRelation.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course courseJAVA= Course.builder()
                .title("JAVA")
                .credit(6)
                .build();
        Course courseDB= Course.builder()
                .title("Database")
                .credit(5)
                .build();
        Course coursePHP= Course.builder()
                .title("PHP")
                .credit(4)
                .build();


        Teacher teacher= Teacher.builder()
                .firstName("Amdadul")
                .lastName("Amin")
       //         .courses(List.of(courseJAVA,courseDB,coursePHP))
                .build();

        teacherRepository.save(teacher);
    }
}