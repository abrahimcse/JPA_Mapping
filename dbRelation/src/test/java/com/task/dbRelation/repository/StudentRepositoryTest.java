package com.task.dbRelation.repository;


import com.task.dbRelation.entity.Guardian;
import com.task.dbRelation.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("abrahim@gmail.com")
                .firstName("Abdur Rahim")
                .lastName("Akash")
//                .guardianName("Sultan Ahmmad")
//                .guardianEmail("sultan@gmail.com")
//                .guardianMobile("90999999998")
                .build();

        studentRepository.save(student);
    }


    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian= Guardian.builder()
                .email("sultan1@gmail.com")
                .name("Sultan Ahmmad")
                .mobile("90999999998")
                .build();

        Student student = Student.builder()

                .firstName("Akash")
                .emailId("akash1@gmail.com")
                .lastName("Rahi")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }


   @Test
    public void printAllStudent(){
        List <Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students= studentRepository.findByFirstName("Akash");

        System.out.println("Students = " + students);
    }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students= studentRepository.findByFirstName("Ak");

        System.out.println("Students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students= studentRepository.findByGuardianName("Sultan");

        System.out.println("Students = " + students);
    }

    @Test
    public void printStudentByEmailAddress(){

        Student student= studentRepository.getStudentByEmailAddress("akash1@gmail.com");
        System.out.println("student = " + student);

    }
    @Test
    public void printStudentFirstNameByEmailAddress(){

        String firstName = studentRepository.getStudentFirstNameByEmailAddress("abrahim@gmail.com");
        System.out.println("firstName = " + firstName);

    }
    @Test
    public void printStudentByEmailAddressNative(){
        Student student= studentRepository.getStudentByEmailAddressNative("akash1@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printStudentByEmailAddressNativeNamedPara(){
        Student student= studentRepository.getStudentByEmailAddressNativeNamedPara("akash1@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest(){
       studentRepository.updateStudentNameByEmailId("A.R.Akash","akash1@gmail.com");
    }

}