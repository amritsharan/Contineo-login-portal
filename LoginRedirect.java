import javax.swing.*; 
import java.awt.*; 
import java.net.URI; 

class LoginApp { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Login"); 
        JTextField usernameField = new JTextField(); 
        JPasswordField passwordField = new JPasswordField(); 
        JButton loginButton = new JButton("Login"); 

        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(new JLabel("Username:")); 
        frame.add(usernameField); 
        frame.add(new JLabel("Password:")); 
        frame.add(passwordField); 
        frame.add(loginButton); 

        frame.setSize(300, 150); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 

        loginButton.addActionListener(e -> { 
            String username = usernameField.getText(); 
            String password = new String(passwordField.getPassword()); 

            if (username.equals("Amrit") && password.equals("password")) { 
                try { 
                    Desktop.getDesktop().browse(new URI("https://sims.sit.ac.in/parents/")); 
                } catch (Exception ex) { 
                    ex.printStackTrace(); 
                } 
            } else { 
                JOptionPane.showMessageDialog(frame, "Invalid Credentials"); 
            } 
        });
    } 
}

