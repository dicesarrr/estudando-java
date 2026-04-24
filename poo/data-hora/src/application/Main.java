package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		// Instanciando Data e Hora
		
		// Instanciando data local de agora
		LocalDate data1 = LocalDate.now();
		System.out.println("Data de agora: " + data1);
		
		// Instanciando data e hora local de agora
		LocalDateTime data2 = LocalDateTime.now();
		System.out.println("Data e hora de agora: " + data2);
		
		// Instanciando data e hora global de agora (Zulu time / GMT)
		Instant data3 = Instant.now();
		System.out.println("Data e hora de agora: " + data3);
		
		// Instanciando data local utilizando uma formatação de texto
		LocalDate data4 = LocalDate.parse("2026-12-20");
		System.out.println("Data do meu próximo aniversário: " + data4);
		
		// Instanciando data e hora local utilizando uma formatação de texto
		LocalDateTime data5 = LocalDateTime.parse("2027-03-25T15:27:00");
		System.out.println("Data do próximo aniversário da minha mãe: " + data5);
		
		// Instanciando data e hora global (Zulu time / GMT) utilizando uma formatação de texto
		Instant data6 = Instant.parse("2027-02-03T15:27:00Z");
		System.out.println("Data: " + data6);
		
		// Instanciando data e hora global (Zulu time / GMT) utilizando uma formatação de texto e armazenando fuso do Brasil
		Instant data7 = Instant.parse("2027-12-20T15:27:00-03:00");
		System.out.println("Data: " + data7);
		
		// Transformando texto customizado em data e hora
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data8 = LocalDate.parse("20/12/2026", formatoData);
		System.out.println("Data: " + data8);
		
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime data9 = LocalDateTime.parse("20/12/2026 23:15", formatoDataHora);
		System.out.println("Data: " + data9);
		
		// Instanciando datas a partir de dados isolados
		LocalDate data10 = LocalDate.of(2026, 12, 20);
		System.out.println("Data: " + data10);
		
		LocalDateTime data11 = LocalDateTime.of(2026, 12, 20, 23, 15);
		System.out.println("Data: " + data11);

		System.out.println("------------------------------------------------------------------");
		
		// Formatando Data e Hora
		
		// Formatando Data em String
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data: " + data4.format(fmt1));
		System.out.println("Data: " + fmt1.format(data4));
		System.out.println("Data: " + data4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		// Formatando Data e Hora em String
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data: " + data5.format(fmt2));

		// Formatando Data e Hora com Time Zone em String
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("Data: " + fmt3.format(data6));
		
		// Exemplo de formatação com ISO
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("Data: " + fmt4.format(data5));
		
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("Data: " + fmt5.format(data6));
		
	}

}
