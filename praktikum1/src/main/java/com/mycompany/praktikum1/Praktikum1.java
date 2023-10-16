/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.praktikum1;

/**
 *
 * @author ahmadfaisal
 */
public class Praktikum1 {

    public static void main(String[] args) {
        Human unnamed = new Human();
        
        System.out.println(unnamed.name);
        System.out.println(unnamed.age);
        System.out.println(unnamed.email);
        
        unnamed.walk();
        
        System.out.println("");
        
        Human faisal = new Human("Ahmad Faisal", 20, "contact@ahmadfaisal.online");
        
        System.out.println(faisal.name);
        System.out.println(faisal.age);
        System.out.println(faisal.email);
        
        faisal.walk();
        
        System.out.println("");
        
        Human aldi = new Human("Aldi Lianto", 20);
        System.out.println(aldi.name);
        System.out.println(aldi.age);
        System.out.println(aldi.email);
        
//        // Instansiasi object dari class
//        Human faisal = new Human();
//        
//        faisal.name = "Ahmad Faisal";
//        faisal.age = 20;
//        faisal.email = "contact@ahmadfaisal.online";
//        
//        faisal.walk();
//        
//        String result = faisal.sendEmail("aldi@lianto.com");
//        System.out.println(result);
//        
//        // Instansiasi object baru
//        Human aldi = new Human();
//        aldi.name = "Aldi Lianto";
//        aldi.email = "aldi@lianto.com";
//        aldi.walk();
//        
//        result = aldi.sendEmail("contact@ahmadfaisal.online");
//        System.out.println(result);
    }
}
