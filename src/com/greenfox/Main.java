package com.greenfox;

public class Main {

  public static void main(String[] args) {
    greet("name of WhoEver");

    Age age = new Age();

    age.count("C", 30);

  }

  public static void greet(String name){
    System.out.println("Greetings for the " + name);
  }
}
