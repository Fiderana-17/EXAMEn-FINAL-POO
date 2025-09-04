package school.hei;

import school.hei.Enseignant;

public class Matiere {
    private int id;
    private String label;
    private int credits;
    private Enseignant enseignant;


    public Matiere(int id, String label, int credits, Enseignant enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }
}
