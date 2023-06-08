package org.lessons.java.animals;

public class Main {
    public static void main(String[] args) {
        Animal[] farm = new Animal[5];
        farm[0] = new Aquila();
        farm[1] = new Coniglio();
        farm[2] = new Formichiere();
        farm[3] = new Leone();
        farm[4] = new Procione();

        for (Animal a : farm) {
            System.out.println(" -------------------- ");

            a.verso();
            a.mangia();
            a.dormi();
        }
    }
}
