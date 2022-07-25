
package Model;


public class Persona_academica {
    private String codigo;
    private String nombres;
    private char genero;
    private int edad;

    public Persona_academica() {
    }

    public Persona_academica(String codigo, String nombres, char genero, int edad) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.genero = genero;
        this.edad = edad;
    }
    
    public Object []  getInfoCliente(){
        Object [] fila = {getCodigo(),getNombres(),getGenero(),getEdad()}; 
        return fila;
    }
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    
}
