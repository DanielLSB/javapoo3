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
public class Moto extends Vehiculo_terrestre {
    private String ejes,tipo_arranque;
    
    public Moto(){}

    public Moto(String ejes, String tipo_arranque, String uso, String transmision, String velocidades, String motor, String cilindros, String placa, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(uso, transmision, velocidades, motor, cilindros, placa, marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.ejes = ejes;
        this.tipo_arranque = tipo_arranque;
    }

    public String getEjes() {
        return ejes;
    }

    public void setEjes(String ejes) {
        this.ejes = ejes;
    }

    public String getTipo_arranque() {
        return tipo_arranque;
    }

    public void setTipo_arranque(String tipo_arranque) {
        this.tipo_arranque = tipo_arranque;
    }
    
    public void agregar1(){
    System.out.println("MARCA:  "+getMarca());
    System.out.println("MODELO:  "+getModelo());
    System.out.println("COLOR:  "+getColor());
    System.out.println("AÑO_FABRICACION:"+getAnio_fabricacion());
    System.out.println("NUMERO DE PASAJEOS:  "+getNo_pasajeros());
    System.out.println("ASIENTOS:  "+getAsientos());
    System.out.println("USO  "+getUso());
    System.out.println("TRANSMISION:  "+getTransmision());
    System.out.println("VELOCIDADES:  "+getVelocidades());
    System.out.println("MOTOR:  "+getMotor());
    System.out.println("CILINDROS:  "+getCilindros());
    System.out.println("PLACA:  "+getPlaca());
    System.out.println("EJES:  "+getEjes());
    System.out.println("TIPO ARRANQUE:  "+getTipo_arranque());
    }
}
