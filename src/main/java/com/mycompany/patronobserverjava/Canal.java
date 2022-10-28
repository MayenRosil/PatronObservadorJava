

package com.mycompany.patronobserverjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayen
 */
public class Canal {
    
    private List<Suscriptor> subs = new ArrayList<>();
    private String titulo;
    
    //Agrega Observadores
    public void suscribir(Suscriptor sub){
        subs.add(sub);
        System.out.println(sub.getNombre() + " se ha suscrito :D");
    }
    
    //Quita Observadores
    public void desuscribir(Suscriptor sub){
        subs.remove(sub);
        System.out.println(sub.getNombre() + " se ha desuscrito :(");
    }
    
    //Notifica de su cambio de estado a los Observadores
    public void notificar(){
        for(Suscriptor sub : subs){
            sub.actualizar();
        }
    }
    
    //Cambia su estado
    public void subirVideo(String titulo){
        this.titulo = titulo;
        notificar();
    }

    public String getTitulo() {
        return titulo;
    }
    
    
}
