package org.lessons.java.animals;

public abstract class Animal {

    //METODI -----------------------------
    //concreti
    public void dormi() {
        System.out.println("Zzz");
    }

    //astratti
    public abstract void verso();
    public abstract void mangia();

}