import javax.swing.JOptionPane;

public class HerenciaPersona {
    public static void main(String[] args) {
     int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Bienvenido a mi examnesito \n" +
                "Seleccione una opcion: \n" +
                "1.- Gestionar estudiantes \n" +
                "2.- Gestionar profesores \n" +
                "3.- Salir"));

            switch (opcion) {

                case 1:
                    DAOEstudiante menuEstudiante = new DAOEstudiante();
                    menuEstudiante.menu();
                    break;

                case 2:
                    DAOProfesor menuProfesor = new DAOProfesor();
                    menuProfesor.menu();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Gracias por usar");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
    }
        } while (opcion != 3);
    }

}