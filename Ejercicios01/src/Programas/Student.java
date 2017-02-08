package Programas;
import java.util.Scanner;
public class Student {
    private String IDnumber;
    private Integer credithour;
    private Integer points;
     
     public String getIdnumber(){
        return IDnumber; 
    }
     
    public void setIdnumber(String num){
        this.IDnumber=num;
    }
     
     public Integer getCredhours(){
        return credithour; 
    }
     
    public void setCredhours(Integer cred){
        this.credithour=cred;
    }
     
     public Integer getPoints(){
        return points; 
    }
     
    public void setPoints(Integer punt){
        this.points=punt;
    }
     
   public Integer gradepoint(){
       return points/credithour;
   }
     
}
