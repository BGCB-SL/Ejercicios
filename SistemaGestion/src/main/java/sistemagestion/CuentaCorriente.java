/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion;
//BGCB
public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void calcularInteres() {
        System.out.println("CuentaCorriente: sin interés aplicado.");
    }
}
