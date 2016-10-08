import java.util.ArrayList;
import java.util.List;

import rubrica.Rubrica;
import rubrica.Voce;


public class EsempioRubrica {

	public static void main(String[] args) {
		
		Rubrica r=new Rubrica("vahid");
		
		Voce v1=new Voce("aaa","bbb","4444");
		
		Voce v2=new Voce("www","eeew","45544");
		
		List<Voce> voci=new ArrayList<Voce>();
		
//		voci.add(v1);
//		voci.add(v2);
//		
//		r.setVoci(voci);
		
		r.inserisciVoce(v1);
		r.inserisciVoce(v2);
		
		for(Voce v: r.getVoci()){
			System.out.println(v.getNome()+" "+ v.getCogname() +" "+v.getTel());
		}
		
		
		
		
		
		
		

	}

}
