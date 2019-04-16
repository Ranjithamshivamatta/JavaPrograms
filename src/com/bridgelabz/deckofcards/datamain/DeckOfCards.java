package com.bridgelabz.deckofcards.datamain;

import com.bridgelabz.deckofcards.dataimple.DeckOfCardsImple;

public class DeckOfCards {
public static void main(String[] args)
{
	DeckOfCardsImple deck = new DeckOfCardsImple();
	//Initialize the deck of cards
	deck.initDeck();
	//Shuffle the deck of cards
	deck.shuffleDeck();
	//Print the shuffled deck of cards
	//deck.printDeck();
	//Print the deck of 9 cards distributed to 4 people
    deck.totalDeck();
}
}
