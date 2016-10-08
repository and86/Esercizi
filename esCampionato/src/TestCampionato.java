import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.Data;

import campionato.Campionato;
import campionato.Giocatore;
import campionato.ServizioCampionato;
import campionato.Squadra;


public class TestCampionato {

	public static void main(String[] args) {
		
				Campionato c = new Campionato("Lega serie A");
				ServizioCampionato sc = new ServizioCampionato();
				
				// Creo e registro giocatori
				Giocatore g1 = new Giocatore("Gonzalo", "Higuain", "01","Attaccante",28);
				Giocatore g2 = new Giocatore("Leo", "Bonny", "02","Difensore",26);
				Giocatore g3 = new Giocatore("Paolo", "Dybala", "03","Attaccante",22);
				//Giocatore gprova = new Giocatore("Paolo", "Dybala", "03");
				Giocatore g4 = new Giocatore("Giorgio", "Chiellini", "04","Difensore",31);
				Giocatore g5= new Giocatore ("Javier","Zanetti","05","Difensore",38);
				Giocatore g6= new Giocatore ("Mauro","Icardi","06","Attaccante",22);
				Giocatore g7= new Giocatore ("Carlos","Bacca","07","Attaccante",29);
	
				sc.registraGiocatore(c, g1.getNome(), g1.getCognome(), g1.getCodiceFiscale(),g1.getRuolo(),g1.getEtà());
				sc.registraGiocatore(c, g2.getNome(), g2.getCognome(), g2.getCodiceFiscale(),g2.getRuolo(),g2.getEtà());
				sc.registraGiocatore(c, g3.getNome(), g3.getCognome(), g3.getCodiceFiscale(),g3.getRuolo(),g3.getEtà());
				//sc.registraGiocatore(c, gprova.getNome(), gprova.getCognome(), gprova.getCodiceFiscale());
				sc.registraGiocatore(c, g4.getNome(), g4.getCognome(), g4.getCodiceFiscale(),g4.getRuolo(),g4.getEtà());
				sc.registraGiocatore(c, g5.getNome(), g5.getCognome(), g5.getCodiceFiscale(),g5.getRuolo(),g5.getEtà());
				sc.registraGiocatore(c, g6.getNome(), g6.getCognome(), g6.getCodiceFiscale(),g6.getRuolo(),g6.getEtà());
				sc.registraGiocatore(c, g7.getNome(), g7.getCognome(), g7.getCodiceFiscale(),g7.getRuolo(),g7.getEtà());
				
//				 Stampa mappa giocatori
				System.out.println("MAPPA GIOCATORI REGISTRATI");
				System.out.println(c.stampaGiocatori(c.getMappaGiocatore()));
			
				
				//Creo e registro Squadre
				Squadra s1=new Squadra("Juventus");
				Squadra s2=new Squadra("Inter");
				Squadra s3=new Squadra("Milan");
				Squadra s4=new Squadra("Napoli");
				
				sc.registraSquadra(c, s1.getNome());
				sc.registraSquadra(c, s2.getNome());
				sc.registraSquadra(c, s3.getNome());
				sc.registraSquadra(c, s4.getNome());
				
				// Stampa mappa squadre
				System.out.println("\nMAPPA SQUADRE REGISTRATE");
				System.out.println(c.stampaSquadre(c.getMappaSquadra()));
				
				
				//Assegno giocatore a squadra e stampo
				sc.assegnaGiocatoreSquadra(c, g1, s1);
				sc.assegnaGiocatoreSquadra(c, g2, s1);
				sc.assegnaGiocatoreSquadra(c, g3, s1);
				sc.assegnaGiocatoreSquadra(c, g4, s1);
				sc.assegnaGiocatoreSquadra(c, g5, s2);
				sc.assegnaGiocatoreSquadra(c, g6, s2);
				sc.assegnaGiocatoreSquadra(c, g7, s3);
				
//				System.out.println("\nGiocatori squadra "+s1.getNome()+":");
//				System.out.println(s1.stampaGiocatoriSquadra(s1.getGiocatoriDellaSquadra()));
//				System.out.println("\nGiocatori squadra "+s2.getNome()+":");
//				System.out.println(s2.stampaGiocatoriSquadra(s2.getGiocatoriDellaSquadra()));

				
				//Registra partita
				Date date=new Date();
				List<Giocatore> goleadori=new ArrayList<Giocatore>();
				goleadori.add(g1);
				goleadori.add(g1);
				goleadori.add(g3);
				goleadori.add(g3);
				goleadori.add(g3);
				goleadori.add(g6);
				goleadori.add(g5);
				
				List<Giocatore> ammoniti=new ArrayList<Giocatore>();
				ammoniti.add(g2);
				ammoniti.add(g5);
				ammoniti.add(g1);
				List<Giocatore> espulsi=new ArrayList<Giocatore>();
				sc.registraPartita(c, s1, s2, 3, 2, date, goleadori, espulsi, ammoniti);
				sc.registraPartita(c, s1, s3, 2, 1, date, goleadori, espulsi, ammoniti);
				
//				System.out.println(c.stampaGiocatori(c.getMappaGiocatore()));
//				System.out.println(c.stampaSquadre(c.getMappaSquadra()));
			
				System.out.println("\nCapocannoniere\t"+sc.getCapocannoniere(c));	
				
				System.out.println("\nCampione\t"+sc.getCampione(c));

	}
}
			


