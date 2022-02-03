package JavaClassPrograms.ColaMachine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class simpleForm
    extends JFrame
    implements ActionListener{
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JTextField tmno;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;



    // constructor, to initialize the components
    // with default values.
    public simpleForm()
    {
        setTitle("Cola Dispenser");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Cola Dispenser");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel();
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);


//right box
        tout = new JTextArea("Drink Menu" +" \n" + "Water : $4.50");
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);


        resadd = new JTextArea("what");
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
                String data1;
                String data
                        = "Name : "
                        + "\n"
                        + "Mobile : "
                        + "\n";

                String data3 = "Address : " + tadd.getText();
                tout.setText(data );
                tout.setEditable(false);
                res.setText("Registration Successfully..");
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
    }
}

// Driver Code
class Registration {

    public static void main(String[] args) throws Exception
    {
        simpleForm f = new simpleForm();
    }
}
