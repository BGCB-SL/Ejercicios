/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestion2;
//BGCB
public class Main {
    public static void main(String[] args) {
        Proyecto proyecto1 = new ProyectoSoftware();
        Proyecto proyecto2 = new ProyectoMarketing();

        // Agregando tareas específicas
        ((ProyectoSoftware) proyecto1).agregarTareaDesarrollo("Crear módulo de login");
        ((ProyectoSoftware) proyecto1).agregarTareaDesarrollo("Implementar base de datos");

        ((ProyectoMarketing) proyecto2).agregarTareaCampaña("Lanzar campaña en redes sociales");
        ((ProyectoMarketing) proyecto2).agregarTareaCampaña("Diseñar material publicitario");

        // Listar tareas de cada proyecto
        System.out.println("Tareas Proyecto Software:");
        proyecto1.listarTareas();

        System.out.println("\nTareas Proyecto Marketing:");
        proyecto2.listarTareas();

        // Eliminar una tarea
        proyecto1.eliminarTarea("[Desarrollo] Crear módulo de login");

        System.out.println("\nTareas Proyecto Software después de eliminar una:");
        proyecto1.listarTareas();
    }
}
