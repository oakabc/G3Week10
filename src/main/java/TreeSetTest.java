
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public class TreeSetTest {
    
    
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        Person a = new Person();
        a.setName("Oak");
        Person b = new Person();
        b.setName("Mark");
        Person c = new Person();
        c.setName("Elon");
        Person d = new Person();
        d.setName("Bill");
        
        ts.add(a);
        ts.add(b);
        ts.add(c);
        ts.add(d);
        System.out.println(ts);

    }
    
}
