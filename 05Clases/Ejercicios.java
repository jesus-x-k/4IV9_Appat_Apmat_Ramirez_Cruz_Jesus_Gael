import java.util.Scanner;

public class Ejercicios {
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Elige una opcion: ");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Salir");

        int opcion =0;

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                suma();
                break;

            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            default:
                break;
        }
    }

    public void suma() {
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();
        resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);

    }

    public void resta() {
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();
        resultado = num1 - num2;
        System.out.println("El resultado es: " + resultado);

    }

    public void multiplicacion() {
        double num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextDouble();
        resultado = num1 * num2;
        System.out.println("El resultado es: " + resultado);

    }


}
