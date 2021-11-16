package test;

import java.util.ArrayList;

public class Firma implements Personal, Visitee{
    public String nume;
    public ArrayList<Personal> personal= new ArrayList<>();

    public Firma(String nume) {
        this.nume = nume;
    }

    public void add(Personal p) {
        this.personal.add(p);
    }

    public void print(){
        System.out.println("Numele firmei: " + this.nume);
        for(Personal p: personal){
            p.print();
        }
    }

    public void accept(Visitor v){
        v.visitFirma(this);
    }
}
