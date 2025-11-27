package com.example.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jpa.entity.student;

@SpringBootTest
public class StudentRepositoryTest {

  private StudentRepository studentRepository;

  @Test
  public void insertTest() {
    student student1 = student.builder()
    .name("김희선")
    .addr("부산")
    .gender("null")
        .build();

    studentRepository.save(student1);
    // delete from ~ 호출
    // studentRepository.delete(student);
    // studentRepository.deleteById(student);

    // select * from where id = 1;
    //
  }
}
