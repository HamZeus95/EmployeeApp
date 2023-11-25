package fromProsit9.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employee,Departement> mapAffrctation;

    public AffectationHashMap() {
        mapAffrctation = new HashMap<>();
    }

    public void ajouterEmployeDepartement(Employee e, Departement d){
        if (!mapAffrctation.containsKey(e)) {
            mapAffrctation.put(e,d);
            System.out.println("Affectation réussie : " + e.getNom() + " -> " + d.getNomDepartement());
        }else{
            System.out.println("Erreur : L'employé"+e.getNom()+ "est déjà affecté à un département.");
        }
    }

    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Employee, Departement> entry : mapAffrctation.entrySet()) {
            System.out.println("Employe: " + entry.getKey() + ", Departement: " + entry.getValue());
        }
    }
    public void supprimerEmploye(Employee e) {
        mapAffrctation.remove(e);
        System.out.println("Suppression réussie de l'employé : " + e.getNom());
    }

    public void supprimerEmployeEtDepartement(Employee e, Departement d) {
        mapAffrctation.remove(e, d);
        System.out.println("Suppression réussie de l'employé : " + e.getNom() + " du département : " + d.getNomDepartement());
    }
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employee e : mapAffrctation.keySet()) {
            System.out.println(e);
        }
    }
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : mapAffrctation.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return mapAffrctation.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return mapAffrctation.containsValue(d);
    }

    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(mapAffrctation);
    }
}
