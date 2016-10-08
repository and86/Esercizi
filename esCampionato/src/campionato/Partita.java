package campionato;

import java.util.Date;

public class Partita {
	private Date data;
	private String squadraCasa;
	private String squadraOspite;
	private int retiDellaSquadraCasa;
	private int retiDellaSquadraOspite;
	private char risultato;
	
	public Partita() {
		
	}

	public Partita(Date data, String squadraCasa, String squadraOspite,
			int retiDellaSquadraCasa, int retiDellaSquadraOspite,char risultato) {
		super();
		this.data = data;
		this.squadraCasa = squadraCasa;
		this.squadraOspite = squadraOspite;
		this.retiDellaSquadraCasa = retiDellaSquadraCasa;
		this.retiDellaSquadraOspite = retiDellaSquadraOspite;
		this.risultato=risultato;
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getSquadraCasa() {
		return squadraCasa;
	}

	public void setSquadraCasa(String squadraCasa) {
		this.squadraCasa = squadraCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}

	public int getRetiDellaSquadraCasa() {
		return retiDellaSquadraCasa;
	}

	public void setRetiDellaSquadraCasa(int retiDellaSquadraCasa) {
		this.retiDellaSquadraCasa = retiDellaSquadraCasa;
	}

	public int getRetiDellaSquadraOspite() {
		return retiDellaSquadraOspite;
	}

	public void setRetiDellaSquadraOspite(int retiDellaSquadraOspite) {
		this.retiDellaSquadraOspite = retiDellaSquadraOspite;
	}

	public char getRisultato() {
		return risultato;
	}

	public void setRisultato(char risultato) {
		this.risultato = risultato;
	}
	

	
	
	
	

}
