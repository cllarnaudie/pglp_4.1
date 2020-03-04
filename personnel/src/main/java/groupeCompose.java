package main.java;

import java.util.ArrayList; 

/* contient des groupes qui contient d'autres groupes (liste de personnel 
 * et liste de groupe)*/

public class groupeCompose extends groupePersonnel {
	private ArrayList <groupePersonnel> groupesPersonnel; 
	
	public groupeCompose() {
		super(); 
		groupesPersonnel = new ArrayList<groupePersonnel>(); 
	}
	
	public void ajouter_personnel (groupePersonnel nouveau) {
		groupesPersonnel.add(nouveau); 
	}
}
