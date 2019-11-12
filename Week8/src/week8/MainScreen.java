package week8;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainScreen extends JFrame {

    private JLabel lblReg;
    private JLabel lblColour;
    private JLabel lblMake;
    private JLabel lblModel;
    private JLabel lblStatus;

    private JTextField txtReg;
    private JTextField txtColour;
    private JTextField txtMake;
    private JTextField txtModel;

    private JButton btnAdd;
    private JButton btnRemove;

    private GridBagConstraints constraints;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        initialiseComponents();

        LayoutComponents();
    }

    public void initialiseComponents() {
        lblReg = new JLabel("Reg no.");
        lblColour = new JLabel("Colour");
        lblMake = new JLabel("Make");
        lblModel = new JLabel("Model");
        lblStatus = new JLabel("Car has 15 empty car park spaces");

        txtReg = new JTextField();
        txtColour = new JTextField();
        txtMake = new JTextField();
        txtModel = new JTextField();

        btnAdd = new JButton("Add");
        btnRemove = new JButton("Remove");
    }

    public void LayoutComponents() {        
        constraints = new GridBagConstraints();
        
        constraints.gridy = 0;
        constraints.gridx = 0;
        this.add(lblReg, constraints);
        
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtReg, constraints);
        
        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblColour, constraints);
        
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtColour, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblMake, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtMake, constraints);
        
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblModel, constraints);
        
        constraints.gridy = 3;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtModel, constraints);
        
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE;
        this.add(lblStatus, constraints);
        
        constraints.gridwidth = 1;
        constraints.gridy = 5;
        constraints.gridx = 0;
        this.add(btnAdd, constraints);
        
        constraints.gridy = 5;
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }
}
