package università;

import java.util.ArrayList;
import java.util.List;



//import biblioteca.Utente;

public class Segreteria {
	
	public Studente registraStudente(Università u,String nome,String cognome){
		List<Studente> studenti=u.getStudenti();
		Studente stemp=null;
		for(Studente s:studenti){
			if(s.getNome().equals(nome) && s.getCognome().equals(cognome)){
				stemp=s;
							}
		}
		
		if(stemp==null){
			Studente studenteNuovo=new Studente(nome,cognome);
			studenteNuovo.setMatricola(cognome.substring(0, 2)+(u.getStudenti().size()+1));
			studenti.add(studenteNuovo);
			return studenteNuovo;
			
		}else{
			return stemp;
		}
	}
	
	public Docente registraDocente(Università u,String nome, String cognome, String codiceFiscale){
		List<Docente> docenti=u.getDocenti();
		Docente dtemp=null;
		for(Docente d:docenti){
			if(d.getCodiceFiscale().equals(codiceFiscale)){
				dtemp=d;
			}
		}
		if(dtemp==null){
			Docente docenteNuovo=new Docente(nome,cognome,codiceFiscale);
			docenti.add(docenteNuovo);
			return docenteNuovo;
			} else {
				return dtemp;
				}
	}
	
	public Corso registraCorso(Università u,String nome,int ore){
		List<Corso> corsi=u.getCorsi();
		Corso ctemp=null;
		for(Corso c:corsi){
			if(c.getNome().equals(nome)){
				ctemp=c;
				}
		}
		if(ctemp==null){
			Corso corsoNuovo=new Corso(nome,ore);
			corsi.add(corsoNuovo);
			return corsoNuovo;
			
		} else{
			return ctemp;
		}
		
	}
	
	public boolean aggiungiStudenteACorso(Università u,Studente s, Corso c){
		boolean res=false;
		if(s.isValid() && c.isValid()){
			c.getStudenti().add(s);
			res=true;
		}
		return res;
				
	}
	
	public boolean aggiungiDocenteACorso(Università u,Docente d, Corso c){
		boolean res=false;
		List<Docente> docentiCorso=c.getDocenti();
		//Studente sctemp=null;
		for(Docente d1:docentiCorso){
			if(d1.getCodiceFiscale().equals(d.getCodiceFiscale())){
				System.out.println("Docente presente");
				
			}else{
				d1.setNome(d.getNome());
				d1.setCognome(d.getCognome());
				d1.setCodiceFiscale(d.getCodiceFiscale());
				res= true;
			}
		
			
		}
		return res;
		
				
	}	
		
		
		
	
		


}
