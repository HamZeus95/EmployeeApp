package fromProsit9.entities;

import fromProsit9.interfaces.IGestion;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList <T> implements IGestion <T>  {

    private List<T> listEmployees;

    public SocieteArrayList() {
        listEmployees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(T employee) {
        listEmployees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
/*        for (T employee : listEmployees) {
            if(employee.getNom().equals(nom)){
                return true ;
            }
        }*/

        return false;
    }

    @Override
    public boolean rechercherEmploye(T t) {
        return listEmployees.contains(t);
    }

    @Override
    public void supprimerEmploye(T t) {
         listEmployees.remove(t);
    }

    @Override
    public void displayEmploye() {
        for (T employee: listEmployees) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
       /* Collections.sort(listEmployees);*/

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        //error .getNom
     /*   Collections.sort(listEmployees, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                int comparaisonNom = o1.getNom().compareTo(o2.getNom());
                if (comparaisonNom !=0) return comparaisonNom;
                int comparaisonDepartement = o1.getNomDepartement().compareTo(o2.getNomDepartement());
                if (comparaisonDepartement !=0) return comparaisonDepartement;
                return Integer.compare(o1.getGarde(), o2.getGarde());
            }
        });*/
    }
}
