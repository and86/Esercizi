package biblioteca;

import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

import mioDate.DataUtility;

//import java.util.List;

public class Gestione {

	public Libro registraLibro(Biblioteca b,String titolo, 
			String autore,String serialNumber,int cp){
		
		Libro l=b.getLibri().get(serialNumber);	//se nn trovo il libro nella map restituisce null
		if(l!=null){	// se il libro esiste, aggiorno copie disponibili e copie totali
			l.setCopieTotali(l.getCopieTotali()+cp);
			l.setCopieDisponibili(l.getCopieDisponibili()+cp);
		}else { //se il libro nn esisteva, lo registro
			l=new Libro(titolo,autore,serialNumber);
			l.setCopieDisponibili(cp);
			l.setCopieDisponibili(cp);
			b.aggiungiLibro(l);
			
		}
				
		return l;
	}
	
	public Utente registraUtente(Biblioteca b,String nome,String cognome,
			String codiceFiscale) throws UtenteGi‡Esiste {
		
		if(b.getUtenti().containsKey(codiceFiscale)){
			throw new UtenteGi‡Esiste("L'utente  esiste in biblioteca "+b.getNome());
			
		} 	//Se si verifica l'eccezione, le righe successive non vengono eseguite, 
			//torno al chiamante.
			//Nel main poi metter‡ try-catch
			
		Utente u=new Utente(nome,cognome,codiceFiscale);	//se si verifica l'eccezione queste due righe nn vengono eseguite
			b.aggiungiUtente(u);
		
		return u;
	}
	
	public boolean prestaLibro(Biblioteca b,String serialNumber,String codiceFiscale){
		boolean result=false;
			
		DataUtility dt=new DataUtility();
		Libro l=b.getLibri().get(serialNumber);
		
		Utente u=b.getUtenti().get(codiceFiscale);
		
		
		if(l!=null && u!=null && u.getNumeroLibri()<3 && l.getCopieDisponibili()>0 && (!u.getLibri().containsKey(serialNumber)) ){
			
//			Date currentData=new Date();
//			Calendar cal= dt.convertDateToCalendar(currentData);
//			cal.add(Calendar.DATE, 14);
			
			//Data dataScadenza=cal.getTime();
			
			
			u.aggiungiLibro(l);
			l.setCopieDisponibili(l.getCopieDisponibili()-1);
			result =true;			
		}
		
		return result;
		}
	
	public boolean restituisciLibro(Biblioteca b,String serialNumber,String codiceFiscale){
		boolean result=false;
		
		//Libro l=null;
		Libro l=b.getLibri().get(serialNumber);
				
		//Utente u=null;
		Utente u=b.getUtenti().get(codiceFiscale);
				
		if(l!=null && u!=null && u.getNumeroLibri()<3){
			u.eliminaLibro(l);
			l.setCopieDisponibili(l.getCopieDisponibili()+1);
			result =true;			
		}		
							
		return result;
		}
	
//	
//		

}



	
	
			
		
		

			
			

	
		
			
			
			
			
			
			
			
			

		
		
		
				
			
	
		


