package Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Util {
        // esta clase habilita a las clases de libro, revista y autoria a traves de metodos a los que llamaremos a traves de Biblioteca
        static void menu() {
                System.out.println("\n1. Crea el libro");
                System.out.println("2. Crea la revista");
                System.out.println("3. Presta el libro");
                System.out.println("4. Devuelve el libro");
                System.out.println("5. Presta la revista");
                System.out.println("6. Devuelve la revista");
                System.out.println("0. Salir\n");
        }
        // se piden los datos por pantalla y se crea el objeto libro1 con los datos, tambien creamos autoria tras pedir los datos que construyen la LocalDate
        static void crearLibro(Libro libro1) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce el nombre del libro: ");
                String nombreL = sc.nextLine();
                System.out.println("Introudce el número de ejemplares: ");
                int ejemplaresL = sc.nextInt();
                System.out.println("Introudce el número de ejemplares en prestamos: ");
                int prestamosL = sc.nextInt();
                System.out.println("Introuce el nombre del autor: ");
                String autor = sc.next();
                System.out.println("Introduce los apellidos del autor: ");
                String apellidosAutor = sc.next();
                System.out.println("Introduce el dia de nacimiento: ");
                int dayOfMonth = sc.nextInt();
                System.out.println("introduce el mes de nacimiento: ");
                int month = sc.nextInt();
                System.out.println("introduce el año: ");
                int year = sc.nextInt();
                libro1.setTitulo(nombreL);
                libro1.setEjemplares(ejemplaresL);
                libro1.setPrestados(prestamosL);
                libro1.setAutoria(new Autoria(autor, apellidosAutor, LocalDate.of(year, month, dayOfMonth)));
                System.out.println("Se ha creado el libro con " + libro1.toString());
        }
        //mismo procedimiento
        static void crearRevista(Revista revista1) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Introduce el nombre de la revista: ");
                String nombre = sc1.nextLine();
                System.out.println("Introudce el número de ejemplares: ");
                int ejemplares = sc1.nextInt();
                System.out.println("Introduce el nombre del autor: ");
                String autor = sc1.next();
                System.out.println("Introduce los apellidos del autor: ");
                String apellidosAutor = sc1.next();
                System.out.println("Introduce el dia de nacimiento: ");
                int dayOfMonth = sc1.nextInt();
                System.out.println("introduce el mes de nacimiento: ");
                int month = sc1.nextInt();
                System.out.println("introduce el año: ");
                int year = sc1.nextInt();
                revista1.setTitulo(nombre);
                revista1.setPrestados(ejemplares);
                revista1.setAutoria(new Autoria(autor, apellidosAutor, LocalDate.of(year, month, dayOfMonth)));
                System.out.println("Se ha creado la revista con " + revista1.toString());
        }
        // habilitamos los metodos creados en las clase Libro y Revista
        static void prestarLibro (Libro libro1) {
                System.out.println("Se ha prestado el libro, ahora quedan: " + libro1.prestar() + " ejemplares");
        }
        static void devolverLibro(Libro libro1) {
                System.out.println("Se ha devuelto su libro, ahora quedan: " + libro1.devolver() + " ejemplares");
        }
        static void prestarRevista(Revista revista1) {
                System.out.println("Se ha prestado el libro, ahora quedan: " + revista1.prestar() + " ejemplares");
        }
        static void devolverRevista(Revista revista1) {
                System.out.println("Se ha devuelto su revista, ahora quedan: " +revista1.devolver() + " ejemplares");
        }
}
