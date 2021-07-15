package Genrator;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// ask user for many password wants and length
		Scanner sc = new Scanner(System.in);
		System.out.println("how many password do you want to generate? ");
		int total = sc.nextInt();
		System.out.println("how long password do you want? ");
		int length = sc.nextInt();
		
		//strength of Password
		if (length <= 6) {
			System.out.println("This are weak Password: ");
		} else if (length <= 10) {
			System.out.println("This are Medium Password: ");
		} else {
			System.out.println("This are Strong Password: ");
		}
		// create an array to store password
		String[] randomPasswords = new String[total];
		// total number of pasword
		for (int i = 0; i < total; i++) {
			String randomPassword1 = "";
			// generate randome pass
			for (int j = 0; j < length; j++) {
				// random character
				randomPassword1 = randomPassword1 + randomCharacter();
			}
			// add array here
			randomPasswords[i] = randomPassword1;
		}
		// print password array
		PrintPassword(randomPasswords);
	}

	public static void PrintPassword(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static char randomCharacter() {
		// random number that represent all possiblty of character in our password
		// 10 digit+26 upper case + 26 lowercase=62 all possible char
		int rand = (int) (Math.random() * 62);
		// convert rand into number,uppercase and lowecase
		// rand between 0 to 61 inclusive
		// if rand is 0 to 9 = number
		// if rand 10 to 35 = uppercase
		// if rand 36 to 61== lowercase
		if (rand <= 9) {
			// number rand '0' to '9' ==48-57 asscii
			int ascii = rand + 48;
			return (char) (ascii);
		} else if (rand <= 35) {
			// upper case rand 10 and 35 ==65-90 asscii
			int ascii = rand + 55;// 65-10
			return (char) (ascii);
		} else {
			// lowercase rand 36 to 65 ==97-122 asscii
			int ascii = rand + 61;// 97-36
			return (char) (ascii);
		}
	}
}
// '0' to '9' ==48-57 
//'A' to'Z'   ==65-90
//'a'to'z'    ==97-122