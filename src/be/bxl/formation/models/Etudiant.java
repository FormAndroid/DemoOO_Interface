package be.bxl.formation.models;

import be.bxl.formation.interfaces.IEtudiant;

public class Etudiant extends Personne implements IEtudiant {

    public Etudiant(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void suivreLeCours(String cours) {
        System.out.println(getNomComplet() + " suit le cours de " + cours);
    }

    @Override
    public void guindailler() {
        System.out.println(getNomComplet() + " guindaille tout le nuit !");
    }
}
