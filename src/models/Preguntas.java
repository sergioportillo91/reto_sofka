package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Preguntas {

    private int id;
    private String titulo;
    private int categoria;

    private ArrayList<Preguntas> lista;

    public Preguntas(int id, String titulo, int categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public Preguntas() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Preguntas> ListQuestions(){
        lista = new ArrayList<>(Arrays.asList(
                new Preguntas(1, "¿Cuánto dura un partido de fútbol? ", 1),
                new Preguntas(2, "¿Cuántos jugadores tiene un equipo de fútbol en el campo de juego?",1),
                new Preguntas(3, "Qué selección de fútbol ha ganado más Mundiales?",1),
                new Preguntas(4, "¿Quién ganó el mundial de fútbol de 2010?",1),
                new Preguntas(5, "¿Cómo se llama el estadio del Bayern de Munich?",1),

                new Preguntas(6, "¿Qué equipo ha ganado más Champions League de la historia? ", 2),
                new Preguntas(7, "¿Qué revista concede el Balón de Oro?",2),
                new Preguntas(8, "Qué equipo de la Premier League tiene más ligas ganadas?",2),
                new Preguntas(9, "¿De qué ciudad es el Chelsea Football Club?",2),
                new Preguntas(10, "¿En qué club italiano jugó Diego Maradona?",2),

                new Preguntas(11, "¿Quién se considera el mejor jugador de baloncesto de todos los tiempos? ", 3),
                new Preguntas(12, "¿En qué país se inventó el voleibol?",3),
                new Preguntas(13, "Cuántos jugadores componen un equipo de rugby?",3),
                new Preguntas(14, "¿Qué atleta logró el récord plusmarca de velocidad en la prueba de los 100 metros lisos?",3),
                new Preguntas(15, "¿Si juegas a la NFL ¿qué deporte practicas?",3),

                new Preguntas(16, "¿Cada cuántos años se celebran los Juegos Olímpicos? ", 4),
                new Preguntas(17, "¿De qué color es la camiseta titular de la selección de Nigeria?",4),
                new Preguntas(18, "Cuáles son los colores de los cinco anillos olímpicos?",4),
                new Preguntas(19, "¿Cuál es el deporte nacional en Japón?",4),
                new Preguntas(20, "¿De qué deporte se han tomado expresiones como “tirar la toalla” o “salvado por la campana”?",4),

                new Preguntas(21, "¿Qué arte marcial de origen sudamericano fue creado para parecerse a un baile? ",5),
                new Preguntas(22, "¿Cuál es el deporte más popular en la India?",5),
                new Preguntas(23, "Qué tipo de competición es el Giro de Italia?",5),
                new Preguntas(24, "Quien gano el mundia del 2018?",5),
                new Preguntas(25, "¿En qué posición juega el cancerbero de un equipo de fútbol?",5)

        ));
        return lista;
    }


    public Preguntas ramdonPregunta(int categoria,int id){

        Preguntas p1 = new Preguntas();

        for (Preguntas p : lista) {

            if(p.categoria == categoria && p.id == id){
                p1 = p;
            }
        }
        return p1;
    }

}
