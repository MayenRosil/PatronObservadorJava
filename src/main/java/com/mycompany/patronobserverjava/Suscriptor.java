

package com.mycompany.patronobserverjava;

/**
 *
 * @author mayen
 */
public class Suscriptor {
    
    public Suscriptor(String nombre){
        this.nombre = nombre;
    }
    
    private String nombre;
    private Canal canal = new Canal();
    
    //Reacciona al cambio en el Observable
    public void actualizar(){
        System.out.println("Hey " + this.nombre + ", Video subido: "+canal.getTitulo());
    }
    
    //Suscribe a un observador al canal
    public void suscribirse(Canal cl){
        canal = cl;
        canal.suscribir(this);
    }
    
    //Desuscribe al observador del canal
    public void desuscribirse(Canal cl){
        canal = cl;
        canal.desuscribir(this);
    }

    public String getNombre() {
        return nombre;
    }
  
}
