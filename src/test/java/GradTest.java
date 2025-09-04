import school.hei.*;

import org.junit.jupiter.api.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GradeServiceTest {

    @Test
    public void testGetExamGrade() {
        Tuteur tuteur = new Tuteur(1, "RAJOELINA", "Andry", LocalDate.of(1980, 10, 11),
                "andry@gmail.com", "0341234567", "Père");

        Etudiants etudiants = new Etudiants(1, "Irina", "Stéphane", LocalDate.of(2005, 5, 20),
                "irina@gmail.com", "0349876543", "Groupe K1", tuteur);

        Enseignant enseignant = new Enseignant(1, "Tsikiniaina", "Tsilavina", LocalDate.of(1947, 3, 15),
                "tsila@gmail.com", "0341112233", "Back-end");

        Matiere course = new Matiere(1, "PROG2", 6, enseignant);

        Examen exam1 = new Examen(1, "Une histoire des notes", course, Instant.now(), 2);

        Note note1 = new Note(etudiants, exam1, 12);

        List<Note> notes = new ArrayList<>();
        notes.add(note1);

        Grade gradeService = new Grade(notes);


        double result = gradeService.getExamGrade(exam1, etudiants, Instant.now());
        assertEquals(12, result);
    }

    @Test
    public void testGetCourseGrade() {
        Tuteur tuteur = new Tuteur(1, "RAJOELINA", "Mialy", LocalDate.of(1984, 8, 31),
                "mialy@gmail.com", "0341234567", "Mère");

        Etudiants etudiants = new Etudiants(1, "IARO", "Mandrindra Fitiavana", LocalDate.of(2010, 2, 24),
                "mandrindra@gmail.com", "0349876543", "Groupe K4", tuteur);

        Enseignant enseignant = new Enseignant(1, "Jessica", "Mitia", LocalDate.of(1999, 6, 26),
                "jessica@gmail.com", "0341112233", "Langue");

        Matiere course = new Matiere(1, "PROG2", 2, enseignant);

        Examen exam1 = new Examen(1, "Grammaire", course, Instant.now(), 3);
        Examen exam2 = new Examen(2, "Expression Ecrite", course, Instant.now(), 2);

        Note note1 = new Note(etudiants, exam1, 10);
        Note note2 = new Note(etudiants, exam2, 15);

        List<Note> notes = new ArrayList<>();
        notes.add(note1);
        notes.add(note2);

        Grade grade = new Grade(notes);


        double result = grade.getCourseGrade(course, etudiants, Instant.now());
        assertEquals(12, result);
    }
}
