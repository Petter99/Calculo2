/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Material {
    // Atributos comunes para cualquier tipo de material en el proyecto de cuantificación.
    private String nombre; // Nombre del material (ej., "Hierro", "Concreto").
    private double cantidad; // Cantidad del material (puede variar dependiendo del cálculo).

    // Constructor de la clase Material.
    // Recibe el nombre del material como parámetro y establece la cantidad en 0.
    public Material(String nombre) {
        this.nombre = nombre;
        this.cantidad = 0; // La cantidad se inicializa en 0 y se ajustará más adelante según los cálculos.
    }

    // Getter para el nombre del material.
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre del material.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la cantidad del material.
    public double getCantidad() {
        return cantidad;
    }

    // Setter para la cantidad del material.
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para mostrar la información básica del material en la consola.
    // Imprime el nombre y la cantidad del material.
    public void mostrarInformacion() {
        System.out.println("Material: " + nombre); // Imprime el nombre del material.
        System.out.println("Cantidad: " + cantidad); // Imprime la cantidad del material.
    }
}

