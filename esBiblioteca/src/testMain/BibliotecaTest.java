package testMain;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Map;

import biblioteca.*;

public class BibliotecaTest {

	public static void main(String[] args) throws UtenteGi‡Esiste {
	
	Gestione g = new Gestione();
	Biblioteca b = new Biblioteca("Biblioteca Poli");
	
	System.out.println("Registrazione Libri:");
	g.registraLibro(b, "Il miglio verde", "aaaa", "a", 2);
	g.registraLibro(b, "Il ritratto", "wild", "b", 5);
	g.registraLibro(b, "Il fu mattia", "pirandello", "c", 7);
	g.registraLibro(b, "Matematica insieme", "newton", "d", 10);
	g.registraLibro(b, "I numeri primi", "verga", "e", 8);
	g.registraLibro(b, "La relativit‡", "Einstein", "f", 9);
		
	System.out.println(b.stampaLibri(b.getLibri()));
		
	
	System.out.println("\nRegistrazione Utenti:");
	
	try{
		g.registraUtente(b, "Mario", "Rossi","maro");
	}catch(UtenteGi‡Esiste e) {
		System.out.print(""); 
	}
	
	try{
		g.registraUtente(b, "Mario", "Rossi","maro");
	}catch(UtenteGi‡Esiste e) {
		System.out.print(""); 
	}		
	
	try{ 	
		g.registraUtente(b, "Chiara", "Verdi","chve");
	}catch(UtenteGi‡Esiste e) {
				System.out.print(""); 
	}
	finally{
		
	System.out.println(b.stampaUtenti(b.getUtenti()));
	
	System.out.println("\nPrestito Libri: ");
	
	
	GregorianCalendar gc= new GregorianCalendar();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String str1 = "31/12/2016";
	try {
		gc.setTime(sdf.parse(str1));
	} catch (ParseException e) {
		e.printStackTrace();
	}
	
	java.util.Date data1=gc.getTime();
	
		if(g.prestaLibro(b, "a","maro",data1)==true){
		System.out.println("Libro prestato  !");
	}else{
		System.out.println("Impossibile prestare!");
	}
		
	System.out.println("\nResituzione libri: ");
	if(g.restituisciLibro(b, "a", "maro")==true){
		System.out.println("Libro restituito!");
	}else{
		System.out.println("Impossibile restituire!");
		}	
	
	}
	}
}






