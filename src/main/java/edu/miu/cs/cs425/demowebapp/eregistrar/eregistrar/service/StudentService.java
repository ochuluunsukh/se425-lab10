package edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.service;

import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.model.Student;

import java.util.List;

public interface StudentService {
    public abstract Student addNewStudent(Student student);

    public abstract List<Student> getAllStudents();

    public abstract Student getStudentById(Long studentId);

    Student updatetStudent(Student updateStudent);

    void deleteStudentById(Long studentId);

    public abstract List<Student> getByKeyword(String keyword);
}
