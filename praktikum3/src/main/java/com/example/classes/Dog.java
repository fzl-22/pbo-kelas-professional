package com.example.classes;

import com.example.interfaces.Pet;

public class Dog extends Carnivore implements Pet{
  @Override
  public void play() {
    System.out.println("Anjing sedang bermain...");
  }

  @Override
  public void friendly() {
    System.out.println("Anjing berteman...");
  }

  @Override
  public void eat() {
    System.out.println("Anjing makan daging...");
  }

  @Override
  public void hunt() {
    System.out.println("Anjing berburu di hutan");
  }

  @Override
  public void roam() {
    System.out.println("Anjing berkelana di hutan");
  }
  
}
