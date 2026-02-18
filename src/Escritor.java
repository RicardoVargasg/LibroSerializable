import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Escritor {
    public void guardarLibros(List<Libro> libros, String Archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Archivo))) {
            oos.writeObject(libros);
            System.out.println("Libros guardados.");
        } catch (IOException e) {
            System.out.println("Error al guardar los libros: " + e.getMessage());
        }
    }
}

