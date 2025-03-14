package edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.model.Student;
import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student addNewStudent(Student student) {
        var newStudent = studentRepository.save(student);
        return newStudent;
    }

    @Override
    public List<Student> getAllStudents() {
        var students = studentRepository.findAllByOrderByFirstNameAsc();
        return students;
    }

    @Override
    public Student getStudentById(Long studentId) {
        var student = studentRepository.findById(studentId).orElse(null);
        return student;
    }

    @Override
    public Student updatetStudent(Student updateStudent) {

        return studentRepository.save(updateStudent);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);

    }

    @Override
    public List<Student> getByKeyword(String keyword) {
        return studentRepository.findByKeyword(keyword);
    }
}