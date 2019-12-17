import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWindow extends JFrame {
    private JButton button1;
    private JPanel jPanel0;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    Integer integer1;
    Integer integer2;

    public TestWindow() {
        this.integer1 = 0;
        this.integer2 = 0;
        this.add( jPanel0 );
        button1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                /**
                 * We save the content of the the textfields as Strings.
                 */
                String string1 = textField1.getText();
                String string2 = textField2.getText();
                /**
                 * We create two StringBuffers and two Integers with value 0.
                 */
                StringBuffer sb1 = new StringBuffer();
                StringBuffer sb2 = new StringBuffer();
                Integer integer1 = 0;
                Integer integer2 = 0;

                /**
                 * We iterate over the Strings appending only Digits and the minus of negativ numbers to the StringBuffer
                 */
                for(int i = 0; i < string1.length(); i++){
                    Character ch = string1.charAt(i);
                    if(Character.isDigit(ch)| (ch == '-' && i == 0)) sb1.append(ch);
                }
                for(int i = 0; i < string2.length(); i++){
                    Character ch = string2.charAt(i);
                    if(Character.isDigit(ch)| (ch == '-' && i == 0)) sb2.append(ch);
                }
                /**
                 * We translate the StringBuffer into a String which we subsequently translate into an Integer number.
                 */
                if(sb1.length() > 0) integer1 = Integer.parseInt(sb1.toString());
                if (sb2.length() > 0) integer2 = Integer.parseInt( sb2.toString() );
                int integer3;
                int integer4;
                integer3 = (integer1 + integer2);
                integer4 = (integer1 - integer2);
            }
        } );

        textField1.addActionListener( new ActionListener() {
            // After hitting <ENTER> the user's cursor will be transferred to textField2;
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.requestFocus();
            }
        } );

        textField2.addActionListener( new ActionListener() {
            // After hitting <ENTER> the user's cursor will be transferred to the calculation button;
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.requestFocus();
            }
        } );

        // Smoothing the appearance: Once the window is shown, the user will be prompted to textField1
        textField1.requestFocus();

    }


    public void calculateValues(int position) {
        switch (position) {
            case 0:
                System.out.println( "Plus" );
            case 1:
                System.out.println( "Minux" );
            case 2:
                System.out.println( "Mal" );
            case 3:
                System.out.println( "Geteilt" );
        }
    }


}
