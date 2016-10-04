package università;

import biblioteca.Utente;

public class Docente extends Utente implements ValidaDato {
	
	private String codiceFiscale;

	@Override
	public boolean isValid() {
		boolean res=false;
		if (!nome.isEmpty() && cognome!=null){
			res=true;
		}
		return res;
	}

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
	
	

}
