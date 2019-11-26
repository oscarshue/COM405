package week10;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainScreen extends JFrame {

    private GridBagConstraints constraints;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        InitialiseComponents();

        constraints = new GridBagConstraints();
        
        LayoutComponents();
    }

    private JLabel lblHeading;
    private JLabel lblCurrentLoad;
    private JLabel lblCurrentLoadValue;
    private JLabel lblRegistration;
    private JLabel lblWeight;
    private JLabel lblMessage;
    private JLabel lblFee;
    private JLabel lblFeeValue;

    private JTextField txtRegistration;
    private JTextField txtWeight;

    private JButton btnAdd;
    private JButton btnRemove;

    public void InitialiseComponents() {
        lblHeading = new JLabel("Bridge System");
        lblCurrentLoad = new JLabel("Current Load (kg):");
        lblCurrentLoadValue = new JLabel("0");
        lblRegistration = new JLabel("Registration:");
        lblWeight = new JLabel("Weight:");
        lblMessage = new JLabel(" ");
        lblFee = new JLabel("Fee:");
        lblFeeValue = new JLabel("£0");

        txtRegistration = new JTextField();
        txtWeight = new JTextField();

        btnAdd = new JButton("Add");
        btnRemove = new JButton("Remove");
    }

    public void LayoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        this.add(lblHeading, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblCurrentLoad, constraints);
        
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        this.add(lblCurrentLoadValue, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        this.add(lblRegistration, constraints);
        
        constraints.gridy = 2;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; 
        this.add(txtRegistration, constraints);
        
        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(lblWeight, constraints);
        
        constraints.gridy = 3;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL; 
        this.add(txtWeight, constraints);
        
        constraints.gridy = 4;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(btnAdd, constraints);
        
        constraints.gridy = 4;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(btnRemove, constraints);
        
        constraints.gridy = 5;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(lblMessage, constraints);
        
        constraints.gridy = 6;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(lblFee, constraints);
        
        constraints.gridy = 6;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE; 
        this.add(lblFeeValue, constraints);
    }

}
