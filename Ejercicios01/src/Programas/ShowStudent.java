package Programas;
public class ShowStudent {
    public static class Student {
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
    public static void main(String[] args) {
        Student stud=new Student();
        stud.setIdnumber("32452");
        stud.setCredhours(10);
        stud.setPoints(20);
        stud.gradepoint();
         
        System.out.println("ID:"+stud.getIdnumber());
        System.out.println("Credit hours earned: "+stud.getCredhours());
        System.out.println("Points earned: "+stud.getPoints());
        System.out.println("The Grade Point Average is: "+stud.gradepoint());
    }
}
