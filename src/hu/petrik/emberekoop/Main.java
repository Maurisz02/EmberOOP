package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Adam", "2002-11-29","Telki");
        Ember e2 = new Ember("Pinter", "2002-10-29","Telki");
        Ember e3 = new Ember("Pintyo", "2002-09-29","Telki");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
