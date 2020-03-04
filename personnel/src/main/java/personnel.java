package main.java;

import java.time.LocalDate; 
import java.util.ArrayList; 

/*classe immuable donc final devant classe */
public final class personnel {
	
    private final String nom;
	private final String prenom; 
	private final String fonction; 
	private final LocalDate dateNaissance; 
	private final ArrayList <NumeroTelephone> numeroTelephone; 
	
	public static class Builder() {
	/*int   dayOfMonth = dateNaissance.getDayOfMonth(); */
		
	    private final String nom;
		private final String prenom; 
		private final String fonction; 
		private final LocalDate dateNaissance; 
		private final ArrayList <NumeroTelephone> numeroTelephone
	
	public Builder (){
		this.nom = ""; 
		this.prenom = ""; 
	 
		
	}
	
}
}
