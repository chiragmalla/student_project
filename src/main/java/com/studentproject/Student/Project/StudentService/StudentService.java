package com.studentproject.Student.Project.StudentService;

import com.studentproject.Student.Project.StudentModel.Student;
import com.studentproject.Student.Project.StudentRepository.IStudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {
    private IStudentDao studentDao;

    @Autowired
    public StudentService(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }



//    @Override
//    public void removeStudent(Student student) {
//        this.studentDao.removeStudent(student);
//    }
//
//    @Override
//    public void displayAllStudents() {
//        this.studentDao.displayAllStudents();
//    }
//
//    @Override
//    public void updateStudent(Student student) {
//        this.studentDao.updateStudent(student);
//    }


    @Override
    public List<Student> findAll() {
        return this.studentDao.findAll();
    }

    @Override
    public void save(Student student) {
        studentDao.save(student);
    }

    public void delete(long id) {
        studentDao.deleteById(id);
    }
    public Student get(long id) {
        return studentDao.findById(id).get();
    }

}
