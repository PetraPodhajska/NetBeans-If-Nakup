
package nákup;

import java.util.ArrayList;
import java.util.Scanner;


public class Nákup {

    
    public static void main(String[] args) {
      PolozkaNakupu polozka;
      polozka = new PolozkaNakupu ();
      ArrayList<PolozkaNakupu> seznam = new ArrayList<>();
      
      Scanner vstup = new Scanner (System.in);
      
      System.out.print("Vlož název: ");
      polozka.nazev = vstup.nextLine();
      while (! polozka.nazev.isEmpty()) {
        System.out.print("Vlož cenu za  kus: ");
        polozka.cenakus = vstup.nextDouble();
        System.out.print("Vlož počet kusů: ");
        polozka.kusu = vstup.nextInt();
        seznam.add(polozka);
      //načteme název následující položky
        vstup.nextLine();
        polozka = new PolozkaNakupu();
        System.out.print("Vlož název: ");
        polozka.nazev = vstup.nextLine(); 
      }
      System.out.println();
      
      for (PolozkaNakupu i: seznam) {
        System.out.println("Název zboží: "+i.nazev);
        System.out.println("Cena za kus: "+i.cenakus);
        System.out.println("Počet kusů: "+i.kusu);
        System.out.println("Celkem za položku: "+i.cenakus*i.kusu); 
      } 
      //polozka.nazev = "rohlik";
      //polozka.cenakus = 1.50;
      //polozka.kusu = 9;
      
      
    }
    
}
