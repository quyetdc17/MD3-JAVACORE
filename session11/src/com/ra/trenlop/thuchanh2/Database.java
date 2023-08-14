package com.ra.trenlop.thuchanh2;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Student> students = new  ArrayList<>(List.of(
            new Student("SV01","Quyet","quyet@gmail.com","07038836666","C01", true),
            new Student("SV01","Nam","nam@gmail.com","07038830000","C01", true)
    ));
    public static List<Class> classes = new  ArrayList<>();
}
