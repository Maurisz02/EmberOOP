package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Adam", "2002-11-29","Telki");
        Ember e2 = new Ember("Pinter", "2002-10-29","Telki");
        Ember e3 = new Ember("Pintyo", "2002-09-28","Telki");
        Ember e4 = new Ember("Valaki", "2002-01-25","Telki");
        Ember e5 = new Ember("Jani", "2002-04-24","Telki");

        Emberek emberek = new Emberek(new Ember[]{e1, e2, e3, e4, e5});

        System.out.println(emberek);
    }
}
