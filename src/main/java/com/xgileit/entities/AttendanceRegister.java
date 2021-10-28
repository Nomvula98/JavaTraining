package com.xgileit.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="Attendance_Register")
public class AttendanceRegister implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registerId;
    @Column(name= "student_name")
    private String studentName;
    @Column(name= "student_surname")
    private String studentSurname;
    @Column(name= "student_id")
    private Long studentId;
    @Column(name= "teacher_name")
    private String teacherName;
    @Column(name= "teacher_surname")
    private String teacherSurname;
    @Column(name= "teacher_id")
    private Long teacherId;
    private Date date;

    public AttendanceRegister() {
    }

    public Long getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Long registerId) {
        this.registerId = registerId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }

    public void setTeacherSurname(String teacherSurname) {
        this.teacherSurname = teacherSurname;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttendanceRegister that = (AttendanceRegister) o;
        return Objects.equals(registerId, that.registerId) && Objects.equals(studentName, that.studentName) && Objects.equals(studentSurname, that.studentSurname) && Objects.equals(studentId, that.studentId) && Objects.equals(teacherName, that.teacherName) && Objects.equals(teacherSurname, that.teacherSurname) && Objects.equals(teacherId, that.teacherId) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registerId, studentName, studentSurname, studentId, teacherName, teacherSurname, teacherId, date);
    }

    @Override
    public String toString() {
        return "AttendanceRegister{" +
                "registerId=" + registerId +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentId=" + studentId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSurname='" + teacherSurname + '\'' +
                ", teacherId=" + teacherId +
                ", date=" + date +
                '}';
    }
}
