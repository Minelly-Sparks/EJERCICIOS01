package Programas;
import java.util.Scanner;
public class TestSandwich {
    public static String tuna(){
        Scanner teclado=new Scanner(System.in);
        String ingredient;
        System.out.println("Sandwiches of :\n chiken\n ham\n cheese\n meat");
        ingredient=teclado.nextLine();
        return ingredient;
    }
     
    public static String wheat(){
        Scanner teclado=new Scanner(System.in);
        String bread;
        System.out.println("Sandwiches of :\n coburg\n stottie\n baguette\n ciabatta");
        bread=teclado.nextLine();
        return bread;
    }
     
    public static Double Ticket(String i, String b){
        Double breadp=0.0;
        Double ingredientp=0.0;
        Double total=0.0;
         
        switch(i){
            case "chiken":
                ingredientp=3.0;
                break;
            case "ham":
                ingredientp=1.8;
                break;
            case "cheese":
                ingredientp=2.5;
                break;
            case "meat":
                ingredientp=4.2;
                break;
        }
         
        switch (b){
            case "coburg":
                breadp=5.9;
                break;
            case "stottie":
                breadp=3.2;
                break;
            case "baguette":
                breadp=2.0;
               break;
            case "ciabatta":
                breadp=8.5;
                break;
        }
         
        total= breadp+ingredientp;
         
        return total;
    }
         public static void main(String[]args){
        String ingredient;
        String bread;
        Double price=0.0;
        ingredient= tuna();
        bread=wheat();
        price=Ticket(ingredient, bread);
        System.out.println(+price);
         
    }
     
}
