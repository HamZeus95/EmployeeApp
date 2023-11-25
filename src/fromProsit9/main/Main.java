package fromProsit9.main;

import fromProsit9.entities.*;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,1,"leo","messi","foot");
        Employee employee2=new Employee(1,1,"leo","messi","foot");
        Employee employee3=new Employee(2,1,"ronaldo","cristiano","foot");
        Employee employee4=new Employee(3,1,"el banneni","khlifa","foot");
        SocieteArrayList s1 = new SocieteArrayList();
        s1.ajouterEmploye(employee1);
        s1.ajouterEmploye(employee2);
        s1.displayEmploye();
        System.out.println("///////////////////");
        s1.displayEmploye();
        s1.ajouterEmploye(employee3);
        s1.ajouterEmploye(employee4);
        System.out.println("---------------------");
        s1.displayEmploye();
        System.out.println("******************");
        s1.trierEmployeParId();
        s1.displayEmploye();
        System.out.println("###############################");
        s1.trierEmployeParNomDépartementEtGrade();
        s1.displayEmploye();
        System.out.println("*********************************");
        DepartementHashSet h1 = new DepartementHashSet();
        Departement d1 = new Departement(1,"IT",500);
        Departement d2 = new Departement(1,"IT",500);
        Departement d3 = new Departement(2,"Network",200);
        h1.ajouterDepartement(d1);
        h1.displayDepartement();
        System.out.println("-----------------------");

        h1.ajouterDepartement(d3);
        h1.displayDepartement();
        System.out.println(h1.rechercherDepartement("Network"));
        System.out.println(h1.rechercherDepartement(d2));
        h1.displayDepartement();
        System.out.println("€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€€");
        Departement departement1 = new Departement(101, "Dept1", 50);
        Departement departement2 = new Departement(102, "Dept2", 75);
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(employee1, departement1);
        affectationHashMap.ajouterEmployeDepartement(employee3, departement2);

        affectationHashMap.afficherEmployesEtDepartements();

        // Essayez d'ajouter le même employé dans deux départements différents
        affectationHashMap.ajouterEmployeDepartement(employee1, departement2);

        affectationHashMap.afficherEmployesEtDepartements();

        affectationHashMap.supprimerEmploye(employee1);
        affectationHashMap.afficherEmployesEtDepartements();





    }
}