package com.studentproject.Student.Project.StudentController;


import com.studentproject.Student.Project.StudentModel.Student;
import com.studentproject.Student.Project.StudentService.IStudentService;


import com.studentproject.Student.Project.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static com.studentproject.Student.Project.StudentService.StudentService.*;


@Controller
public class StudentController {

    private IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/")
    public ModelAndView index() {

        return new ModelAndView("index");
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView list(Student student){
        List<Student> studentList = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentList", studentList);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/new")
    public String showNewStudentPage(Model model) {
        Student student1 = new Student();
        model.addAttribute("student",student1);

        return "new_student";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("student") Student student) {
        studentService.save(student);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{id}")
    public String deleteProduct(@PathVariable(name = "id") long id) {

        studentService.delete(id);
        return "redirect:/index";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") long id) {
        ModelAndView mav = new ModelAndView("edit_student");
        Student student = studentService.get(id);
        mav.addObject("student", student);

        return mav;
    }



}
