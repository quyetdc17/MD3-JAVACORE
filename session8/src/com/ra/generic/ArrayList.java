package com.ra.generic;

import java.beans.Customizer;
import java.util.List;

public class ArrayList<T> {
    private final int MIN_CAPACITY= 10;
    private List<T> element;

    public ArrayList(){
        this.element = (List<T>) new ArrayList<>();
    }
    public void showList(){

    }

}