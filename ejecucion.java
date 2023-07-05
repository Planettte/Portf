package example.main;

import java.util.Scanner;
import example.data.Pelis;
import java.util.ArrayList;

public class ejecucion {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Pelis> Informacion = new ArrayList();

        int opt = 1;
        String pelicula = "";
        String categoria = "";
        byte clasificacion_edad;
        int numero_asistentes;
        int cont = 0;
        int contaccion=0;
        int contterror=0;
        int contcomedia=0;
        int contterroryclasificacion=0;

        do {
            System.out.println("***************************************************************************");
            System.out.println("*      1. Listar la informacion de cada una de las peliculas              *");
            System.out.println("*      2. Crear nueva pelicula                                            *");
            System.out.println("*      3. Calcular promedio de asistentes a las pleiculas                 *");
            System.out.println("*      4. Cuantas peliculas se han creado por cada una de las categorias  *");
            System.out.println("*      5. cuantas peliculas de terror tiene clasificacion de 13 años      *");
            System.out.println("*      0. Salir de la aplicacion                                          *");
            System.out.println("***************************************************************************");
            opt = input.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.println("" + Informacion);
                    break;
                }

                case 2 -> {
                    System.out.println("Digite el titulo de la pelicula");
                    pelicula = input.next();
                    System.out.println("Digite la categoria de la pelicula (accion, terror, comedia");
                    categoria = input.next();

                    if (categoria.equalsIgnoreCase("accion") || categoria.equalsIgnoreCase("terror") || categoria.equalsIgnoreCase("comedia")) {
                        //para los contadores de las categorias de las peliculas
                        if (categoria.equalsIgnoreCase("accion")){
                            contaccion=contaccion+1;
                        }

                        if (categoria.equalsIgnoreCase("terror")){
                            contterror=contterror+1;
                        }

                        if (categoria.equalsIgnoreCase("comedia")){
                            contcomedia=contcomedia+1;
                        }

                        System.out.println("Digite la clasificacion de la edad 0,7,13,16");
                        clasificacion_edad = input.nextByte();
                           //clasificacion 13 años peliculas de terror
                           if (categoria.equalsIgnoreCase("terror") && clasificacion_edad==13){
                                contterroryclasificacion=contterroryclasificacion+1;
                           } 

                        if (clasificacion_edad == 0 || clasificacion_edad == 7 || clasificacion_edad == 13 || clasificacion_edad == 16) {
                            System.out.println("Digite el numero de asistentes");
                            numero_asistentes = input.nextInt();
                            cont += numero_asistentes;
                            Informacion.add(new Pelis(pelicula, categoria, clasificacion_edad, numero_asistentes));
                        } else {
                            System.out.println("digite una clasificacion de edad valido");
                            break;
                        }
                    } else {
                        System.out.println("digite una categoria valida");
                        break;
                    }
                }

                case 3 -> {
                    if (Informacion.size() > 0) {
                        System.out.println("El promedio de los asistentes es " + cont / Informacion.size());
                        break;
                    }
                }
                
                case 4->{
                    System.out.println("las peliculas que hay de accion "+contaccion);
                    System.out.println("las peliculas que hay de terror "+contterror);
                    System.out.println("las peliculas que hay de comedia "+contcomedia);  
                    break;
                }
                
                case 5->{
                    System.out.println("las peliculas de terror que tiene clasificacion de 13 años son "+contterroryclasificacion);
                }
            case 0 -> {
                    System.out.println("Proceso finalizado");
                    break;
                }
            }
        } while (opt != 0); 
    }
}
