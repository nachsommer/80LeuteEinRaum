public class TestHelloWorld {

    public static void main(String[] args) {
        // System.out.println("Daten");
        System.out.println( "\nHello World!" );
        test();
        TestWindow fenster = new TestWindow();
        fenster.setVisible( true );
        fenster.setSize( 200, 120 );
        fenster.setLocation( 200, 120 );
    }

    public static void test() {
        // @TODO: Extend this method...
        /*

        Unterschiede von Datentypen, wenn man 3.5 / dreieinhalb Äpfel definieren möchte.

         */

        String aepfel = "Dreieinhalb";
        String birnen = "3.5";

        String obst = aepfel + birnen;

        System.out.println( obst );

        int aepfel1 = 3;

        double aepfel2 = 3.5;
        double birnen2 = 3.5;

        System.out.println( aepfel2 + birnen2 );

    }

}
