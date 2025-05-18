/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion2;
//BGCB
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    // Clase interna Tarea
    public class Tarea {
        private String descripcion;
        private boolean completada;

        public Tarea(String descripcion) {
            this.descripcion = descripcion;
            this.completada = false;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public boolean isCompletada() {
            return completada;
        }

        public void completar() {
            this.completada = true;
        }

        @Override
        public String toString() {
            return descripcion + (completada ? " (completada)" : " (pendiente)");
        }
    }

    private List<Tarea> tareas = new ArrayList<>();

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public boolean eliminarTarea(String descripcion) {
        return tareas.removeIf(t -> t.getDescripcion().equalsIgnoreCase(descripcion));
    }

    public void listarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en el proyecto.");
            return;
        }
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

