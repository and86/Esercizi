package campionato;

import java.util.Comparator;

public class GiocatoreComparator implements Comparator <Giocatore> {

	@Override
	public int compare(Giocatore g1, Giocatore g2) {
		int retiVal=g2.getReti()-g1.getReti();
		if (retiVal==0){
			int espVal=g1.getEspulsioni()-g2.getEspulsioni();
				if (espVal==0){
					int ammVal=g1.getAmmonizione()-g2.getAmmonizione();
					return ammVal;
				
				}else return espVal;
		}
				
		return retiVal;
	}
	

}
