package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Informe o número do quarto: ");
		int numeroDoQuarto = sc.nextInt();
		System.out.print("Informe a data do check-in (dd/MM/aaaa): ");
		Date dataCheckIn = formatoData.parse(sc.next());
		System.out.print("Informe a data do check-out (dd/MM/aaaa): ");
		Date dataCheckOut = formatoData.parse(sc.next());

		if (!dataCheckOut.after(dataCheckIn)) {
			System.out.println("Erro na reserva: A data de check-out precisa ser depois da data de check-in.");
		} else {
			Reserva reserva = new Reserva(numeroDoQuarto, dataCheckIn, dataCheckOut);
			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("Informe os dados para atualizar a reserva: ");
			System.out.print("Informe a data do check-in (dd/MM/aaaa): ");
			dataCheckIn = formatoData.parse(sc.next());
			System.out.print("Informe a data do check-out (dd/MM/aaaa): ");
			dataCheckOut = formatoData.parse(sc.next());

			Date dataAgora = new Date();
			if (dataCheckIn.before(dataAgora) || dataCheckOut.before(dataAgora)) {
				System.out.println("Erro na reserva: As datas de reserva devem ser datas futuras.");
			} else if (!dataCheckOut.after(dataCheckIn)) {
				System.out.println("Erro na reserva: A data de check-out precisa ser depois da data de check-in.");
			} else {
				reserva.atualizarDatas(dataCheckIn, dataCheckOut);
				System.out.println("Reserva: " + reserva);
			}

		}

		sc.close();

	}

}
