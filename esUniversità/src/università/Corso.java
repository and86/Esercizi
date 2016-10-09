package università;

import java.util.ArrayList;
import java.util.List;

public class Corso implements ValidaDato {
	
	private String nome;
	private int ore;
	private List <Studente> studenti=new ArrayList<Studente>();
	private List <Docente> docenti=new ArrayList<Docente>();
	
	public Corso() {
		
	}
	public Corso(String nome, int ore) {
		super();
		this.nome = nome;
		this.ore = ore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getOre() {
		return ore;
	}
	public void setOre(int ore) {
		this.ore = ore;
	}
	public List<Studente> getStudenti() {
		return studenti;
	}
	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
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
	
	


	@Override
	public boolean isValid() {
		boolean res=false;
		if (!nome.isEmpty() && nome!=null){
			res=true;
		}
		return res;
	}
	
	
	

}
