package medecine;

import java.util.ArrayList;

public class Medicament {
    String nom;
    int prix;
    private static final int MEAN_LENGTH = 10;


    public Medicament(String nom, int prix) {

        this.nom = nom;
        this.prix = prix;

        System.out.println(nom + " est un médicament " + "(" + this.prix + "€)");

    }


    static String lister(Medicament[] medicaments, boolean avecPrix) {

        StringBuilder sb = new StringBuilder(medicaments.length * (MEAN_LENGTH + (avecPrix ? 7 : 2)));
        for (Medicament medicament : medicaments) {
            sb
                    .append(", ")
                    .append(medicament.nom);
            if (avecPrix)
                sb
                        .append(" (")
                        .append(medicament.prix)
                        .append("€)");

        }
        return sb.delete(0, 2)
                .toString();
    }

    static int totaliser(Medicament... medicaments) {

        int total = 0;
        for (Medicament medicament : medicaments) {
            total += medicament.prix;
        }
        return total;
    }



}
