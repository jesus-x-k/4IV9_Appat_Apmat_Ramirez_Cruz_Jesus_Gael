import java.io.*;
import javax.swing.JOptionPane;


public class DAOEstudiante {
    
    Estudiante obj[] = new Estudiante[10];
    int x = 0;

    public void menu() {
        cargar();
        String var = "si";

        while (var.equalsIgnoreCase("si")) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu estudiantes: \n"
                + "1.- Dar de alta a un nuevo estudiante \n"
                + "2.- Mostrar los datos de los estudiantes \n"));
            switch (opcion) {
                case 1:
                    pedirEstudiante();
                    break;
                
                case 2:
                    mostrarEstudiantes();
                    default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            var = JOptionPane.showInputDialog("Desea repetir el programa?");  
        }
        guardar();
    }

    public void pedirEstudiante() {
        if (x < 10) {
        int numboleta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la boleta del estudiante:"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        char genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante (M/F):").charAt(0);

        obj[x] = new Estudiante(numboleta, nombre, edad, genero);
        x++;
    } else {
        JOptionPane.showMessageDialog(null, "No se pueden agregar mas estudiantes");
    }
    }
    public void mostrarEstudiantes() {
        if (x == 0) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
            return;
        }
        for (int i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null,
            "La boleta del estudiante es: " + obj[i].getNumboleta() + "\n"
            + "El nombre del estudiante es: " + obj[i].getNombre() + "\n"
            + "La edad del estudiante es: " + obj[i].getEdad() + "\n"
            + "El genero del estudiante es: " + obj[i].getGenero());
        }
    }

    private void guardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            oos.writeObject(obj);
            oos.writeInt(x);
            oos.close();
        } catch (Exception e) {
            System.out.println("Error al guardar los estudiantes: " + e.getMessage());
        }
    }

    private void cargar() {
        
            File file = new File("estudiante.dat");
            if (file.exists()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                obj = (Estudiante[]) ois.readObject();
                x = ois.readInt();
                 
        } catch (Exception e) {
            System.out.println("Error al cargar los estudiantes: " + e.getMessage());}
        }
    }
}
