import java.util.Scanner;
public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nombre = "", apellidopaterno = "", apellidomaterno = "",fechanacimiento = "", direccion = "";

        int cuartos = 0;
        double total = 0;
        int opcion;
        

        do { 
            System.out.println("Menu");
            System.out.println("1. Ingresar datos del cliente");
            System.out.println("2. Ver tipos de piso");
            System.out.println("3. Cuartos y medidas");
            System.out.println("4. Comprar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Datos del Cliente");
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Apellido Paterno: ");
                    apellidopaterno = sc.nextLine();

                    System.out.print("Apellido Materno: ");
                    apellidomaterno = sc.nextLine();

                    System.out.print("Fecha de Nacimiento: ");
                    fechanacimiento = sc.nextLine();

                    System.out.print("Direccion: ");
                    direccion = sc.nextLine();
                    break;


                case 2:
                    System.out.println("Tipos de Piso");
                    System.out.println("1. Porcelanato = $22.35 m2");
                    System.out.println("2. Marmoleado = $34.27 m2");
                    System.out.println("3. Acrilico = $22.94 m2");
                    break;


                case 3:
                    total = 0;

                    do {
                        System.out.print("Cuantos cuartos tiene? (de 2 a 4)");
                        cuartos = sc.nextInt();
                    } while (cuartos <= 1 || cuartos >= 5);
                    for (int i = 1; i <= cuartos; i++) {
                        System.out.print("Cuarto" + i + "---");

                        System.out.print("Largo: ");
                        double largo = sc.nextDouble();

                        System.out.print("Ancho: ");
                        double ancho = sc.nextDouble();

                        double area = largo * ancho;

                        System.out.println("Tipo de piso: ");
                        System.out.println("1. Porcelanato");
                        System.out.println("2. Marmoleado");
                        System.out.println("3. Acrilico");
                        int tipo = sc.nextInt();
                        double precio = 0;
                        String nombrePiso = "";

                    switch (tipo) {
                            case 1:
                                precio = 22.35;
                                nombrePiso = "Porcelanato";
                                break;
                            case 2:
                                precio = 34.27;
                                nombrePiso = "Marmoleado";
                                break;
                            case 3:
                                precio = 22.94;
                                nombrePiso = "Acrilico";
                                break;
                            default:
                                System.out.println("Tipo de piso no valido");
                                
                        }
                        
                        double costo = area * precio;
                        total += costo;
                        
                        System.out.println("Tipo de piso: " + nombrePiso);
                        System.out.println("Costo del cuarto: $" + costo);
                    }
                    break;
                

                case 4:
                    if (total == 0) {
                        System.out.println("No se han ingresado datos de los cuartos");
                        break;
                    }

                    double iva = total * 0.16;
                    double totalConIva = total + iva;

                    System.out.println("Resumen");
                    System.out.println("Cliente: " + nombre + " " + apellidopaterno + " " + apellidomaterno);
                    System.out.println("Fecha de Nacimiento: " + fechanacimiento);
                    System.out.println("Direccion: " + direccion);
                    System.out.println("Total sin IVA: $" + total);
                    System.out.println("IVA: $" + iva);
                    System.out.println("Total con IVA: $" + totalConIva);

                    System.out.print("Desea realizar la compra? (s/n): ");
                    char r = sc.next().charAt(0);

                    if (r == 's' || r == 'S') {
                        double descuento = totalConIva * 0.0795;
                        double totalFinal = totalConIva - descuento;
                        System.out.println("Descuento: $" + descuento);
                        System.out.println("Total a pagar: $" + totalFinal);
                    } else {
                        System.out.println("Compra cancelada");
                    }
                    break;
                

                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        sc.close();
    }
}