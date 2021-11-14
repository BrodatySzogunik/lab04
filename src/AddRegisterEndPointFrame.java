

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddRegisterEndPointFrame extends JFrame implements ActionListener {

    JTextField tPostCode,tCity,tStreet,tBuildingNumber,tFlatNumber;
    JLabel lPostCode,lCity,lStreet,lBuildingNumber,lFlatNumber,lPostCodeError;
    JButton bRegister;


    public AddRegisterEndPointFrame(){
        setSize(500,500);
        setTitle("Rejestrowanie nowego punktu odbioru");
        setLayout(null);

        tPostCode = new JTextField();
        tPostCode.setBounds(170,20,150,20);
        tPostCode.setVisible(true);

        tCity = new JTextField();
        tCity.setBounds(170,40,150,20);
        tCity.setVisible(true);

        tStreet = new JTextField();
        tStreet.setBounds(170,60,150,20);
        tStreet.setVisible(true);

        tBuildingNumber = new JTextField();
        tBuildingNumber.setBounds(170,80,150,20);
        tBuildingNumber.setVisible(true);

        tFlatNumber = new JTextField();
        tFlatNumber.setBounds(170,100,150,20);
        tFlatNumber.setVisible(true);

        lPostCode = new JLabel("Kod pocztowy");
        lPostCode.setBounds(20,20,150,20);
        lPostCode.setVisible(true);

        lCity = new JLabel("Miasto");
        lCity.setBounds(20,40,150,20);
        lCity.setVisible(true);

        lStreet = new JLabel("Ulica");
        lStreet.setBounds(20,60,150,20);
        lStreet.setVisible(true);

        lBuildingNumber = new JLabel("Nr budynku");
        lBuildingNumber.setBounds(20,80,150,20);
        lBuildingNumber.setVisible(true);

        lFlatNumber = new JLabel("Nr Mieszkania");
        lFlatNumber.setBounds(20,100,150,20);
        lFlatNumber.setVisible(true);

        bRegister = new JButton("Zarejestruj");
        bRegister.setBounds(20,120,300,20);
        bRegister.addActionListener(this);
        bRegister.setVisible(true);

        lPostCodeError = new JLabel("wprowadzono niepoprawny kod");
        lPostCodeError.setBounds(320,20,150,20);
        lPostCodeError.setVisible(false);



        add(tPostCode);
        add(tCity);
        add(tStreet);
        add(tBuildingNumber);
        add(tFlatNumber);

        add(lPostCode);
        add(lCity);
        add(lStreet);
        add(lBuildingNumber);
        add(lFlatNumber);

        add(bRegister);

        add(lPostCodeError);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        String PostCodeRegex = "/[0-9]{2}-[0-9]{3}/";
        String tex=tPostCode.getText();

        Pattern pt = Pattern.compile(PostCodeRegex);
        Matcher mt = pt.matcher(tex);
        if(source == bRegister){
            if(mt.matches()){

            }else{
                lPostCodeError.setVisible(true);
            }
        }

    }
}
