package be.bxl.formation.models;

public class Personne {

    private String nom;
    private String prenom;


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void domir(int nbHeure) {
        System.out.println(getNom() + " dort " + nbHeure + " heure!");
    }
}
