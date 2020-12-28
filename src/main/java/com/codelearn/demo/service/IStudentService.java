package com.codelearn.demo.service;

import com.codelearn.demo.entity.Student;
import java.util.ArrayList;
public interface IStudentService {
    public ArrayList<Student> getStudentList();
    public Student getStudentByID(int id);
    public ArrayList<Student> addStudent(Student student);
    public Student updateStudent(Student student);
    public int deleteStudentByID(int id);
}
