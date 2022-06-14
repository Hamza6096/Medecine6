package medecine;

import java.util.ArrayList;
import java.util.Arrays;

public class Consultation {

    Patient patient;
    Maladie maladie;
    Medicament[] medicaments;

    public Consultation(Patient patient) {

        this.patient = patient;
        this.maladie = patient.maladie;


    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb
                .append("\t")
                .append(this.patient.prenom)
                .append(" (")
                .append(this.maladie.nom)
                .append(")")
                .append(System.lineSeparator());
        for (Medicament medicament : this.medicaments) {
            sb.append("\t\t")
                    .append(medicament.nom)
                    .append(System.lineSeparator());

        }
        return sb.toString();


    }
}
