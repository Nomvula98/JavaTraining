package com.xgileit.repositories;

import com.xgileit.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    List<Teacher> findByTeachersId(Long teacherId);
}
