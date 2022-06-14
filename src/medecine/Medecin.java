package medecine;

import java.util.ArrayList;

public class Medecin {

    String prenom;
    int tarif;
    Patient patient;
    ArrayList<Consultation> consultations = new ArrayList<>();

    public Medecin(String prenom, int tarif) {

        this.prenom = prenom;
        this.tarif = tarif;
        System.out.println(prenom + " est une medecin (tarif: " + tarif + "€)");

    }

    public void recevoir(Patient patient) {

        this.patient = patient;
        this.consultations.add(new Consultation(patient));
        System.out.println(this.prenom + " reçoit " + patient.prenom + " en consultation.");

    }

    public void prescrire(Medicament... medicaments) {

        this.consultations.get(this.consultations.size() - 1).medicaments = medicaments;
        System.out.println(this.prenom + " prescrit " + Medicament.lister(medicaments, false) + " à " + this.patient.prenom);

    }

    public void demanderPaiement() {


        System.out.println(this.prenom + " demande " + this.tarif + "€ à " + this.patient.prenom);


    }


    public void afficherConsultations() {

        System.out.println("Consultations de :" + this.prenom + "");
        for (Consultation consultation : this.consultations) {
            System.out.print(consultation);


        }
        System.out.println("\tTotal: " + consultations.size() + " consultations");

    }


}
