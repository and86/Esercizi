package campionato;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;

public class Squadra {
	private String nome;
//	private String codiceSquadra;
	private int punti;
	private int retiSubiti;
	private int retiFatti;
	private int differenzaReti;
	
	private Map<String,Giocatore> giocatoriDellaSquadra = new HashMap<String,Giocatore>();
	
	public Squadra() {
		
	}

	public Squadra(String nome, int punti, int retiSubiti, int retiFatti,
			int differenzaReti) {
		
		this.nome = nome;
		this.punti = punti;
		this.retiSubiti = retiSubiti;
		this.retiFatti = retiFatti;
		this.differenzaReti = differenzaReti;
	}
	
	public Squadra(String nome){
		this.nome=nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getPunti() {
		return punti;
	}

	public void setPunti(int punti) {
		this.punti = punti;
	}

	public int getRetiSubiti() {
		return retiSubiti;
	}

	public void setRetiSubiti(int retiSubiti) {
		this.retiSubiti = retiSubiti;
	}

	public int getRetiFatti() {
		return retiFatti;
	}

	public void setRetiFatti(int retiFatti) {
		this.retiFatti = retiFatti;
	}

	public int getDifferenzaReti() {
		return differenzaReti;
	}

	public void setDifferenzaReti(int differenzaReti) {
		this.differenzaReti = differenzaReti;
	}
	
	public Map<String, Giocatore> getGiocatoriDellaSquadra() {
		return giocatoriDellaSquadra;
	}

	public void setGiocatoriDellaSquadra(
			Map<String, Giocatore> giocatoriDellaSquadra) {
		this.giocatoriDellaSquadra = giocatoriDellaSquadra;
	}
	
	public String toString(){
		String str="\nSquadra: \t"+ nome + "Punti:\t"+ punti;
		return str;
	}
	
	public void aggiungiGiocatore(Giocatore g){
		giocatoriDellaSquadra.put(g.getCodiceFiscale(), g);
	}
	
	public boolean trovaGiocatore(Giocatore g){
		boolean ris=false;
		if(giocatoriDellaSquadra.containsKey(g.getCodiceFiscale())){
			ris=true;
		}
		return ris;
	}
	
	public String stampaGiocatoriSquadra(Map<String,Giocatore> giocatoriDellaSquadra){
		String str="";
		for(Map.Entry<String,Giocatore> entry: giocatoriDellaSquadra.entrySet()){
			str+=entry.getValue().getNome()+" "+entry.getValue().getCognome()+",";
		}
		return str;
	}
	


	
	
	
	

}
