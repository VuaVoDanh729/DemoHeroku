package com.codelearn.demo.controller;


import com.codelearn.demo.entity.Student;
import com.codelearn.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

    // Open Student Management View
    @RequestMapping(value = "")
    public String getListStudent(Model model) {
        ArrayList<Student> student_list = studentService.getStudentList();
        model.addAttribute("student_list", student_list);
        return "home";
    }

    // Open Create Student View
    @RequestMapping(value = "/new")
    public String newStudentPage(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "newStudent";
    }

    // Add student to Arraylist
    @RequestMapping(value = "/add")
    public String addStudent(@ModelAttribute("student") Student student, Model model) {
        studentService.addStudent(student);
        model.addAttribute("message","Add successfull");
        return "newStudent";
    }

    //Open UpdateStudent View
    @RequestMapping(value = "/update/{id}")
    public String openUpdateStudent(@PathVariable("id") int id, Model model) {
        Student student = studentService.getStudentByID(id);
        model.addAttribute("student",student);
        model.addAttribute("message","");
        return "Update";
    }

    // Update Student in Arraylist
    @RequestMapping(value = "/update-student")
    public String updateStudent(Model model, Student student){
        Student student_updated = studentService.updateStudent(student);
        model.addAttribute("student",student);
        model.addAttribute("message","Update Successfull !");
        return "Update";
    }

    // Delete Student
    @RequestMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") int id, Model model){
        int result = studentService.deleteStudentByID(id);
        ArrayList<Student> student_list = studentService.getStudentList();
        model.addAttribute("student_list", student_list);
        return "redirect:/student";
    }
}