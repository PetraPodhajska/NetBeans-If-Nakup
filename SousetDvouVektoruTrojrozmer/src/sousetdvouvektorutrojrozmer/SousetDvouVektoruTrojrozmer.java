//součet vektorů zadaných v poli

package sousetdvouvektorutrojrozmer;

import java.util.Scanner;


public class SousetDvouVektoruTrojrozmer {

    
    public static void main(String[] args) {
        Scanner vstup = new Scanner (System.in);
        int [] [] pole = new int [2] [3];
        for (int j = 1; j <= 2; j++) {
            System.out.println ("Vektor" +j+ ":");
            for (int i=1; i<=3; i++) {
                System.out.print(i+". složka: ");
                pole [j-1] [i-1] = vstup.nextInt();    
            }
        }
        System.out.print("Součet vektorů: ");
        for (int i=0; i<=2; i++) {
            System.out.print(pole[0] [i]+pole [1] [i]+" ");
        }
        System.out.println();
    }   
}
