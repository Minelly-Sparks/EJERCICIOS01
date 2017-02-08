package Programas;
import java.util.Scanner;
public class MetricConversion {
    public static void main(String[]args){
        Scanner teclado= new Scanner(System.in);
         
        System.out.println("Value: ");
        Integer value=teclado.nextInt();
        inch(value);
        gallon(value);
         
    }
     
    public static void inch(Integer x){
        Double c=x*2.54;
        System.out.println("Hay "+c+" centímetros en "+x+" pulgadas");
    }
     
    public static void gallon(Integer x){
        Double l=x*3.7854;
        System.out.println("Hay "+l+" litros en "+x+" galones");
    }
     
}
