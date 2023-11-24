package fromProsit9.entities;


import java.util.Comparator;
import java.util.Objects;

public class Departement implements Comparator<Departement> {
    private int id;
    private String nomDepartement;
    private int nbreEmployee;
    public Departement() {

    }
    public Departement(int id, String nomDepartement, int nbreEmployee) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbreEmployee = nbreEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNbreEmployee() {
        return nbreEmployee;
    }

    public void setNbreEmployee(int nbreEmployee) {
        this.nbreEmployee = nbreEmployee;
    }


    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNomDepartement().compareTo(o2.getNomDepartement());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement dep = (Departement) obj;
        return id == dep.id && nomDepartement.equals(dep.nomDepartement);
    }

    @Override
    public String toString() {
        return "fromProsit9.entities.Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbreEmployee=" + nbreEmployee +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(id,nomDepartement);
    }


}
