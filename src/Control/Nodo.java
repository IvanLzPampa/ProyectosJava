
package Control;

import Model.Persona_academica;


public class Nodo {
    private Persona_academica informacion;
    private Nodo enlace;

    public Nodo(Persona_academica inf) {
        this.informacion = inf;
        this.enlace=this;
    }

    public Persona_academica getInformacion() {
        return informacion;
    }

    public void setInformacion(Persona_academica informacion) {
        this.informacion = informacion;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo siguiente) {
        this.enlace = siguiente;
    }
    
    
    
}
