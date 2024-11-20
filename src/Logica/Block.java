/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Block {
    double metrosLineales;
    double altura;

    public Block(double metrosLineales, double altura) {
        this.metrosLineales = metrosLineales;
        this.altura = altura;
    }
    
    private int calcularBloques() {
        // Área de la pared
        double areaPared = metrosLineales * altura;

        // Área de un bloque
        double areaBloque = (0.41)*(0.21);
        double cantidadBloques = areaPared / areaBloque;

        // Cantidad de bloques (redondeado hacia arriba)
        return (int) Math.ceil(cantidadBloques);
    }
    
    public String mostrarDatos(){
        return "Cantidad de blocks para un muro de "+this.altura+" de alto y "+this.metrosLineales+" de largo son: "+calcularBloques()+"y con 10% de desperdicio: "+(int) Math.ceil(calcularBloques()*1.10);
    }
    public String calcularRepello() {
        // Área de la pared
        double areaPared = metrosLineales * altura;

        // Cálculo de cemento (1 bolsa por metro cuadrado de repello)
        double bolsasCemento = areaPared;  // 1 bolsa de cemento por m²

        // Cálculo de arena (4 partes de arena por 1 de cemento)
        double volumenArena = areaPared * 0.04; // Aproximadamente 4 partes de arena

        // Mensaje de resumen
        return "Para un repello de " + areaPared + " m², se necesitan aproximadamente " + bolsasCemento 
               + " bolsas de cemento y " + volumenArena + " m³ de arena.";
    }
}
