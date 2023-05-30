package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Reshmi 
 * @author Reshmi Patel May 23 2023
 */
public class Card {
    /**
     * An array representing the possible suits of a card.
     */
    public static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };

    private int value;
    private String suit;

    /**
     * Returns the value of the card.
     * @return The value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the card.
     * @param value The value to set for the card.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns the suit of the card.
     * @return The suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Sets the suit of the card.
     * @param suit The suit to set for the card.
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
}
