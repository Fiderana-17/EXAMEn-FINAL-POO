package school.hei;

import java.time.LocalDate;

public class Tuteur {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String lien;

    public Tuteur(int id, String nom, String prenom, LocalDate dateNaissance,
                  String email, String telephone, String lien) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.lien = lien;
    }
}
