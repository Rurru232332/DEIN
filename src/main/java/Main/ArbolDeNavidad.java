package Main;

public class ArbolDeNavidad {
    
    public static void imprimirArbol(){
        imprArbol(10);
    }
    
    public static void imprimirArbol(int n){
        imprArbol(n);
    }
    
    private static void imprArbol(int n){
        for (int k = n; k>0; k--){
            for (int i = k; i>0; i--){
                System.out.print(" ");
            }
            for (int j = n-k; j>0; j--){
                System.out.print("*");
            }
            for (int h=0; h<=n-k; h++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
