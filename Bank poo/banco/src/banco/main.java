package banco;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("\n--- Menú ---");
        System.out.println("1. Registrar banco");
        System.out.println("2. Registrar cliente y asociar a banco");
        System.out.println("3. Registrar tarjeta y asociar a cliente");
        System.out.println("4. Mostrar información completa de un cliente");
        System.out.println("5. Mostrar lista de tarjetas de un cliente");
        System.out.println("6. Mostrar clientes registrados en un banco");
        System.out.println("7. Actualizar saldo de una tarjeta");
        System.out.println("8. Calcular intereses de tarjetas de crédito");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción:  ");
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("Opción inválido. Debe ser un número entero.");
                System.out.print("Seleccione una opción:");
                sc.nextLine();
                continue;
            }
            opcion = sc.nextInt();
            sc.nextLine();
            boolean repetido = false;
            switch (opcion) {
                case 1 ->
                    Logica.registrarBanco();
                case 2 ->
                    Logica.registrarClientes();
                case 3 ->
                    Logica.registrarTarjeta();
                case 4 ->
                    Logica.mostrarInfoCliente();
                case 5 ->
                    Logica.mostrarTarjetasCliente();
                case 6 ->
                    Logica.mostrarClientesBanco();
                case 7 ->
                    Logica.actulizarSaldoTarjeta();
                case 8 ->
                    Logica.calcularInteresesTarjetasCredito();
                case 0 -> {
                    Logica.guardarDatosJSON();
                    System.out.println("Saliendo...");
                    System.exit(0);
                }
            }
        }
    }

}
