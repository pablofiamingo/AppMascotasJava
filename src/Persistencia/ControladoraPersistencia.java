package Persistencia;

import Logica.Perro;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    PerroJpaController perroJpa = new PerroJpaController();

    public void altaPerrito(Perro per) {

        //Uso las excepciones para asegurar que el programa no rompa en caso de existir un error
        try {
            perroJpa.create(per);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
