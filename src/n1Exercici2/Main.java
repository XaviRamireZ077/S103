package n1Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import n1Exercici1.Month;

public class Main {

	/*
	 * Crea i emplena un List<Integer>.
	 * 
	 * Crea un segon List<Integer> i insereix a la segona llista els elements de la
	 * primera en ordre invers.
	 * 
	 * Empra els objectes ListIterator per a llegir els elements de la primera
	 * llista i inserir-los en la segona.
	 */

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);

		// System.out.println(list);
		for (Integer i : list) {
			System.out.println(i);
		}

		List<Integer> listinvers = new ArrayList<Integer>();
		listinvers.add(1);
		listinvers.add(2);
		listinvers.add(3);
		listinvers.add(4);
		listinvers.add(5);
		listinvers.add(6);
		listinvers.add(7);
		ListIterator it = listinvers.listIterator(listinvers.size());

		while (it.hasPrevious())
			System.out.println(it.previous());

		// System.out.println(listinvers);

	}

}
