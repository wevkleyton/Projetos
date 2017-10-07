package br.com.testes;

import java.time.LocalDate;
import java.time.Period;

public class Teste {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2015,3,26);
		Period p = Period.ofDays(1);
		System.out.println(date.plus(p));
	}
	
}
