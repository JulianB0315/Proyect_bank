package banco;

/**
 *
 * @author Julian
 */
public class Banco {

    private int idBanco;
    private String nombre;
    private String direccion;
    private String ruc;

    public Banco(int idBanco, String nombre, String direccion, String ruc) {
        this.idBanco = idBanco;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    // Getters y setters
    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
}
