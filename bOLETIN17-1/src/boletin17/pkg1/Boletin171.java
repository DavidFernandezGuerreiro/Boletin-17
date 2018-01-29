
package boletin17.pkg1;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]numeros=new int[6];
        Metodos_1 obx=new Metodos_1();
        //Crea o array con números aleatorios dun rango de 1 a 50.
        obx.crearArray(numeros);
        //Visualiza o array:
        obx.visualizar(numeros);
        //Visualiza o array ao revés:
        obx.visualizarOReves(numeros);
    }
    
}
