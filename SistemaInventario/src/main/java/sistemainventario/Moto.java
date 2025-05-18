/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventario;
//BGCB
public class Moto extends Vehiculo {
    @Override
    public void encender() {
        System.out.println("Moto encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Moto apagada");
    }

    public void hacerCaballito() {
        System.out.println("Haciendo caballito");
    }
}
