
import java.util.Scanner;



public class ejercicio11 {
    

    public static void main (String []args ){
    Scanner input = new Scanner (System.in);
        System.out.println("Escriba la cantidad del monto");
        double monto=input.nextDouble();     
        
       double total_pagar =0;
       
        if (monto<50000){
         total_pagar= monto-(monto*0.03);
                 
        }else{
         total_pagar=monto-(monto*0.02);   
        }
                 
          System.out.println("su couta inicial es $"+total_pagar);       
       
        
     
    
         
    }
 
 } 
    

