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
//			if (valDifferenzaReti==0){
////				String valRisultato=c.getMappaPartite().get(s1.getNome()+" "+s2.getNome()).getRisultato();
//			}
			return valDifferenzaReti;
		}
		return valPunti;
	}
	
}
