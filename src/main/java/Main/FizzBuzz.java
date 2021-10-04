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
public class FizzBuzz {
    
    private static boolean fizz (int n){
        
        if (n%3 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    private static boolean buzz (int n){
        
        if (n%5 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void fizzBuzz (int hasta){
        
        for (int k = 1; k <= hasta; k++){
            boolean fob = false;
            
            if (fizz(k)){
                fob = true;
                System.out.print("FIZZ");
            }
            if (buzz(k)){
                fob = true;
                System.out.print("BUZZ");
            }
            if (fob == false){
                System.out.print(k);
            }
            fob = false;
            System.out.println();
        }
    }
}
