package fromProsit9.main;

import fromProsit9.entities.Employee;
import fromProsit9.entities.SocieteArrayList;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,1,"leo","messi","foot");
        Employee employee2=new Employee(1,1,"leo","messi","foot");
        Employee employee3=new Employee(2,1,"ronaldo","cristiano","foot");
        Employee employee4=new Employee(3,1,"el banneni","khlifa","foot");
        SocieteArrayList s1 = new SocieteArrayList<>();
        s1.ajouterEmploye(employee1);
        s1.ajouterEmploye(employee3);
        System.out.println(s1.rechercherEmploye(employee1));
        s1.displayEmploye();
        s1.supprimerEmploye(employee3);
        System.out.println("///////////////////////");
        s1.displayEmploye();
    }
}