package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @PostMapping("/save")
    public Student create(@RequestBody Student student) {
        return service.save(student);
    }

    @GetMapping("/all")
    public List<Student> findAll() {
        return service.findAll();
    }

    @GetMapping("/id")
    public Student findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @PutMapping("/update")
    public Student update(@RequestParam Long id, @RequestBody Student student) {
        return service.update(id, student);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Long id) {
        service.delete(id);
    }
}