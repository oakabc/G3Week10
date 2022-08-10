/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3week10;

/**
 *
 * @author chanakarnkingkaew
 */
public class Person {

    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public boolean equals(Person that) { // การหาว่า object เท่ากันหรือไม่ เราสามารถกำหนดเอง
    
        return this.name.equals(that.name) && this.surname.equals(that.surname);
    }


}
