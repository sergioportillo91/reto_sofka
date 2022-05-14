import models.HistoricoJugador;
import models.Jugador;
import models.Opciones;
import models.Preguntas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Principal {
    static Scanner scan;
    static int contador;
    static Preguntas pregunta;
    static Preguntas objPregunta;
    static Opciones objOpciones;
    static ArrayList<Opciones> ListOptions;
    static ArrayList<Integer> idPreguntas;
    static boolean opcionA, opcionB, opcionC, opcionD;
    static String opcionEscogida;
    static int opcion;
    static double premio;
    static Jugador jugador;
    static HistoricoJugador historico;

    public static void main(String[] args) {

        scan = new Scanner(System.in);
        pregunta = new Preguntas();
        ListOptions = new ArrayList<>();
        objPregunta = new Preguntas();
        objOpciones = new Opciones();
        contador = 0;
        opcion = 1;
        premio = 0;
        idPreguntas = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25));
        historico = new HistoricoJugador();

        //obtenemos la hora actual
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        //obtenemos lista de preguntas
        objPregunta.ListQuestions();
        //obtenemos lista de respuestas
        objOpciones.ListOptions();

        textoBienvenida();
        registroJugador();

        while (opcion != 3) {
            contador++;
            if (contador <= 5) {
                generarPregunta(1, 4, 0, 1);
                almacenarOpciones();
                mostrarMenuPregunta("1", "$2.000", "$10.000");
                dimeRespuestaCorrecta(2000);
            } //generamos la pregunta de la categoria 2
            else if (contador > 5 && contador <= 10) {
                generarPregunta(6, 9, 5, 2);
                almacenarOpciones();
                mostrarMenuPregunta("2", "$4.000", "$20.000");
                dimeRespuestaCorrecta(4000);
            } //generamos la pregunta de la categoria 3
            else if (contador > 10 && contador <= 15) {
                generarPregunta(11, 14, 10, 3);
                almacenarOpciones();
                mostrarMenuPregunta("3", "$6.000", "$30.000");
                dimeRespuestaCorrecta(6000);
            } //generamos la pregunta de la categoria 4
            else if (contador > 15 && contador <= 20) {
                generarPregunta(16, 19, 15, 4);
                almacenarOpciones();
                mostrarMenuPregunta("4", "$8.000", "$40.000");
                dimeRespuestaCorrecta(8000);
            } //generamos la pregunta de la categoria 5
            else if (contador > 20 && contador <= 25) {
                generarPregunta(21, 24, 20, 5);
                almacenarOpciones();
                mostrarMenuPregunta("5", "$10.000", "$50.000");
                dimeRespuestaCorrecta(10000);
                if(contador == 25){
                    opcion = 3;
                }
            }else{
                System.out.println("Has ganado el juego");
                System.out.println("Juego terminado, total ganado:" + premio);
                opcion = 3;
                String registroHistorico = "Nombre:" + jugador.getNombre() + " edad:" + jugador.getEdad() + " premio:" + premio + " fecha:" + LocalDate.now() + " " + dateFormat.format(date);
                historico.guardarDatos(registroHistorico);
                break;
            }
            if (opcion != 3) {
                System.out.println("Desea seguir jugando?");
                System.out.println("1. seguir jugando");
                System.out.println("2. ver historico");
                System.out.println("3. salir");
                opcion = scan.nextInt();
            }
            if (opcion == 2) {
                historico.leerDatos();
                System.out.println("Desea seguir jugando?");
                System.out.println("1. seguir jugando");
                System.out.println("3. salir");
                opcion = scan.nextInt();
            }
            if (opcion == 3) {
                System.out.println("Juego terminado, total ganado:" + premio);
                String registroHistorico = "Nombre:" + jugador.getNombre() + " edad:" + jugador.getEdad() + " premio:" + premio + " fecha:" + LocalDate.now() + " " + dateFormat.format(date);
                historico.guardarDatos(registroHistorico);
            }
        }
    }

    public static void textoBienvenida() {
        System.out.println("PREGUNTAS DEPORTIVAS");
        System.out.println("Que tanto sabes de deportes?");
        System.out.println("__________________________________");
    }

    public static void registroJugador() {

        System.out.println("REGISTRO DE JUGADOR");
        System.out.println("__________________________________");
        System.out.print("Ingrese sus nombres:");
        String nombre = scan.nextLine().toUpperCase();
        System.out.print("Ingrese su edad:");
        String edad = scan.next();
        jugador = new Jugador(nombre, edad);
    }

    public static void generarPregunta(int numero, int max, int min, int categoria) {

        if (contador == numero) {
            Random random = new Random();
            int number = random.nextInt(max - min) + min;
            //System.out.println("numero ramdon es=" + (number));
            pregunta = objPregunta.ramdonPregunta(categoria, number + 1);
            ListOptions = objOpciones.optionsPreguntas(pregunta.getId());
            int pos = idPreguntas.indexOf(number + 1);
            idPreguntas.remove(pos);
        } else {
            //System.out.println("entro en el sino");
            for (Integer idPregunta : idPreguntas) {
                pregunta = objPregunta.ramdonPregunta(categoria, idPregunta);
                ListOptions = objOpciones.optionsPreguntas(pregunta.getId());
                idPreguntas.remove(0);
                break;
            }
        }
    }

    public static void almacenarOpciones() {
        opcionA = ListOptions.get(0).isEsCorrecta();
        opcionB = ListOptions.get(1).isEsCorrecta();
        opcionC = ListOptions.get(2).isEsCorrecta();
        opcionD = ListOptions.get(3).isEsCorrecta();
    }

    public static void mostrarMenuPregunta(String ronda, String pIndividual, String pRonda) {
        System.out.println("Preguntas RONDA " + ronda);
        System.out.println("Premio total por ronda " + ronda + " " + pRonda);
        System.out.println("Premio individual por pregunta correcta " + pIndividual);
        System.out.println("Pregunta " + contador + " " + pregunta.getTitulo());
        System.out.println("A:" + ListOptions.get(0).getTitulo());
        System.out.println("B:" + ListOptions.get(1).getTitulo());
        System.out.println("C:" + ListOptions.get(2).getTitulo());
        System.out.println("D:" + ListOptions.get(3).getTitulo());
        System.out.print("Escoja la Respuesta Correcta:");
        opcionEscogida = scan.next().toUpperCase();
    }

    public static void dimeRespuestaCorrecta(double valor) {
        if (opcionEscogida.equals("A")) {
            if (opcionA) {
                premio += valor;
                System.out.println("correcto!!,Total ganado " + premio);
            } else {
                System.out.println("Incorrecto,Juego terminado");
                premio = 0;
                opcion = 3;
            }
        } else if (opcionEscogida.equals("B")) {
            if (opcionB) {
                premio += valor;
                System.out.println("correcto!!,Total ganado " + premio);
            } else {
                System.out.println("Incorrecto,Juego terminado");
                premio = 0;
                opcion = 3;
            }
        } else if (opcionEscogida.equals("C")) {
            if (opcionC) {
                premio += valor;
                System.out.println("correcto!!,Total ganado " + premio);
            } else {
                System.out.println("Incorrecto,Juego terminado");
                premio = 0;
                opcion = 3;
            }
        } else if (opcionEscogida.equals("D")) {
            if (opcionD) {
                premio += valor;
                System.out.println("correcto!!,Total ganado " + premio);
            } else {
                System.out.println("Incorrecto,Juego terminado");
                premio = 0;
                opcion = 3;
            }
        } else {
            System.out.println("Opción no disponible,Juego terminado");
            premio = 0;
            opcion = 3;
        }
    }
}

