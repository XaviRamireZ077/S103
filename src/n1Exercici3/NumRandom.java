package n1Exercici3;

import java.util.Random;
import java.util.Scanner;

public class NumRandom {

	private static int numIntents = 10; 
	private static Scanner entrada = new Scanner(System.in);
	public static int NumAleatori() {
	
	Random random = new Random();
    int punts = 0;
	
	String resposta = "";
	
      for(int i = 0; i <=numIntents; i++) {
          
    	  Object[] paisos = GestioFitxers.getPaisosCapitals().values().toArray();
    	  Object paisosAleatoris = paisos[random.nextInt(paisos.length)];
          
        
    	  System.out.println("Sabries dir-me la capital de " +paisosAleatoris + "?");
    	  resposta = entrada.nextLine();
    	  
    	  
    	  if (GestioFitxers.getPaisosCapitals().containsKey(resposta)) {
    		  punts++;
    		  System.out.println("Enhorabona, la resposta és correcte, reps " + punts + "punts");
    		  
    		  
    		  
    		  
    		  
    	  } else {
    		  System.out.println("OOOoohhh, no és correcte, hauries d'estudiar més, torna-ho a intentar");
    		  
    		  
    	  }
    	  
    	  } 
	      return punts;
      }
	
}
