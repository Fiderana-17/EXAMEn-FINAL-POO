package school.hei;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Note {
    private Etudiants etudiant;
    private Examen examen;
    private double valeurInitiale;
    private List<NoteHistorique> historique = new ArrayList<>();

    public Note(Etudiants etudiant, Examen examen, double valeurInitiale) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.valeurInitiale = valeurInitiale;
    }

    public void addHistorique(double valeur, Instant date, String motif) {
        historique.add(new NoteHistorique(valeur, date, motif));
    }

    public double getValeurAUnInstant(Instant t) {
        double note = valeurInitiale;
        for (NoteHistorique h : historique) {
            if (!h.getDateChangement().isAfter(t)) {
                note = h.getValeur();
            }
        }
        return note;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }

    public Examen getExamen() {
        return examen;
    }
}
