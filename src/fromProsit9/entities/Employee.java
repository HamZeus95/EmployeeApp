package fromProsit9.entities;

public class Employee implements Comparable<Employee> {
    private int id,garde;
    private String nom,prenom;
    private String nomDepartement;

    public Employee() {
    }

    public Employee(int id, int garde, String nom, String prenom, String nomDepartement) {
        this.id = id;
        this.garde = garde;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGarde() {
        return garde;
    }

    public void setGarde(int garde) {
        this.garde = garde;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    // override methode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employe = (Employee) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    // override methode toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", garde=" + garde +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id,o.id);
    }
}
