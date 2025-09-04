package school.hei;

import java.util.List;
import java.time.Instant;

public class Grade {
    private List<Note> notes;

    public Grade(List<Note> notes) {
        this.notes = notes;
    }


    public double getExamGrade(Examen exam, Etudiants etudiants, Instant t) {
        for (Note n : notes) {
            if (n.getExamen().getId() == exam.getId() && n.getEtudiant().getId() == etudiants.getId()) {
                return n.getValeurAUnInstant(t);
            }
        }
        return 0.0;
    }

    public double getCourseGrade(Matiere course, Etudiants etudiants, Instant t) {
        double total = 0;
        double totalCoef = 0;

        for (Note n : notes) {
            if (n.getEtudiant().getId() == etudiants.getId() && n.getExamen().getCours().getId() == course.getId()) {
                double val = n.getValeurAUnInstant(t);
                int coef = n.getExamen().getCoefficient();
                total += val * coef;
                totalCoef += coef;
            }
        }

        if (totalCoef == 0){
            return 0.0;
        };
        return total / totalCoef;
    }
}
