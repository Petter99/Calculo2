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
        
        //Se crea un objeto ventana y se hace visible (menu inicial)
        CalculadoraMaterial calculadora = new CalculadoraMaterial();
        Inicio ventana = new Inicio(calculadora);
        //GUI.Solera ventana = new GUI.Solera(calculadora);
        Block block = new Block(20, 3);
        String resultado = block.mostrarDatos();
        String repello = block.calcularRepello();
        System.err.println(resultado);
        System.err.println(repello);
        
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setSize(800,600);
        //asegura que el programa deje de ejecutarse al cerrar la ventana
         ventana.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
         
        
    }
}

