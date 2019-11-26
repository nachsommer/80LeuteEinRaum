import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWindow extends JFrame {
    private JButton button1;
    private JPanel jPanel0;
    private JPanel jPanel1;
    private JTextField textField1;
    private JTextField textField2;


    public TestWindow() {
        this.add( jPanel0 );
        button1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println( "Knopf gedrückt!" );

            }
        } );
        textField1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println( "Wert eingegeben! Er lautet: " + textField1.getText() );
                /*

                An dieser Stelle benötigen wir eine Methode, die es erlaubt, den Eingabewert des textField1 in eine Integer-Variable umzuwandeln.
                Hausaufgabe!

                 */

            }
        } );
    }

}
