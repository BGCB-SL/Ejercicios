/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;
//BGCB
import java.util.ArrayList;

public class RegistroPrestamo {
    private ArrayList<Prestamo> historial = new ArrayList<>();

    public void registrar(Prestamo item) {
        historial.add(item);
    }

    public void mostrarEstado() {
        for (Prestamo p : historial) {
            System.out.println(p.getClass().getSimpleName() + ": " + ((p.estaPrestado()) ? "Prestado" : "Disponible"));
        }
    }
}
