import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Lector {
    public List<Libro> leerLibros(String Archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Archivo))) {
            return (List<Libro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer los libros" + e.getMessage());
            return null;
        }
    }
}
