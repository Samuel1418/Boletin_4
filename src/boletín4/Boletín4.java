/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín4;

/**
 *
 * @author Samuel
 */
public class Boletín4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche prueba = new Coche();
        prueba.acelerar(20);
        prueba.frenar(9);
       System.out.println(prueba.getVelocidade());
    }
    
}
