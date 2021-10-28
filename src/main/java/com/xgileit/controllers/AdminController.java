package com.xgileit.controllers;

import com.xgileit.entities.Student;
import com.xgileit.entities.Subject;
import com.xgileit.services.StudentService;
import com.xgileit.services.SubjectService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Controller for admin to perform CRUD operation for student, subject and
 **/
@RestController
@RequestMapping(value = "/api/v1/admin")
public class AdminController {
    StudentService studentService = new StudentService();
    SubjectService subjectService= new SubjectService();
    List<Student> studentList = new ArrayList<>();
    List<Subject> subjectList = new ArrayList<>();

    /**
     * End-point for Submitting student details to be stored in database
     * @param student represents the student details
     * @return a string confirming successful submission or not
     **/
    @PostMapping("/student/submitStudentDetails")
    public String submitDetails(@RequestBody Student student){
        return studentService.submitStudentDetails(student);
    }

    /**
     * End-point for Retrieving all students details that are stored in database
     * @return a List of students
     **/
    @GetMapping("/student/retrieveAllStudents")
    public List<Student> retrieveAllStudentsDetails(){
        studentList = studentService.retrieveAllStudents();
        return studentList;
    }
    @GetMapping("/student/retrieveStudents")
    public String retrieveStudent(){

        return "sUCCESSFUL";
    }

    /**
     * End-point for Updating student details of the corresponding id passed in URL
     * @param studentId identifies the student details to be updated
     * @param student represents the updated student's details to save
     * @return a String confirming successful update
     **/
    @PutMapping("/student/update/{studentId}")
    public String updateDetails(@PathVariable Long studentId, @RequestBody Student student){

        return studentService.updateStudentDetails(studentId, student);
    }

    /**
     * End-point for Deleting student details of the corresponding id passed in URL
     * @param studentId identifies the student details to be deleted
     * @return a String confirming successful delete
     **/
    @DeleteMapping("/student/delete/{studentId}")
    public String deleteDetails(@PathVariable Long studentId){
        return studentService.deleteStudent(studentId);
    }

    /**
     * End-point for registering a subject and store in database
     * @param subject represents the subject details
     * @return a string confirming successful submission or not
     **/
    @PostMapping("/subject/registerSubject")
    public String registerSubject(@RequestBody Subject subject){
        return subjectService.registerSubject(subject);
    }

    /**
     * End-point for Retrieving all subjects that are stored in database
     * @return a List of subjects
     **/
    @GetMapping("/subject/retrieveAllSubjects")
    public List<Subject> retrieveAllSubjects(){
        subjectList = subjectService.retrieveAllSubjects();
        return subjectList;
    }

    /**
     * End-point for Updating subject details of the corresponding code passed in URL
     * @param subjectCode identifies the subject details to be updated
     * @param subject represents subject details
     * @return a String confirming successful update
     **/
    @PutMapping("/subject/update/{subjectCode}")
    public String updateSubjectDetails(@PathVariable Long subjectCode, @RequestBody Subject subject){
        return subjectService.updateSubjectInfo(subjectCode, subject);
    }

    /**
     * End-point for Deleting subject of the corresponding code passed in URL
     * @param subjectCode identifies the subject details to be deleted
     * @return a String confirming successful delete
     **/
    @DeleteMapping("/subject/delete/{subjectCode}")
    public String deleteSubject(@PathVariable Long subjectCode){
        return "deleted";
    }
}
