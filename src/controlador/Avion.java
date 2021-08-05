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
public class Avion extends Vehiculo_aereo{
    private String carrera_despegue,carrera_aterrizaje;
    
    public Avion(){}

    public Avion(String carrera_despegue, String carrera_aterrizaje, String Tipo_aereo, String carga_maxima, String alcance, String motores, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(Tipo_aereo, carga_maxima, alcance, motores, marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.carrera_despegue = carrera_despegue;
        this.carrera_aterrizaje = carrera_aterrizaje;
    }

    public String getCarrera_despegue() {
        return carrera_despegue;
    }

    public void setCarrera_despegue(String carrera_despegue) {
        this.carrera_despegue = carrera_despegue;
    }

    public String getCarrera_aterrizaje() {
        return carrera_aterrizaje;
    }

    public void setCarrera_aterrizaje(String carrera_aterrizaje) {
        this.carrera_aterrizaje = carrera_aterrizaje;
    }

   
    

   
    
    
    public void agregar2(){
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
    System.out.println("CARRERA DESPEGUE:  "+getCarrera_despegue());
    System.out.println("CARRERA ATERRIZAJE:  "+getCarrera_aterrizaje());
    
    }
}
