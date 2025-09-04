package school.hei;
import java.time.Instant;

public class NoteHistorique {
    private double valeur;
    private Instant dateChangement;
    private String motif;

    public NoteHistorique(double valeur, Instant dateChangement, String motif) {
        this.valeur = valeur;
        this.dateChangement = dateChangement;
        this.motif = motif;
    }

    public double getValeur() {
        return valeur;
    }

    public Instant getDateChangement() {
        return dateChangement;
    }

}







