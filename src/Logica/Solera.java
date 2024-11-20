/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author canil
 */
public class Solera {
    private int numeroHierro;
    private double base;
    private double altura;
    private double peralte;
    private double est;
    private double largo;
    //variables para los calculos
    String hierro;
    String Esthierro;
    int  cantVarillas;
    int  cantVarillas2;
    double concretom3;
    double arena;
    double piedrin;
    int cemento;

    public Solera(int numeroHierro, double largo,double base, double altura, double peralte, double est) {
        this.numeroHierro = numeroHierro;
        this.largo = largo;
        this.base = base;
        this.altura = altura;
        this.peralte = peralte;
        this.est = est;
    }

    public void calcularMaterial() {
        //Proceso
        double barrasx6m = this.largo/5.6;
        double barraRequerida = this.base / this.est;
        //estribos

        //Variables finales
        hierro = tipohierro(this.numeroHierro);
        Esthierro = tipohierro(this.numeroHierro-1);
        cantVarillas = (int) Math.ceil(barraRequerida*barrasx6m);
        concretom3 = this.altura*this.base*this.largo;
        arena = concretom3 *0.75;
        piedrin = concretom3 * 0.5;
        cemento = (int) Math.ceil(concretom3*9); 

    }

    public String mostrarDatos() {
        calcularMaterial();
        return "Solera [Cantidad de Varillas de "+hierro+": "+cantVarillas+" Cantidad de varillas de '1/4' = '000'"+
                "Cantidad de Arena: "+arena+"Cantidad de Piedrin: "+piedrin+"Cantidad de Cemento: "+cemento+"]";
    }
    
    private String tipohierro(int num){
        String varilla;
        switch (num) {
            case 2: varilla = "1/4";
                break;
            case 3: varilla = "3/8";
                break;
            case 4: varilla = "1/2";
                break;
            default:
                throw new AssertionError();
        }
        
        return varilla;
    }
}
