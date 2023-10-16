/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum1;

/**
 *
 * @author ahmadfaisal
 */
// Template/blueprint manusia
public class Human {
    // attributes
    public String name;
    public int age;
    public String email;
    
    // constructor overloading -> memiliki lebih dari 1 constructor
    // constructors
    // dibedakan berdasarkan susunan parameter
    public Human(){
        // default constructor
        System.out.println("constructor pertama dipanggil");
        this.name = "unnamed";
        this.age = 0;
        this.email = "example@gmail.com";
    }
    
    public Human(String name, int age, String email){
        // custom constructor
        System.out.println("constructor kedua dipanggil");
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    public Human(String name, int age){
        System.out.println("constructor ketiga dipanggil");
        this.name = name;
        this.age = age;
        this.email = "empty";
    }
    
    // methods
    public void walk(){
        System.out.println(this.name + " " + "sedang berjalan");
    }
    
    public String sendEmail(String receiver){
        return "Email terkirim dari " + this.email + " ke " + receiver;
    }
}
