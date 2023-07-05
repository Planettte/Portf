
import java.util.Scanner;

public class Ejercicios {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Escriba sus ingresos");
       double ingreso = input.nextDouble();
       System.out.println("Escriba el valor de la casa");
       double valorcasa = input.nextDouble();
       
       double enganche=0;
       double precio1 =0;
       
       if (ingreso<1800000){
           enganche =(valorcasa*0.15);
           precio1 = (valorcasa-enganche)/120;
           
       }else{
           enganche =(valorcasa*0.30);
           precio1 =(valorcasa-enganche)/84;
      
      System.out.printf("por concepto de enganche %.4f",enganche);
      System.out.printf("por concepto de enganche %.2f",precio1);
   
       }
    }
    
}
