import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Principal {
    public static void escribirPersona(Persona persona, String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write("nombre=" + persona.getNombre());
            writer.newLine();
            writer.write("apellidoPaterno=" + persona.getApellidoPaterno());
            writer.newLine();
            writer.write("apellidoMaterno=" + persona.getApellidoMaterno());
            writer.newLine();
            writer.write("edad=" + persona.getEdad());
            writer.newLine();
            writer.write("correo=" + persona.getCorreo());
            writer.newLine();
            System.out.println("Persona guardada en: " + archivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static Persona leerPersona(String archivo) {
        Persona persona = new Persona();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] partes = line.split("=", 2);
                 if (partes.length < 2) continue; 
                String clave = partes[0];
                String valor = partes[1];
                switch (clave) {
                    case "nombre":
                        persona.setNombre(valor);
                        break;
                    case "apellidoPaterno":
                        persona.setApellidoPaterno(valor);
                        break;
                    case "apellidoMaterno":
                        persona.setApellidoMaterno(valor);
                        break;
                    case "edad":
                        persona.setEdad(Integer.parseInt(valor));
                        break;
                    case "correo":
                        persona.setCorreo(valor);
                        break;
                }
            }
            System.out.println("Persona leída desde: " + archivo);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return persona;
    }

    public static void main(String[] args) {
        String archivo = "persona.txt";

        Persona persona = new Persona("Juan", "Gomez", "Lopez", 21, "juan.gomez@mail.com");

        System.out.println("=== Datos originales ===");
        System.out.println(persona);

        System.out.println("\n=== Guardando en archivo ===");
        escribirPersona(persona, archivo);

        System.out.println("\n=== Leyendo desde archivo ===");
        Persona personaLeida = leerPersona(archivo);
        System.out.println(personaLeida);

    }
}