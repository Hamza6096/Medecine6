package medecine;

import medecine.Maladie;
import medecine.Medecin;
import medecine.Medicament;
import medecine.Pharmacien;

public class Patient {

    String prenom;
    Maladie maladie;


    public Patient(String prenom) {

        this.prenom = prenom;
        System.out.println(this.prenom + " est une patient");

    }

    public String getNom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.prenom = nom;
    }

    public static void main(String[] args) {


        System.out.println("hello");
    }

    public void contracter(Maladie maladie) {

        this.maladie = maladie;


        System.out.println(this.prenom + " contracte la maladie " + maladie.nom);


    }

    public void payer(Medecin medecin) {

        System.out.println(this.prenom + " paie " + medecin.tarif + "€ à " + medecin.prenom);


    }

    public void payer(Pharmacien pharmacien, Medicament... medicaments) {

        System.out.println(this.prenom + " paie " + Medicament.totaliser(medicaments) + " à " + pharmacien.prenom);


    }

    public void guerir() {
        System.out.println(this.prenom + " guérit de la maladie de la " + this.maladie.nom);
        this.maladie = null;

    }

}
