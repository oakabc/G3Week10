/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public class Person implements Comparable<Person> { //implements Comparable<Person>

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Person that) {
        return this.name.equals(that.name);
    }

   
    public int compareTo(Person that) {
        return this.name.compareTo(that.name); // using String compareTo
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }
}
