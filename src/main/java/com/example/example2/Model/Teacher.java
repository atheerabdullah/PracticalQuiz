package com.example.example2.Model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {


    @NotNull(message = "Teacher id should not null")
    private int teacherId;

    @NotEmpty(message = "Teacher name should not null ")
    private String teacherName;

    @NotNull(message = "= salary should not null")
    @Positive
    private int salary;


}
