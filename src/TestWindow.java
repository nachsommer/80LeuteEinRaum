import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestWindow extends JFrame {
    private JButton button1;
    private JPanel jPanel0;
    private JTextField textField1;
    private JTextField textField2;
    Integer integer1;
    Integer integer2;

    public TestWindow() {
        this.integer1 = 0;
        this.integer2 = 0;
        this.add( jPanel0 );
        button1.addActionListener(new ActionListener() {
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
                 * We clear the Textfields.
                 */
                textField1.setText("");
                textField2.setText("");
                /**
                 * We translate the StringBuffer into a String which we subsequently translate into an Integer number.
                 */
                if(sb1.length() > 0) integer1 = Integer.parseInt(sb1.toString());
                if(sb2.length() > 0) integer2 = Integer.parseInt(sb2.toString());
                int integer3;
                int integer4;
                integer3 = (integer1+integer2);
                integer4 = (integer1-integer2);
                //**
                // * And show a DialogMessage to display the saved values.
                // */
                JOptionPane.showMessageDialog(null, "VariableA= "+integer1+"\nVariableB= "+integer2);
                JOptionPane.showMessageDialog(null, "Addition= "+integer3+"\nSubtraction= "+integer4);
            }
        });
    }





}
