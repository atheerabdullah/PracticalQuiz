package com.example.example2.Model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    @NotNull(message = "Student id should not null")
    private int studentId;

    @NotEmpty(message = "= Student name should not null ")
    private String studentName;


    @NotNull(message = "= Age name should not null ")
    @Positive
    private int studentAge;

    @NotEmpty(message = "= Major name should not null ")
    private String studentMajor;


}
