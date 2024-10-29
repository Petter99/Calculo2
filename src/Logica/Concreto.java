/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Concreto extends Material {
    // Atributos específicos para el material de tipo Concreto.
    private double metrosCubicos; // Metros cúbicos de concreto necesarios.
    private double cantidadArena; // Cantidad de arena requerida por metro cúbico de concreto.
    private double cantidadPiedrin; // Cantidad de piedrín requerida por metro cúbico de concreto.
    private int cantidadCemento; // Cantidad de cemento en bolsas necesaria por metro cúbico.

    // Constructor de la clase Concreto.
    // Inicializa los metros cúbicos, cantidad de arena, piedrín y cemento.
    public Concreto(double metrosCubicos, double cantidadArena, double cantidadPiedrin, int cantidadCemento) {
        super("Concreto"); // Llama al constructor de Material para definir el nombre.
        this.metrosCubicos = metrosCubicos;
        this.cantidadArena = cantidadArena;
        this.cantidadPiedrin = cantidadPiedrin;
        this.cantidadCemento = cantidadCemento;
    }

    // Método para calcular la cantidad total de arena requerida.
    public double calcularArena() {
        return this.metrosCubicos * this.cantidadArena;
    }

    // Método para calcular la cantidad total de piedrín requerido.
    public double calcularPiedrin() {
        return this.metrosCubicos * this.cantidadPiedrin;
    }

    // Método para calcular la cantidad total de cemento requerido.
    public double calcularCemento() {
        return this.metrosCubicos * this.cantidadCemento;
    }
}

