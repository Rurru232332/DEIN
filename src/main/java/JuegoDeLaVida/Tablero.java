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
public class Tablero {
    
    private Fila[] tablero;
    
    public Tablero(){
        
        tablero = new Fila[10];
        for (int k = 0; k<tablero.length; k++){
            tablero[k] = new Fila();
        }
    }
    
    public Tablero(int f, int c){
        
        tablero = new Fila[c];
        for (int k = 0; k<tablero.length; k++){
            tablero[k] = new Fila(f);
        }
    }
    
    public Tablero(int n){
        
        tablero = new Fila[n];
        for (int k = 0; k<tablero.length; k++){
            tablero[k] = new Fila(n);
        }
    }
    
    public boolean getCasillaTablero(int fila, int columna){
        return tablero[columna].getCasillaFila(fila);
    }
    
    public void cambiarEstado (int fila, int columna){
        tablero[columna].cambiarEstadoFila(fila);
    }
    
    public void setTrueTablero(int fila, int columna){
        tablero[columna].setTrueFila(fila);
    }
    
    public void setFalseTablero(int fila, int columna){
        tablero[columna].setFalseFila(fila);
    }
    
    public void printTablero(){
        
        for (int k = 0; k<tablero.length; k++){
            String f = "";
            for (int i = 0; i<tablero[k].getLength(); i++){
                if (tablero[k].getCasillaFila(i) == true){
                    f += " ●";
                }
                else{
                    f += " ○";
                }
            }
            System.out.println(f);
        }
    }
    
    public int getLength(){
        return tablero.length;
    }
    
    public int getLengthFila(int f){
        return tablero[f].getLength();
    }
    
    public static void main (String[] args){
        Tablero t = new Tablero();
        t.printTablero();
    }
}
