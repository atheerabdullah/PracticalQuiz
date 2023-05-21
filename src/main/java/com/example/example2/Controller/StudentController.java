package com.example.example2.Controller;


import com.example.example2.Model.Student;
import com.example.example2.Service.StudentService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class StudentController {

    // Endpoint to retrieve all students
    @GetMapping("/all-students")
    public List<Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    // Endpoint to retrieve a student by ID
    @GetMapping("/{id}/getAll-student")
    public Student getStudentById(@PathVariable int id) {
        return StudentService.getStudentById(id);
    }

    // Endpoint to create a new student
    @PostMapping("/createStudent")
    public String createStudent(@RequestParam String name, @RequestParam int age, @RequestParam String major) {
        try {
            StudentService.createStudent(name, age, major);
            return "Student created successfully";
        } catch (Exception e) {
            // Handle error
            return "Error creating student: " + e.getMessage();
        }
    }

    // Endpoint to update a student by ID
    @PutMapping("/{id}/update-student-by-ID")
    public String updateStudent(@PathVariable int id, @RequestParam String name, @RequestParam int age, @RequestParam String major) {
        try {
            StudentService.updateStudent(id, name, age, major);
            return "Student updated successfully";
        } catch (Exception e) {
            // Handle error
            return "Error updating student: " + e.getMessage();
        }
    }

    // Endpoint to delete a student by ID
    @DeleteMapping("/{id}/delete-student-by-ID")
    public String deleteStudent(@PathVariable int id) {
        try {
            StudentService.deleteStudent(id);
            return "Student deleted successfully";
        } catch (Exception e) {
            // Handle error
            return "Error deleting student: " + e.getMessage();
        }
    }


}
