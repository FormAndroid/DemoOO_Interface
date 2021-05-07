package be.bxl.formation.models;

import be.bxl.formation.interfaces.IProf;

public class Assistant extends Etudiant implements IProf {

    public Assistant(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public void donnerCours(String cours) {
        System.out.println(getNomComplet() + " donne cours de " + cours);
    }

    @Override
    public void preparerCours(String cours) {
        if (Math.random() > 0.5) {
            System.out.println(getNomComplet()  + " prepare le cours");
        }
        else {
            this.guindailler();
        }
    }

    @Override
    public void corrigerCopies() {
        System.out.println(getNomComplet() + " passe la nuit a corriger des copies");
    }
}
