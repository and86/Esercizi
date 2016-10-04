package campionato;

public class Giocatore {
	private String nome;
	private String cognome;
	private String ruolo;
	private double stipendio;
	private int età;
	private int ammonizione;
	private int espulsioni;
	private int reti;
	private int assist;
	private String codiceFiscale;
	
	public Giocatore() {
		
	}

	public Giocatore(String nome, String cognome, String codiceFiscale) {
//		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
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

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		this.età = età;
	}

	public int getAmmonizione() {
		return ammonizione;
	}

	public void setAmmonizione(int ammonizione) {
		this.ammonizione = ammonizione;
	}

	public int getEspulsioni() {
		return espulsioni;
	}

	public void setEspulsioni(int espulsioni) {
		this.espulsioni = espulsioni;
	}

	public int getReti() {
		return reti;
	}

	public void setReti(int reti) {
		this.reti = reti;
	}

	public int getAssist() {
		return assist;
	}

	public void setAssist(int assist) {
		this.assist = assist;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public String toString(){
		String str="Giocatore: \t"+nome+" "+cognome;
		return str;
		
	}
	
	
	
	

}
