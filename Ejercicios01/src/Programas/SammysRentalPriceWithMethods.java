package Programas;
import  java.util.Scanner;
public class SammysRentalPriceWithMethods {
    public static void main(String[]args){
        int t=time();
        motto();
        price(t);
    }
     
    public static int time(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Time you want the rent (in minutes): ");
        int h=teclado.nextInt();
        return h;
    }
     
    public static void motto(){
        System.out.println("The best kayaks of the beach");
    }
     
    public static void price(int h){
        int hours=h/60;
        h=h%60;
        double price=215.00;
        double total=hours*price + (price/40)*h;
        System.out.println("Price per hour: US$"+price);
        System.out.println("Time of rent \n"+hours+" hours \n"+h+" minutes");
        System.out.println("Your total is: \n$"+total);
         
    }
}
