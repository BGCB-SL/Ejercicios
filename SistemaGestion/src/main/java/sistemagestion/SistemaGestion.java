/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;
//BGCB
public class SistemaGestion {

    public static void main(String[] args) {
        CuentaBancaria[] cuentas = new CuentaBancaria[3];

        cuentas[0] = new CuentaCorriente(1000);
        cuentas[1] = new CuentaAhorro(2000);
        cuentas[2] = new CuentaInversion(5000);

        for (CuentaBancaria cuenta : cuentas) {
            cuenta.depositar(100);
            cuenta.retirar(50);
            cuenta.calcularInteres();
            System.out.println("Saldo final: " + cuenta.getSaldo());
            System.out.println("---------------------");
        }
    }
}
