package rubrica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	private String nome;
	private List<Voce> voci =new ArrayList<Voce>();
	
	
	
	public Rubrica() {
		
	}


	public Rubrica(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Voce> getVoci() {
		return voci;
	}


	public void setVoci(List<Voce> voci) {
		this.voci = voci;
	}
	
	public void inserisciVoce(Voce v){
		voci.add(v);
	}
	
	
}
