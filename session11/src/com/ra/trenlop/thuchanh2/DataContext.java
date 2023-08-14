package com.ra.trenlop.thuchanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataContext implements Serializable {
    private List<Class> classes;
    private List<Student> students;
    // Đường dẫn file lưu danh sách categories
    transient private String contextPath;

    public DataContext(String contextPath) {
        this.contextPath = contextPath;
        readObject();
    }

    public List<Class> getClasses() {
        return classes;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void save() throws Exception {
        try {
            FileOutputStream fos = new FileOutputStream(contextPath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
        } catch (Exception ex) {
            throw ex;
        }
    }

    private void readObject() {
        try {
            FileInputStream fos = new FileInputStream(contextPath);
            ObjectInputStream oos = new ObjectInputStream(fos);
            DataContext data = (DataContext)oos.readObject();
            oos.close();
            this.classes = data.getClasses();
            this.students = data.getStudents();
        } catch (Exception ex) {
            this.classes = new ArrayList<>();
            this.students = new ArrayList<>();
            //ex.printStackTrace();
        }
    }
}
