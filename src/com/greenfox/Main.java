package com.greenfox;

public class Main {

  public static void main(String[] args) {
    greet("Greetings");

    Age age = new Age();

    age.count();

  }

  public static void greet(String name){
    System.out.println(name);
  }
}
