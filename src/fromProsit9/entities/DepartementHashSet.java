package fromProsit9.entities;

import fromProsit9.interfaces.IDepartement;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement <Departement> {

    private Set<Departement> departementsSet;

    public DepartementHashSet() {
        departementsSet = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
            departementsSet.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement: departementsSet) {
            if (departement.getNomDepartement().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departementsSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
            departementsSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        for (Departement departement : departementsSet) {
            System.out.println(departement);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        return new TreeSet<>(new Comparator<Departement>() {
            @Override
            public int compare(Departement o1, Departement o2) {
                return Integer.compare(o1.getId(),o2.getId());
            }
        });
    }
}
