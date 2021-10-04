package JuegoDeLaVida;

import java.util.Scanner;

public class GameOfLive {
    
    /*
    Si tiene 2 o 3 vecinas: vive
    Si tiene 4 o menos de 2: muere
    Si una casilla vacía tiene dos vecinas: cobra vida
    */
    
    public static void main (String[] args){
        
        Tablero t = new Tablero(15);
        
        //Insertar aquí la disposición inicial
        t.cambiarEstado(0, 2);
        t.cambiarEstado(1, 2);
        t.cambiarEstado(2, 2);
        t.cambiarEstado(2, 1);
        t.cambiarEstado(1, 0);
        
        //fin de la disposición inicial
        t.printTablero();
        
        Scanner sc = new Scanner (System.in);
        
        int n = 1;
        while (n!=0){
            n = sc.nextInt();
            Tablero nuevo = comprobar(t);
            /*
            for (int k = 0; k<10; k++){
                for (int i = 0; i<10; i++){
                    System.out.print(comprobar(t).getCasillaTablero(k, i)+" ");
                }
                System.out.println();
            }*/
            nuevo.printTablero();
            t = nuevo;
        }
    }
    
    private static Tablero comprobar(Tablero t){
        
        Tablero n = new Tablero(15);
        int cuenta = 0;
        for (int f = 0; f < t.getLength(); f++){
            for (int c = 0; c<t.getLengthFila(f); c++){
                int casillasVecinas = 0;
                cuenta++;
                //comprobantes de fila
                if (c - 1 >= 0){
                    if (t.getCasillaTablero(f, (c-1))){
                        casillasVecinas++;
                    }
                }
                
                if (c+1 < t.getLengthFila(f)){
                    if (t.getCasillaTablero(f, c+1)){
                        casillasVecinas++;
                    }
                }
                
                //comprobantes de columna
                if (f-1 >= 0){
                    if (t.getCasillaTablero((f-1), c)){
                        casillasVecinas++;
                    }
                }
                
                if (f+1 < t.getLength()){
                    if (t.getCasillaTablero(f+1, c)){
                        casillasVecinas ++;
                    }
                }
                
                
                //diagonales
                
                //c-1, f-1
                if (c - 1 >= 0 && f-1 >= 0){
                    if (t.getCasillaTablero((f-1), (c-1))){
                        casillasVecinas++;
                    }
                }
                
                //c+1, f-1
                if (c+1 < t.getLengthFila(f) && (f-1)>=0){
                    if (t.getCasillaTablero(f-1, c+1)){
                        casillasVecinas++;
                    }
                }
                
                //c+1, f+1
                if (f+1 < t.getLengthFila(f) && c+1 < t.getLength()) {
                    if (t.getCasillaTablero((f+1), (c+1))){
                        casillasVecinas++;
                    }
                }
                
                //c-1, f+1
                if (f+1 < t.getLength() && c-1 >= 0){
                    if (t.getCasillaTablero(f+1, c-1)){
                        casillasVecinas ++;
                    }
                }
                //matar o vivir células
                
                //System.out.println(cuenta+" "+casillasVecinas);
                if (t.getCasillaTablero(f, c) == false){
                    if (casillasVecinas == 3){
                        n.setTrueTablero(f, c);
                    }
                }
                else{
                    if (casillasVecinas>=2 && casillasVecinas <=3){
                        n.setTrueTablero(f, c); //redundante
                    }
                    else{
                        n.setFalseTablero(f, c);
                    }
                }
                
            }
        }
        
        return n;
    }    
}

/*
detecta hacia abajo y hacia la derecha pero no hacia arriba y hacia la izquierda
*/
























