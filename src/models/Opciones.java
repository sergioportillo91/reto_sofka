package models;

import java.util.ArrayList;
import java.util.Arrays;

public class Opciones {

    private int id;
    private String titulo;
    private int preguntaId;
    private boolean esCorrecta;
    private ArrayList<Opciones> lista;


    public Opciones(int id, String titulo, int preguntaId, boolean esCorrecta) {
        this.id = id;
        this.titulo = titulo;
        this.preguntaId = preguntaId;
        this.esCorrecta = esCorrecta;
    }

    public Opciones() {
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

    public int getPreguntaId() {
        return preguntaId;
    }

    public void setPreguntaId(int preguntaId) {
        this.preguntaId = preguntaId;
    }

    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    public ArrayList<Opciones> ListOptions() {

        lista = new ArrayList<>(Arrays.asList(
                new Opciones(1, "60 minutos", 1, false),
                new Opciones(2, "90 minutos", 1, true),
                new Opciones(3, "120 minutos", 1, false),
                new Opciones(4, "45 minutos", 1, false),

                new Opciones(5, "11 jugadores", 2, true),
                new Opciones(6, "10 jugadores", 2, false),
                new Opciones(7, "22 jugadores", 2, false),
                new Opciones(8, "20 jugadores", 2, false),

                new Opciones(9, "argentina", 3, false),
                new Opciones(10, "alemania", 3, false),
                new Opciones(11, "brasil", 3, true),
                new Opciones(12, "italia", 3, false),

                new Opciones(13, "alemania", 4, false),
                new Opciones(14, "españa", 4, true),
                new Opciones(15, "francia", 4, false),
                new Opciones(16, "brasil", 4, false),

                new Opciones(17, "camp now", 5, false),
                new Opciones(18, "mestalla", 5, false),
                new Opciones(19, "allianz arena", 5, true),
                new Opciones(20, "san siro", 5, false),

                new Opciones(21, "manchester united", 6, false),
                new Opciones(22, "bayern munchen", 6, false),
                new Opciones(23, "real madrid", 6, true),
                new Opciones(44, "barcelona", 6, false),

                new Opciones(25, "La revista France Football", 7, true),
                new Opciones(26, "La Gazzetta dello Sport ", 7, false),
                new Opciones(27, "La revista Marca Football", 7, false),
                new Opciones(28, "La revista óle Football", 7, false),

                new Opciones(29, "Manchester united", 8, true),
                new Opciones(30, "Liverpool", 8, false),
                new Opciones(31, "Chelsea", 8, false),
                new Opciones(32, "Arsenal", 8, false),

                new Opciones(33, "Londres", 9, true),
                new Opciones(34, "Manchester", 9, false),
                new Opciones(35, "Southampton", 9, false),
                new Opciones(36, "Birmingham", 9, false),

                new Opciones(37, "Milan", 10, false),
                new Opciones(38, "Inter", 10, false),
                new Opciones(39, "Juventus", 10, false),
                new Opciones(40, "Napoli", 10, true),

                new Opciones(41, "Michael jordan", 11, true),
                new Opciones(42, "Lebron james", 11, false),
                new Opciones(43, "Kobe bryant", 11, false),
                new Opciones(44, "Shaquille o'neal", 11, false),

                new Opciones(45, "Estados Unidos", 12, true),
                new Opciones(46, "Alemania", 12, false),
                new Opciones(47, "Canada",12, false),
                new Opciones(48, "Puerto rico",12, false),

                new Opciones(49, "15 jugadores",13, true),
                new Opciones(50, "10 jugadores",13, false),
                new Opciones(51, "12 jugadores",13, false),
                new Opciones(52, "8 jugadores",13, false),

                new Opciones(53, "Usain Bolt", 14, true),
                new Opciones(54, "Jesse Owens",14, false),
                new Opciones(55, "Michael Phelps", 14, false),
                new Opciones(56, "Paavo Nurmi", 14, false),

                new Opciones(57, "Futbol americano", 15, true),
                new Opciones(58, "Futbol", 15, false),
                new Opciones(59, "Tenis", 15, false),
                new Opciones(60, "Beisbol", 15, false),

                new Opciones(61, "4 años", 16, true),
                new Opciones(62, "3 años", 16, false),
                new Opciones(63, "5 años", 16, false),
                new Opciones(64, "2 años", 16, false),

                new Opciones(65, "blanca y verde", 17, true),
                new Opciones(66, "verde y blanca", 17, false),
                new Opciones(67, "verde y amarilla", 17, false),
                new Opciones(68, "amarilla y verde", 17, false),

                new Opciones(69, "Azul, amarillo, verde, rojo y negro", 18, true),
                new Opciones(70, "Azul, amarillo, verde, rojo y blanco", 18, false),
                new Opciones(71, "rosado, amarillo, verde, rojo y negro", 18, false),
                new Opciones(72, "Azul, amarillo, verde, rojo y morado", 18, false),

                new Opciones(73, "Karate", 19, false),
                new Opciones(74, "futbol", 19, false),
                new Opciones(75, "Sumo", 19, true),
                new Opciones(76, "Ajedrez", 19, false),

                new Opciones(77, "Boxeo", 20, true),
                new Opciones(78, "Karate", 20, false),
                new Opciones(79, "Futbol", 20, false),
                new Opciones(80, "Kun fu", 20, false),


                new Opciones(81, "Kun fu", 21, false),
                new Opciones(82, "Boxeo", 21, false),
                new Opciones(83, "Karate", 21, false),
                new Opciones(84, "Capoeira", 21, true),

                new Opciones(85, "El críquet", 22, true),
                new Opciones(86, "Beisbol", 22, false),
                new Opciones(87, "Boxeo",22, false),
                new Opciones(88, "Billar",22, false),

                new Opciones(89, "Motociclismo",23, false),
                new Opciones(90, "Ciclismo",23, true),
                new Opciones(91, "Automovilismo",23, false),
                new Opciones(92, "No existe",23, false),

                new Opciones(93, "Argentina",24, false),
                new Opciones(94, "Brasil",24, false),
                new Opciones(95, "Holanda",24, false),
                new Opciones(96, "Fancia",24, true),

                new Opciones(97, "delantero", 25, false),
                new Opciones(98, "defensa", 25, false),
                new Opciones(99, "medio campo", 25, false),
                new Opciones(100, "arquero", 25, true)
        ));

        return lista;
    }

    public ArrayList<Opciones> optionsPreguntas(int idPregunta) {

        ArrayList<Opciones> opcionesPregunta = new ArrayList<>();

        for (Opciones opciones : lista) {

            if (opciones.preguntaId == idPregunta) {
                opcionesPregunta.add(opciones);
            }
        }

        return opcionesPregunta;
    }

}
