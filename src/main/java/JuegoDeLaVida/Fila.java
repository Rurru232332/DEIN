/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoDeLaVida;

/**
 *
 * @author Alumno Tarde
 */
public class Fila {
    
    private Casilla[] fila;
    
    public Fila(){
        fila = new Casilla [10];
        for (int k = 0; k<fila.length; k++){
            fila[k] = new Casilla();
        }
    }
    
    public Fila(int n){
        fila = new Casilla [n];
        for (int k = 0; k<fila.length; k++){
            fila[k] = new Casilla();
        }
    }
    
    public boolean getCasillaFila(int n){
        if (n<0 || n>fila.length){
            throw new Error ("Índice de array fila fuera de rango!");
        }
        else{
            return fila[n].getEstado();
        }
    }
    
    public void cambiarEstadoFila(int n){
        
        if (n<0 || n>fila.length){
            throw new Error ("Índice de array fila fuera de rango!");
        }
        else{
            if (fila[n].getEstado() == true){
                fila[n].setFalse();
            }
            else{
                fila[n].setTrue();
            }
        }
    }
    
    public void setTrueFila(int n){
        if (n<0 || n>fila.length){
            throw new Error ("Índice de array fila fuera de rango!");
        }
        else{
            fila[n].setTrue();
        }
    }
    
    public void setFalseFila(int n){
        if (n<0 || n>fila.length){
            throw new Error ("Índice de array fila fuera de rango!");
        }
        else{
            fila[n].setFalse();
        }
    }
    
    
    public int getLength(){
        return fila.length;
    }
}
