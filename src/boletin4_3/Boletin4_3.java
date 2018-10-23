/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author Samuel
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo aa=new Circulo(8);//constructor con parametro
        System.out.println("El area del circulo es "+aa.calcArea());
        System.out.println("La longitud o perímetro del circulo es "+aa.calcLonx());
        
         Circulo tt =new Circulo(); //constructor sin parametro
         tt.setRadio(12);
         System.out.println("El area con valor dado es "+tt.calcArea());
         System.out.println("El perimetro con valor dado es "+tt.calcLonx());
        }
        
}
    
    
