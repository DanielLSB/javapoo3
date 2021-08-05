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
public class Automovil extends Vehiculo_terrestre {
    
    private String puertas,traccion,torque_maximo;
    
    public Automovil(){}

    public Automovil(String puertas, String traccion, String torque_maximo, String uso, String transmision, String velocidades, String motor, String cilindros, String placa, String marca, String modelo, String color, String anio_fabricacion, String no_pasajeros, String asientos) {
        super(uso, transmision, velocidades, motor, cilindros, placa, marca, modelo, color, anio_fabricacion, no_pasajeros, asientos);
        this.puertas = puertas;
        this.traccion = traccion;
        this.torque_maximo = torque_maximo;
    }

   

    
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTorque_maximo() {
        return torque_maximo;
    }

    public void setTorque_maximo(String torque_maximo) {
        this.torque_maximo = torque_maximo;
    }

  
    public void agregar(){
    
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
    System.out.println("PUERTAS:  "+getPuertas());
    System.out.println("TRACCION:  "+getTraccion());
    System.out.println("TORQUE MAXIMO:  "+getTorque_maximo());
    }
    
    
    
}
