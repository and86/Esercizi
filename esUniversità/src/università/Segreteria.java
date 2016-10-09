package università;

// import java.util.ArrayList;
import java.util.List;



//import biblioteca.Utente;

public class Segreteria {
	
	public Studente registraStudente(Università u,String nome,String cognome){
		
		Studente stemp = trovaStudente(u, nome, cognome);
		
		if(stemp==null){
			Studente studenteNuovo=new Studente(nome,cognome);
			if(studenteNuovo.isValid()){
				studenteNuovo.setMatricola(cognome.substring(0, 2)+(u.getStudenti().size()+1));
				u.aggiungiStudente(studenteNuovo);
				stemp=studenteNuovo;
			}
					
		}
		return stemp;
		
	}


	
	public Docente registraDocente(Università u,String nome, String cognome, String codiceFiscale){
		Docente dtemp = trovaDocente(u, codiceFiscale);
		
		if(dtemp==null){
			Docente docenteNuovo=new Docente(nome,cognome,codiceFiscale);
			
			if(docenteNuovo.isValid()){
					u.aggiungiDocente(docenteNuovo);
					dtemp=docenteNuovo;
			}
		}
				return dtemp;
				
	}

	
	public Corso registraCorso(Università u,String nome,int ore){
		Corso ctemp = trovaCorso(u, nome);
		if(ctemp==null){
			Corso corsoNuovo=new Corso(nome,ore);
			if(corsoNuovo.isValid()){
				u.aggiungiCorso(corsoNuovo);
				ctemp=corsoNuovo;
			}
		}
			
		return ctemp;
		
		
	}



	
	
//	public boolean aggiungiStudenteACorso(Università u,Studente s, Corso c){
//		boolean res=false;
//		if(s.isValid() && c.isValid()){
//			c.getStudenti().add(s);
//			res=true;
//		}
//		return res;
//				
//	}
	
	public boolean aggiungiStudenteACorso(Università u,Studente s, Corso c){
		boolean res=false;
		if((!c.getStudenti().contains(s)) && (u.getStudenti().contains(s))){
			c.aggiungiStudente(s);
			res=true;
		}
		return res;
				
	}
	
	public boolean aggiungiDocenteACorso(Università u,Docente d, Corso c){
		boolean res=false;
		if(!c.getDocenti().contains(d) && u.getDocenti().contains(d)){
			c.aggiungiDocente(d);
			res=true;
		}
		return res;
				
	}
	
	
	
	private Studente trovaStudente(Università u, String nome, String cognome) {
		List<Studente> studenti=u.getStudenti();
		Studente stemp=null;
		for(Studente s:studenti){
			if(s.getNome().equals(nome) && s.getCognome().equals(cognome)){
				stemp=s;
							}
		}
		return stemp;
	}
	
	private Docente trovaDocente(Università u, String codiceFiscale) {
		List<Docente> docenti=u.getDocenti();
		Docente dtemp=null;
		for(Docente d:docenti){
			if(d.getCodiceFiscale().equals(codiceFiscale)){
				dtemp=d;
			}
		}
		return dtemp;
	}
	
	private Corso trovaCorso(Università u, String nome) {
		List<Corso> corsi=u.getCorsi();
		Corso ctemp=null;
		for(Corso c:corsi){
			if(c.getNome().equals(nome)){
				ctemp=c;
				}
		}
		return ctemp;
	}
		
				
	}	
		
		
		
	
		



