package Logica;

import java.io.Serializable;
import javax.persistence.*;

//Indico que es una clase Entidad mediante las anotations
@Entity
public class Perro implements Serializable {

    @Id
    private int nroCliente; //Dado que pido al usuario que ingrese el número por interfaz gráfica, no necesito aplicar una asignación secuencial
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String esAlergico;
    private String necesitaAtencionEspecial;
    private String nombreDue;
    private String celuDue;
    private String observaciones;

    //Constructor vacío
    public Perro() {
    }

    //Constructor con parámetros
    public Perro(int nroCliente, String nombre, String raza, String color, String esAlergico, String necesitaAtencionEspecial, String nombreDue, String celuDue, String observaciones) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.esAlergico = esAlergico;
        this.necesitaAtencionEspecial = necesitaAtencionEspecial;
        this.nombreDue = nombreDue;
        this.celuDue = celuDue;
        this.observaciones = observaciones;
    }

    //Getters y setters
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isEsAlergico() {
        return esAlergico;
    }

    public void setEsAlergico(String esAlergico) {
        this.esAlergico = esAlergico;
    }

    public String isNecesitaAtencionEspecial() {
        return necesitaAtencionEspecial;
    }

    public void setNecesitaAtencionEspecial(String necesitaAtencionEspecial) {
        this.necesitaAtencionEspecial = necesitaAtencionEspecial;
    }

    public String getNombreDue() {
        return nombreDue;
    }

    public void setNombreDue(String nombreDue) {
        this.nombreDue = nombreDue;
    }

    public String getCeluDue() {
        return celuDue;
    }

    public void setCeluDue(String celuDue) {
        this.celuDue = celuDue;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
