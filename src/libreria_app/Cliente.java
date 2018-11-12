/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria_app;

import java.util.ArrayList;

/**
 *
 * @author Diego Aguilef
 */
public class Cliente  extends Persona{
    private Fecha fecha_subscripcion;
    private ArrayList<Libro> librosAdquiridos;

    public Cliente() {
    }
    /**
     * 
     * @param rut
     * @param nombre
     */
    public Cliente(String rut, String nombre) {
        super(rut, nombre);
        this.fecha_subscripcion = new Fecha();
        this.librosAdquiridos = new ArrayList<>();
    }

    public Fecha getFecha_subscripcion() {
        return fecha_subscripcion;
    }

    public void setFechaSubscripcion(Fecha fecha_subscripcion) {
        this.fecha_subscripcion = fecha_subscripcion;
    }

    public ArrayList<Libro> getLibrosAdquiridos() {
        return librosAdquiridos;
    }
    /**
     * 
     * @param libro 
     */
    public void setLibro(Libro libro) {
        this.librosAdquiridos.add(libro);
    }
    
    public void setLibrosAdquiridos(Libro libro) {
        this.librosAdquiridos.add(libro);
    }

    @Override
    public String toString() {
      String libros = "";
      int indice = 1;
      for(Libro libro:librosAdquiridos){
        libros += indice+": "+libro.getNombre()+"\n";
        indice++;
      }
      return "Cliente: " + super.getNombre() + 
              "Fecha Subscripcion: " + fecha_subscripcion.toString() +
              ", Libros: " + libros;
    }
    
}
