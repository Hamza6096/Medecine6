package medecine;

import java.util.Arrays;

public class Vente {

    Patient client;
    Medicament[] medicaments;

    public Vente(Patient client, Medicament[] medicaments) {
        this.client = client;
        this.medicaments = medicaments;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb
                .append("\t")
                .append(this.client.prenom)
                .append(System.lineSeparator());
        for (Medicament medicament : this.medicaments) {
            sb
                    .append("\t\t")
                    .append(medicament.nom)
                    .append("(")
                    .append(medicament.prix)
                    .append(")")
                    .append(System.lineSeparator());
        }
        return sb.toString();
    }
}
