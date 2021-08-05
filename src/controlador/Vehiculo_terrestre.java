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
 public class Vehiculo_terrestre extends Vehiculo {
    private String uso,transmision, velocidades, motor, cilindros,placa;

public Vehiculo_terrestre(){}

    public Vehiculo_terrestre(String uso, String transmision, String velocidades, String motor, String cilindros, String placa, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.uso = uso;
        this.transmision = transmision;
        this.velocidades = velocidades;
        this.motor = motor;
        this.cilindros = cilindros;
        this.placa = placa;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
   
}
