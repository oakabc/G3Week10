package com.mycompany.g3week10;


import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public class Sortbysurname implements Comparator <Person> {

    @Override
    public int compare(Person o1, Person o2) {
    
        return o1.getSurname().compareTo(o2.getSurname());
    }
    
}
