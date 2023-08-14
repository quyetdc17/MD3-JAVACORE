package com.ra.abtract.thuchanh1;

import java.text.MessageFormat;

public class Person {
    private String name;
    private String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
//        return "name *\t"+ name+"address *\t"+ address;
        return MessageFormat.format("Person{0}, name={1}, address={2}]",this.name, this.address);
    }
}
