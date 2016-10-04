package biblioteca;

public class Libro implements ValidaDati {
	
	private String titolo;
	private String autore;
	private String serialNumber;
	private int copieTotali;
	private int copieDisponibili;
	
	
	
	public Libro() {
		
	}

	public Libro(String titolo, String autore, String serialNumber) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.serialNumber = serialNumber;
		this.copieTotali = 0;
		this.copieDisponibili = 0;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCopieTotali() {
		return copieTotali;
	}

	public void setCopieTotali(int copieTotali) {
		this.copieTotali = copieTotali;
	}

	public int getCopieDisponibili() {
		return copieDisponibili;
	}

	public void setCopieDisponibili(int copieDisponibili) {
		this.copieDisponibili = copieDisponibili;
	}

	@Override
	public boolean isValid() {
		boolean result =false;
		if (!titolo.isEmpty() && titolo!=null &&
				(!autore.isEmpty()&& autore!=null &&
				(!serialNumber.isEmpty() && serialNumber!=null))){
			result =true;
		}
		return result;
	}
	
	
	
	

}
