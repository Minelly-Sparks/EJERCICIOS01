package Programas;
import java.util.Scanner;
public class GasPrice {
    public static void betw(Double x){
        Double a=(3.5*x)/100;
        Double b=(4*x)/100;
        System.out.println("Price per barrel is: "+x+" then the price at the pump should be between "+a+" & "+b);
    }
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
         
        System.out.println("assign a value");
        Double pricePerBarrel=teclado.nextDouble();
        betw(pricePerBarrel);
         
    }
     
}
