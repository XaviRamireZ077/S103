package n1Exercici3;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i
		 * capitals. El programa ha de llegir el fitxer i guardar les dades en un
		 * HashMap<String, String>. El programa demana el nom de l’usuari/ària, i
		 * després ha de mostrar un país de forma aleatòria, guardat en el HashMap. Es
		 * tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en
		 * qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10
		 * vegades. Un cop demanades les capitals de 10 països de forma aleatòria,
		 * llavors s’ha de guardar en un fitxer anomenat classificacio.txt, el nom de
		 * l’usuari/ària i la seva puntuació.
		 */

		Scanner entrada = new Scanner(System.in);// Inicialitzem Scanner

		ArrayList<CrearUsuari> Usuaris = new ArrayList<CrearUsuari>();
		
		// Atributs
        
		String jugador = CrearUsuari.nouJugador();
		CrearUsuari jugador1 = new CrearUsuari(jugador);
        Usuaris.add(jugador1);
		
		GestioFitxers.LlegirFitxer();//Cridem al mètode per llegir el fitxer txt i posteriorment guardarlo dins un Hashmap 
		
		
		int puntuacio = NumRandom.NumAleatori();//Cridem al mètode per generar un numero aleatori i el guardem en una variable "puntuacio"
		
		
		String classificacio = "Nom de l'usuari " + jugador + "puntuacio obtinguda " + puntuacio + "punts";
		GestioFitxers.EscriureFitxer(classificacio);//Cridem al mètode per escriure el resultat en un nou fitxer txt
		
		
		

	}
}