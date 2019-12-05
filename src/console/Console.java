/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

/**
 *
 * @author douglasro
 */
public class Console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        while(contador < 5){
            System.out.println(contador);
        }
        if (contador == 5){
            System.out.println("Contador igual a 5");
        }
        
    }
    
}
