package com.ra.mylist;

import java.util.Objects;

public class Student {
    private String studentId;
    private String studentName;
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getStudentId(), student.getStudentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

}
