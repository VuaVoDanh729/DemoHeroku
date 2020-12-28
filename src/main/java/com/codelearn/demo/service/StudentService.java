package com.codelearn.demo.service;

import com.codelearn.demo.entity.Student;


import java.util.ArrayList;
import org.springframework.stereotype.Service;
@Service
public class StudentService implements IStudentService{
    static ArrayList<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"Nguyen Quang Hai","11A","Ha Noi"));
        studentList.add(new Student(2,"Nguyen Van Quyet","11A","Ha Noi"));
        studentList.add(new Student(3,"Nguyen Cong Phuong","11A","Nghe An"));
        studentList.add(new Student(4,"Nguyen Thanh Chung","11A","Ha Noi"));
        studentList.add(new Student(5,"Nguyen Van Thanh","11A","Hai Duong"));
        studentList.add(new Student(6,"Nguyen Van Toan","11A","Hai Duong"));
    }

    @Override
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Student getStudentByID(int id) {
        for(Student student : studentList){
            if(student.getID() == id){
                return student;
            }
        }
        return  null;
    }

    @Override
    public ArrayList<Student> addStudent(Student student) {
        studentList.add(student);
        return studentList;
    }

    @Override
    public Student updateStudent(Student student) {
        for (Student stu : studentList){
            if(stu.getID() == student.getID()){
                stu.setFull_name(student.getFull_name());
                stu.setAddress(student.getAddress());
                stu.setClass_room(student.getClass_room());
                return stu;
            }
        }
        return null;
    }

    @Override
    public int deleteStudentByID(int id) {
        boolean check = false;
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getID() == id){
                studentList.remove(i);
                return 1;
            }
        }
        return 0;
    }
}
