package com.bridgelab.deckqueue.datamain;


import com.bridgelabz.deckqueue.deckqueueimple.DeckQueueImplementation;

public class deckQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeckQueueImplementation deck = new DeckQueueImplementation();
		//Initialize the deck of cards
		deck.initDeck();
		//Shuffle the deck of cards
		deck.shuffleDeck();
		//Print the shuffled deck of cards
		//deck.printDeck();
		//Print the deck of 9 cards distributed to 4 people
	   deck.totalDeck();
	    deck.printDeck();
	}

}
