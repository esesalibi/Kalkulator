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

public class Kalkulator {

    int a;
    int b;
    listaOpcji l = new listaOpcji();

    public void dodawanie() {
        do {
            System.out.println("Podaj pierwszą liczbę");
            Scanner pobierz = new Scanner(System.in);
            a = pobierz.nextInt();
            System.out.println("Podaj drugą liczbę");
            b = pobierz.nextInt();
            System.out.println("Suma liczb wynosi: " + (a + b));

        } while (l.czyWykonacKolejneZadanie());

    }

    public void odejmowanie() {
        do {
            System.out.println("Podaj pierwszą liczbę");
            Scanner pobierz = new Scanner(System.in);
            a = pobierz.nextInt();
            System.out.println("Podaj drugą liczbę");
            b = pobierz.nextInt();
            System.out.println("Różnica liczb wynosi: " + (a - b));
        } while (l.czyWykonacKolejneZadanie());
    }

    public void mnozenie() {
        do {
            System.out.println("Podaj pierwszą liczbę");
            Scanner pobierz = new Scanner(System.in);
            a = pobierz.nextInt();
            System.out.println("Podaj drugą liczbę");
            b = pobierz.nextInt();
            System.out.println("Wynik mnożenia to: " + (a * b));
        } while (l.czyWykonacKolejneZadanie());
    }

    public void dzielenie() {
        double c;
        double d;
        do {
            System.out.println("Podaj pierwszą liczbę");
            Scanner pobierz = new Scanner(System.in);
            c = pobierz.nextDouble();
            System.out.println("Podaj drugą liczbę");
            d = pobierz.nextDouble();
            while (d == 0) {
                System.out.println("Niepoprawne dane - podana liczba musi być różna od 0");
                System.out.println("Podaj cyfrę większą od 0 ");
                d = pobierz.nextInt();
            }
            System.out.println("Wynik dzielenia to: " + (c / d));
        } while (l.czyWykonacKolejneZadanie());

    }
}
