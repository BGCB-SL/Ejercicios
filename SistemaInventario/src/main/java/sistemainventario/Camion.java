/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventario;
//BGCB
public class Camion extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Camión encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Camión apagado");
    }

    public void cargarCargaPesada() {
        System.out.println("Cargando carga pesada");
    }
}
