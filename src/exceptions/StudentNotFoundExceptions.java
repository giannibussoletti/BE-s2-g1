package exceptions;

public class StudentNotFoundExceptions extends Exception {
    // Estendendo Exception questa sarà una CHECKED EXCEPTION
    public StudentNotFoundExceptions() {
        super("studente non trovato");
    }

    public StudentNotFoundExceptions(int id) {
        super("Lo studente con id: " + id + " non è stato trovato");
    }
}
