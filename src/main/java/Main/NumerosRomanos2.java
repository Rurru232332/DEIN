/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Alumno Tarde
 */
public class NumerosRomanos2 {
    
    private int n;          //número a convertir
    private String romano;  //String del número convertido a romanos
    
    public NumerosRomanos2(int num){
        n = num;
    }
    
    public void cambiarNumero(int num){ //método para cambiar de n
        
        n = num;
    }
    
    public String aRomanos(){ //método para convertir n a romanos
        
        if (n>3999 || n<1){ //Lanza una excepción si el número es menor de 1 o mayor de 3999
            throw new Error("Imposible escribir "+n+" en romanos!");
        }
        
        else{
            romano = "";
            while (n>=1000){ //conversor de las unidades de millar
                n -= 1000;
                romano += "M";
            }
            conversor("M", "D", "C", 100);  //conversor de las centenas
            conversor("C", "L", "X", 10);   //conversor de las decenas
            conversor("X", "V", "I", 1);    //conversor de las unidades
            
            return romano;
        }
        
    }
    
    private String conversor(String mayor, String medio, String menor, int mult){
        
        /*
        Método para convertir las unidades, decenas o centenas a romanos
        menor corresponde a la letra de menor valor
        medio corresponde a la letra inmediatamente superior a menor (menor x 5)
        mayor corresponde a la letra inmediatamente superior a medio (menor x 10)
        mult es la mutiplicidad
        
        Tabla de conversor:
        
                   menor   medio   mayor   mult
        Unidades     I       V       X      1
        Decenas      X       L       C      10
        Centenas     C       D       M      100
        */
            
        if (n>=9*mult){ //conversor de los 9
            romano += menor + mayor;
            n -= 9*mult;
        }

        else{ //conversor de los 5, 6, 7 y 8
            if (n>=5*mult){ //(5)
                romano += medio;
                n -= 5*mult;

                while (n>=mult){ //(6, 7, 8)
                    romano += menor;
                    n -= mult;
                }
            }
            else{
                if (n>=4*mult){ //conversor de los 4
                    romano += menor + medio;
                    n -= 4*mult;
                }
                else{
                    while (n>=mult){ //conversor de los 1, 2 y 3
                        romano += menor;
                        n -= mult;
                    }
                }
            }
        }
        
        return romano;
    }
}
