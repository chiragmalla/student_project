package com.studentproject.Student.Project.StudentService;

import com.studentproject.Student.Project.StudentModel.Student;

import java.util.List;

public interface IStudentService {
      void save(Student student);
//    void removeStudent(Student student);
//    void updateStudent(Student student);
//    void displayAllStudents();
    public void delete(long id);
    public Student get(long id);
    List<Student> findAll();

}
