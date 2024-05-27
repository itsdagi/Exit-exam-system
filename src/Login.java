import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
   LoginPanel loginPanel = new LoginPanel();

   public Login() {
      super("Login");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 300);
      setLocationRelativeTo(null);

      loginPanel = new LoginPanel();
      add(loginPanel);
   }

   public static void main(String[] args) {
      new Login();
   }
}

class LoginPanel extends JPanel {
   private final JLabel loginLabel, usernameLabel, passwordLabel;
   private final JTextField usernameField;
   private final JPasswordField passwordField;
   private final JButton loginButton, resetButton;
   private final JCheckBox showPasswordCheckBox;

   public LoginPanel() {
      loginLabel = new JLabel("Login with your username and password");
      usernameLabel = new JLabel("Username:");
      passwordLabel = new JLabel("Password:");
      usernameField = new JTextField(20);
      passwordField = new JPasswordField(20);
      loginButton = new JButton("Login");
      resetButton = new JButton("Reset");
      showPasswordCheckBox = new JCheckBox("Show Password");

      initializeLabelStyles();
      initializeLoginButton();
      initializeResetButton();
      initializeShowPasswordCheckBox();

      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

      setAlignmentY(Component.TOP_ALIGNMENT);

      add(addCentered(loginLabel));
      add(addKeyValuePanel(usernameLabel, usernameField));
      add(addKeyValuePanel(passwordLabel, passwordField));
      add(addCentered(showPasswordCheckBox));
      add(addKeyValuePanel(loginButton, resetButton));
   }

   void initializeLabelStyles() {
      loginLabel.setFont(new Font("Arial", Font.BOLD, 20));
      usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));
      passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
      showPasswordCheckBox.setFont(new Font("Arial", Font.BOLD, 16));
   }

   void initializeLoginButton() {
      loginButton.addActionListener(e -> {
         String username = usernameField.getText();
         String password = Arrays.toString(passwordField.getPassword());
         if (login(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful");
            Instruction frame1 = new Instruction(new Student(), (int) getLocationOnScreen().getX(), (int) getLocationOnScreen().getY());
            frame1.setVisible(true);
            setVisible(false);

         } else {
            JOptionPane.showMessageDialog(this, "Login failed");
         }
      });
      resetButton.addActionListener(e -> reset());
   }

   void initializeResetButton() {
      resetButton.addActionListener(e -> reset());
   }

   void initializeShowPasswordCheckBox() {
      showPasswordCheckBox.addActionListener(e -> {
         passwordField.setEchoChar(
               showPasswordCheckBox.isSelected()
                     ? (char) 0
                     : '*');
      });
   }

   public void reset() {
      usernameField.setText("");
      passwordField.setText("");
   }

   public boolean login(String username, String password) {
      return true;
   }

   public static JPanel addKeyValuePanel(JComponent key, JComponent value) {
      JPanel panel = new JPanel(new FlowLayout());
      panel.add(key);
      panel.add(value);
      return panel;
   }

   public static JPanel addCentered(JComponent component) {
      JPanel panel = new JPanel(new FlowLayout());
      panel.add(component);
      return panel;

   }
}
