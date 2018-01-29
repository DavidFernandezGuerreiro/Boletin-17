
package boletin17.pkg2;

/**
 *
 * @author dfernandezguerreiro
 */
public class Metodos_2 {
    
    int[]notas={2,9,6,4};
    
    public void visualizar(){
        for(int not:notas){
            if(not>=5 && not<=10){
                System.out.println("Aprobado: "+not);
            }else{
                System.out.println("Suspenso: "+not);
            }
        }
    }
    
    public void notaMedia(){
        int suma=0;
        for(int i=0;i<notas.length;i++){
            suma=(suma+notas[i]);
        }
        System.out.println("Media= "+suma/4);
    }
    
    public void notaAlta(){
        int notAlta=0;
        for(int i=0;i<notas.length;i++){
            if(notAlta<notas[i]){
                notAlta=notas[i];
            }
        }
        System.out.println("Nota máis alta: "+notAlta);
    }

}
