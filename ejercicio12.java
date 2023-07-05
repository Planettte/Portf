
import java.util.Scanner;



public class ejercicio12 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        System.out.println("Escriba la cantidad de materias que cursa");
        byte materias_estudiante = input.nextByte();
        System.out.println("Escriba su promedio");
        byte promedio = input.nextByte();
      
        float materia=250000;
        float descuento=0;
        float descuento_total=0;
        
        if (promedio>= 9){
           descuento=(float)(materia*0.30);
           descuento_total= (materia-descuento)*materias_estudiante;
        
   
        }else{
            descuento=(float)(materia*0.10);
            descuento_total=(descuento * materias_estudiante);
        }
    
        System.out.print("su descuento es "+descuento_total);
    }   
    
   }

    
