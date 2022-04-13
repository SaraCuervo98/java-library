package Biblioteca;

import java.time.LocalDate;

public class Revista {
    //// inicializamos los atributos de la clase revista
    private String titulo;
    private Autoria autoria;
    private int prestados;

    // getters y setters

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getPrestados() { return prestados; }

    public void setPrestados(int prestados) { this.prestados = prestados; }

    public void setAutoria(Autoria autoria) { this.autoria = autoria; }

    public Autoria getAutoria() { return autoria; }

    // constructores. Mismo procedimiento que en libro excepto que no tenemos ejemplares, tan solo prestamos ya que hay ejemplares ilimitados

    public Revista() {
    }

    public Revista(String titulo, int prestados, String nombreR, String apellidosR, int year, int month, int dayOfMonth ) {
        //this.autoria = new Autoria(nombreR, apellidosR, LocalDate.of(int year, int month, int dayOfMonth));
        this.titulo = titulo;
        this.prestados = prestados;
        this.autoria= new Autoria(nombreR, apellidosR, LocalDate.of(year,month,dayOfMonth));
    }

    // Métodos: el metodo prestar es poco eficiente pero al tener el mismo funcionamiento que el de libro lo he hecho de la siguiente manera.
    //Partiendo de la base de que hay ejemplares ilimitados, un método que devuelve el número de ejemlares disponibles no tendría sentido porque no sabemos
    // como devolver matematicamente un número infinito. Lo que he hecho es guardar el numero de ejemplares en el de prestados, se inicia un bucle infinito y cuando llega
    // al numero de prestado, se guarda el valor y es lo que se devulve.

    public int prestar() {
        int total = 0;
        for (total = 1; total > 0; total++) {
            if (total == this.prestados) {
                return total;
            }
        }
        return total;
    }
    // la devolción funciona de la misma manera, no es eficiente, pero al haber ejemplares ilimitados no se actualiza el valor de los ejemplares
    public int devolver () {
            int total = 0;
            if (this.prestados > 0) {
                return total = this.prestados;
            } else {
                return total = -1;
            }
        }
    @Override
    public String toString() {
        String salida = "titulo: " + this.titulo
                + "\nPrestados: " + this.prestados + "\n"
         + "Autor con los siguientes datos: " + this.autoria.toString();
        return salida;
    }

    }
