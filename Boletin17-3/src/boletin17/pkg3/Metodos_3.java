
package boletin17.pkg3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos_3 {
    
    int[]notas={2,9,6,4};
    String[]alumnos={"Maria","Roberto","Ana","Manuel"};
    
    public void notaAlumno(){
        for(int i=0;i<alumnos.length;i++){
            System.out.println("Nome: "+alumnos[i]+", nota: "+notas[i]);
        }
    }
    
    public void alumAprobados(){
        System.out.println("\nAlumnos aprobados: ");
        for(int i=0;i<alumnos.length;i++){
            if(notas[i]>=5 && notas[i]<=10){
                System.out.println("Nome: "+alumnos[i]);
            }
        }
    }
    
    public void ordenarLista(){
        System.out.println("\nLista ordenada crecente: ");
        int aux=0;
        for(int i=notas.length-1;i>0;i--){
            for(int j=notas.length-1;j>0;j--){
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
                }
            }
        }
    }
    public void visualizar(){
        for(int not:notas){
            System.out.println("Nota: "+not);
        }
    }
    
    //Neste método hai un fallo.
    public void notAlumnoDeterminado(){
        System.out.println("\nNota dun alumno determinado: ");
        String nome=JOptionPane.showInputDialog("Introduza o nome do alumno: ");
        for(int i=0;i<alumnos.length;i++){
            if(nome.equals(alumnos[i])){
                System.out.println("Nome: "+alumnos[i]+", nota: "+notas[i]);
            }
        }
    }
    
}
