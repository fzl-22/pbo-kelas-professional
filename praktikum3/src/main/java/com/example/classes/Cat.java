package com.example.classes;

import com.example.interfaces.Pet;

public class Cat extends Animal implements Pet{
  public Cat(String name, String habitat) {
    this.name = name;
    this.habitat = habitat;
  }

  @Override
  public void eat() {
    System.out.println("Kucing makan daging...");
  }

  @Override
  public void roam() {
    System.out.println("Kucing berjalan...");
  }

  @Override
  public void play() {
    System.out.println("Kucing bermain...");
  }

  @Override
  public void friendly() {
    System.out.println("Kucing berteman...");
  }
}
