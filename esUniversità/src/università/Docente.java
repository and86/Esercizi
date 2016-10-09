package università;

import java.util.ArrayList;
import java.util.List;

import biblioteca.Utente;

public class Docente extends Utente implements ValidaDato {
	
	private String codiceFiscale;
	private List <Corso> docentiCorso=new ArrayList<Corso>();


	public Docente() {
		
	}

	public Docente(String nome,String cognome,String codiceFiscale) {
		super(nome,cognome);
		this.codiceFiscale = codiceFiscale;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public List <Corso> getDocentiCorso() {
		return docentiCorso;
	}

	public void setDocentiCorso(List <Corso> docentiCorso) {
		this.docentiCorso = docentiCorso;
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
