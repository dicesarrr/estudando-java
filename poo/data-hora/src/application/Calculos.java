package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {
		
		// Realizando cálculos com data e hora
		
		LocalDate data1 = LocalDate.parse("2026-12-20");
		LocalDateTime data2 = LocalDateTime.parse("2026-12-20T15:09:00");
		Instant data3 = Instant.parse("2026-12-20T15:09:00Z");
		
		LocalDate localDateSemanaPassada = data1.minusDays(7);
		LocalDate localDateProximaSemana = data1.plusDays(7);
		
		System.out.println("Semana passada: " + localDateSemanaPassada);
		System.out.println("Próxima semana: " + localDateProximaSemana);
		
		LocalDateTime localDateTimeSemanaPassada = data2.minusDays(7);
		LocalDateTime localDateTimeProximaSemana = data2.plusDays(7);
		
		System.out.println("Semana passada: " + localDateTimeSemanaPassada);
		System.out.println("Próxima semana: " + localDateTimeProximaSemana);
		
		Instant instantSemanaPassada = data3.minus(7, ChronoUnit.DAYS);
		Instant instantProximaSemana = data3.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada: " + instantSemanaPassada);
		System.out.println("Próxima semana: " + instantProximaSemana);
		
		System.out.println("------------------------------------------------------------------");
		
		// Calculando duração
		
		Duration t1 = Duration.between(localDateSemanaPassada.atStartOfDay(), data1.atStartOfDay());
		System.out.println("Duração: " + t1.toDays());
		
		Duration t2 = Duration.between(localDateTimeSemanaPassada, data2);
		System.out.println("Duração: " + t2.toDays());

		Duration t3 = Duration.between(instantSemanaPassada, data3);
		System.out.println("Duração: " + t3.toDays());
		
		Duration t4 = Duration.between(data3, instantSemanaPassada);
		System.out.println("Duração: " + t4.toDays());
		
	}

}
