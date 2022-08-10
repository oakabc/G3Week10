/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

/**
 *
 * @author chanakarnkingkaew
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
// Make a collection 
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //cars.add(new Integer(3));
        //cars.clear();
        
        // 1- Get the iterator 
        Iterator<String> it = cars.iterator();
          
        while (it.hasNext()) {
        System.out.println(it.next());
        }

        // 2-For-each
        for (String car:cars){
            System.out.println(car);
        }
        
        // 3- Lambda expression
        
        cars.forEach(car -> System.out.println(car));
        
        System.out.println(cars.isEmpty());
    }
}
