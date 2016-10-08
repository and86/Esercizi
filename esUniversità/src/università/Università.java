package università;

import java.util.ArrayList;
import java.util.List;



public class Università {
	private String nome;
	private List<Corso> corsi=new ArrayList<Corso>();
	private List<Docente> docenti= new ArrayList<Docente>();
	private List<Studente> studenti= new ArrayList<Studente>();

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public Università() {
	
	}

	public Università(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void setDocenti(List<Docente> docenti) {
		this.docenti = docenti;
	}
	
	public void aggiungiStudente(Studente s){
		studenti.add(s);
	}
	
	public void aggiungiDocente(Docente d){
		docenti.add(d);
	}
	
	public void aggiungiCorso(Corso c){
		corsi.add(c);
	}
	
	public String stampaCorsi(){
		
		String str="";
		for(Corso ct: corsi){
			str+=("\n"+ct.getNome()+" "+"Ore: "+ct.getOre());
		}
		return str;
	}
	
public String stampaDocenti(){
		
		String str="";
		for(Docente dt: docenti){
			str+=("\n"+dt.getNome()+" "+dt.getCognome());
		}
		return str;
	}
	
	

}