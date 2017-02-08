package Programas;
import java.util.Scanner;
public class BankAccount {
    private String[] name;
    private Integer accountnum;
    private Double balance;
     
public BankAccount(String a,Integer b, Double c){
     
}   
public void setname(String[] i){
    name=i;
}    
public String[] getname(){
    return name;
}
public void setaccount(Integer I){
    accountnum=I;
}    
public Integer getaccount(){
    return accountnum;
}
public void setbalance(Double t){
    balance=t;
}    
public Double getbalance(){
    return balance;
}
public Double deductMonthlyFee(Double M){
    return M-4.00;
}
public void explainAccountPolicy(){
    System.out.println("The $4 service fee will be deducted each month");
     
}
 public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     System.out.println("What's your name?: ");
     String name=teclado.next();
     System.out.println("Client Acccount");
     int acouuntc=teclado.nextInt();
     System.out.println("Last Balance");
     double balance=teclado.nextDouble();
     BankAccount metodo=new BankAccount(name,acouuntc,balance);
     System.out.println("The balance is :"+metodo.deductMonthlyFee(balance) );
     metodo.explainAccountPolicy();
 }
     
}
