package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// Pips: ♣♦♥♠
		// Numbers: A2345678910JQK

		List<Character> pips = Arrays.asList('♣', '♦', '♥', '♠');
		List<String> numbers = Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K");

		ArrayList<String> deck = new ArrayList<String>();

		for (String n : numbers) {
			for (Character p : pips) {
				deck.add(n + p);
			}
		}

		System.out.println("Original Deck:");
		System.out.println(deck + "\n");

		ArrayList<String> shuffledDeck = new ArrayList<String>();

		Random random = new Random();
		for (int i = 0; i < deck.size(); i++) {

			String aux = deck.get(random.nextInt(deck.size()));

			while (shuffledDeck.contains(aux)) {
				aux = deck.get(random.nextInt(deck.size()));
			}

			shuffledDeck.add(aux);

		}

		System.out.println("Shuffled Deck:");
		System.out.println(shuffledDeck + "\n");

	}

}
