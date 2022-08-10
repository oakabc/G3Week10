/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author chanakarnkingkaew
 */
public class Chapter10 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(); // Generic
        ts.add(new Integer(3)); // Add primitive via Wrapper Class
        ts.add(4);
        ts.add(55555);
        ts.add(-15678);
        ts.add(10);
        //ts.add("Oak");
        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            // Integer i = (Integer) o;
            System.out.println("" + o);
        }
    }
}

