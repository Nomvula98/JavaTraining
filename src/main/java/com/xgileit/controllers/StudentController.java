package com.xgileit.controllers;

import com.xgileit.entities.Student;
import com.xgileit.services.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {
StudentService studentService = new StudentService();
    /**
     * End-point for de-registering a student with id pass in url
     * @param studentId identifies the student details to be deregistered
     * @return a String confirming successful delete
     **/
    @DeleteMapping("/deregister/{id}")
    public String deregistration(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }
}
