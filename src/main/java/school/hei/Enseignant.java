package school.hei;

import java.time.LocalDate;

public class Enseignant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String specialite;

    public Enseignant(int id, String nom, String prenom, LocalDate dateNaissance,
                      String email, String telephone, String specialite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
    }
}
