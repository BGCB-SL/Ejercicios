/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;
//BGCB
public class Libro extends ItemBiblioteca implements Prestamo {
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        super(titulo, autor, anioPublicacion);
        this.prestado = false;
    }

    @Override
    public void prestar() {
        prestado = true;
        System.out.println("Libro prestado: " + titulo);
    }

    @Override
    public void devolver() {
        prestado = false;
        System.out.println("Libro devuelto: " + titulo);
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }
}
