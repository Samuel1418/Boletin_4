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
public class Coche {
         private int velocidade;
         

    public Coche(){
    velocidade =0 ;
    }
public int getVelocidade(){
    return this.velocidade;
}

public void acelerar (int a){ //al poner .acelerar más un valor in se va sumar a la velocidad el valor
this.velocidade= this.velocidade+a;
}
public void frenar (int b){  //Al poner.frenar le damos un valor y se lo va restar a la velocidad
this.velocidade=this.velocidade-b;
}
}
