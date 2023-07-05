
package example.data;


public class Pelis {

   
  
    private String pelicula; 
    private String categoria;
    private byte clasificacion_edad;
    private int numero_asistentes;
    
    public Pelis(String pelicula, String categoria, byte clasificacion_edad, int numero_asistentes) {
        this.pelicula = pelicula;
        this.categoria = categoria;
        this.clasificacion_edad = clasificacion_edad;
        this.numero_asistentes = numero_asistentes;
    }
     public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte getClasificacion_edad() {
        return clasificacion_edad;
    }

    public void setClasificacion_edad(byte clasificacion_edad) {
        this.clasificacion_edad = clasificacion_edad;
    }

    public int getNumero_asistentes() {
        return numero_asistentes;
    }

    public void setNumero_asistentes(int numero_asistentes) {
        this.numero_asistentes = numero_asistentes;
    }
   
      @Override
    public String toString() {
        return "Pelis{" + "pelicula=" + pelicula + ", categoria=" + categoria + ", clasificacion_edad=" + clasificacion_edad + ", numero_asistentes=" + numero_asistentes + '}';
    }

   
   
}
