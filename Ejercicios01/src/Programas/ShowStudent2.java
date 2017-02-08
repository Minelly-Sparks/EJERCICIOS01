package Programas;
public class ShowStudent2 {
   public static void main(String[] args) {
        Student stud=new Student();
        stud.setIdnumber("014404011");
        stud.setCredhours(45);
        stud.setPoints(485);
        stud.gradepoint();
         
        System.out.println("ID: "+stud.getIdnumber());
        System.out.println("Credit hours earned: "+stud.getCredhours());
        System.out.println("Points earned: "+stud.getPoints());
        System.out.println("The Grade Point Average is: "+stud.gradepoint());
    }  
}
