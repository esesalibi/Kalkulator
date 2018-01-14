/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prostykalkulator;

/**
 * Paczka stworzona podczas tworzenia projektu nazwana w ten sam sposób co cały projekt
 */

/**
 *
 * @author Sebix
 */

import java.util.Scanner;

public class ProstyKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcja;
        Kalkulator k = new Kalkulator();
        Menu m = new Menu();
        info i = new info();
        szyfrCezara s = new szyfrCezara();
        Scanner pobierz = new Scanner(System.in);

        do {
            m.wyswietl();
            opcja = pobierz.nextInt();
            switch (opcja) {
                case 1:
                    k.dodawanie();
                    break;
                case 2:
                    k.odejmowanie();
                    break;
                case 3:
                    k.mnozenie();
                    break;
                case 4:
                    k.dzielenie();
                    break;
                case 5:
                    s.szyfrowanie();
                    break;
                case 6:
                    i.wyswietl();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takiej opcji. Nastąpi zamknięcie programu");
                    System.exit(0);

            }
        } while (true);

    }

    // TODO code application logic here
}
