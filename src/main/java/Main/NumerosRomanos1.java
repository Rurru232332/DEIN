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
public class NumerosRomanos1 {
    
    private int n;
    
    public NumerosRomanos1(int num){
        n = num;
    }
    
    public void cambiarNumero(int num){
        n = num;
    }
    
    public String aRomanos(){
        
        if (n>3999 || n<1){
            throw new Error("Imposible escribir "+n+" en romanos!");
        }
        
        else{
            
            //Unidades de millar
            String romano = "";
            
            while (n>=1000){
                n -= 1000;
                romano += "M";
            }
            
            //Centenas
            if (n>=900){
                romano += "CM";
                n -= 900;
            }
            
            else{
                if (n>=500){
                    romano += "D";
                    n -= 500;
                    
                    while (n>=100){
                        romano += "C";
                        n -= 100;
                    }
                }
                else{
                    if (n>=400){
                        romano += "CD";
                        n -= 400;
                    }
                    else{
                        while (n>=100){
                            romano += "C";
                            n -= 100;
                        }
                    }
                }
            }
            
            //Decenas
            if (n>=90){
                romano += "XL";
                n -= 90;
            }
            
            else{
                if (n>=50){
                    romano += "L";
                    n -= 50;
                    
                    while (n>=10){
                        romano += "X";
                        n -= 10;
                    }
                }
                else{
                    if (n>=40){
                        romano += "XL";
                        n -= 40;
                    }
                    else{
                        while (n>=10){
                            romano += "X";
                            n -= 10;
                        }
                    }
                }
            }
            
            if (n>=9){
                romano += "IX";
                n -= 9;
            }
            
            else{
                if (n>=5){
                    romano += "V";
                    n -= 5;
                    
                    while (n>=1){
                        romano += "I";
                        n -= 1;
                    }
                }
                else{
                    if (n>=4){
                        romano += "IV";
                        n -= 4;
                    }
                    else{
                        while (n>=1){
                            romano += "I";
                            n -= 1;
                        }
                    }
                }
            }
            return romano;
        }
        
    }
}
