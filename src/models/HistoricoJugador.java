package models;

import java.io.*;

public class HistoricoJugador {

    private String ruta;

    public HistoricoJugador() {
        this.ruta = "C:/Users/SERGIO/Documents/NetBeansProjects/PruebaPreguntas/historico.txt";
    }

    public void guardarDatos(String datos) {
        try {
            FileWriter escritura = new FileWriter(ruta, true);
            PrintWriter escritor = new PrintWriter(escritura);
            escritor.println(datos);
            escritura.close();
            escritor.close();
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }

    public void leerDatos() {
        try {
            FileReader entrada = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(entrada);
            String linea = "";
            System.out.println("HISTORICO JUGADOR");
            while (linea != null) {
                linea = buffer.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

}

