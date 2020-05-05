package io.dowlath.searchpagination.repository;

import io.dowlath.searchpagination.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {

    // This method for without pagination
    // @Query("select s from Student s where name like %?1%")
    // List<Student> findByName(String name);

    // This method for with pagination
    @Query("select s from Student s where name like %?1%")
    Page<Student> findByName(String name, Pageable pageable);
}
