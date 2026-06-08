import exceptions.ZeroException;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class KmLitro {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("calcoliamo quanta benzina hai consumato");
        double chilometri = 0.0;
        while (true) {
            System.out.println("Quanti Chilometri hai percorso?");
            if (scanner.hasNextDouble()) {
                chilometri = scanner.nextDouble();
                try {
                    if (chilometri <= 0) {
                        throw new ZeroException("Il carburante non può essere zero od un numero negativo");
                    } else {
                        break;
                    }
                } catch (ZeroException e) {
                    System.out.println("I chilometri non possono essere zero");
                }
            } else {
                System.out.println("Non è un numero valido");
                scanner.nextLine();
            }
        }

        double carburante = 0.0;
        while (true) {
            System.out.println("Quanto carburante hai consumato");
            if (scanner.hasNextDouble()) {
                carburante = scanner.nextDouble();
                try {
                    if (carburante <= 0) {
                        throw new ZeroException("Il carburante non può essere zero");
                    } else {
                        break;
                    }
                } catch (ZeroException e) {
                    System.out.println("Il carburante non può essere zero");
                }
            } else {
                System.out.println("Non è un numero valido");
                scanner.nextLine();
            }
        }

        double kmLitro = (chilometri / carburante);
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("La tua media di carburante per chilometro è:\n" + df.format(kmLitro) + "km/l");

    }
}
