package biblioteca;

import java.util.Date;

public class Prestito {
	private Utente utente;
	private Libro libro;
	private Date dataPrestito;
	private Date dataRestituzione;
	private Date dataScadenza;
	
	public Prestito() {
		
	}

	public Prestito(Utente utente, Libro libro, Date dataPrestito,
			Date dataRestituzione,Date dataScadenza) {
		
		this.utente = utente;
		this.libro = libro;
		this.dataPrestito = dataPrestito;
		this.dataRestituzione = dataRestituzione;
		this.dataScadenza=dataScadenza;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Date getDataPrestito() {
		return dataPrestito;
	}

	public void setDataPrestito(Date dataPrestito) {
		this.dataPrestito = dataPrestito;
	}

	public Date getDataRestituzione() {
		return dataRestituzione;
	}

	public void setDataRestituzione(Date dataRestituzione) {
		this.dataRestituzione = dataRestituzione;
	}
			

}
