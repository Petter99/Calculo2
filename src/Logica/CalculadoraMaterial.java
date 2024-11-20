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

public class CalculadoraMaterial {
    private List<String> resultados;

    public CalculadoraMaterial() {
        resultados = new ArrayList<>();
    }

    public void agregarResultado(String resultado) {
        resultados.add(resultado);
    }

    public List<String> obtenerResumen() {
        return resultados;
    }

    public void procesarSolera(int numeroHierro,double largo, double base, double altura, double peralte, double est) {
        Solera solera = new Solera(numeroHierro,largo, base, altura, peralte, est);
        String resultado = solera.mostrarDatos();
        agregarResultado(resultado);
        //System.out.println(resultado); // Para mostrar el resultado en consola o enviarlo a GUI
    }

    public void procesarColumna(int cantidadColumnas, int numeroHierro, double ancho, double largo, double altura, double esl, int cantidadVarillas) {
        Columna columna = new Columna(cantidadColumnas, numeroHierro, ancho, largo, altura, esl, cantidadVarillas);
        String resultado = columna.mostrarDatos();
        agregarResultado(resultado);
        //System.out.println(resultado); // Para mostrar el resultado en consola o enviarlo a GUI
    }
}

