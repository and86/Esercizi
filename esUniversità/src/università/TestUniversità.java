package universitÓ;
public class TestUniversitÓ {

public static void main(String[] args) {
	Segreteria s = new Segreteria();
	UniversitÓ u = new UniversitÓ("UniversitÓ catania");
	

	System.out.println("Registra Studente: ");
	Studente s1=s.registraStudente(u, "Pippo", "Rossi");
	Studente s2=s.registraStudente(u, "Mario", "Bianchi");
	Studente s3=s.registraStudente(u, "Luca", "Verdi");
	Studente s4=s.registraStudente(u, "Franco", "Belli");
	Studente s5=s.registraStudente(u, "Luca", "Verdi");
	
	System.out.println(u.stampaStudenti());
	
	System.out.println("\nRegistra Docente: ");
	Docente d1=s.registraDocente(u, "Mmmm", "Lmmmm", "lamsjd");
	Docente d2=s.registraDocente(u, "Nnnnn", "Gtttt", "aaaa");
	Docente d3=s.registraDocente(u, "Annnn", "yryryry", "sssd");
	Docente d4=s.registraDocente(u, "vahid", "docent", "auuuhj");
	
	System.out.println(u.stampaDocenti());
	
	System.out.println("\nRegistra Corsi: ");
	Corso c1=s.registraCorso(u, "Fisica", 10);
	Corso c2=s.registraCorso(u, "Analisi", 15);
	Corso c3=s.registraCorso(u, "Informatica",30);
	Corso c4=s.registraCorso(u, "Elettronica", 50);
	
	System.out.println(u.stampaCorsi());
	
	System.out.println("\nAggiungi studente a corso");

	if(s.aggiungiStudenteACorso(u, s1, c1)==true){
		System.out.println("Studente aggiunto");
	}else{
		System.out.println("Studente giÓ in corso");
	}
	
	System.out.println("\nAggiungi docente a corso");

	if(s.aggiungiDocenteACorso(u, d1, c1)==true){
		System.out.println("Docente assegnato al corso");
	}else{
		System.out.println("Docente giÓ assegnato al corso");}
	
	
	
	
	




}
}

	



