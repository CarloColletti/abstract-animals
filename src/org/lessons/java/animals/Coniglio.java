package org.lessons.java.animals;

public class Coniglio extends Animal{
    //METODI
    @Override
    public void verso() {
        System.out.println("riiiii");
    }
    @Override
    public void mangia() {
        System.out.println("è onnivoro, quello che trova");
    }
}