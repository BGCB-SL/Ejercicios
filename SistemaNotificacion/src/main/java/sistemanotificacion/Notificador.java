/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanotificacion;
//BGCB
import java.util.ArrayList;
import java.util.List;

public class Notificador {
    private final List<Notificable> listaNotificables;

    public Notificador() {
        listaNotificables = new ArrayList<>();
    }

    public void agregarNotificable(Notificable n) {
        listaNotificables.add(n);
    }

    public void notificarTodos() {
        for (Notificable n : listaNotificables) {
            n.enviarNotificacion();
        }
    }

    public static void main(String[] args) {
        Notificador notificador = new Notificador();

           notificador.agregarNotificable(new CorreoElectronico());
        notificador.agregarNotificable(new SMS());
        notificador.agregarNotificable(new PushNotification());

        notificador.agregarNotificable(new Notificable() {
            @Override
            public void enviarNotificacion() {
                System.out.println("Enviando notificación desde clase anónima.");
            }
        });

        System.out.println("=== Enviando notificaciones ===");
        notificador.notificarTodos();
    }
}
