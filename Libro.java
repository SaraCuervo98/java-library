package Biblioteca;

import java.time.LocalDate;

public class Libro {
    // inicializamos los atributos de la clase libro
    private String titulo;
    private int ejemplares, prestados;
    private Autoria autoria;


    //getter y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() { return prestados; }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public void setAutoria(Autoria autoria) { this.autoria = autoria; }

    public Autoria getAutoria() { return autoria; }


    //Constructores, haremos un constructor con los datos que se piden por pantalla de cara a crear tanto la clase libro como la clase autoria
    public Libro(String titulo, int prestados, int ejemplares, String autor, String apellidosAutor, int year, int month, int dayOfMonth) {
        this.titulo=titulo;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
        this.autoria= new Autoria(autor, apellidosAutor, LocalDate.of(year,month,dayOfMonth));
    }
    // constrimos un constructor vacia para poder crear el objeto y mas adelamte llamar al otro constructor a traves de los setters
    public Libro() {

    }

    // metodos:Comprueba que efectivamentehay ejemplares disponibles
    // para poder hacer el préstamo (que no estén todos prestados).
    // El método devuelve un número entero con el número de ejemplares
    // disponibles en la biblioteca después de este préstamo, o -1
    // encaso de que no se haya podido hacer (todos los ejemplares estaban prestados).
    // el total comprueba si el numero de ejemplares es mayor que el de prestado, en caso de que asi sea devuelve el total calculado
    public int prestar(){
        int total = this.ejemplares - this.prestados;
            if (total > 0) {
            return total-1;
        } else {
                return total = -1;
            }
    }
    // el metodo devolver comprueba que el numero de prestados sea mayor que 0 ya que sino no habrá nada que devolver
    // en caso de que asi sea, el numero de ejemplares se actualiza sumando el numero de prestados, en caso contrario devulve -1
    public int devolver() {
        int total = 0;
        if (this.prestados > 0) {
            return total = this.ejemplares += this.prestados;
        } else {
            return total = -1;
        }
    }
    @Override
    public String toString() {
        String salida =  "titulo: " + this.titulo
                + "\nPrestamos: " + this.prestados
                 + "\nEjemplares: " + this.ejemplares
               +  "\nAutor con los siguientes datos: " + this.autoria.toString()
        ;
        return salida;
    }

}
