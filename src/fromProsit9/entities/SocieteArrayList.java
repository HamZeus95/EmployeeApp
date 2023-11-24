package fromProsit9.entities;

import fromProsit9.interfaces.IGestion;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {
    private List<Employee> listEmployees;

    public SocieteArrayList() {
        listEmployees = new ArrayList<>();
    }
    @Override
    public void ajouterEmploye(Employee employee) {
        listEmployees.add(employee);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employee employe : listEmployees) {
            if (employe.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employee) {
        return listEmployees.contains(employee);
    }

    @Override
    public void supprimerEmploye(Employee employee) {
        listEmployees.remove(employee);
    }

    @Override
    public void displayEmploye() {
        for (Employee employee: listEmployees) {
            System.out.println(employee);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listEmployees);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employee> comparator = Comparator
                .comparing(Employee::getNom)
                .thenComparing(Employee::getNomDepartement)
                .thenComparing(Employee::getGarde);
        Collections.sort(listEmployees,comparator);

    }
}