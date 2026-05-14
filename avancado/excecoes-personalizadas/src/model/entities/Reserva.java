package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva() {
	}

	public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public void setNumeroDoQuarto(Integer numeroDoQuarto) {
		this.numeroDoQuarto = numeroDoQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	public void atualizarDatas(Date checkIn, Date checkOut) {
		Date dataAgora = new Date();
		if (checkIn.before(dataAgora) || checkOut.before(dataAgora)) {
			throw new IllegalArgumentException("As datas de reserva devem ser datas futuras.");
		}
		if (!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("A data de check-out precisa ser depois da data de check-in.");
		}

		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto " + numeroDoQuarto + ", check-in: " + formatoData.format(checkIn) + ", check-out: "
				+ formatoData.format(checkOut) + ", " + duracao() + " noites";

	}

}
