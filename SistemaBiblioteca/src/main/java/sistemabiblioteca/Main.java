/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;
//BGCB
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("1984", "George Orwell", 1949);
        Revista revista = new Revista("National Geographic", "NG Society", 2021);
        DVD dvd = new DVD("Inception", "Christopher Nolan", 2010);

        RegistroPrestamo registro = new RegistroPrestamo();

        libro.prestar();
        revista.prestar();
        dvd.prestar();

        registro.registrar(libro);
        registro.registrar(revista);
        registro.registrar(dvd);

        libro.devolver();
        dvd.devolver();

        registro.mostrarEstado();
    }
}

