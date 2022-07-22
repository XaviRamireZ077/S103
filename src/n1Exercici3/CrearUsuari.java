package n1Exercici3;

import java.util.Scanner;

public class CrearUsuari {

	
	private String nom;

	static Scanner entrada = new Scanner(System.in);
	
	
	public CrearUsuari(String nom) {
		super();
		this.nom = nom;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public static String nouJugador() {
		String nomJugador = "";
		System.out.println("Per favor introdueixi el seu nom d'usuari: ");
		nomJugador = entrada.next();
		
		return nomJugador;
		
		
		
		
	}


	
	
	
}
