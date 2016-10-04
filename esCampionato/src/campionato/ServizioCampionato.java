package campionato;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;

public class ServizioCampionato {
	
	public Giocatore registraGiocatore(Campionato c, String nome, String cognome, String codiceFiscale){
		Giocatore g=c.getMappaGiocatore().get(codiceFiscale);
		if(g==null){
			g=new Giocatore(nome,cognome,codiceFiscale);
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
			c.getMappaSquadra().get(sCasa.getNome()).setPunti(c.getMappaSquadra().get(sCasa.getNome()).getPunti()+3);
			//sCasa.setPunti(sCasa.getPunti()+3);
//			c.aggiungiSquadra(sCasa);
		} else if((rCasa-rOspite)<0){
			risultato='2';
			c.getMappaSquadra().get(sOspite.getNome()).setPunti(c.getMappaSquadra().get(sOspite.getNome()).getPunti()+3);
//			sCasa.setPunti(sOspite.getPunti()+3);
//			c.aggiungiSquadra(sOspite);
		} else {
		risultato='X';
		c.getMappaSquadra().get(sCasa.getNome()).setPunti(c.getMappaSquadra().get(sCasa.getNome()).getPunti()+1);
		c.getMappaSquadra().get(sOspite.getNome()).setPunti(c.getMappaSquadra().get(sOspite.getNome()).getPunti()+1);
		//sCasa.setPunti(sCasa.getPunti()+1);
//		sCasa.setPunti(sOspite.getPunti()+1);
		}
		
		c.getMappaSquadra().get(sCasa.getNome()).setRetiFatti(c.getMappaSquadra().get(sCasa.getNome()).getRetiFatti()+rCasa);
//		sCasa.setRetiFatti(sCasa.getRetiFatti()+rCasa);
		c.getMappaSquadra().get(sCasa.getNome()).setRetiSubiti(c.getMappaSquadra().get(sCasa.getNome()).getRetiSubiti()+rOspite);
//		sCasa.setRetiSubiti(sCasa.getRetiSubiti()+rOspite);
		c.getMappaSquadra().get(sCasa.getNome()).setDifferenzaReti(c.getMappaSquadra().get(sCasa.getNome()).getDifferenzaReti()+(rCasa-rOspite));
//		sCasa.setDifferenzaReti(sCasa.getRetiFatti()-sCasa.getRetiSubiti());
		
		c.getMappaSquadra().get(sOspite.getNome()).setRetiFatti(c.getMappaSquadra().get(sOspite.getNome()).getRetiFatti()+rOspite);
		c.getMappaSquadra().get(sOspite.getNome()).setRetiSubiti(c.getMappaSquadra().get(sOspite.getNome()).getRetiSubiti()+rCasa);
		c.getMappaSquadra().get(sOspite.getNome()).setDifferenzaReti(c.getMappaSquadra().get(sOspite.getNome()).getDifferenzaReti()+(rOspite-rCasa));
//		sOspite.setRetiFatti(sOspite.getRetiFatti()+rOspite);
//		sOspite.setRetiSubiti(sOspite.getRetiSubiti()+rCasa);
//		sOspite.setDifferenzaReti(sOspite.getRetiFatti()-sOspite.getRetiSubiti());
//		
//		c.aggiungiSquadra(sCasa);
//		c.aggiungiSquadra(sOspite);
//		
		
		
		Partita p=new Partita(dataP,sCasa.getNome(),sOspite.getNome(),rCasa,rOspite,risultato);
		c.aggiungiPartita(p);
		
		if(retiFatte!=null){
			for(Giocatore goal: retiFatte ){
				c.getMappaGiocatore().get(goal.getCodiceFiscale()).setReti(
						c.getMappaGiocatore().get(goal.getCodiceFiscale()).getReti()+1);
//				goal.setReti(goal.getReti()+1);
//				c.aggiungiGiocatore(goal);
			}
		}
		
		if(espulsi!=null){
			for(Giocatore esp: espulsi ){
				c.getMappaGiocatore().get(esp.getCodiceFiscale()).setEspulsioni(
						c.getMappaGiocatore().get(esp.getCodiceFiscale()).getEspulsioni()+1);
//				esp.setEspulsioni(esp.getEspulsioni()+1);
//				c.aggiungiGiocatore(esp);
			}
		}
		
		if(ammoniti!=null){
			for(Giocatore amm: ammoniti ){
				c.getMappaGiocatore().get(amm.getCodiceFiscale()).setAmmonizione(
						c.getMappaGiocatore().get(amm.getCodiceFiscale()).getAmmonizione()+1);
//				amm.setAmmonizione(amm.getAmmonizione()+1);
//				c.aggiungiGiocatore(amm);
			}
		}
				
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
		
	

		
		


		
	}

		
			
	
	

