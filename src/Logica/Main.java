package Logica;


import IGU.InterfazPerritos;

//Aquí comienza el programa, desde el Main, desde donde llamamos a la IGU para que se muestre
public class Main {

    public static void main(String[] args) {

        //Creamos la instacia de la interfaz, la hacemos visible y la centramos
        InterfazPerritos pantalla = new InterfazPerritos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }

}
