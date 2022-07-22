package n1Exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GestioFitxers {

	private static HashMap<String,String> paisosCapitals = new HashMap<String,String>();

	public static HashMap<String,String> getPaisosCapitals() {
		return paisosCapitals;
	}

	public static void setPaisosCapitals(HashMap<String,String> paisosCapitals) {
		GestioFitxers.paisosCapitals = paisosCapitals;

	}

	public static void LlegirFitxer() {

		String cadena;

		try {

			FileReader llegirfitxer = new FileReader(
					"C:\\Users\\Admin\\Documents\\Eclipse projects\\S103\\src\\n1Exercici3\\countries.txt");
			BufferedReader br = new BufferedReader(llegirfitxer);
			while ((cadena = br.readLine()) != null) {
				String[] paraula = cadena.split(" ");
				paisosCapitals.put(paraula[1], paraula[0]);

			}

			br.close();
		} catch (IOException e) {
			System.out.println("Error, no ha estat possible trobar l'arxiu seleccionat");
		}

		

	}

	public static void EscriureFitxer(String resultat) {

//		String usuari;
//		int puntuacio;

		try {


			BufferedWriter escriuClasificacio = new BufferedWriter(new FileWriter("C:/Users/Admin/Documents/Eclipse projects/S103/src/n1Exercici3/classificacio.txt"));

			for (int i = 0; i < resultat.length(); i++) {
				escriuClasificacio.write(resultat.charAt(i));
			}

			escriuClasificacio.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		System.out.println("L'arxiu s'ha creat correctament, fins un altre!");

	}

}
