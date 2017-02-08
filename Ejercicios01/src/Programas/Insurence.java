package Programas;
import java.util.Scanner;
public class Insurence {
    public static Integer amount(Integer x, Integer y){
        Integer premium= (((x-y)/10)+15)*20;
        return premium;
    }
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
         
        System.out.println("Calendar Year");
        Integer year=teclado.nextInt();
        System.out.println("Birth year:");
        Integer age= teclado.nextInt();
        Integer premium=amount(year, age);
        System.out.println("El importe total de la prima es: "+premium);
         
    }
     
}
