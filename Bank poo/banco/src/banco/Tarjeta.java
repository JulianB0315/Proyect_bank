package banco;

/**
 *
 * @author Julian
 */
public class Tarjeta {

    private String numTarjeta;
    private String tipoTarjeta;
    private double saldo;
    private double interes;
    private Cliente cliente;

    public Tarjeta(String numTarjeta, String tipoTarjeta, double saldo, double interes, Cliente cliente) {
        this.numTarjeta = numTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.saldo = saldo;
        this.interes = interes;
        this.cliente = cliente;
    }

    // Getters y setters
    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
