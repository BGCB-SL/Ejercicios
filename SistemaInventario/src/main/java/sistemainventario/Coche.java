/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventario;
//BGCB
public class Coche extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Coche encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Coche apagado");
    }

    public void abrirMaletera() {
        System.out.println("Maletera abierta");
    }
}
