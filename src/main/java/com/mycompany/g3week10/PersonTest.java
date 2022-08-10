/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chanakarnkingkaew
 */
public class PersonTest {
    
    public static void main(String[] args) {
        
        ArrayList<Person> al = new ArrayList<>();
        
        Person a = new Person();
        a.setName("Oak");
        a.setSurname("Kingkaew");
        
        Person b = new Person();
        b.setName("Mark");
        b.setSurname("Zuckerberg");
        
        Person c = new Person();
        c.setName("Elon");
        c.setSurname("Musk");
        
        Person d = new Person();
        d.setName("Bill");
        d.setSurname("Gates");
        
        al.add(a);
        al.add(b);
        al.add(c);
        al.add(d);

       // al.forEach(p -> System.out.println(p));
        
        Collections.sort(al, new Sortbyname()); // จัดเรียงข้อมูลตามกำหนด
        //System.out.println(al);
        al.forEach(p -> System.out.println(p));
        
    }
         
    
}
