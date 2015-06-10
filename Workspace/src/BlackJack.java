import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class BlackJack {
	
	 public static int heartCards[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	 public static int diamondCards[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	 public static int clubCards[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	 public static int spadeCards[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	 
	 public static int[][] Cards = {heartCards, diamondCards, clubCards, spadeCards};
	 
	static Random rand = new  Random();
	
	public static int cardPicker(){
		int tempCard = 0;
		while (tempCard == 0){
			int tempValue1 = rand.nextInt(13);
			int tempValue2 = rand.nextInt(4);
			if (Cards[tempValue2][tempValue1] != 0){
				 tempCard = Cards[tempValue2][tempValue1];
				 Cards[tempValue2][tempValue1] = 0;
			 }
		}
		return tempCard;
	}
	
	public static void main(String[] args){
		
		 Scanner keyboard = new Scanner(System.in);
		 
		 Random rand = new Random();
		 
		 // INITIAL DEAL
		 
		 int userCard1 = cardPicker();
		 int userCard2 = cardPicker();
		 int dealerCard1 = cardPicker();
		 int dealerCard2 = cardPicker();
		 
		 int userTotal = userCard1 + userCard2;
		 int dealerTotal = dealerCard1 + dealerCard2;
		 
		 
		 System.out.println("Welcome to the Blackjack table!\n");
		 System.out.println("The cards have been dealt. Your cards are " + userCard1 + " and " + userCard2 + ", so your total is " + (userCard1+userCard2));
		 System.out.println("\nThe dealer's flipped card is " + dealerCard1 + "\n");
		 
		 

	}
}
