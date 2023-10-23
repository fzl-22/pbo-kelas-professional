/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2.classes;

/**
 *
 * @author ahmadfaisal
 */
public class Doctor {
    protected boolean worksAtHospital;
    
    public Doctor(boolean worksAtHospital){
        this.worksAtHospital = worksAtHospital;
    }
    
    public void treatPatient(){
        System.out.println("Merawat pasien...");    
    }
    
    // setter (write) -> memberi atau mengubah nilai dari atribut yang dibatasi aksesnya
    public void setWorksAtHospital(boolean worksAtHospital){
        this.worksAtHospital = worksAtHospital;
    }
    
    // getter (read) -> mendapatkan nilai dari atribut yang dibatasi aksesnya
    public boolean getWorksAtHospital(){
        return this.worksAtHospital;
    } 
}
