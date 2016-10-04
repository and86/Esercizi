package università;
public class TestUniversità {

public static void main(String[] args) {
	Segreteria s = new Segreteria();
	Università u = new Università("Università catania");
	
	System.out.println("Registra Studente: ");
	s.registraStudente(u, "Pippo", "Rossi");
	s.registraStudente(u, "Mario", "Bianchi");
	s.registraStudente(u, "Luca", "Verdi");
	s.registraStudente(u, "Franco", "Belli");
	s.registraStudente(u, "Luca", "Verdi");
	
	for(Studente st: u.getStudenti()){
		System.out.println(st.getNome()+ " "+st.getCognome()+ " "+st.getMatricola());
	}
	
	System.out.println("Registra Docente: ");
	s.registraDocente(u, "Mmmm", "Lmmmm", "lamsjd");
	s.registraDocente(u, "Nnnnn", "Gtttt", "aaaa");
	s.registraDocente(u, "Annnn", "yryryry", "sssd");
	s.registraDocente(u, "vahid", "docent", "auuuhj");
	
	for(Docente dt: u.getDocenti()){
		System.out.println(dt.getNome()+ " "+dt.getCognome()+ " "+dt.getCodiceFiscale());
	}
	
	System.out.println("Registra Corsi: ");
	s.registraCorso(u, "Fisica", 10);
	s.registraCorso(u, "Analisi", 15);
	s.registraCorso(u, "Informatica",30);
	s.registraCorso(u, "Elettronica", 50);
	
	for(Corso ct: u.getCorsi()){
		System.out.println(ct.getNome()+" "+"Ore: "+ct.getOre());
	}
	
	System.out.println("Aggiungi studente a corso");
	Studente st= new Studente("Luca","Verdi");
	Corso ct=new Corso("Fisica",10);
	if(s.aggiungiStudenteACorso(u, st, ct)==true){
		System.out.println("Studente aggiunto");
	}else{
		System.out.println("Studente già in corso");}
	
	
	
	




}
}

	

//	System.out.println("Registrazione Utenti:");
//	if(g.registraUtente(b, "Mario", "Rossi")==true){
//		System.out.println("Utente Registrato");
//	}else{
//		System.out.println("Utente già Registrato");}
//	if(g.registraUtente(b, "Mario", "Rossi")==true){
//		System.out.println("Utente Registrato");
//	}else{
//		System.out.println("Utente già Registrato");}
//	if(g.registraUtente(b, "Chiara", "Verdi")==true){
//		System.out.println("Utente Registrato");
//	}else{
//		System.out.println("Utente già Registrato");}
//	System.out.println("Prestito Libri: ");
//	if(g.prestaLibro(b, "tttt", "aaaa", "Mario", "Rossi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	if(g.prestaLibro(b, "TTTT", "AAAA", "Mario", "Rossi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	if(g.prestaLibro(b, "NNNN", "aaaa", "Mario", "Rossi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	if(g.prestaLibro(b, "FFFF", "aaaa", "Mario", "Rossi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	if(g.prestaLibro(b, "NNNN", "aaaa", "Chiara", "Verdi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	if(g.prestaLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
//		System.out.println("Libro prestato!");
//	}else{
//		System.out.println("Impossibile prestare!");}
//	System.out.println("Resituzione libri: ");
//	if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
//		System.out.println("Libro restituito!");
//	}else{
//		System.out.println("Impossibile restituire!");}
//	if(g.restituisciLibro(b, "FFFF", "aaaa", "Chiara", "Verdi")==true){
//		System.out.println("Libro restituito!");
//	}else{
//		System.out.println("Impossibile restituire!");} 
//	}



