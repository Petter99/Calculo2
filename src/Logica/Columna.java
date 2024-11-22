/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Columna {
    private int cantidadColumnas;
    private int numeroHierro;
    private double ancho;
    private double largo;
    private double altura;
    private double esl;
    private int cantidadVarillas;
    //variables para los calculos
    String hierro;
    String Esthierro;
    int  cantVarillas;
    int  cantVarillas2;
    double concretom3;
    double arena;
    double piedrin;
    int cemento;

    public Columna(int cantidadColumnas, int numeroHierro, double ancho, double largo, double altura, double esl, int cantidadVarillas) {
        this.cantidadColumnas = cantidadColumnas;
        this.numeroHierro = numeroHierro;
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
        this.esl = esl;
        this.cantidadVarillas = cantidadVarillas;
    }

    public void calcularMaterial() {
        //calculos
        //hierro principal
        double barraRequerida = this.altura / 5.6;
        double varillasRequeridas = (int) Math.ceil(this.cantidadVarillas*barraRequerida);
        //estribos
        double varillas = ((this.ancho*2)-0.1 + (this.largo*2)-0.1)+0.1;
        int barrax6m = (int) Math.ceil(6/varillas);
        barraRequerida = (int) Math.ceil((this.altura-0.4)/this.esl);

        //Variables finales
        hierro = tipohierro(this.numeroHierro);
        Esthierro = tipohierro(this.numeroHierro-1);
        cantVarillas =(int) Math.ceil(this.cantidadColumnas*varillasRequeridas);
        cantVarillas2 = (int) Math.ceil((this.cantidadColumnas*barraRequerida)/barrax6m);
        concretom3 = this.altura*this.ancho*this.largo;
        arena = concretom3 *0.75;
        piedrin = concretom3 * 0.5;
        cemento = (int) Math.ceil(concretom3*9);
    }

    public String mostrarDatos() {
        calcularMaterial();
        return "Columna [Cantidad de Varillas de "+hierro+": "+cantVarillas+" Cantidad de varillas de "+Esthierro+" = "+cantVarillas2+
                " Cantidad de Arena: "+arena+"Cantidad de Piedrin: "+piedrin+"Cantidad de Cemento: "+cemento+"]";
    }
    
    private String tipohierro(int num){
        String varilla;
        switch (num) {
            case 1 -> varilla = "null";
            case 2 -> varilla = "1/4";
            case 3 -> varilla = "3/8";
            case 4 -> varilla = "1/2";
            default -> throw new AssertionError();
        }
        
        return varilla;
    }
}
