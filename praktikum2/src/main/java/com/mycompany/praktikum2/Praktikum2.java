/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.praktikum2;

import com.mycompany.praktikum2.classes.Doctor;
import com.mycompany.praktikum2.classes.FamilyDoctor;
import com.mycompany.praktikum2.classes.Surgeon;

/**
 *
 * @author ahmadfaisal
 */
public class Praktikum2 {

    public static void main(String[] args) {
        Doctor doctor = new Doctor(true);
        doctor.setWorksAtHospital(false);
        System.out.println("Doctor works at hospital: " + doctor.getWorksAtHospital());
        doctor.treatPatient();
        
        System.out.println("");
        
        Surgeon surgeon = new Surgeon(true);
        surgeon.treatPatient();
        surgeon.makeIncision();
        
        System.out.println("");
        
        FamilyDoctor familyDoctor = new FamilyDoctor(false, true);
        System.out.println("Value: " + familyDoctor.getWorksAtHospital());
        System.out.println("Value: " + familyDoctor.getMakeHouseCalls());
        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();
    }
}
