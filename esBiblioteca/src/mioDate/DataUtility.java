package mioDate;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtility {
	
	public Date convertStringToDate(String dataString) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date= sdf.parse (dataString);
				
		return date;
				
	}
	
	public String convertDateToString(Date data){
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String date=sdf.format(data);
		
		return date;
	}
	
	public Date convertCalendarToDate(Calendar calendar){
		Date data =calendar.getTime();
		
		return data;
		
	}
	
	public Calendar convertDateToCalendar(Date data){
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(data);
		
		return calendar;
				
	}
	
public java.sql.Date convertJavaDateToSqlDate(Date date){
	
	return new java.sql.Date (date.getTime());
				
	}

public long getDifferenzaGiorni(Date data1,Date data2){
	
	long diffMilliSecondi=data2.getTime()-data1.getTime();
	long diffGiorni=diffMilliSecondi/(3600*24*1000);
	
	return diffGiorni;
		
}

}
