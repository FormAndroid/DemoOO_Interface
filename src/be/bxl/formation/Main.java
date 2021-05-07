package be.bxl.formation;

import be.bxl.formation.interfaces.IEtudiant;
import be.bxl.formation.interfaces.IProf;
import be.bxl.formation.models.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("Duck", "Riri");

        // Quels sont les types d'un objet Etudiant ?
        //  - Object
        //  - Personne
        //  - Etudiant
        //  - IEtudiant

        // => Utilisation comme un filtre
        // On peut stocker un Etudiant dans une variable de type compatible
        //  - On ne peut acceder qu'aux élémént connu par le type
        IEtudiant ie1 = e1;
        ie1.guindailler();


        // => Utilisation du type de l'interface
        IProf p1 = new Prof("Picsou", "Balthazar");
        IProf p2 = new ProfRobot();
        IProf p3 = new Assistant("Duck", "Donald");


        utiliserLeProf(p1);
        utiliserLeProf(p2);
        utiliserLeProf(p3);

    }

    private static void utiliserLeProf(IProf prof) {
        // Abstraction de code => La méthode ne connait pas le type "classe"
        //                        On connait uniquement le comportement !
        prof.donnerCours("Math");
        prof.corrigerCopies();
        prof.donnerCours("Dev");

    }
}
