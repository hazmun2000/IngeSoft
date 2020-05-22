package Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable {

    @Id
    @Column(length = 11)
    private String cedulaEmpleado;
    @Column(nullable = false, length = 25)
    private String nombreEmpleado;
    @Column(nullable = false, length = 15)
    private String telefonoEmpleado;
    @Column(nullable = false, length = 32)
    private String direccionEmpleado;
    @Column(nullable = false, length = 25)
    private String apellidoEmpleado;
    @Column(nullable = false, length = 20)
    private String contraseniaEmpleado;
    @Column(nullable = false, length = 50)
    private String correoEmpleado;

    public Empleado() {
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getContraseniaEmpleado() {
        return contraseniaEmpleado;
    }

    public void setContraseniaEmpleado(String contreseniaEmpleado) {
        this.contraseniaEmpleado = contreseniaEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

}
