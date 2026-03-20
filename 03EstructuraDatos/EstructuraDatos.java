import java.util.Scanner;

class EstructuraDatos {
    public static void main(String[] args) {
        int opcion;
        char letrapararepetir;
        float total = 0;
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("Bienvenido a este programa para verificar que tanto saben programar apartir de algoritmosbasicos.");
        System.out.println("Porfavor elija la opcion deseada");
        System.out.println("1.- Bono por edad");
        System.out.println("2.- Convertir un numero a binario");
        System.out.println("3.- Convertir temperaturas");
        System.out.println("4.- Contar positivos y negativos");
        System.out.println("5.- Tiendita");
        System.out.println("6.- Area y perimetro");
        System.out.println("7.- Tabla de multiplicar");
        System.out.println("8.- Factorial");
        System.out.println("9.- Cuadrado magico");
        System.out.println("10.- Cuadrado hueco");
        System.out.println("11.- Diamante");
        System.out.println("12.- Caluladora");
        System.out.println("13.- Salir");

        opcion = entrada.nextInt();

        switch (opcion) {
        case 1:
            System.out.println("Ingrese su edad");
            int edad = entrada.nextInt();
            if(edad >= 60){
                System.out.println("Tiene un bono de 30%");
            } else if(edad >= 30){
                System.out.println("Tiene un bono del 10%");
            } else {
                System.out.println("No tiene bono");
            }
            break;
        case 2:
            System.out.println("Ingrese un numero positivo entero que se desee convertir a binario");
            int numbinario;
            String guardarbinario = "";
            numbinario = entrada.nextInt();

            if(numbinario > 0){
                while(numbinario > 0){
                    if(numbinario%2 == 0){
                        guardarbinario = "0" + guardarbinario;
                    } else {
                        guardarbinario = "1" + guardarbinario;

                    }
                    numbinario = (int)numbinario/2;
                }
            } else if(numbinario == 0){
                guardarbinario = "0";
        } else {
            guardarbinario = "No se puede convertir ese numero, solo acepta positivos";
        }
        System.out.println("El numero convertido a binario es: " + guardarbinario);
            break;
        case 3:
            System.out.println("Ingrese temperatura en celsius:");
            double c = entrada.nextDouble();
            double f = (c * 9/5) + 32;
            double k = c + 273.15;
            System.out.println("La temperatura en Fahrenheit es: " + f);
            System.out.println("La temperatura en Kelvin es: " + k);
            break;
        case 4:
            int positivos = 0, negativos = 0;
            System.out.println("Cuantos numeros desea ingresar?");
            int n = entrada.nextInt();
            for(int i = 0; i < n; i++){
                int x = entrada.nextInt();
                if(x >= 0) positivos++;
                else negativos++;
            }
            System.out.println("Positivos: " + positivos);
            System.out.println("Negativos: " + negativos);
            break;

        case 5:
            System.out.println("Bienvenido a esta hermosa tienda");
            System.out.println("Porfavor ingrese cunatos elementos va a comprar");
            int elementosproducto = entrada.nextInt(); 
            if(elementosproducto > 0){
                for(int i = 0; i <= elementosproducto; i++){
                    System.out.println("Ingrese el nombre del producto");

                    System.out.println("Ingrese el precio");
                    float precio = entrada.nextFloat();

                    System.out.println("Ingrese la cantidad de productos");
                    int cantidad = entrada.nextInt();

                    total = precio * cantidad;

                }
                System.out.println("El total de su compra es: " + total);

            } else {
                System.out.println("Ingrese solo cantidades positivas");
            }
            break;
            
        case 6:
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Rectangulo");
            System.out.println("3.- Triangulo");
            System.out.println("4.- Trapecio");
            System.out.println("5.- Circulo");
            int figura = entrada.nextInt();
            switch (figura) {
                case 1 -> {
                    System.out.println("Ingrese el lado del cuadrado");
                    double lado = entrada.nextDouble();
                    System.out.println("El area del cuadrado es de: " + (lado*lado));
                    System.out.println("El perimetro del cuadrado es de: " + (4*lado));
                }
                case 2 -> {
                    System.out.println("Ingrese la base del rectangulo");
                    double baserec = entrada.nextDouble();
                    System.out.println("Ingrese la altura del rectangulo");
                    double altura = entrada.nextDouble();
                    System.out.println("El area del rectangulo es de: " + (baserec*altura));
                    System.out.println("El perimetro del rectangulo es de: " + (2*(baserec+altura)));
                }
                case 3 -> {
                    System.out.println("Ingrese la base del triangulo");
                    double basetri = entrada.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    double alturatri = entrada.nextDouble();
                    System.out.println("El area del triangulo es de: " + ((basetri*alturatri)/2));
                    System.out.println("El perimetro del triangulo es de: " + (basetri*3));
                }
                case 4 -> {
                    System.out.println("Ingrese la base mayor del trapecio");
                    double basemayor = entrada.nextDouble();
                    System.out.println("Ingrese la base menor del trapecio");
                    double basemenor = entrada.nextDouble();
                    System.out.println("Ingrese la altura del trapecio");
                    double alturatrap = entrada.nextDouble();
                    System.out.println("El area del trapecio es de: " + (((basemayor+basemenor)*alturatrap)/2));
                    System.out.println("El perimetro del trapecio es de: " + (basemayor+basemenor+(2*alturatrap)));
                }
                case 5 -> {
                    System.out.println("Ingrese el radio del circulo");
                    double radio = entrada.nextDouble();
                    System.out.println("El area del circulo es de: " + (Math.PI*(radio*radio)));
                    System.out.println("El perimetro del circulo es de: " + (2*Math.PI*radio));
                }
                default -> System.out.println("Ingrese solo numeros entre 1 y 5");
            }
            break;



        case 7:
                for (int i = 1; i <= 10; i++) {
                    System.out.println(
                        "| " + i + " | " + (i*10+ " "+(i*100)+ " "+(i*1000)));
                }
    
            case 8:
                System.out.println("Ingrese un numero para calcular su factorial");
                int numf = entrada.nextInt();
                int factorial = 1;
                for(int i = 1; i <= numf; i++){
                    factorial *= i;
                }
                System.out.println("El factorial de " + numf + " es: " + factorial);
                break;

            case 9:
                System.out.println("Vamos a realizar el dibujo de un cuadrado magico");
                System.out.println("Ingrese el tamaño del cuadrado");
                int n1 = entrada.nextInt();

                if(n1 >= 1 && n1 <= 20){
                    for(int i = 1; i <= n1; i++){
                        for(int j = 1; j <= n1; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                } else {
                    System.out.println("Porfavor ingrese solo valores entre 1 y 20");
                    }
                    break;

            case 10:
                System.out.println("Vamos a realizar el dibujo de un cuadrado hueco");
                int th = entrada.nextInt();
                for (int i = 0; i < th; i++) {
                    for (int j = 0; j < th; j++) {
                        if (i == 0 || i == th - 1 || j == 0 || j == th - 1)
                            System.out.print(" * ");
                        else
                            System.out.print("   ");
                    }
                    System.out.println();
                }
                break;

                case 11:
                    System.out.println("Vamos a realizar el dibujo de un diamante");
                    System.out.println("Ingrese el tamaño del diamante");
                    int td = entrada.nextInt();
                    for (int i = 1; i < td; i++) {
                        for (int j = i; j < td; j++) System.out.print(" ");
                        for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 12:
                    System.out.println("Bienvenido a esta hermosa calculadora");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    int cn = entrada.nextInt();
                    System.out.println("Ingrese el primer numero");
                    double resultado = entrada.nextDouble();

                    for(int i = 1; i < cn; i++){
                        System.out.println("Ingrese el operador que desea usar (+,-,*,/)");
                        char op = entrada.next().charAt(0);
                        System.out.println("Ingrese el siguiente numero");
                        double num2 = entrada.nextDouble();

                        switch (op) {
                            case '+' -> resultado += num2;
                            case '-' -> resultado -= num2; 
                            case '*' -> resultado *= num2;
                            case '/' -> resultado /= num2;
                        
                        }
                    }

                System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                    case 13:
                        System.out.println("Gracias por probar mi intento de programa)");
                        break;

                }
            System.out.println("Desea repetir el programa? escribe s o S para si");
            letrapararepetir = entrada.next().charAt(0);
            } while (letrapararepetir != 's' || letrapararepetir == 'S');
    }                      
}
