package n1Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		/*
		 * Crea una classe anomenada Month amb un atribut "name" (que emmagatzemarà el
		 * nom del mes de l'any). Afegeix 11 objectes Month (cadascun amb el seu atribut
		 * diferent) en un ArrayList, a excepció de l'objecte amb atribut "Agost".
		 * Després, efectua la inserció en el lloc que correspon a aquest mes i demostra
		 * que l’ArrayList manté l'ordre correcte.
		 * 
		 * Converteix l’ArrayList de l’exercici anterior en un HashSet i assegura’t que
		 * no permet duplicats.
		 * 
		 * Recorre la llista amb un for i amb un iterador.
		 */

		ArrayList<Month> mesos = new ArrayList<>();

		mesos.add(new Month("Gener"));
		mesos.add(new Month("Febrer"));
		mesos.add(new Month("Marc"));
		mesos.add(new Month("Abril"));
		mesos.add(new Month("Maig"));
		mesos.add(new Month("Juny"));
		mesos.add(new Month("Juliol"));
		mesos.add(new Month("Septembre"));
		mesos.add(new Month("Octubre"));
		mesos.add(new Month("Novembre"));
		mesos.add(new Month("Decembre"));

		 /*Month gener = new Month("Gener");
		 Month febrer = new Month("Febrer");
		 Month marc = new Month("Marc");
	     Month abril = new Month("Abril");
		 Month maig = new Month("Maig");
		 Month juny = new Month("Juny");
		 Month juliol = new Month("Juliol");
		 Month septembre = new Month("Septembre");
		 Month octubre = new Month("Octubre");
		 Month novembre = new Month("Novembre");
		 Month decembre = new Month("Decembre");*/
		
		

		
		Month agost = new Month("Agost");
		mesos.add(7, agost);//Afegim el mes d'agost
       
		
        
        
        // FOR
		
		// for (int i = 0; i < 1 ; i++) {
		 //System.out.println(mesos.toString()); }
		 

		// Recorrem la ArrayList amb un FOREACH
		
		for (Month i : mesos) {
			//if(i.equals(agost)) {
				//mesos.remove(null);
			System.out.println(i);
		}
			
			//System.out.println("Sortida amb for each");
			

			
            
			
			/*HashSet
			
			
			HashSet<Month> hashSet = new HashSet<>(mesos);
			//HashSet<Month> set = new HashSet<Month>();
			
			//hashSet.add(agost);
			
			
			
			
			//Estructura loop Iterador
			
			
			Iterator<Month> mesosDupli= hashSet.iterator();
			
			
			
			while (mesosDupli.hasNext()) {
			
			
			System.out.println(mesosDupli.next() + "");*/
			
			
			


		}

		}
	
  