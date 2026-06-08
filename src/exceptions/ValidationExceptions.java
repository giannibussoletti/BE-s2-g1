package exceptions;

public class ValidationExceptions extends RuntimeException {
    // Estendendo RuntimeException questa sarà una unchecked exception
    public ValidationExceptions() {
        super("Errore di validazione"); // Il messaggio che impostiamo nel super
        // Sarà quello che verrà visualizzato nel terminale quando avverrà l'eccezione
    }

    //Questa è una validazione più generica che permette di ricevere un messaggio esternamente
    public ValidationExceptions(String string) {
        super(string);
    }
}
