/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

/**
 *
 * @author chanakarnkingkaew
 */
public class StringEqualityTest {
    
    public static void main(String[] args) {
        
        
        String a = "Hello";
        String b = new String ("Hello");
        String c = "Hello";
        
        
        System.out.println("a==b is " + (a==b));
        System.out.println("a==c is "+(a==c));
        System.out.println("a.equals(b) is "+ a.equals(b)); //e....
       
    }
}
