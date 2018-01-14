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

public class info {

    listaOpcji l = new listaOpcji();

    public void wyswietl() {

        System.out.println("|Program wykonał:                          |\n"
                + "|            Sebastian Schulz              |\n"
                + "|       Semestr I Informatyka GĆW02        |\n"
                + "|          Studia Niestacjonarne           |\n"
                + "|Wyższa Szkoła Biznesu w Dąbrowie Górniczej|\n"
                + "----------------------------------------------\n"
        );
        l.czyWyjscDoMenu();
    }
}
