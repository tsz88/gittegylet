package com.greenfox;

public class Main {

  public static void main(String[] args) {
    greet("Szilvi", "Ms");

    Age age = new Age();

    age.count("C", 30);

  }

  public static void greet(String name, String title){
    System.out.println(title + name);
  }
}
