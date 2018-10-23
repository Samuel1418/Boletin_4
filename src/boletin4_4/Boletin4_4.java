/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author Samuel
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Cocina ca =new Cocina(){};
        
        System.out.println("EL numero de cliente que puedeatender es "+ca.getCantidadePolboEPatacas(50, 60));

        Cocina yu = new Cocina(){};
        yu.engadirPatacas(80);
        yu.engadirPolbo(60);
        System.out.println("O numero de patatas é");
        yu.amosarPatacas();
        System.out.println("O numero de polbos é");
        yu.amosarPolbo();
}
}