package main.java;

import java.time.LocalDate; 
import java.util.ArrayList; 
import java.time.Month;
/*classe immuable donc final devant classe */
public final class personnel {
	
    private final String nom;
	private final String prenom; 
	private final String fonction; 
	private final LocalDate dateNaissance; 
	private final ArrayList <String> numeroTelephone; 
	
	public  static class Builder  {
	    private  String nom;
		private  String prenom; 
		private  String fonction; 
		private  LocalDate dateNaissance; 
		private  ArrayList <String> numeroTelephone; 
	
	public Builder (String nom, String prenom){
		this.nom = nom; 
		this.prenom = prenom; 
		this.fonction= "inconnu";
		this.dateNaissance = LocalDate.of(0, Month.JANUARY, 0); 
		this.numeroTelephone = new ArrayList<String> (); 
		
	}
	
	public Builder fonction () {
		
	}
	
	public Builder dateNaissance () {
		
	}
	
	public Builder numeroTelephone() {
		
	}
}
}
