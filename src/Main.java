import entities.Student;

import java.util.Scanner;

public class Main {
    static void main() throws InterruptedException {
        //-----------GESTIONE DEGLI ERRORI & DEBUGGER--------
        //---------ECCEZIONI
        // è un evento eccezionale che si verifica durante l'esecuzione di un programma
        // e che ne altera il normale flusso di lavoro
        // Esempi:
        // Input errati: inseriamo un numero dove va una stringa
        // Risorse mancanti: cerchiamo di accedere ad un file o a un database che non esiste
        // Errori logici: Tentativo di accedere ad un oggetto null o un indice di Array inesistente
        // Guasti hardware: Si rompe il disco rigido
        // La caratteristica che rende le eccezioni uno strumento così potente per gestire
        // gli errori è la propagazione dell'eccezione.
        // Quando viene riscontrato un errore durante l'esecuzione di un metodo,
        // l'eccezione generata viene propagata a ritroso lungo tutta la catena di chiamate
        // a metodi che ha portato all'errore. Ogni metodo della catena può interrompere
        // la propagazione e gestire l'errore, oppure continuare la propagazione ai metodi
        // superiori, interrompendo la propria esecuzione nel punto in cui è stata generata
        // l'eccezione. Se nessun metodo della catena gestisce l'eccezione e si risale fino
        // all'entry point dell'applicazione (main), essa viene terminata.
        // Propagare una eccezione è detto "exception throwing
        // e fermarne la propagazione "exception catching"

//UNCECKED EXCEPTIONS
        // Sono Exceptions che non devono essere gestite per forza con un try-catch, per queste non abbiamo alcun obbligo di gestione
        // IL codice funzionerà a prescindere anche senza aver messo un try-catch
// CHECKED EXCEPTIONS
        // Con questo tipo di eccezione abbiamo l'OBBLIGO DI GESTIONE. Ciò significa che non potrò neanche eseguire il codice
        //Fino a che non avrò scritto del codice per gestirle
//        Dobbiamo usare il try-catch in questo caso
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Esistono anche ECCEZIONI CUSTOM, sono delle classi che stendono Exception (per le checked) e RuntimeException (per le unchecked)
        Scanner scanner = new Scanner(System.in);
        Student student01 = new Student("Mario", "Rossy");
        String newName = scanner.nextLine();
        student01.setName(newName);

        // Essendo findById gestito da una Exception Checked
        // Bisogna gestire l'errore con un try-catch
        // Se nello stesso blocco di codice t ry { } so che si possono presentare più tipi di eccezione posso optare per multipli catch
        // qualora volessi gestire i diversi tipi di eccezione in maniere diverse
        //        try {
        //            Student.findById(10);
        //        } catch (StudentNotFoundExceptions e) {
        //            throw new RuntimeException(e);
        //        } catch (ValidationException ex) {
        //            System.out.println(ex.getMessage());
        // ex. printStackTrace();
        //        } catch (ArithmeticException ex) {
        //            System.out.println("Sa1vo l'errore nel DB");
        //        } catch (NullPointerException I ArrayIndexOutOfBoundsException ex) {
        //            System. out. println("lnvio email con l'errore a Donald J. Trump");
        //        } catch (Exception ex) {
        //            System. out. println("Nessuna delle precedenti");
        //            ex.printstackTrace();
        //        }
    }
    //Quando viene lanciata un eccezione che viene gestita da un try-catch, si può usare
    //finally che in ogni caso viene eseguito
// Cosa succede se un metodo lancia un'eccezione ma non ha un blocco catch per fermarla? L'eccezione non
// scompare, ma "risale la corrente"
// 1. II metodo che ha generato l'errore smette di lavorare all'istante
// 2. L'eccezione viene passata al metodo "chiamante" (quello che aveva invocato il metodo attuale)
// 3. Java controlla se il chiamante ha un try-catch
    // a. Se SÌ: L'eccezione viene catturata e la risalita si ferma
    // b. Se NO: Anche il chiamante si interrompe e l'eccezione risale ancora di un livello
// II capolinea: Se l'eccezione arriva al metodo main e nessuno la ferma, l'intera applicazione crasha e viene
// stampato lo Stack Trace (la cronologia del viaggio)

    //-------------DEBUGGER----------------------
    // Possiamo creare dei Breakpoints nel codice e vedere cosa succede riga per riga
    
}

