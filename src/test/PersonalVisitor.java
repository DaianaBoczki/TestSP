package test;

public class PersonalVisitor implements  Visitor{
    public int angajat;
    public int director;
    public int manager;
    public String firma;

    public PersonalVisitor(){
        this.angajat = 0;
        this.director = 0;
        this.manager = 0;
    }

    public void setManager() {
        this.manager++;
    }

    public void setDirector() {
        this.director++;
    }

    public void setAngajat() {
        this.angajat++;
    }

    public void visitFirma(Firma f) {
        this.firma = f.nume;
        for(Personal p: f.personal){
            if(p instanceof Angajat){
                this.setAngajat();
            }
            if(p instanceof Director){
                this.setDirector();
            }
            if(p instanceof  Manager){
                this.setManager();
            }
        }
    }

    public void visitDirector(Director d) {
        System.out.println("Directorul " + d.nume + "a fost vizitat");
    }

    public void visitManager(Manager m) {
        System.out.println("Managerul " + m.nume + "a fost vizitat");
    }

    public void visitAngajat(Angajat a) {
        System.out.println("Angajatul " + a.nume + "a fost vizitat");
    }

    public void print(){
        System.out.println("Statistici pentru firma: " + this.firma);
        System.out.println("Numar angajati: " + this.angajat);
        System.out.println("Numar directori: " + this.director);
        System.out.println("Numar manageri: " + this.manager);
    }
}
