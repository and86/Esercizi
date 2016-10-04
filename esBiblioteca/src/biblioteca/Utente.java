package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Utente implements ValidaDati {
	
	protected String nome;
	protected String cognome;
	private String codiceFiscale;
	private boolean validi; //falso se nn ha restitutito un libro 
							//prestato da 2 settimane
	
	private Map <String,Libro> libri=new HashMap<String,Libro>();	//metto i libri che l'utente prende in prestito

	
	
	public Utente() {

	}

	public Utente(String nome, String cognome,String codiceFiscale) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale=codiceFiscale;
	}
	
	public Utente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	

	public Map<String, Libro> getLibri() {
		return libri;
	}

	public void setLibri(Map<String, Libro> libri) {
		this.libri = libri;
	}

	@Override
	public boolean isValid() {
		boolean result =false;
		if (!nome.isEmpty()&& nome!=null &&
				(!cognome.isEmpty()&& cognome!=null)){
			result =true;
		}
		return result;
	}
	
	public int getNumeroLibri(){
		 return this.libri.size();	//mi da la size della mappa, cioè quanti libri ha l'utente
	}
	
	public void aggiungiLibro(Libro l){
		this.libri.put(l.getSerialNumber(), l);
	}
	
	public void eliminaLibro(Libro l){
		this.libri.remove(l.getSerialNumber());
	}
		

}
