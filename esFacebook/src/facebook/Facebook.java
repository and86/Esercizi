package facebook;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
	private List<Utente> utenti= new ArrayList<Utente>();
		
	
	public void registraUtente(String nome, String cognome,int età, char sesso, String mail){
		if(mail.contains("@")==true){
			Utente u=new Utente (nome,cognome,età,sesso,mail);
			utenti.add(u);
			
		}	
		
	}
	public void aggiungiAmici(String nomecognome1,String nomecognome2){
		Utente u1= null;
		Utente u2=null;
		
		for(Utente u:utenti){
			String strtemp = u.getNome()+" "+u.getCognome();
			if (nomecognome1.equals(strtemp)==true){
				u1=u;
				break;
			}
		
			}
				
		for(Utente u:utenti){
			String strtemp = u.getNome()+" "+u.getCognome();
			if (nomecognome2.equals(strtemp)){
				u2=u;
				break;
			}
			
			
		}
		
		if(u1!=null && u2!=null){
		u1.inserisciUtente(u2);
		u2.inserisciUtente(u1);
		}
		
		
	}
	public List<Utente> getAmiciDiUnUtente(String nome,String cognome){
		
		Utente utmp=null;
		for(Utente u:utenti){
			if(nome.equals(u.getNome())&& cognome.equals(u.getCognome())){
				utmp=u;
				
				
			}
		if(utmp!=null){
			return utmp.getAmici();
		}
		}

		 return null;
	}

	
	public List <Utente> getAmiciDiAmici(String nome,String cognome){
		List<Utente> listaAmici;
		List <Utente> listatemp=new ArrayList<Utente>();
		
		Utente u1tmp = trovaUtente(nome, cognome);
		listaAmici=u1tmp.getAmici();
		for(Utente u:listaAmici){
			listatemp.add(u);
			List<Utente> amiciAmici=u.getAmici();
			for(Utente utmp:amiciAmici){
				if((utmp.getNome().equals(nome)) && (utmp.getCognome().equals(cognome)) && (listaAmici.contains(utmp)==false)){
					listatemp.add(utmp);
					return listatemp;
				}
									
			}
							
			}
			return null;
		}

		



public String getAmiciInComune(String nomeCognome1 , String nomeCognome2 ) {
	Utente u1=null;
	Utente u2=null;
	
	for(Utente u : utenti){
		String sttemp = u.getNome() + " " + u.getCognome();
		if(nomeCognome1.equals(sttemp)==true){
			u1=u;
		}
		
	}
	for(Utente u : utenti){
		String sttemp = u.getNome() + " " + u.getCognome();
		if(nomeCognome2.equals(sttemp)==true){
			u2=u;
		}
	}
	String amiciInComune = "";
	amiciInComune = scorreLista(u1, u2, amiciInComune);
	return amiciInComune;


}





private Utente trovaUtente(String nome, String cognome) {
	Utente u1tmp=new Utente();
	for(Utente u:utenti){
		if(nome.equals(u.getNome())&& cognome.equals(u.getCognome())){
			u1tmp=u;
		}
	}
	return u1tmp;
}





private String scorreLista(Utente u1, Utente u2, String amiciInComune) {
	for(Utente u : u1.getAmici()){
		for(Utente ut : u2.getAmici()){
			if(u.getNome().equals(ut.getNome()) && u.getCognome().equals(ut.getCognome())){
				amiciInComune = amiciInComune + u.getNome() + " " + u.getCognome() + " ";				
			}
		}
	}
	return amiciInComune;
}








}
						
				
				
			
		
	





