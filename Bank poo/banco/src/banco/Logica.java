package banco;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 *
 * @author Julian
 */
public class Logica {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Banco> bancos = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Tarjeta> tarjetas = new ArrayList<>();

    public static void registrarBanco() {
        int id;
        while (true) {
            System.out.print("ID Banco: ");
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Debe ser un número entero.");
                sc.nextLine();
                continue;
            }
            id = sc.nextInt();
            sc.nextLine();
            boolean repetido = false;
            for (Banco b : bancos) {
                if (b.getIdBanco() == id) {
                    System.out.println("Ya existe un banco con ese ID.");
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                break;
            }
        }
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("RUC: ");
        String ruc = sc.nextLine();
        bancos.add(new Banco(id, nombre, direccion, ruc));
        System.out.println("Banco registrado.");
        main.menu();
        guardarDatosJSON();
    }

    public static void registrarClientes() {
        if (bancos.isEmpty()) {
            System.out.println("Debe registrar un banco primero.");
            main.menu();
        }
        int id;
        while (true) {
            System.out.print("ID Cliente: ");
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Debe ser un número entero.");
                sc.nextLine();
                continue;
            }
            id = sc.nextInt();
            sc.nextLine();
            boolean repetido = false;
            for (Cliente c : clientes) {
                if (c.getIdCliente() == id) {
                    System.out.println("Ya existe un cliente con ese ID.");
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                break;
            }
        }
        System.out.print("Nombres: ");
        String nombres = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.println("Seleccione el banco por ID:");
        for (Banco b : bancos) {
            System.out.println(b.getIdBanco() + ": " + b.getNombre());
        }
        int idBanco;
        Banco banco = null;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Debe ser un número entero.");
                sc.nextLine();
                continue;
            }
            idBanco = sc.nextInt();
            sc.nextLine();
            for (Banco b : bancos) {
                if (b.getIdBanco() == idBanco) {
                    banco = b;
                    break;
                }
            }
            if (banco != null) {
                break;
            }
            System.out.println("Banco no encontrado. Intente de nuevo.");
        }
        clientes.add(new Cliente(id, nombres, direccion, dni, banco));
        System.out.println("Cliente registrado.");
        main.menu();
        guardarDatosJSON();
    }

    public static void registrarTarjeta() {
        if (clientes.isEmpty()) {
            System.out.println("Debe registrar un cliente primero.");
            main.menu();
        }
        String numTarjeta;
        while (true) {
            System.out.print("Número de tarjeta: ");
            numTarjeta = sc.nextLine();
            boolean repetido = false;
            for (Tarjeta t : tarjetas) {
                if (t.getNumTarjeta().equals(numTarjeta)) {
                    System.out.println("Ya existe una tarjeta con ese número.");
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                break;
            }
        }
        String tipo;
        while (true) {
            System.out.print("Tipo de tarjeta (Crédito/Débito): ");
            tipo = sc.nextLine();
            if (tipo.equalsIgnoreCase("Crédito") || tipo.equalsIgnoreCase("Débito")) {
                break;
            }
            System.out.println("Tipo inválido. Debe ser 'Crédito' o 'Débito'.");
        }
        double saldo;
        while (true) {
            System.out.print("Saldo: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Saldo inválido. Debe ser un número.");
                sc.nextLine();
                continue;
            }
            saldo = sc.nextDouble();
            if (saldo < 0) {
                System.out.println("El saldo no puede ser negativo.");
                sc.nextLine();
                continue;
            }
            break;
        }
        double interes;
        while (true) {
            System.out.print("Interés: ");
            if (!sc.hasNextDouble()) {
                System.out.println("Interés inválido. Debe ser un número.");
                sc.nextLine();
                continue;
            }
            interes = sc.nextDouble();
            if (interes < 0) {
                System.out.println("El interés no puede ser negativo.");
                sc.nextLine();
                continue;
            }
            break;
        }
        sc.nextLine();
        System.out.println("Seleccione el cliente por ID:");
        for (Cliente c : clientes) {
            System.out.println(c.getIdCliente() + ": " + c.getNombres());
        }
        int idCliente;
        Cliente cliente = null;
        while (true) {
            if (!sc.hasNextInt()) {
                System.out.println("ID inválido. Debe ser un número entero.");
                sc.nextLine();
                continue;
            }
            idCliente = sc.nextInt();
            sc.nextLine();
            for (Cliente c : clientes) {
                if (c.getIdCliente() == idCliente) {
                    cliente = c;
                    break;
                }
            }
            if (cliente != null) {
                break;
            }
            System.out.println("Cliente no encontrado. Intente de nuevo.");
        }
        tarjetas.add(new Tarjeta(numTarjeta, tipo, saldo, interes, cliente));
        System.out.println("Tarjeta registrada.");
        main.menu();
        guardarDatosJSON();
    }

    public static void mostrarInfoCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            main.menu();
        }
        System.out.println("Seleccione el cliente por ID:");
        for (Cliente c : clientes) {
            System.out.println(c.getIdCliente() + ": " + c.getNombres());
        }
        int idCliente = sc.nextInt();
        sc.nextLine();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getIdCliente() == idCliente) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }
        System.out.println("Cliente: " + cliente.getNombres());
        System.out.println("DNI: " + cliente.getDni());
        System.out.println("Dirección: " + cliente.getDireccion());
        Banco banco = cliente.getBanco();
        System.out.println("Banco: " + banco.getNombre() + " (RUC: " + banco.getRuc() + ")");
        System.out.println("Tarjetas:");
        for (Tarjeta t : tarjetas) {
            if (t.getCliente().getIdCliente() == cliente.getIdCliente()) {
                System.out.println("  - " + t.getNumTarjeta() + " (" + t.getTipoTarjeta() + "), Saldo: " + t.getSaldo() + ", Interés: " + t.getInteres());
            }
        }
        main.menu();
        guardarDatosJSON();
    }

    public static void mostrarTarjetasCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        System.out.println("Seleccione el cliente por ID:");
        for (Cliente c : clientes) {
            System.out.println(c.getIdCliente() + ": " + c.getNombres());
        }
        int idCliente = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Tarjeta t : tarjetas) {
            if (t.getCliente().getIdCliente() == idCliente) {
                System.out.println("Tarjeta: " + t.getNumTarjeta() + " (" + t.getTipoTarjeta() + "), Saldo: " + t.getSaldo() + ", Interés: " + t.getInteres());
                found = true;
            }
        }
        if (!found) {
            System.out.println("El cliente no tiene tarjetas registradas.");
        }
        main.menu();
        guardarDatosJSON();
    }

    public static void mostrarClientesBanco() {
        if (bancos.isEmpty()) {
            System.out.println("No hay bancos registrados.");
            main.menu();

        }
        System.out.println("Seleccione el banco por ID:");
        for (Banco b : bancos) {
            System.out.println(b.getIdBanco() + ": " + b.getNombre());
        }
        int idBanco = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Cliente c : clientes) {
            if (c.getBanco().getIdBanco() == idBanco) {
                System.out.println("Cliente: " + c.getNombres() + ", DNI: " + c.getDni());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay clientes registrados en este banco.");
            main.menu();

        }
        main.menu();
        guardarDatosJSON();
    }

    public static void actulizarSaldoTarjeta() {
        if (tarjetas.isEmpty()) {
            System.out.println("No hay tarjetas registradas.");
            main.menu();
        }
        System.out.println("Seleccione la tarjeta por número:");
        for (Tarjeta t : tarjetas) {
            System.out.println(t.getNumTarjeta() + " - " + t.getCliente().getNombres());
        }
        String numTarjeta = sc.nextLine();
        Tarjeta tarjeta = null;
        for (Tarjeta t : tarjetas) {
            if (t.getNumTarjeta().equals(numTarjeta)) {
                tarjeta = t;
                break;
            }
        }
        if (tarjeta == null) {
            System.out.println("Tarjeta no encontrada.");
            return;
        }
        System.out.print("Nuevo saldo: ");
        double nuevoSaldo = sc.nextDouble();
        sc.nextLine();
        tarjeta.setSaldo(nuevoSaldo);
        System.out.println("Saldo actualizado.");
        main.menu();
        guardarDatosJSON();
    }

    public static void calcularInteresesTarjetasCredito() {
        boolean found = false;
        for (Tarjeta t : tarjetas) {
            if ("Crédito".equalsIgnoreCase(t.getTipoTarjeta())) {
                double interesCalculado = t.getSaldo() * t.getInteres() / 100.0;
                System.out.println("Tarjeta: " + t.getNumTarjeta()
                        + " | Cliente: " + t.getCliente().getNombres()
                        + " | Saldo: " + t.getSaldo()
                        + " | Interés (%): " + t.getInteres()
                        + " | Interés calculado: " + interesCalculado);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No hay tarjetas de crédito registradas.");
        }
        main.menu();
        guardarDatosJSON();
    }

    public static void guardarDatosJSON() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("bancos.json")) {
            gson.toJson(bancos, writer);
        } catch (IOException e) {
            System.out.println("Error guardando bancos: " + e.getMessage());
        }
        try (FileWriter writer = new FileWriter("clientes.json")) {
            gson.toJson(clientes, writer);
        } catch (IOException e) {
            System.out.println("Error guardando clientes: " + e.getMessage());
        }
        try (FileWriter writer = new FileWriter("tarjetas.json")) {
            gson.toJson(tarjetas, writer);
        } catch (IOException e) {
            System.out.println("Error guardando tarjetas: " + e.getMessage());
        }
    }

    public static void cargarDatosJSON() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("bancos.json")) {
            Type listType = new TypeToken<ArrayList<Banco>>() {
            }.getType();
            ArrayList<Banco> bancosCargados = gson.fromJson(reader, listType);
            if (bancosCargados != null) {
                bancos = bancosCargados;
            }
        } catch (IOException e) {
            System.out.print(e);

        }
        try (FileReader reader = new FileReader("clientes.json")) {
            Type listType = new TypeToken<ArrayList<Cliente>>() {
            }.getType();
            ArrayList<Cliente> clientesCargados = gson.fromJson(reader, listType);
            if (clientesCargados != null) {
                clientes = clientesCargados;
            }
        } catch (IOException e) {
            System.out.print(e);

        }
        try (FileReader reader = new FileReader("tarjetas.json")) {
            Type listType = new TypeToken<ArrayList<Tarjeta>>() {
            }.getType();
            ArrayList<Tarjeta> tarjetasCargadas = gson.fromJson(reader, listType);
            if (tarjetasCargadas != null) {
                tarjetas = tarjetasCargadas;
            }
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
