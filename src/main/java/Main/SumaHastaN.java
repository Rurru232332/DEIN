package Main;

public class SumaHastaN {
    
    public static int sumarHasta(int n){
        
        int total = 0;
        for (int k = n; k>0; k--){
            total += k;
        }
        
        return total;
    }
    
    public static int sumarAlCuadrado(int n){
        
        int total = 0;
        for (int k = n; k>0; k--){
            int cuadrado = k*k;
            total += cuadrado;
        }
        return total;
    }
    public static int sumarSoloPares(int n){
    
        int total = 0;
        for (int k = n; k>0; k--){
            if (k%2 == 0){
                total += k;
            }
        }
        
        return total;
    }
    
    public static int sumarSoloPrimos(int n){
        
        int total = 0;
        for (int k = n; k>1; k--){
            if (primo(k)){
                total += k;
            }
        }
        return total;
    }
    
    private static boolean primo(int n){
        
        if (n>2 && (n%2 == 0 || n<=1)){
            return false;
        }
        else{
            boolean primo = true;
            int contador = 0;
            for (int k = 1; k<=n; k++){
                if (n%k == 0){
                    contador++;
                }
                if (contador>2){
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }
}

//                                               D A R K N E S S   I M P R I S I O N I N G   M E                                                           \\

