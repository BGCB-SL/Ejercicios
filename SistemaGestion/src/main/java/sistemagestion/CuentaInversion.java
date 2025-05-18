/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;
//BGCB
public class CuentaInversion extends CuentaBancaria {

    public CuentaInversion(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void calcularInteres() {
        double interes = saldo * 0.05;
        saldo += interes;
        System.out.println("Interés aplicado en CuentaInversion: " + interes);
    }
}
