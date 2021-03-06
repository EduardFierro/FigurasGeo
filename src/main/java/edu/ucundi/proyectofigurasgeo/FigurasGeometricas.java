/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucundi.proyectofigurasgeo;

/**
 * Clase Super Padre de las figuras geometricas
 * @author Eduard Fierro, Arley Rivera
 */
public class FigurasGeometricas {
    
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //posicion x, y del tercer punto (C)
    private double coordenadaXC;
    private double coordenadaYC;
    //Variable que guarda el area de las figuras
    private double area;
     //Variable que guarda el perimetro de las figuras
    private double perimetro;
    //Variable que guarda el tipo de figura 
    private String tipo;
    //Pi que se usa para poder realizar calculos
    public static final double PI = 3.1416;
   
    //Constructor de la clase
    
    public FigurasGeometricas(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB, double coordenadaXC, double coordenadaYC ) {
        this.coordenadaXA = coordenadaXA;
        this.coordenadaYA = coordenadaYA;
        this.coordenadaXB = coordenadaXB;
        this.coordenadaYB = coordenadaYB;
        this.coordenadaXC = coordenadaXC;
        this.coordenadaYC = coordenadaYC;
        
        
    }
    //Metodo que ayuda a calcular el lado de las figuras 
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB){
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    //Metodo get del area
    public double getArea() {
        return area;
    }

    //Metodo set del area
    public void setArea(double area) {
        this.area = area;
    }
    
    //Metodo get de las coordenadas en X del punto A
    public double getCoordenadaXA() {
        return coordenadaXA;
    }

    //Metodo set de las coordenadas en X del punto A
    public void setCoordenadaXA(double coordenadaXA) {
        this.coordenadaXA = coordenadaXA;
    }

    //Metodo get de las coordenadas en Y del punto A
    public double getCoordenadaYA() {
        return coordenadaYA;
    }

    //Metodo set de las coordenadas en Y del punto A
    public void setCoordenadaYA(double coordenadaYA) {
        this.coordenadaYA = coordenadaYA;
    }

    //Metodo get de las coordenadas en X del punto B
    public double getCoordenadaXB() {
        return coordenadaXB;
    }

    //Metodo set de las coordenadas en X del punto B
    public void setCoordenadaXB(double coordenadaXB) {
        this.coordenadaXB = coordenadaXB;
    }

    //Metodo get de las coordenadas en Y del punto B
    public double getCoordenadaYB() {
        return coordenadaYB;
    }

    //Metodo set de las coordenadas en Y del punto B
    public void setCoordenadaYB(double coordenadaYB) {
        
        this.coordenadaYB = coordenadaYB;
    }
    //Metodo get de las coordenadas en X del punto C
    public double getCoordenadaXC() {
        return coordenadaXC;
    }
    //Metodo set de las coordenadas en X del punto C
    public void setCoordenadaXC(double coordenadaXC) {
        this.coordenadaXC = coordenadaXC;
    }
    //Metodo get de las coordenadas en Y del punto C
    public double getCoordenadaYC() {
        return coordenadaYC;
    }
    //Metodo set de las coordenadas en Y del punto C
    public void setCoordenadaYC(double coordenadaYC) {
        this.coordenadaYC = coordenadaYC;
    }
    //Metodo get del perimetro
    public double getPerimetro() {
        return perimetro;
    }

    //Metodo set del perimetro
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Metodo get del tipo de figura
    public String getTipo() {
        return tipo;
    }

    //Metodo set del tipo de figura
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
