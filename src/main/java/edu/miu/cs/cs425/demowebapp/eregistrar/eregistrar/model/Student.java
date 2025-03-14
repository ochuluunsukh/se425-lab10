package edu.miu.cs.cs425.demowebapp.eregistrar.eregistrar.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private Long studentId;

    @NotBlank(message = "Student Number cannot be null or empty or blank spaces")
    // @Column(name = "student_number", unique = true, nullable = false)
    private String studentNumber;

    @NotBlank(message = "First Name cannot be null or empty or blank spaces")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last Name cannot be null or empty or blank spaces")
    private String lastName;

    private double cgpa;

    @NotNull(message = "Enrollment Date cannot be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEnrollment;

    @NotNull(message = "is International cannot be null")
    private boolean isInternational;

    public Student() {
    }

    public Student(String studentNumber, String firstName, String middleName,
                   String lastName, double cgpa, LocalDate dateOfEnrollment, boolean isInternational) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
        this.isInternational = isInternational;
    }

    public boolean isIsInternational() {
        return isInternational;
    }

    /**
     * @param isInternational the isInternational to set
     */
    public void setIsInternational(boolean isInternational) {
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return studentId;
    }

    @NotNull(message = "is International cannot be null")
    public boolean isInternational() {
        return isInternational;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setInternational(@NotNull(message = "is International cannot be null") boolean international) {
        isInternational = international;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                '}';
    }
}