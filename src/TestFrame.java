import javax.swing.*;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {


    JLabel lInput;
    JButton bButton;

    public TestFrame(){
    setSize(500,500);
    setTitle("testowe okienko");
    setLayout(null);
    bButton = new JButton("działa");
    bButton.setBounds(20,20,150,20);
    bButton.setVisible(true);

    lInput = new JLabel("label");
    lInput.setBounds(20,40,150,20);
    lInput.setVisible(true);

    add(bButton);

    }

}
