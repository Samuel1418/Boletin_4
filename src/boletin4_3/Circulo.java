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
public class Circulo {
 private final double pi= 3.14;
 double radio;
 public Circulo(){
 }
public Circulo(double a){
    radio=a;
}
public double calcArea(){   
double area=this.pi*this.radio*this.radio;
     return area;  //Si no hay void siempre un return
}
public double calcLonx(){
double perimetro= 2*this.pi*radio;
return perimetro;
}
public void setRadio(double j){ //Pedir valor de radio, siempre usar this. para llamar atributos
    this.radio=j;

}
}
