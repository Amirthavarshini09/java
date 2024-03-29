package eCeptionnn;
import java.util.Scanner;

public class exception1 {
		public static void main(String[] args) {
			int[] counts=new int [26];
			Scanner scan = new Scanner(System.in);
			//get word from user
			System.out.print("Enter a single word (letters only, please): ");
			String word =scan.nextLine();
			//convert to all upper case
			word= word.toUpperCase();
			//count frequency of each letter in string
			int i=0;
			try {
			for (i=0; i < word.length(); i++){
				counts [word.charAt(i)-'A']++;
			}
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Not a Letter"+word.charAt(i));
			}
			//print frequencies
			System.out.println();
			for (int i1=0; i1<counts.length; i1++) {
				if (counts [i1] != 0);
				System.out.println((char) (i1+'A')+":"+ counts[i1]);
			}
		}
	}

