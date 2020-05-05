package io.dowlath.searchpagination.controller;

import io.dowlath.searchpagination.entity.Student;
import io.dowlath.searchpagination.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class StudentController {
    private final StudentRepository repository;

    // without page request and request like -> http://localhost:8080/students?name=Do
    /*

    @GetMapping("/students")
    public List<Student> findAll(@RequestParam Optional<String> name){
        return repository.findByName(name.orElse("_"));
    }

    */


    // page request like : http://localhost:8080/students?page=0
    // http://localhost:8080/students?page=1
    /*
    @GetMapping("/students")
    public Page<Student> findAll(@RequestParam Optional<String> name,
                                 @RequestParam Optional<Integer> page){
        return repository.findByName(name.orElse("_"),PageRequest.of(page.orElse(0),5));
    }
     */

    // sortBy
    // page request like : http://localhost:8080/students?page=0&name=Do
    @GetMapping("/students")
    public Page<Student> findAll(@RequestParam Optional<String> name,
                                 @RequestParam Optional<Integer> page,
                                 @RequestParam Optional<String> sortBy){
        return repository.findByName(name.orElse("_"),
                 PageRequest.of(page.orElse(0),5,
                 Sort.Direction.ASC,sortBy.orElse("id")));
    }

}
