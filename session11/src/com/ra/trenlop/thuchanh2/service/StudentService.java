package com.ra.trenlop.thuchanh2.service;

import com.ra.trenlop.thuchanh2.Database;
import com.ra.trenlop.thuchanh2.GenericService;
import com.ra.trenlop.thuchanh2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentService implements GenericService<Student> {
    @Override
    public List<Student> findAll() {
        return Database.students;
    }

    @Override
    public List<Student> where(Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();
        for (Student c : findAll()) {
            if (predicate.test(c))
                result.add(c);
        }
        return result;
    }

    @Override
    public Student findSingle(Predicate<Student> predicate) {
        for (Student st : findAll()){
            if (predicate.test(st))
                return st;
        }
        return null;
    }

    @Override
    public boolean add(Student item) {
        try {
            Database.students.add(item);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean edit(Student item) {
        try{
            Student _student = findSingle(st -> st.getId().equals(item.getId()));
            if (_student != null){
                _student.setName(item.getName());
                return true;
            }
            return false;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean remove(Student item) {
        try {
            Database.students.remove(item);
            return true;
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
