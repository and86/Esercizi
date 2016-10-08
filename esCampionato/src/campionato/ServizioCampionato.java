package campionato;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

public class ServizioCampionato {
	
	public Giocatore registraGiocatore(Campionato c, String nome, String cognome, String codiceFiscale, String ruolo, int età){
		Giocatore g=c.getMappaGiocatore().get(codiceFiscale);
		if(g==null){
			g=new Giocatore(nome,cognome,codiceFiscale,ruolo,età);
			c.aggiungiGiocatore(g);
			
		}
		return g;
		
	}
	
	public Squadra registraSquadra(Campionato c, String nome){
		Squadra s=c.getMappaSquadra().get(nome);
		
		if(s==null){
			s=new Squadra(nome);
			c.aggiungiSquadra(s);
		}
		return s;
	}
	
	public boolean assegnaGiocatoreSquadra(Campionato c, Giocatore g, Squadra s){
		boolean result=false;
		
		Giocatore gtemp=c.getMappaGiocatore().get(g.getCodiceFiscale());
		Squadra stemp=c.getMappaSquadra().get(s.getNome());
		
		if(gtemp!= null && stemp!=null){
			s.aggiungiGiocatore(gtemp);
			result=true;
		}
		
		return result;
	}
	
	public Partita registraPartita(Campionato c, Squadra sCasa, Squadra sOspite, int rCasa, int rOspite,
			Date dataP, List<Giocatore> retiFatte, List<Giocatore> espulsi, List<Giocatore> ammoniti){
		
		char risultato;
		
		
		if((rCasa-rOspite)>0){
			risultato='1';
			//Aggiorno dando 3 punti alla squadra di casa
			aggiornaPunti(c, sCasa);
					
		} else if((rCasa-rOspite)<0){
			risultato='2';
			aggiornaPunti(c, sOspite);

		} else {
		risultato='X';
		//Aggiorno dando 1 punto a squadra ospite e casa
		aggiornaPuntiPareggio(c, sCasa, sOspite);

		}
		
		//Aggiorno reti fatte e subite squadra casa
		aggiornaReti(c, sCasa, rCasa, rOspite);

		//Aggiorna reti fatte e subite squadra ospite
		aggiornaReti(c, sOspite, rOspite, rCasa);
		
		
		Partita p=new Partita(dataP,sCasa.getNome(),sOspite.getNome(),rCasa,rOspite,risultato);
		
		c.aggiungiPartita(p);
		
		aggiornaDatiGiocatore(c, retiFatte, espulsi, ammoniti);
				
		return p;
		
	}

	



	

		public Giocatore getCapocannoniere(Campionato c){
		
		List <Giocatore> capocannoniere=new ArrayList<Giocatore>(c.getMappaGiocatore().values());
		Collections.sort(capocannoniere,new GiocatoreComparator());
		return capocannoniere.get(0);
		
	}
	
	public Squadra getCampione(Campionato c){
		
		List<Squadra> campione=new ArrayList<Squadra>(c.getMappaSquadra().values());
		Collections.sort(campione, new SquadraComparator(c));
		return campione.get(0);
	}
		

	// METODI AUSILIARI
	private void aggiornaReti(Campionato c, Squadra sCasa, int rCasa,int rOspite) {
		c.getMappaSquadra().get(sCasa.getNome()).setRetiFatti(c.getMappaSquadra().get(sCasa.getNome()).getRetiFatti()+rCasa);
		c.getMappaSquadra().get(sCasa.getNome()).setRetiSubiti(c.getMappaSquadra().get(sCasa.getNome()).getRetiSubiti()+rOspite);
		c.getMappaSquadra().get(sCasa.getNome()).setDifferenzaReti(c.getMappaSquadra().get(sCasa.getNome()).getDifferenzaReti()+(rCasa-rOspite));
	}
	
	private void aggiornaPunti(Campionato c, Squadra sCasa) {
		c.getMappaSquadra().get(sCasa.getNome()).setPunti(c.getMappaSquadra().get(sCasa.getNome()).getPunti()+3);
	}
	
	private void aggiornaPuntiPareggio(Campionato c, Squadra sCasa, Squadra sOspite) {
		c.getMappaSquadra().get(sCasa.getNome()).setPunti(c.getMappaSquadra().get(sCasa.getNome()).getPunti()+1);
		c.getMappaSquadra().get(sOspite.getNome()).setPunti(c.getMappaSquadra().get(sOspite.getNome()).getPunti()+1);
	}
	
	private void aggiornaDatiGiocatore(Campionato c, List<Giocatore> retiFatte,
			List<Giocatore> espulsi, List<Giocatore> ammoniti) {
		if(retiFatte!=null){
			for(Giocatore goal: retiFatte ){
				c.getMappaGiocatore().get(goal.getCodiceFiscale()).setReti(
						c.getMappaGiocatore().get(goal.getCodiceFiscale()).getReti()+1);

			}
		}
		
		if(espulsi!=null){
			for(Giocatore esp: espulsi ){
				c.getMappaGiocatore().get(esp.getCodiceFiscale()).setEspulsioni(
						c.getMappaGiocatore().get(esp.getCodiceFiscale()).getEspulsioni()+1);

			}
		}
		
		if(ammoniti!=null){
			for(Giocatore amm: ammoniti ){
				c.getMappaGiocatore().get(amm.getCodiceFiscale()).setAmmonizione(
						c.getMappaGiocatore().get(amm.getCodiceFiscale()).getAmmonizione()+1);

			}
		}
	}


	

		
}

		
			
	
	

