package com.ra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class RWObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
           new Student("SV01","nguyen van A",true),
           new Student("SV02","nguyen van B",true),
           new Student("SV03","nguyen van C",true),
           new Student("SV04","nguyen van D",true),
           new Student("SV05","nguyen van E",true),
           new Student("SV06","nguyen van F",true)
        ));
        String path = "database";
    }
    public static void WriteObject(String path, List<Student> data){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(data);
            oos.close();
        }catch (Exception ex){
            ex.printStackTrace();

        }
    }

    public static void ReadObject(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<Student> data = (List<Student>)ois.readObject();
            ois.close();
            for (Student s: data)
                System.out.println(s.getId()+ "|"+ s.getName());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
