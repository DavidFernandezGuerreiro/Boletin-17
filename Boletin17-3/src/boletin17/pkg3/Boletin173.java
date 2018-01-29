
package boletin17.pkg3;

import java.util.Arrays;

/**
 *
 * @author dfernandezguerreiro
 */
public class Boletin173 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos_3 obx=new Metodos_3();
        //Visualiza a nota dos alumnos:
        obx.notaAlumno();
        //Visualiza os alumnos aprobados:
        obx.alumAprobados();
        //Visualiza unha lista ordenada por orden crecente de notas:
        obx.ordenarLista();
        obx.visualizar();
        //Visualiza a nota dun alumno determinado que pides por teclado:
        //(Neste método hai un fallo)
        obx.notAlumnoDeterminado();
    }
    
}
