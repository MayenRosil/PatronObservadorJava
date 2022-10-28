

package com.mycompany.patronobserverjava;

/**
 *
 * @author mayen
 */
public class Main {

    
    public static void main(String[] args) {
        //Crea Observable
        Canal pildoras = new Canal();
        
        //Crea Observadores
        Suscriptor s1 = new Suscriptor("Julio");
        Suscriptor s2 = new Suscriptor("Jose");
        Suscriptor s3 = new Suscriptor("Bryan");
        
        //Suscribe Observadores
        s1.suscribirse(pildoras);
        s2.suscribirse(pildoras);
        s3.suscribirse(pildoras);
        
        //Cambia el estado del Observable y el Observer reacciona al cambio
        pildoras.subirVideo("Tutorial Java 1");
        
        //Desuscribe observadores
        s2.desuscribirse(pildoras);
        
        //Cambia el estado del Observable y el Observer reacciona al cambio
        pildoras.subirVideo("C# parte 1");
    }
    
}
