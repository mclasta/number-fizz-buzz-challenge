package br.com.challenge.fizzbuzz;

import br.com.challenge.fizzbuzz.services.FizzBuzzService;

import java.util.List;

public class FizzbuzzApplication {

	public static void main(String[] args) {
		List<String> resultList = FizzBuzzService.numberFizzOrBuzz(1, 100);
		resultList.forEach(System.out::println);
	}
}
