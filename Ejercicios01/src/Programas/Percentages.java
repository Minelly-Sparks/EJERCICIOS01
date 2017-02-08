package Programas;
public class Percentages {
     public static void main(String[]args){
     
    Double n1=2.0;
    Double n2=5.0;
     
    computePercent(n1, n2);
    computePercent(n2, n1);
   
}
     
    public static void computePercent(Double x, Double y){
        Double percent=(y*100)/x;
        System.out.println(y+" is "+percent+"% of "+x);
    }
     
}
