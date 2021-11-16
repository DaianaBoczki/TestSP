package test;

public class Salariu {
    public double lei;
    public String functie;

    public Salariu(double lei, String functie) {
        this.lei = lei;
        this.functie = functie;
    }

    public void print(){
        System.out.println("Functie: "  +this.functie + ", lei: " + this.lei);
    }
}
