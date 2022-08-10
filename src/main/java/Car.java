/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkingkaew
 */
public class Car implements Comparable <Car> { 

     

    private String manufacturer; // ยี่ห้อรถ 

    private int age; // อายุรถ 

 

    // Constructor 

     
    public Car (String manufacturer, int age) {
    
        this.manufacturer = manufacturer;
        this.age = age;
    
    }
     

    /** 

     * @return the manufacturer 

     */ 

    public String getManufacturer() { 

        return manufacturer; 

    } 

 

    /** 

     * @param manufacturer the manufacturer to set 

     */ 

    public void setManufacturer(String manufacturer) { 

        this.manufacturer = manufacturer; 

    } 

 

    /** 

     * @return the age 

     */ 

    public int getAge() { 

        return age; 

    } 

 

    /** 

     * @param age the age to set 

     */ 

    public void setAge(int age) { 

        this.age = age; 

    } 

     

    @Override 

    public String toString () { 

     

        return "Car[age = " + age +", manufacture = " + manufacturer +"]"; 

     

    } 

    @Override
    public int compareTo(Car that) {
     
        return this.getManufacturer().compareTo(that.getManufacturer());
    }

     

     

 

} 
