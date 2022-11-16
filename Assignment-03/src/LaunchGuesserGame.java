import java.util.Scanner;
/*
 *enhanced guesser game with adding below functionalities
 *added a method that take one argument that will show the player number
 *added a functionalities that will verify umpire with login whether a umpire is valid of not using username and password.
 */

class Guesser {
	int guessNum;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess the number: ");
		guessNum = scan.nextInt();
		return guessNum;

	}
}

class Player {
	int guessNum;

	int guessNum(int i) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Player " + i + " Kindly Guess the number: ");
		guessNum = scan.nextInt();
		return guessNum;

	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
// verify umpire with login id and password
	String userName = "umpire";
	String password = "Umpire@123";
	Scanner scan = new Scanner(System.in);

	void logIn() {
		System.out.println("Umpire enter your usename: ");
		String user = scan.nextLine();
		System.out.println("Umpire enter your password: ");
		String pass = scan.nextLine();

		if (userName.equalsIgnoreCase(user) && password.equals(pass)) {
			System.out.println("loged in");
		} else {
			System.out.println("Wrong username or password please re login");
			logIn();
		}
	}

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum(1);
		numFromPlayer2 = p2.guessNum(2);
		numFromPlayer3 = p3.guessNum(3);
	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 & Player 2 won");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 & Player 3 won");
			} else {
				System.out.println("Player 1 won the game");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 & Player 3 won");
			} else {
				System.out.println("Player 2 won the game");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("All player lost game Try Again!");
		}

	}
}

public class LaunchGuesserGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.logIn();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
