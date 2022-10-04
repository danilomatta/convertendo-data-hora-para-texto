package SECAO11_112_ConvertendoDataHoraParaTexto;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-03-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-03-20T01:30:26");
		Instant d03 = Instant.parse("2022-03-20T01:30:26Z");
		
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
//Tem que seguir o padrão do link acima	
		//FORMATANDO O LOCALDATE
		DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(d01.format(dtm));
		//OU
		System.out.println(dtm.format(d01));
		//or
		System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		//or 
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(d01));
		
	
		//FORMATANDO O LOCALDATETIME para um patterns customizado
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(d02));
	
		//Já o INSTANT, que trabalha com fuso-horário, tem que determinar qual o fuso horario
//com o método systemDefault(), ele pega o fuso horario do local
		DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());  
				System.out.println(dtf01.format(d03));
		
		
	}

}
