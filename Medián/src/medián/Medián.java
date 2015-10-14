// vypočtěte medián z řady čísel zakončených nulou

package medián;

import java.util.Arrays;
import java.util.Scanner;


public class Medián {

    public static void main(String[] args) {
        final int MAX = 100;
        int[] pole = new int [MAX];
        int pocet = 0;
        Scanner vstup = new Scanner (System.in);
        System.out.print ("Vlož číslo:");
        int cislo = vstup.nextInt ();
        while (cislo != 0) {
            pole [pocet++] = cislo;
            System.out.print ("Vlož číslo: ");
            cislo = vstup.nextInt();
        }
        Arrays.sort(pole,0,pocet);
        if (pocet%2 == 1) {
            // lichý počet prvků
            System.out.println ("Medián: "+pole[pocet/2]);
        } else {
            // sudý počet prvků
            // výstupem je průměr dvou středních prvků
            // přetipúování na float kvůli desetinnému výstupu
             System.out.println ("Medián: "+
                     ((float) pole[pocet/2]+pole[pocet/2-1])/2);
        }
    }
    
}
