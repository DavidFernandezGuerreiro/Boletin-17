
package boletin17.pkg1;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos_1 {
    
    public void crearArray(int[]numeros){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int) ((Math.random()*50)+1);
        }
    }
    
    public void visualizar(int[]numeros){
        System.out.println("Visualizar array: ");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
    public void visualizarOReves(int[]numeros){
        System.out.println("\nVisualizar array ao revés: ");
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
