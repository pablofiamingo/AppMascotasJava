package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void altaPerrito(int nroCliente, String nombre, String raza, String color, String esAlergico, String necesitaAtencionEspecial, String nombreDue, String celuDue, String observaciones) {

        //Instancio el objeto Perro
        Perro perrito = new Perro();

        //Le asigno los valores que recibo de la interfaz gráfica
        perrito.setNroCliente(nroCliente);
        perrito.setNombre(nombre);
        perrito.setRaza(raza);
        perrito.setColor(color);
        perrito.setEsAlergico(esAlergico);
        perrito.setNecesitaAtencionEspecial(necesitaAtencionEspecial);
        perrito.setNombreDue(nombreDue);
        perrito.setCeluDue(celuDue);
        perrito.setObservaciones(observaciones);

        controlPersis.altaPerrito(perrito);

    }
}
