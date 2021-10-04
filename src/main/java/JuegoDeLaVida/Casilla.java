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
public class Casilla {
    
    private boolean estado;
    
    public Casilla(){
        estado = false;
    }
    
    public void setTrue(){
        estado = true;
    }
    
    public void setFalse(){
        estado = false;
    }
    
    public boolean getEstado(){
        return estado;
    }
}
