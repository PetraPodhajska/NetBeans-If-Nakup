// spočtěte velikosti předem zadaného 
// počtu dvourozměrných vektorů.

package velikostvektorudvourozmer;

import java.util.Scanner;


public class VelikostVektoruDvourozmer {

  
    public static void main(String[] args) {
       Scanner vstup = new Scanner (System.in);
       System.out.print ("Počet vektorů: ");
       int pocet = vstup.nextInt ();
       for (int i=1; i<=pocet; i++) {
           System.out.print("Vektor "+i+":");
           System.out.print("První složka: ");
           int a = vstup.nextInt ();
           System.out.print("Druhá složka: ");
           int b = vstup.nextInt ();
           System.out.println ("Velikost vektoru: "+
                   Math.sqrt(a*a+b*b));
        }
    } 
}
