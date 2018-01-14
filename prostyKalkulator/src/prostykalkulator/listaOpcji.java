/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prostykalkulator;

/**
 *
 * @author Sebix
 */
import java.util.Scanner;

public class listaOpcji {

    public boolean czyWykonacKolejneZadanie() {

        Scanner pobierz = new Scanner(System.in);

        System.out.println("Naciśnij 1 aby wykonać kolejne działanie, 2 aby wyjść do głównego menu lub\n"
                + "0 aby zamknąć program.");

        int opcja = pobierz.nextInt();
        switch (opcja) {
            case 0:
                System.exit(0);
                break;

            case 1:
                return true;

            case 2:
                return false;
            default:
                System.out.println("Automatyczne zamknięcie programu");
                System.exit(0);

        }
        return false;
    }

    public void czyWyjscDoMenu() {
        Scanner pobierz = new Scanner(System.in);

        System.out.println("Naciśnij 1 aby wyjść do głównego menu lub\n"
                + "cokolwiek aby zamknąć program.");

        int opcja = pobierz.nextInt();
        if (opcja == 1) {
            return;
        }

        System.exit(0);
    }

}
