package LordofRings;
import java.util.Scanner;
public class LordofRingsSimulator {
	public static void main (String [] args) {
	
		Scanner scnr = new Scanner(System.in);
		
		int frodoSteps;
		int finish = 0;
		
	for(finish = 0; finish < 1;) {
		System.out.print("You are Frodo, destined to carry the One Ring to Mordor \nand cast it into the fires of Mount Doom so that the evil Lord Sauron \ncannot claim the Ring for himself. \nHow many steps will you take to arrive at Mount Doom: ");
		frodoSteps = scnr.nextInt();
		
		
		if(frodoSteps < 5000 && frodoSteps < 100000) {
			System.out.println ("Some Nazgûl clapped your hobbit butt \nand then ran off with the Ring. Too bad.\n");
		}
		
		if(frodoSteps < 100000 && frodoSteps >5000) {
			System.out.println("Some Orc just played golf with \nyour little hobbit head\n");
		}
		
		if(frodoSteps < 4000000 && frodoSteps >100000) {
			System.out.println("Sauron himself found you and chucked you into Mount Doom... \nwithout the Ring.\n");
		}
		
		if(frodoSteps >= 4435225) {
			System.out.println("Congratulations, Sir Frodo, you have made it to Mount Doom \nand have cast the Ring into the fire");
			finish = 1;
		}
	}
	}
}
