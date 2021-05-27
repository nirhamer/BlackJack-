import java.io.Serializable;

public class Card implements Serializable
{
	//TODO it would be batter to define suit as an enum a enum could  move the 'suit name' to the Suit enum reducing the size of card


	private char suit;
	private int value;

	private Card() {

		suit = ' ';
		value = 0;


	}

	public Card(char newSuit, int newValue) throws InvalidCardValueException, InvalidCardSuitException {
		if (newValue < 1 || newValue > 13) {
			throw new InvalidCardValueException(newValue);
		} else {
			
			this.value = newValue;
		}
		if (newSuit != 'H' && newSuit != 'S' && newSuit != 'D' && newSuit != 'C') {
			throw new InvalidCardSuitException(newSuit);
		} else {
			this.suit = newSuit;
		}
		
		}


	public String toString() {
		
		return getSuitName() + " " + this.value;

	}

	public String getSuitName() {

		//TODO use switch statement her it will help reducing the code size
		String suit;
		
		if (this.suit == 'H') {

			suit = "Hearts";

		}
		else if (this.suit == 'S') {

			suit = "Spades";

		}
		else if (this.suit == 'C') {

			suit = "Clubs";

		}
		else if (this.suit == 'D') {

			suit = "Diamonds";

		} else {

			suit = "Unknown";
		}
		
		return suit;

	}
	public char getSuitDesignator() {

		return suit;

	}

	public String getValueName(){

		String name = "Unknown";

		if (this.value == 1) {		
			name = "Ace";
		}
		else if (this.value == 2) {
			name = "Two";
		}
		else if (this.value == 3) {
			name = "Three";
		}
		else if (this.value == 4) {
			name = "Four";
		}
		else if (this.value == 5) {
			name = "Five";
		}
		else if (this.value == 6) {
			name = "Six";
		}
		else if (this.value == 7) {
			name = "Seven";
		}
		else if (this.value == 8) {
			name = "Eight";
		}
		else if (this.value == 9) {

			name = "Nine";
		}
		else if (this.value == 10) {

			name = "Ten";
		}
		else if (this.value == 11) {

			name = "Jack";
		}
		else if (this.value == 12) {

			name = "Queen";
		}
		else if (this.value == 13) {

			name = "King";

		} 
		return name;

	}
	
	public int getValue() {
		
		return this.value;
	}

	//TODO methods starting with  compare  might not be the best choice for Java
	// The common concepts of equivalence means i could probably use isSameSuit or isSameValue rather than compare
	public boolean compareSuit(Card card){
		
		return this.suit == card.getSuitDesignator();
		
	}
	
	public boolean compareValue(Card card){
		
		return this.value == card.getValue();
	}
	
	public boolean compareTo(Card card){
		
		return this.suit == card.getSuitDesignator() && this.value == card.getValue();
	}


} //End class