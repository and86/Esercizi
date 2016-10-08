package campionato;

import java.util.Comparator;

public class SquadraComparator implements Comparator <Squadra> {
	
	Campionato c;

	
	public SquadraComparator(Campionato c){
		this.c=c;
	}
	
	
	@Override
	public int compare(Squadra s1, Squadra s2) {
		int valPunti=s2.getPunti()-s1.getPunti();
		if(valPunti==0){
			int valDifferenzaReti=s1.getDifferenzaReti()-s2.getDifferenzaReti();
			if (valDifferenzaReti==0){
				int valScontriDiretti=scontriDiretti(s1,s2);
				return valScontriDiretti;
			}
			return valDifferenzaReti;
		}
		return valPunti;
	}
	
	private int scontriDiretti (Squadra s1,Squadra s2){
		
		//Partita p=c.getMappaPartite().get(s1).get
		int p1=0;
		int p2=0;
		
		if(c.getMappaPartite().containsKey(s1.getNome()+" "+s2.getNome()) || (c.getMappaPartite().containsKey(s2.getNome()+" "+s1.getNome()))){
			if(c.getMappaPartite().get(s1).getRisultato()=='1'){
				p1=3;
			} else if (c.getMappaPartite().get(s1).getRisultato()=='2'){
				p2=3;
			}
			
							
		}
		int varScontriDiretti=p2-p1;
		return varScontriDiretti;
		
	}
	
}
