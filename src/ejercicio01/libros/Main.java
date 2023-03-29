package ejercicio01.libros;

public class Main {
    public static void main(String[] args) {

        // Creación de los onjetos Libro
        Libro libro1 = new Libro("979-8724515283", "El poder de estar solo", "Brian Alba", 102);
        Libro libro2 = new Libro("978-6070790461", "Un café contigo", "Kristen Helmstetter", 216);

        // Imprimir los datos de los libros mediante el método toString
        System.out.println(libro1);
        System.out.println(libro2);

        // Validación de cúal libro tiene más páginas.
        String tituloLibMasPags = libro1.getNumPags() < libro2.getNumPags() ? libro2.getTitulo() : libro1.getTitulo();
        System.out.println("El libro que tiene más páginas es: " + tituloLibMasPags);
    }
}
