
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public class TestCar {
    
    
    public static void main(String[] args) {
        
        Car benz = new Car ("Benz", 10);
        Car mitsubishi = new Car ("Mitsubishi", 18);
        Car mazda = new Car ("Mazda", 3);
        Car volvo = new Car ("Volvo", 3);
        Car benz2 = new Car ("Benz", 13);
        Car mitsubishi2 = new Car ("Mitsubishi", 10);
        
//        
//        TreeSet<Car> ts = new TreeSet<>();
//        
//        ts.add(benz);
//        ts.add(mitsubishi);
//        ts.add(mazda);
//        ts.add(volvo);
//        ts.add(benz2);
//        ts.add(mitsubishi2);
//        
//        ts.forEach(c -> System.out.println(c));

          ArrayList<Car> al = new ArrayList<>();
          al.add(benz); 
          al.add(mitsubishi);
          al.add(mazda);
          al.add(volvo);
          al.add(benz2);
          al.add(mitsubishi2);
          Collections.sort(al, new Sortbymanage());
          al.forEach(c -> System.out.println(c));
        
    }
    
}
