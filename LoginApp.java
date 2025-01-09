package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginApp {
    public static void main(String[] args) {
        // Create the Login Frame
        JFrame loginFrame = new JFrame("Asociatia mea");
        loginFrame.setSize(350, 200);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);

        // Username Label and Text Field
        JLabel usernameLabel = new JLabel("Nume:");
        usernameLabel.setBounds(30, 30, 80, 25);
        loginFrame.add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(120, 30, 150, 25);
        loginFrame.add(usernameField);

        // Password Label and Password Field
        JLabel passwordLabel = new JLabel("Parola");
        passwordLabel.setBounds(30, 70, 80, 25);
        loginFrame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(120, 70, 150, 25);
        loginFrame.add(passwordField);

        // Login Button
        JButton loginButton = new JButton("Logare");
        loginButton.setBounds(120, 110, 100, 25);
        loginFrame.add(loginButton);

        // ActionListener for Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Dummy validation (replace this with your logic)
                if (username.equals("alex") && password.equals("alexmuresan2003")) {
                    JOptionPane.showMessageDialog(loginFrame, "te ai logat cu succes!");
                    loginFrame.dispose(); // Close the login window
                    openMainWindow();    // Open the main window with 5 buttons
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Parola sau nume gresit!");
                }
            }
        });

        // Make the Login Frame Visible
        loginFrame.setVisible(true);
    }

    // Function to Open the Main Window
    public static void openMainWindow() {
        // Create the Main Frame
        JFrame mainFrame = new JFrame("Main Window");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(3, 2, 10, 10)); // Grid layout for the buttons

        // Create Buttons
        JButton activitatiiButton = new JButton("Activitatii");
        JButton voluntariiButton = new JButton("Voluntarii");
        JButton coordonatoriButton = new JButton("Coordonatori");
        JButton comunicariiButton = new JButton("Comunicarii");
        JButton proiecteButton = new JButton("Proiecte");

        // Add Buttons to the Main Frame
        mainFrame.add(activitatiiButton);
        mainFrame.add(voluntariiButton);
        mainFrame.add(coordonatoriButton);
        mainFrame.add(comunicariiButton);
        mainFrame.add(proiecteButton);

        // Add ActionListeners for Buttons (Example)
        activitatiiButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Activitatii button clicked!"));
        voluntariiButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Voluntarii button clicked!"));
        coordonatoriButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Coordonatori button clicked!"));
        comunicariiButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Comunicarii button clicked!"));
        proiecteButton.addActionListener(e -> JOptionPane.showMessageDialog(mainFrame, "Proiecte button clicked!"));

        // Make the Main Frame Visible
        mainFrame.setVisible(true);
    }
}
