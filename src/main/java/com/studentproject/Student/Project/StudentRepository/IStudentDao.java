package com.studentproject.Student.Project.StudentRepository;

import com.studentproject.Student.Project.StudentModel.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface IStudentDao extends JpaRepository<Student, Long> {


    //retrive list of students from the database
//    @Override
//    public List<Student> getAllStudents() {
//        return students;
//    }
//
//    @Override
//    public Student getStudent(int rollNo) {
//        return students.get(rollNo);
//    }
//
//    @Override
//    public void updateStudent(Student student) {
        //students.get(student.getId()).setName(student.getName());

//        try {
//            PreparedStatement stmt = con.prepareStatement("Update student set name = ? where rollno=?");
//
//            stmt.setString(1, student.getName());
//            stmt.setInt(2, student.getRollNo());
//            stmt.executeUpdate();
//            System.out.println("Record updated successfully");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println("Student: Roll No " + student.getRollNo() + ", updated in the database");
//    }

//    @Override
//    public void addStudent(Student student) {
//
//        try {
//            PreparedStatement stmt = con.prepareStatement("INSERT INTO student (id,name,rollno ) VALUES (?,?,?)");
//            stmt.setInt(1, student.getId());
//            stmt.setString(2, student.getName());
//            stmt.setInt(3, student.getRollNo());
//            stmt.executeUpdate();
//            System.out.println("Records inserted successfully");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void removeStudent(Student student) {
//
//        try {
//            PreparedStatement stmt = con.prepareStatement("delete from student where rollno= ?");
//            stmt.setInt(1, student.getRollNo());
//            stmt.executeUpdate();
//            System.out.println("Record deleted successfully");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void displayAllStudents() {
//        try {
//
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from student");
//            while (rs.next())
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
////        System.out.println("**** Student List ****");
////        for (Student student : this.students) {
////            System.out.println("The name is " + student.getName());
////            System.out.println("The id is " + student.getId());
////            System.out.println("The roll no is " + student.getRollNo());
////            System.out.println("-----------------------");
////        }
//    }
}