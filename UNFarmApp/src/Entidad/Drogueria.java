package Entidad;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Drogueria")
public class Drogueria implements Serializable{

    @Id
    @Column(length = 20)
    private String nitDrogueria;
    @Column(nullable = false, length = 32)
    private String nombreDrogueria;
    @Column(nullable = false, length = 32)
    private String direccionDrogueria;
    @Column(nullable = false, length = 15)
    private String telefonoDrogueria;
    @Column(nullable = false, length = 50)
    private String emailDrogueria;
    @Column(nullable = false, length = 32)
    private String representanteLegalDrogueria;

    public Drogueria() {
    }

    public String getNitDrogueria() {
        return nitDrogueria;
    }

    public void setNitDrogueria(String nitDrogueria) {
        this.nitDrogueria = nitDrogueria;
    }

    public String getNombreDrogueria() {
        return nombreDrogueria;
    }

    public void setNombreDrogueria(String nombreDrogueria) {
        this.nombreDrogueria = nombreDrogueria;
    }

    public String getDireccionDrogueria() {
        return direccionDrogueria;
    }

    public void setDireccionDrogueria(String direccionDrogueria) {
        this.direccionDrogueria = direccionDrogueria;
    }

    public String getTelefonoDrogueria() {
        return telefonoDrogueria;
    }

    public void setTelefonoDrogueria(String telefonoDrogueria) {
        this.telefonoDrogueria = telefonoDrogueria;
    }

    public String getEmailDrogueria() {
        return emailDrogueria;
    }

    public void setEmailDrogueria(String emailDrogueria) {
        this.emailDrogueria = emailDrogueria;
    }

    public String getRepresentanteLegalDrogueria() {
        return representanteLegalDrogueria;
    }

    public void setRepresentanteLegalDrogueria(String representanteLegalDrogueria) {
        this.representanteLegalDrogueria = representanteLegalDrogueria;
    }

}