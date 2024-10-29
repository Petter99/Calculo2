/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Hierro extends Material {
    // Atributos específicos para el material de tipo Hierro.
    private int cantidadVarillas; // Cantidad de varillas de hierro.
    private double factor; // Factor para los cálculos de cuantificación.
    private double varillasPorMetro; // Varillas por metro que se utilizan en el cálculo.

    // Constructor de la clase Hierro.
    // Inicializa el nombre, cantidad de varillas, factor y varillas por metro.
    public Hierro(String nombre, int cantidadVarillas, double factor, double varillasPorMetro) {
        super(nombre); // Llama al constructor de la clase base (Material) para establecer el nombre.
        this.cantidadVarillas = cantidadVarillas;
        this.factor = factor;
        this.varillasPorMetro = varillasPorMetro;
    }

    // Método para calcular el total de varillas requeridas para el hierro.
    public double calcularVarillasRequeridas() {
        return this.cantidadVarillas * this.varillasPorMetro * this.factor;
    }
}


