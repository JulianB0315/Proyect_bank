/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio.modelo;

/**
 *
 * @author Julian
 */
public class Cliente {
    //Atributos de la Class
    
    String idCLiente;
    String nombre;
    String apellido;
    String sexo;
    String fechaNacimiento;
    String direccion;
    String Telefono;
    String Email;

    public Cliente() {
    }

    public String getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(String idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCLiente=" + idCLiente + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", Telefono=" + Telefono + ", Email=" + Email + '}';
    }
    
}
