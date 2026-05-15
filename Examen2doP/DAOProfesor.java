import java.io.*;
import javax.swing.JOptionPane;

public class DAOProfesor {
    
    Profesor obj[] = new Profesor[10];
    int pCont = 0;

    void menu() {
        cargar();
        String var = "si";

        while (var.equalsIgnoreCase("si")) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu profesores: \n"
                + "1.- Dar de alta a un nuevo profesor \n"
                + "2.- Mostrar los datos de los profesores \n"));
            switch (opcion) {
                case 1:
                    pedirProfesor();
                    break;
                
                case 2:
                    mostrarProfesores();
                    break;
                    default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            var = JOptionPane.showInputDialog("Desea repetir el programa?");  
        }
        guardar();
    }

    public void pedirProfesor() {
        if (pCont < 10) {
        String rfc = JOptionPane.showInputDialog("Ingrese el RFC del profesor:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesor:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del profesor:"));
        char genero = JOptionPane.showInputDialog("Ingrese el genero del profesor (M/F):").charAt(0);

        obj[pCont] = new Profesor(rfc, nombre, edad, genero);
        pCont++;
    } else {
        JOptionPane.showMessageDialog(null, "No se pueden agregar mas profesores");
    }
    }

    public void mostrarProfesores() {
        if (pCont == 0) {
            JOptionPane.showMessageDialog(null, "No hay profesores registrados");
            return;
        }
        for (int i = 0; i < pCont; i++) {
            JOptionPane.showMessageDialog(null,
            "El RFC del profesor es: " + obj[i].getRfc() + "\n"
            + "El nombre del profesor es: " + obj[i].getNombre() + "\n"
            + "La edad del profesor es: " + obj[i].getEdad() + "\n"
            + "El genero del profesor es: " + obj[i].getGenero());
        }
    }

    private void guardar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("profesores.dat"))) {
            oos.writeObject(obj);
            oos.writeInt(pCont);
            } catch (Exception e) {
                System.out.println("Error al guardar los profesores: " + e.getMessage()); }
    }

    private void cargar() {
        File file = new File("profesores.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                obj = (Profesor[]) ois.readObject();
                pCont = ois.readInt();
            } catch (Exception e) { 
                System.out.println("Error al cargar los profesores: " + e.getMessage()); }
        }
    }   
}
    