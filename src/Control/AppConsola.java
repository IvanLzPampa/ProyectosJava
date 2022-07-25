package Control;

import Model.Persona_academica;
import javax.swing.table.DefaultTableModel;

public class AppConsola {

    Nodo lc;

    public AppConsola() {
        lc = null;
    }

    public boolean vacio() {
        if (lc == null) {
            return true;
        } else {
            return false;
        }
    }

    public void InsertaFinal(Persona_academica c) {
        Nodo nuevo = new Nodo(c);

        if (lc != null) {
            nuevo.setEnlace(lc.getEnlace());
            lc.setEnlace(nuevo);
        }
        lc = nuevo;
    }

    public int resumen() {
        int suma = 0;
        Nodo p;
        if (lc != null) {
            p = lc.getEnlace();
            do {
                suma = suma + p.getInformacion().getEdad();
                p = p.getEnlace();
            } while (p != lc.getEnlace());
        }
        return suma;
    }
    
    
     public void listar (DefaultTableModel modelo ) {
        Nodo aux;
        if (lc != null) {  //verificar que la lista circular no este vacia
            aux = lc.getEnlace();  //desde el inicio
            do {
                modelo.addRow(aux.getInformacion().getInfoCliente());
                aux = aux.getEnlace();
            } while (aux != lc.getEnlace());
        }
    }
     
     
     public Persona_academica buscar(String nom){
        Nodo actual;
        boolean encontrado=false;
        actual=lc;
        while((actual.getEnlace()!=lc) && (!encontrado)){
            encontrado = nom.equals(actual.getInformacion().getNombres());
            if(!encontrado)
                actual=actual.getEnlace();
        }
        
        encontrado = nom.equals(actual.getInformacion().getNombres());
        
        if(encontrado)
            return actual.getInformacion();
        else
            return null;
        
    }

     
     public boolean eliminar(String nom) {
        Nodo actual = lc;
        boolean encontrado = false;
        while ((actual.getEnlace() != lc) && (!encontrado)) {
            encontrado = actual.getEnlace().getInformacion().getNombres().equalsIgnoreCase(nom);
            if (!encontrado) {
                actual = actual.getEnlace();
            }
        }
              encontrado = actual.getEnlace().getInformacion().getNombres().equalsIgnoreCase(nom);
     

        if (encontrado) {
            Nodo n = actual.getEnlace();             
           if (lc == lc.getEnlace()) 
            {
                lc = null;
            } else {
                if (n == lc) 
                {
                    lc = actual;
                }

                actual.setEnlace(n.getEnlace());
            }
            return true;
        }
        else
            return false;

    }
     
}
