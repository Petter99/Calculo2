/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import GUI.Inicio;
/**
 *
 * @author canil
 */

//Esta clase Main solo es para las pruebas si todo jalaba al 100
//Despues se tendra que eliminar
public class Main {
    public static void main(String[] args) {
        // Crea una instancia de ProyectoCuantificacion para gestionar el proyecto.
        ProyectoCuantificacion proyecto = new ProyectoCuantificacion();
        
        // Crea una instancia de Hierro con nombre, cantidad de varillas, factor y varillas por metro.
        Hierro hierro = new Hierro("Cimiento", 4, 5.4, 0.55);

        // Crea una instancia de Concreto con metros cúbicos, arena, piedrín y cemento.
        Concreto concreto = new Concreto(6.6, 4.95, 3.3, 60);

        // Agrega los materiales al proyecto.
        proyecto.agregarMaterial(hierro);
        proyecto.agregarMaterial(concreto);
        
        // Calcula y muestra la cantidad total de materiales.
        proyecto.calcularTotalMateriales();
        
        //Se crea un objeto ventana y se hace visible (menu inicial)
        Inicio ventana = new Inicio();
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(800,600);
        //asegura que el programa deje de ejecutarse al cerrar la ventana
         ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
         
        
    }
}

