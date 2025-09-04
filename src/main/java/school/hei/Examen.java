package school.hei;

import java.time.Instant;

public class Examen {
    private int id;
    private String titre;
    private Matiere cours;
    private Instant dateHeure;
    private int coefficient;

    public Examen(int id, String titre, Matiere cours, Instant dateHeure, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public Matiere getCours() {
        return cours;
    }

    public int getId() {
        return id;
    }
}
