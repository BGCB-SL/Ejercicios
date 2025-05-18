/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionempleados;
//BGCB
import java.util.ArrayList;
public class Main {
    public static void procesarNomina(ArrayList<Empleado> empleados) {
        double total = 0;
        for (Empleado e : empleados) {
            double salario = e.calcularSalario();
            System.out.println("Empleado: " + e.nombre + ", Salario: " + salario);
            total += salario;
        }
        System.out.println("Salario total a pagar: " + total);
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Luis", 5000));
        empleados.add(new Desarrollador("Ana", 4000));
        empleados.add(new Diseñador("Carlos", 3500));

        procesarNomina(empleados);
    }
}