package Programas;
import java.util.Scanner;
public class CarlysEventPriceWithMethods {
    public static int numberofguests () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("How many guests will be there?");
        int guests = teclado.nextInt();
 
        return guests;
    }
 
    public static void Printmotto(String motto) {
 
        System.out.println("The company motto is: " + motto);
 
    }
 
    public static void precioenvento(int guests) {
        int PricePerGuest = 35;
        int price = PricePerGuest * guests;
        int LargeEvent = 50;
        if (guests > LargeEvent) {
            System.out.println("The price are: US$ " + price );
            System.out.println("Its a Large Event");
        } else {
            System.out.println("The price are : US$ " + price );
        }
 
    }
 
    public static void main(String[] args) {
        int guests = numberofguests();
        String motto = "Be Our Guest";
        System.out.println("The guests were: " + guests + " personas");
        Printmotto(motto);
        precioenvento(guests);
    }
 
}
    

