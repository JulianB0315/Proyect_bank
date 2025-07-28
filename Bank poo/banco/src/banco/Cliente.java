package banco;

/**
 *
 * @author Julian
 */
public class Cliente {

    private int idCliente;
    private String nombres;
    private String direccion;
    private String dni;
    private Banco banco;

    public Cliente(int idCliente, String nombres, String direccion, String dni, Banco banco) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.direccion = direccion;
        this.dni = dni;
        this.banco = banco;
    }

    // Getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
