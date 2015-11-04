//Ze zadání tří stran určete, jaký je to trojúhelník
//&&= A
//||= NEBO
package trojúhelník;

import java.util.Scanner;

public class Trojúhelník {

    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        System.out.print("Zadej první stranu: ");
        int a  = in.nextInt();
        System.out.print ("Zadej druhou stranu: ");
        int b  = in.nextInt();
        System.out.print ("Zadej třetí stranu: ");
        int c = in.nextInt();
        
        if (! (a+b>c || b+c>a || a+c>b)) {
            System.out.println ("Trojúhelník není možné sestrojit.");
         } else {
            //rovnoramenný může být pravoúhlý, ostroúhlý i tupoúhlý
            if ((a==b && a!=c) || (b==c && b!=a ) || (c==a && c!=b )) {
            }
            //pravoúhlost
            if (a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) {
                System.out.println ("Troujúhelník JE pravoúhlý.");
            } else if (a*a+b*b>c*c && b*b+c*c>a*a && a*a+c*c>b*b){
                System.out.println("Troujúhelník Je ostroúhlý.");
                //ostroúhlý může být rovnostranný
                if (a==b && b==c){
                    System.out.println ("Trojúhelník JE rovnostranný."); 
                }     
        } else {
            System.out.println("Trojúhelník JE tupoúhlý");
        }
    }
}    
}