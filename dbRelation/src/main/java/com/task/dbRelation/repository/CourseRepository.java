package com.task.dbRelation.repository;

import com.task.dbRelation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.net.ContentHandler;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    ContentHandler findAll(Pageable firstPageWithThreeRecords);
}
