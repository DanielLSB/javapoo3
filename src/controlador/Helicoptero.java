/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author mutsu
 */
public class Helicoptero extends Vehiculo_aereo {
    private String elices,distancia_aterrizaje;
    
    public Helicoptero(){}

    public Helicoptero(String elices, String distancia_aterrizaje, String Tipo_aereo, String carga_maxima, String alcance, String motores, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(Tipo_aereo, carga_maxima, alcance, motores, marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.elices = elices;
        this.distancia_aterrizaje = distancia_aterrizaje;
    }

    public String getElices() {
        return elices;
    }

    public void setElices(String elices) {
        this.elices = elices;
    }

    public String getDistancia_aterrizaje() {
        return distancia_aterrizaje;
    }

    public void setDistancia_aterrizaje(String distancia_aterrizaje) {
        this.distancia_aterrizaje = distancia_aterrizaje;
    }

   public void agregar3(){
     System.out.println("MARCA:  "+getMarca());
    System.out.println("MODELO:  "+getModelo());
    System.out.println("COLOR:  "+getColor());
    System.out.println("AÑO_FABRICACION:"+getAnio_fabricacion());
    System.out.println("NUMERO DE PASAJEOS:  "+getNo_pasajeros());
    System.out.println("ASIENTOS:  "+getAsientos());
     System.out.println("TIPO AEREO:  "+getTipo_aereo());
    System.out.println("CARGA MAXIMA:  "+getCarga_maxima());
    System.out.println("ALCANCE:  "+getAlcance());
    System.out.println("MOTORES:"+getMotores());
    System.out.println("ELICES:  "+getElices());
    System.out.println("DISTANCIA ATERRIZAJE:  "+getDistancia_aterrizaje());
    
    }
    
    
    
    
}
