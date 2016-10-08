package facebook;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	private String nome;
	private String cognome;
	private int età;
	private char sesso;
	private String mail;
	private List<Utente> amici=new ArrayList<Utente>();
	 
	public Utente() {
		
	}
	public Utente(String nome, String cognome, int età, char sesso, String mail) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.sesso = sesso;
		this.mail=mail;
		
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
	public int getEtà() {
		return età;
	}
	public void setEtà(int età) {
		this.età = età;
	}
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public String getEmail() {
		return mail;
	}
	public void setEmail(String email) {
		this.mail = mail;
	}
	
	public Utente(List<Utente> amici) {
		this.amici = amici;
	}
	public List<Utente> getAmici() {
		return amici;
	}
	public void setAmici(List<Utente> amici) {
		this.amici = amici;
	}
	public void inserisciUtente(Utente u){
		amici.add(u);
	}
	
	
}
