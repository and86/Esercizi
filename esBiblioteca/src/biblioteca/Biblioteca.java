package biblioteca;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Biblioteca implements ValidaDati {
	private String nome;
	
	private Map <String,Utente> utenti=new HashMap<String,Utente>();
	private Map<String, Libro> libri=new HashMap<String,Libro>();
	private List <Prestito> prestito=new ArrayList<Prestito>();

	public Biblioteca() {
		
	}

	public Biblioteca(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Map<String, Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String, Utente> utenti) {
		this.utenti = utenti;
	}

	
	public Map<String, Libro> getLibri() {
		return libri;
	}

	public void setLibri(Map<String, Libro> libri) {
		this.libri = libri;
	}
	

	public List <Prestito> getPrestito() {
		return prestito;
	}

	public void setPrestito(List <Prestito> prestito) {
		this.prestito = prestito;
	}
		
	
	
	public void aggiungiUtente(Utente u){
		this.utenti.put(u.getCodiceFiscale(), u);
	}
	
	public void aggiungiLibro(Libro l){
		this.libri.put(l.getSerialNumber(),l);
	}
	
	public void aggiungiPrestito(Prestito p){
		this.prestito.add(p);
	}
	
	
	public String stampaLibri(Map<String, Libro> libri ){
		
		String str="";
		for(Map.Entry<String,Libro> lib : libri.entrySet()){
			str+="\n"+" SerialNumber: "+lib.getKey()+" "+"\tTitolo: "+lib.getValue().getTitolo()+ "\t Copie disp: "+lib.getValue().getCopieDisponibili();
						
		}
		return str;
						
		}
	
public String stampaUtenti(Map<String, Utente> utenti ){
		
		String str="";
		for(Map.Entry<String,Utente> ut : utenti.entrySet()){
			str+="\n"+ "Nome: "+ut.getValue().getNome()+" "+"\tCognome: "+ut.getValue().getCognome()+" "+"\tCodice Fiscale: "+ut.getKey();
						
		}
		return str;
						
		}


	@Override
	public boolean isValid() {
		boolean result=false;
		if(!nome.isEmpty()&& nome!=null){
			result=true;
		}
		return result;
	}

}
