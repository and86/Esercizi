package università;

import biblioteca.Utente;

public class Studente extends Utente implements ValidaDato {
	
	private String matricola;
	private double media;
	

	public Studente() {
		
	}

	public Studente(String nome,String cognome,String matricola, double media) {
		super(nome,cognome);
		this.matricola = matricola;
		this.media = media;
	}
	
	public Studente(String nome,String cognome) {
		super(nome,cognome);
		
	}


	public String getMatricola() {
		return matricola;
	}


	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}
	
	
	@Override
	public boolean isValid() {
		boolean res=false;
		if (!nome.isEmpty() && cognome!=null){
			res=true;
		}
		return res;
	}

	

	
	
	
	
	
	
	
	
	

}
