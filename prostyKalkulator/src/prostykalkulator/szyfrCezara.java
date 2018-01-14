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

public class szyfrCezara {

    listaOpcji l = new listaOpcji();

    public void szyfrowanie() {
        String zestaw;
        int przesuń;
        do {
            System.out.println("????????????????\n"
                    + "? Szyfr Cezara ?\n"
                    + "????????????????\n"
                    + "Podaj zestaw znaków, który chcesz zaszyfrować");
            Scanner pobierz = new Scanner(System.in);
            zestaw = pobierz.nextLine();
            char[] x = zestaw.toCharArray();
            System.out.println("Podaj liczbę, o którą ma się przesunąć alfabet");
            przesuń = pobierz.nextInt();
            for (int i = 0; i != x.length; i++) {
                int n = x[i];
                n += przesuń;
                x[i] = (char) n;
            }
            System.out.println("Oto Twój zaszyfrowany ciąg znaków:");
            System.out.println(x);
        } while (l.czyWykonacKolejneZadanie());

    }
}
