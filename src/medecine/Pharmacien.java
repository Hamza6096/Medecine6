package medecine;

import java.util.ArrayList;
import java.util.Arrays;

public class Pharmacien {

    String prenom;
    ArrayList<Vente> ventes = new ArrayList<>();

    public Pharmacien(String prenom){

        this.prenom = prenom;
        System.out.println(this.prenom + " est un pharmacien.");
    }

    public void vendre(Patient patient, Medicament... medicaments){
        this.ventes.add(new Vente(patient, medicaments));
        System.out.println(this.prenom + " vend " + Medicament.lister(medicaments, true) +" à " + patient.prenom);

    }

    public void afficherVentes() {
        System.out.println("Vente de " + this.prenom + ":");
        int total = 0;
        for (Vente vente : this.ventes) {
            int sousTotal = Medicament.totaliser(vente.medicaments);
            total += sousTotal;
            System.out.println(vente);
            System.out.println("\t\tSous-total: " + sousTotal );
        }
        System.out.println("\tTotal: " + total + " (" + this.ventes.size() + " ventes)" );

    }

}
