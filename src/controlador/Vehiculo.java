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
abstract public class Vehiculo {
    private String marca, modelo,color,anio_fabricacion,no_pasajeros,asientos;
    
    public Vehiculo (){}

    public Vehiculo(String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio_fabricacion = anio_fabricacion;
        this.no_pasajeros = no_pasajeros;
        this.asientos = asientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio_fabricacion() {
        return anio_fabricacion;
    }

    public void setAnio_fabricacion(String anio_fabricacion) {
        this.anio_fabricacion = anio_fabricacion;
    }

    public String getNo_pasajeros() {
        return no_pasajeros;
    }

    public void setNo_pasajeros(String no_pasajeros) {
        this.no_pasajeros = no_pasajeros;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }
    
    public void agregar(){
  
  
    }
    
    
}
