/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

/**
 *
 * @author chanakarnkingkaew
 */
public class PersonTest {
    
    public static void main(String[] args) {
        
        Person a = new Person();
        a.setName("Oak");
        a.setSurname("Kingkaew");
        Person b = new Person();
        b.setName("Oak");
        b.setSurname("Gmanga");
        
        System.out.println( a.equals(b) );
        
    }
         
    
}
