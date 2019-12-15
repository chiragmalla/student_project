package com.studentproject.Student.Project.StudentModel;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private long rollNo;

    public Student(long id, String name, long rollNo){
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Student(long rollNo){
        this.rollNo = rollNo;
    }

    public Student(String name, long rollNo){

        this.name = name;
        this.rollNo = rollNo;
    }

    public Student() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {

        this.rollNo = rollNo;
    }
}