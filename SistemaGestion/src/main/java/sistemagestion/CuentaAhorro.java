/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;
//BGCB
public class CuentaAhorro extends CuentaBancaria {

    public CuentaAhorro(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void calcularInteres() {
        double interes = saldo * 0.02;
        saldo += interes;
        System.out.println("Interés aplicado en CuentaAhorro: " + interes);
    }
}