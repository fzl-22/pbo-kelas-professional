/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2.classes;

/**
 *
 * @author ahmadfaisal
 */
public class FamilyDoctor extends Doctor{
    final private boolean makeHouseCalls;
    
    public FamilyDoctor(boolean worksAtHospital, boolean makeHouseCalls){
        super(worksAtHospital);
        this.makeHouseCalls = makeHouseCalls;
    }
    
    public void giveAdvice(){
        System.out.println("Memberikan anjuran dokter...");
    }
    
    public boolean getMakeHouseCalls(){
        return this.makeHouseCalls;
    }
}
