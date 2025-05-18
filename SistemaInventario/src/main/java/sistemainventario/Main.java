/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventario;
//BGCB
public class Main {
    public static void gestionarVehiculo(Vehiculo v) {
        v.encender();
        v.apagar();

        if (v instanceof Coche) {
            Coche c = (Coche) v;
            c.abrirMaletera();
        } else if (v instanceof Moto) {
            Moto m = (Moto) v;
            m.hacerCaballito();
        } else if (v instanceof Camion) {
            Camion c = (Camion) v;
            c.cargarCargaPesada();
        }
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Coche();  // Polimorfismo
        gestionarVehiculo(vehiculo);
    }
}

