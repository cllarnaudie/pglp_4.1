package main.java;
import java.util.ArrayList; 

public abstract class groupePersonnel {

	private ArrayList <personnel> membres; 
	
	public groupePersonnel() {
		membres = new ArrayList<personnel>(); 
	}
	
	public void ajouter_membres(personnel nouveau) {
		membres.add(nouveau); 
	}
}
