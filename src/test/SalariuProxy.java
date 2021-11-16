package test;

import java.util.concurrent.TimeUnit;

public class SalariuProxy implements Venit{
    public double lei;
    public String functie;
    public Salariu salariu;

    public SalariuProxy(double lei, String functie) {
        this.lei = lei;
        this.functie = functie;
        if(this.lei <= 6400){
            try{
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public Salariu load(){
        if(this.salariu == null){
            this.salariu = new Salariu(this.lei, this.functie);
        }
        return this.salariu;
    }

    public void print(){
        this.load();
        this.salariu.print();
    }
}
