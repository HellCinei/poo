package aula;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class ExemploDate {

	public static void main(String[] args) {

		/*
		 * Date dataAtual = new Date(); System.out.println(dataAtual);
		 * System.out.println(dataAtual.getDate());
		 * System.out.println(dataAtual.getDay());
		 * 
		 * Calendar hoje = Calendar.getInstance(); System.out.println(hoje); int ano =
		 * hoje.get(Calendar.YEAR);
		 * 
		 * LocalDate hoje = LocalDate.now(); System.out.println(hoje); LocalDate entrada
		 * = LocalDate.of(2024, 9, 06); System.out.println(entrada.plusDays(3));
		 */

		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);

		for (String f : ZoneId.getAvailableZoneIds()) {
			System.out.println(f);
		}
	}

}
