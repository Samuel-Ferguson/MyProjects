import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class FunnyLilThing {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Input Passcode");
        String affirmation = scnr.nextLine();
        if (affirmation.equals("REDFLAG")) {
            for (int j = 0; j < 5000; j++) {
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
                    desktop.browse(oURL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        else{System.out.println("Failed");}

    }
}
