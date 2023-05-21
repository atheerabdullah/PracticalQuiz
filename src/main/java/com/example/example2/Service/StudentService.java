package com.example.example2.Service;

import com.example.example2.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private static final List<Student> students = new ArrayList<>();

    public static List<Student> getAllStudents() {
        return students;
    }

    // Define a function to get the next available ID for a new student
    private static int getNextId() {
        return students.size() + 1;
    }

    public static void createStudent(String name, int age, String major) {
        int id = getNextId();
        Student student = new Student(id, name, age, major);
        students.add(student);
    }

    // Define a function to retrieve a student by ID
    public static Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    // Define a function to update a student by ID
    public static void updateStudent(int id, String name, int age, String major) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setStudentName(name);
            student.setStudentAge(age);
            student.setStudentMajor(major);
        } else {
            throw new IllegalArgumentException("Student not found with ID: " + id);
        }
    }

    // Define a function to delete a student by ID
    public static void deleteStudent(int id) {
        Student student = getStudentById(id);
        if (student != null) {
            students.remove(student);
        } else {
            throw new IllegalArgumentException("Student not found with ID: " + id);
        }
    }

}

