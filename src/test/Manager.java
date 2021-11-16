package test;

import java.util.ArrayList;

public class Manager implements Personal, Visitee{
    public String functie;
    public String nume;
    public ArrayList<Personal> personal= new ArrayList<>();

    public Manager(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
    }

    public void add(Personal p) {
        this.personal.add(p);
    }

    public void print(){
        System.out.println("Nume: " + this.nume + ", functie: " + this.functie);
    }

    public void accept(Visitor v){
        v.visitManager(this);
    }
}
