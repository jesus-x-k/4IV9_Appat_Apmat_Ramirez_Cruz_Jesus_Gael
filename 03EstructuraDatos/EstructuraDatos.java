import java.util.Scanner;

class EstructuraDatos {
    public static void main(String[] args) {
        int opcion;
        char letrapararepetir;
        float compra = 0;
        Scanner entrada = new Scanner(System.in);

        do{
        System.out.println("Bienvenido a este programa para verificar que tanto saben programar apartir de algoritmosbasicos.");
        System.out.println("Porfavor elija la opcion deseada");
        System.out.println("1.-");
        System.out.println("2.-");
        System.out.println("3.-");
        System.out.println("4.-");
        System.out.println("5.-");
        System.out.println("6.-");
        System.out.println("7.-");
        System.out.println("8.-");
        System.out.println("9.-");
        System.out.println("10.-");
        System.out.println("11.-");
        System.out.println("12.-");
        System.out.println("13.-");
        System.out.println("14.- Salir");

        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:

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

            break;
        case 4:

            break;

        case 5:
            System.out.println("Bienvenido a esta hermosa tienda");
            System.out.println("Porfavor ingrese cunatos elementos va a comprar");
            int elementosproducto = 0;
            elementosproducto = entrada.nextInt(); 
            if(elementosproducto > 0){
                for(int i = 1; i <= elementosproducto; i++){
                    System.out.println("Ingrese el precio");
                    float precio = 0;
                    precio = entrada.nextFloat();
                    float resultado;
                    System.out.println("Ingrese la cantidad de producto");
                    int cantidad = 0;
                    cantidad = entrada.nextInt();
                    resultado = precio * cantidad;
                    
                    compra = resultado + compra;

                }
                System.out.println("El total de su compra es: " + compra);

            } else {
                System.out.println("Ingrese solo cantidades positivas");
            }
            break;
            
        default:
            break;
            case 6:
                break;

            case 7:
                for (int n = 1; n <= 10; n++) {
                    System.out.println(
                        "|" + n + "| " +
                    (n*10 + (n*100)) + "" + (n*1000));
                    break;
                }
            
            case 8:
                break;

            case 9:
                System.out.println("Vamos a realizar el dibujo de un cuadrado magico");
                System.out.println("Ingrese el tamaño del cuadrado");
                int n1 = entrada.nextInt();

                if(n1 >= 1 && n1 <= 20){
                    for(int i = 1; i <= n1; i++){
                        for(int j = 1; j <= n1; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    
                break;


        }
        System.out.println("Desea repetir el programa? escribe s o S para si");
        letrapararepetir = entrada.next().charAt(0);
        } while (letrapararepetir != 's' || letrapararepetir == 'S');
            
    
    }
}