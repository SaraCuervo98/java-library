package Biblioteca;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        // mismo funcionamiento que en la practica 1, un switch dentro un while infinito hasta que el booleano cambie a false y se salga del while
        boolean dentro = true;
        System.out.println("Bienvenido al sistema gestor de bibliotecas !!");
        // se crean los objetos para usarlos en el switch y se llama al menu de Util
        Libro libro1 = new Libro();
        Revista revista1 = new Revista();
        Autoria autoria1 = new Autoria();
            while(dentro) {
                Util.menu();
                Scanner sc = new Scanner(System.in);
                System.out.println("\nInserta una opcion: ");
                int opcion = sc.nextInt();
                System.out.println();
        // los case funcionan con metodos de la clase util en vez de con funciones
                switch (opcion) {
                    case 1:
                        Util.crearLibro(libro1);
                        break;
                    case 2:
                        Util.crearRevista(revista1);
                        break;
                    case 3:
                        Util.prestarLibro(libro1);
                        break;
                    case 4:
                        Util.devolverLibro(libro1);
                        break;
                    case 5:
                        Util.prestarRevista(revista1);
                        break;
                    case 6:
                        Util.devolverRevista(revista1);
                        break;
                    case 0:
                        dentro = false;
                        System.out.println("Has salido del menú");
                    default:
                        // para los casos en los que el ususario introduzca un valor que se salga del intervalo
                        System.out.println("Solo se permiten las opciones del 0 al 6");
                }
            }

    }


}
