import java.util.Scanner;

public class Figura {

    double lado, altura, area, perimetro, base;
    int opcion;
    char letra;
    boolean esValido = false;

    Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        new Figura().menu();
    }

    public void menu() {
        do {
            System.out.println("Este es un programa para calcular Area y Perimetro de figuras geometricas");
            System.out.println("1.- Triangulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Circulo");
            System.out.println("Agregue una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo();
                    break;
                case 2:
                    calcularCuadrado();
                    break;
                case 3:
                    calcularCirculo();
                    break;
                default:
                    System.out.println("Gracias por usar el programa");
                    break;
            }
            System.out.println("Desea calcular otra figura? ingrese s");
            letra = entrada.next().charAt(0);

        } while (letra == 's' || letra == 'S');
    }

    public void calcularTriangulo() {
        System.out.println("Area y Perimetro de un Triangulo");
        System.out.println("Que tipo de triangulo desea calcular?");
        System.out.println("1.- Equilatero");
        System.out.println("2.- Isosceles");
        System.out.println("3.- Escaleno");
        opcion = entrada.nextInt();
        switch (opcion) {

            case 1:
                double lado = 0;
                esValido = false;
                do {
                    System.out.println("Ingrese la base del triangulo");
                    if (entrada.hasNextDouble()) {
                        lado = entrada.nextDouble();
                        if (lado > 0) {
                            esValido = true;
                        } else {
                            System.out.println("Valor no valido, ingrese un numero positivo");
                        }
                    } else {
                        System.out.println("Valor no valido, ingrese unicamente numeros");
                        entrada.next();
                    }
                } while (!esValido);

                double areaE = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
                double perimetroE = 3 * lado;
                System.out.println("El area del triangulo es: " + areaE);
                System.out.println("El perimetro del triangulo es: " + perimetroE);
                break;

            case 2:
                double baseI = 0, ladosI = 0;
                esValido = false;
                System.out.println("Ingrese la base del triangulo");
                baseI = entrada.nextDouble();
                System.out.println("Ingrese los lados iguales del triangulo");
                ladosI = entrada.nextDouble();
                double perimetroI = (2 * ladosI) + baseI;
                double alturaI = Math.sqrt(Math.pow(ladosI, 2) - Math.pow(baseI / 2, 2));
                double areaI = (baseI * alturaI) / 2;

                System.out.println("El area del triangulo es: " + areaI);
                System.out.println("El perimetro del triangulo es: " + perimetroI);
                break;

            case 3:
                double ladoA = 0, ladoB = 0, ladoC = 0;
                esValido = false;
                System.out.println("Ingrese el primer lado del triangulo");
                ladoA = entrada.nextDouble();
                System.out.println("Ingrese el segundo lado del triangulo");
                ladoB = entrada.nextDouble();
                System.out.println("Ingrese el tercer lado del triangulo");
                ladoC = entrada.nextDouble();
                double perimetroS = ladoA + ladoB + ladoC;
                double semiperimetroS = perimetroS / 2;
                double areaS = Math.sqrt(semiperimetroS * (semiperimetroS - ladoA) * (semiperimetroS - ladoB) * (semiperimetroS - ladoC));

                System.out.println("El area del triangulo es: " + areaS);
                System.out.println("El perimetro del triangulo es: " + perimetroS);
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public void calcularCuadrado() {
        System.out.println("Area y Perimetro de un Cuadrado");
        double lado = 0;
        esValido = false;
        System.out.println("Ingrese el lado del cuadrado");
        lado = entrada.nextDouble();

        double areaC = Math.pow(lado, 2);
        double perimetroC = 4 * lado;
        System.out.println("El area del cuadrado es: " + areaC);
        System.out.println("El perimetro del cuadrado es: " + perimetroC);
    }

    public void calcularCirculo() {
        System.out.println("Area y Perimetro de un Circulo");
        double radio = 0;
        esValido = false;
        System.out.println("Ingrese el radio del circulo");
        radio = entrada.nextDouble();

        double areaCir = Math.PI * Math.pow(radio, 2);
        double perimetroCir = 2 * Math.PI * radio;
        System.out.println("El area del circulo es: " + areaCir);
        System.out.println("El perimetro del circulo es: " + perimetroCir);
    }
}
