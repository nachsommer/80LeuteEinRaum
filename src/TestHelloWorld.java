import javax.swing.*;

public class TestHelloWorld {

    public static void main(String[] args) {
        // System.out.println("Daten");
        System.out.println( "\nHello World!" );
        test();
        TestWindow fenster = new TestWindow();
        fenster.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        fenster.setSize( 250, 120 );
        fenster.setLocation( 200, 120 );
        fenster.setVisible( true );
        fenster.validate();
    }

    public static void test() {
        // @TODO: Extend this method...
        /*

        Unterschiede von Datentypen, wenn man 3.5 / dreieinhalb Äpfel definieren möchte.

         */

        String aepfel = "Dreieinhalb";
        String birnen = "4.5";

        String obst = aepfel + birnen;

        System.out.println( obst );

        int aepfel1 = 3;

        double aepfel2 = 3.5;
        double birnen2 = 3.5;

        String banane = "Chiquita";

        System.out.println( aepfel2 + birnen2 );
        System.out.println( "Mal schauen, was jetzt passiert..." + " " + banane);

    }

    // funtion to check if the input string contains only numbers
    public static boolean isNumeric(String input) {

        // if input string is null or emtpy return false
        if (input == null || input.isEmpty()) {
            return false;
        }
        // try to convert string to int. If format is wrong, return false
        try {
            int number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        // input string is not null, not empty and in the right format
        return true;
    }
}
hallo
