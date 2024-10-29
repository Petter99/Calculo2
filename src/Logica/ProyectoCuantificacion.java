/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ProyectoCuantificacion {
    // Lista para almacenar todos los materiales (Hierro, Concreto, etc.) del proyecto.
    private List<Material> materiales;

    // Constructor de la clase ProyectoCuantificacion.
    // Inicializa la lista de materiales vacía.
    public ProyectoCuantificacion() {
        this.materiales = new ArrayList<>(); // Inicializa la lista como un ArrayList.
    }

    // Método para agregar un material al proyecto.
    public void agregarMaterial(Material material) {
        this.materiales.add(material); // Agrega el material a la lista de materiales.
    }

    // Método para calcular y mostrar la cantidad total de cada material.
    public void calcularTotalMateriales() {
        // Recorre cada material en la lista.
        for (Material material : materiales) {
            // Si el material es de tipo Hierro, llama a su cálculo específico.
            if (material instanceof Hierro) {
                System.out.println("Hierro requerido: " + ((Hierro) material).calcularVarillasRequeridas());
            }
            // Si el material es de tipo Concreto, llama a sus métodos de cálculo específicos.
            else if (material instanceof Concreto) {
                System.out.println("Arena requerida: " + ((Concreto) material).calcularArena());
                System.out.println("Piedrín requerido: " + ((Concreto) material).calcularPiedrin());
                System.out.println("Cemento requerido: " + ((Concreto) material).calcularCemento());
            }
        }
    }
}


