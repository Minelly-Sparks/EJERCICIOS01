package Programas;
import java.util.Scanner;
public class Percentages2 {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
     
        System.out.println("Numer one");
        Double n1= teclado.nextDouble();
        System.out.println("Number two");
        Double n2= teclado.nextDouble();
        computePercent(n1, n2);
        computePercent(n2, n1);
   
}
     
    public static void computePercent(Double x, Double y){
        Double percent=(y*100)/x;
        System.out.println(y+" is "+percent+"% de "+x);
    }
}
