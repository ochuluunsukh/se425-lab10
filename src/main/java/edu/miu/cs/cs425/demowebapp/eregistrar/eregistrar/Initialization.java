package edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar;

import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.model.Student;
import edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Initialization implements CommandLineRunner {
    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Initializing data...");

        Student student1 = new Student("000-61-0001", "Anna", "Smith", "Smith",
                        3.78, LocalDate.parse("2019-05-12"), false);

        Student student2 = new Student("000-61-8672", "Od-Erdene", "", "Chuluunsukh",
                        3.8, LocalDate.parse("2024-08-12"), true);
        Student student3 = new Student("000-61-8672", "Sara", "", "West",
                3.8, LocalDate.parse("2024-08-12"), true);
        Student student4 = new Student("000-61-8672", "Johnny", "", "Depp",
                3.8, LocalDate.parse("2024-08-12"), true);
        studentService.addNewStudent(student1);
        studentService.addNewStudent(student2);
        studentService.addNewStudent(student3);
        studentService.addNewStudent(student4);
        System.out.println("Ready to use...");
    }
}
