package hu.petrik.emberekoop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Ember e1 = new Ember("Adam", "2002-11-29","Telki");
        Ember e2 = new Ember("Pinter", "2002-10-29","Telki");
        Ember e3 = new Ember("Pintyo", "2002-09-28","Telki");
        Ember e4 = new Ember("Valaki", "2002-01-25","Telki");
        Ember e5 = new Ember("Jani", "2002-04-24","Telki");

        Ember e6 = new Ember("Proba", "2002-01-12", "Telki");
        Ember e7 = new Ember("Proba2", "2002-11-12", "Telki");

        System.out.println(e1);
        System.out.println(e4);
        System.out.println(e6);


        Emberek emberek = new Emberek(new Ember[]{e1, e2, e3, e4, e5});

        //System.out.println(emberek);

        try{
            Emberek emberek2 = new Emberek("emberek.txt");
            System.out.println(emberek2);
        }catch (FileNotFoundException e){
            System.out.println("Hiba az emberek.txt fájl nem található");
        }catch (IOException e){
            System.err.println("Ismeretlen hiba történt a fájl beolvasás folyamán");
        }

    }
}
