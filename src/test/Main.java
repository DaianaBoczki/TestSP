package test;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nSubpunctul a)");
        Firma firma1 = new Firma("IT");
        Director director1 = new Director("Popescu", "director");
        Director director2 = new Director("Popovici", "director");
        Manager manager = new Manager("Ionescu", "manager");
        Angajat angajat1 = new Angajat("Ioncica", "angajat");
        Angajat angajat2 = new Angajat("Bina", "angajat");
        Angajat angajat3 = new Angajat("Ianculescu", "angajat");
        Angajat angajat4 = new Angajat("Becheru", "angajat");
        firma1.add(director1);
        firma1.add(director2);
        firma1.add(manager);
        firma1.add(angajat1);
        firma1.add(angajat2);
        firma1.add(angajat3);
        firma1.print();
        System.out.println();

        Firma firma2 = new Firma("Automotive");
        firma2.add(firma1);
        firma2.add(angajat4);
        firma2.print();

        System.out.println("\nSubpunctul b)");
        PersonalVisitor counter = new PersonalVisitor();
        firma1.accept(counter);
        counter.print();

        System.out.println("\nSubpunctul c)");
        long startTime = System.currentTimeMillis();
        SalariuProxy salDirector = new SalariuProxy(6500, "director");
        long endTime = System.currentTimeMillis();
        System.out.println("Timp pentru crearea salariului directorului: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        SalariuProxy salManager = new SalariuProxy(10000, "manager");
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru crearea salariului managerului: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        SalariuProxy salAngajat = new SalariuProxy(5600, "angajat");
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru crearea salariului angajatului: " + (endTime - startTime));

        System.out.println();
        startTime = System.currentTimeMillis();
        salDirector.print();
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru afisarea salariului directorului: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        salManager.print();
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru afisarea salariului managerului: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        salAngajat.print();
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru afisarea salariului angajatului: " + (endTime - startTime));
    }
}
