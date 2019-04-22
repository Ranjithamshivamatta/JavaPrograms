package com.bridgelabz.deckofcards.datamain;

import com.bridgelabz.deckofcards.dataimple.DeckOfCardsServiceImple;

public class DeckOfCardsApp {
public static void main(String[] args)
{
	DeckOfCardsServiceImple deck = new DeckOfCardsServiceImple();
	//Initialize the deck of cards
	deck.initDeck();
	//Shuffle the deck of cards
	deck.shuffleDeck();
	
   
    deck.printDeck();
}
}
