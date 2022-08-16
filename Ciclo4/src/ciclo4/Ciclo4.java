
package ciclo4;

public class Ciclo4 {

    public static void main(String[] args) {
        int contador = 0;
        for(int z=1; z<=10000; z++){
            
            if (z%20 == 0) {
                contador ++;
            }
        
    }
        System.out.println("La cantidad de números entre 0 y el 10.000 multiplos de 20 son: " + contador);
    }
    
}
