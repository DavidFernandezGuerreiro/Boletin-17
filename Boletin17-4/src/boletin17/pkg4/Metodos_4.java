
package boletin17.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Metodos_4 {
    char[]dniLetras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    public void devolverLetra(){
        int numDni=Integer.parseInt(JOptionPane.showInputDialog("Introduza o número do DNI: "));
        int resto=numDni%23;
        System.out.println("A súa letra do DNI é... "+dniLetras[resto]+"\nDNI completo: "+numDni+" "+dniLetras[resto]);
    }
    
}
