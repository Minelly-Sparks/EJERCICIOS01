package Programas;
import java.util.Scanner;
public class PaintCalulator {
    public static Double AreaPrice(Float a, Float b, Float c){
        Float area=(c*b)+(a*c);
        Float gallons=wgall(area);
        System.out.println("Need"+gallons+" gallons");
        Double price=(Math.ceil(gallons))*32;
        return price;
    }
     
    public static Float wgall(Float a){
        Float cant=a/350;
        return cant;
    }
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
         
        Double price;
        System.out.println("length: ");
        Float length= teclado.nextFloat();
        System.out.println("width: ");
        Float width= teclado.nextFloat();
        System.out.println("height: ");
        Float height = teclado.nextFloat();
         
        price=AreaPrice(length, width, height);
         
        System.out.println("The price for you space is: US$ "+price);
         
    }
}
