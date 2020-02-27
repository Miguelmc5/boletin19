package boletin19;

import java.util.Scanner;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Boletin19 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
     int matriz[][] = new int[20][36];
        String[] equipos = {"Alavés", "Athletic", "Atlético Madrid", "Barcelona",
            "Betis", "Celta", "Eibar", "Espanyol", "Getafe", "Granada", "Leganés",
            "Levante", "Mallorca", "Osasuna", "Real Madrid", "Real Sociedad",
            "Sevilla", "Valencia", "Valladolid", "Villarreal"};
         String[] equiposOrdenados = {"Alavés", "Athletic", "Atlético Madrid", "Barcelona",
            "Betis", "Celta", "Eibar", "Espanyol", "Getafe", "Granada", "Leganés",
            "Levante", "Mallorca", "Osasuna", "Real Madrid", "Real Sociedad",
            "Sevilla", "Valencia", "Valladolid", "Villarreal"};
        String[] xornadas = new String[36];
        
         int resposta;
        Metodos obx = new Metodos();
        xornadas = obx.crearXornadas(xornadas);
        do {
            System.out.println("\nQue queres facer?"
                    + "\n 1.-Crear Matriz."
                    + "\n 2.-Amosar todo."
                    + "\n 3.-Amosar los equipos ordenados por goles de "
                    + "forma creciente."
                    + "\n 4.-Amosar equipo/s maximo/s goleador/es e en "
                    + "que xornada."
                    + "\n 5.-Consultar por equipo e xornada os goles."
                    + "\n 0.-Saír.");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    matriz = obx.crearMatriz(matriz);
                    break;
                case 2:
                    obx.amosarTodo(matriz, equipos, xornadas);
                    break;
                case 3:
                    obx.menorGoles(matriz, equiposOrdenados);
                    break;
                case 4:
                    obx.goleadorMaximo(matriz, equipos, xornadas);
                    break;
                case 5:
                    obx.consultar(matriz, equipos, xornadas);
                    break;
            }
        } while (resposta != 0);

    }
}