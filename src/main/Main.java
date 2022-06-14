package main;

import medecine.*;

public class Main {

    public static void main(String[] args) {
        Patient gilles = new Patient("Gilles");
        Maladie grippe = new Maladie("grippe");
        gilles.contracter(grippe);
        Medecin marc = new Medecin("Marc", 30);
        marc.recevoir(gilles);
        Medicament aspirine = new Medicament("aspirine", 10);
        Medicament paracetamol = new Medicament("paracetamol", 7);
        marc.prescrire(aspirine, paracetamol);
        marc.demanderPaiement();
        gilles.payer(marc);
        Patient robert = new Patient("Robert");
        Maladie rhinite = new Maladie("rhinite");
        robert.contracter(rhinite);
        marc.recevoir(robert);
        Medicament oxymetazoline = new Medicament("oxymetazoline", 18);
        marc.prescrire(aspirine, oxymetazoline);
        marc.demanderPaiement();
        robert.payer(marc);
        Pharmacien paul = new Pharmacien("Paul");
        paul.vendre(gilles, aspirine, paracetamol);
        gilles.payer(paul, aspirine, paracetamol);
        gilles.guerir();
        paul.vendre(robert, aspirine, oxymetazoline);
        robert.payer(paul, aspirine, oxymetazoline);
        robert.guerir();
        marc.afficherConsultations();
        paul.afficherVentes();
    }
}
