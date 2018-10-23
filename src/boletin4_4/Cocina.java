/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;/**
 *
 * @author Samuel
 */
public class Cocina {
    private int polbo;
    private int patacas;
    private int clientes;
   
    public Cocina(){};
    
    public Cocina(int a, int b){
    polbo=a;
    patacas=b;
    }
    
    public int getCantidadePolboEPatacas(int p,int t){
     this.patacas=t;
     this.polbo=p;
     int h=p/2;
     int j= (t+h)/2;
     return j;
}
    public void engadirPolbo(int df){
        this.polbo=df;
    }
    public void engadirPatacas (int ll){
        this.patacas=ll;
    }
       public void amosarPolbo(){
      System.out.println(this.polbo);
           
       }
          public void amosarPatacas ( ){
              System.out.println(this.patacas);
          }
}