import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String archivo = "libros.dat";

        List<Libro> libros = new ArrayList<>();
        libros.add(new Libro("Crimen y Castigo", "Fiódor Dostoyevski", 1866));
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("La Metamorfosis" , "Franz Kafka", 1915));

        Escritor escritor= new Escritor();
        escritor.guardarLibros(libros, archivo);

        Lector lector = new Lector();
        List<Libro> librosLeidos = lector.leerLibros(archivo);

        System.out.println("Libros leidos desde el archivo: ");
        if(librosLeidos != null) {
            librosLeidos.forEach(System.out::println);
        }
    }
}