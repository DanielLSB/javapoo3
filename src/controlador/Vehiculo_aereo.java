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
public class Vehiculo_aereo extends Vehiculo{
    private String Tipo_aereo,carga_maxima,alcance,motores;
    
    public Vehiculo_aereo(){}

    public Vehiculo_aereo(String Tipo_aereo, String carga_maxima, String alcance, String motores, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.Tipo_aereo = Tipo_aereo;
        this.carga_maxima = carga_maxima;
        this.alcance = alcance;
        this.motores = motores;
    }

    public String getTipo_aereo() {
        return Tipo_aereo;
    }

    public void setTipo_aereo(String Tipo_aereo) {
        this.Tipo_aereo = Tipo_aereo;
    }

    public String getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(String carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public String getMotores() {
        return motores;
    }

    public void setMotores(String motores) {
        this.motores = motores;
    }

   

    
    
}
