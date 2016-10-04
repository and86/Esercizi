package campionato;

import java.util.HashMap;
import java.util.Map;

public class Campionato {
	private String nome;
	
	private Map <String,Giocatore> mappaGiocatore= new HashMap<String,Giocatore>();
	private Map<String,Squadra>mappaSquadra= new HashMap<String,Squadra>();
	private Map<String,Partita>mappaPartite= new HashMap<String,Partita>();
		
	public Campionato() {
		
	}

	public Campionato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Giocatore> getMappaGiocatore() {
		return mappaGiocatore;
	}

	public void setMappaGiocatore(HashMap<String, Giocatore> mappaGiocatore) {
		this.mappaGiocatore = mappaGiocatore;
	}

	public Map<String, Squadra> getMappaSquadra() {
		return mappaSquadra;
	}

	public void setMappaSquadra(HashMap<String, Squadra> mappaSquadra) {
		this.mappaSquadra = mappaSquadra;
	}
	
	public Map<String, Partita> getMappaPartite() {
		return mappaPartite;
	}

	public void setMappaPartite(Map<String, Partita> mappaPartite) {
		this.mappaPartite = mappaPartite;
	}
	
	public void aggiungiGiocatore (Giocatore g){
		this.mappaGiocatore.put(g.getCodiceFiscale(), g);
	}
	
	public void aggiungiSquadra(Squadra s){
		this.mappaSquadra.put(s.getNome(), s);
	}
	
	public void aggiungiPartita(Partita p){
		this.mappaPartite.put(p.getSquadraCasa()+" "+p.getSquadraOspite(),p);
		//		this.mappaPartite.put(p.toString(),p);
		
		
	}
	
	public String stampaGiocatori(Map <String,Giocatore> mappaGiocatore){
		String str="";
		for(Map.Entry<String,Giocatore> entry:mappaGiocatore.entrySet()){
			str+="\n Giocatore: \t"+entry.getValue().getNome()+" "+entry.getValue().getCognome();
//			str+="\n Giocatore: \t"+entry.getValue().getNome()+" "+entry.getValue().getCognome()+" reti:"+entry.getValue().getReti()+" ammoniti:"+entry.getValue().getAmmonizione()+" espulsi: "+entry.getValue().getEspulsioni();
		}
		return str;
		
	}
	
	public String stampaSquadre(Map <String,Squadra> mappaSquadre){
		String str="";
		for(Map.Entry<String,Squadra> entry:mappaSquadra.entrySet()){
//			str+="\n Squadra: \t"+entry.getValue().getNome()+"Punti:"+ entry.getValue().getPunti()+"Reti f: "+entry.getValue().getRetiFatti()+"Reti s: "+entry.getValue().getRetiSubiti()+"Diff r: "+entry.getValue().getDifferenzaReti();
			str+="\n Squadra: \t"+entry.getValue().getNome();
		}
		return str;
		
	}
	
//	public String stampaPartita(Map <String,Partita> mappaPartite){
//		String str="";
//		for(Map.Entry<String,Partita> entry:mappaPartite.entrySet()){
//			str+=entry.getValue().getSquadraCasa();
//		}
//		return str;
//		
//	}


	
	
	
}
