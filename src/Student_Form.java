import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_Form extends JFrame {

	private JTextField textField_Name;
	private JTextField textField_Email;
	private JPasswordField textField_Password;
	private JTextField textField_Roll;

	public Student_Form(int X, int Y) {
		getContentPane().setForeground(Color.BLACK);
		setTitle("Student Registration");
		setResizable(false);
		setBounds(X, Y, 1108, 896);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		Student S = new Student();

		// Header section
		JLabel Image_label = new JLabel("");
		Image_label.setBorder(null);
		Image logo = new ImageIcon(this.getClass().getResource("/images/")).getImage();
		Image_label.setIcon(new ImageIcon(logo));
		Image_label.setBounds(50, 13, 100, 100);
		getContentPane().add(Image_label);

		JLabel lblTitle = new JLabel("Exam Registration Form");
		lblTitle.setBorder(null);
		lblTitle.setFont(new Font("Helvetica Neue", Font.BOLD, 40));
		lblTitle.setBounds(200, 30, 800, 50);
		getContentPane().add(lblTitle);

		JSeparator separator = new JSeparator();
		separator.setBorder(new MatteBorder(2, 0, 2, 0, new Color(100, 149, 237)));
		separator.setBounds(39, 122, 1038, 17);
		getContentPane().add(separator);

		// Name field
		JLabel lblName = new JLabel("Full Name");
		lblName.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblName.setBounds(83, 144, 200, 24);
		getContentPane().add(lblName);

		textField_Name = new JTextField();
		textField_Name.setForeground(new Color(100, 149, 237));
		textField_Name.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		textField_Name.setOpaque(false);
		textField_Name.setBorder(new MatteBorder(0, 0, 2, 0, new Color(100, 149, 237)));
		textField_Name.setBounds(82, 180, 925, 30);
		getContentPane().add(textField_Name);
		textField_Name.setColumns(10);

		// Email field
		JLabel lblEmail = new JLabel("Email Address");
		lblEmail.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblEmail.setBounds(83, 220, 200, 24);
		getContentPane().add(lblEmail);

		textField_Email = new JTextField();
		textField_Email.setForeground(new Color(100, 149, 237));
		textField_Email.setOpaque(false);
		textField_Email.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		textField_Email.setColumns(10);
		textField_Email.setBorder(new MatteBorder(0, 0, 2, 0, new Color(100, 149, 237)));
		textField_Email.setBounds(82, 256, 925, 30);
		getContentPane().add(textField_Email);

		// Roll number field
		JLabel lblRollNo = new JLabel("ID Number");
		lblRollNo.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblRollNo.setBounds(83, 296, 200, 24);
		getContentPane().add(lblRollNo);

		textField_Roll = new JTextField();
		textField_Roll.setForeground(new Color(100, 149, 237));
		textField_Roll.setOpaque(false);
		textField_Roll.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		textField_Roll.setColumns(10);
		textField_Roll.setBorder(new MatteBorder(0, 0, 2, 0, new Color(100, 149, 237)));
		textField_Roll.setBounds(82, 332, 925, 30);
		getContentPane().add(textField_Roll);

		// Password field
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblPassword.setBounds(83, 372, 200, 24);
		getContentPane().add(lblPassword);

		textField_Password = new JPasswordField();
		textField_Password.setOpaque(false);
		textField_Password.setBorder(new MatteBorder(0, 0, 2, 0, new Color(100, 149, 237)));
		textField_Password.setForeground(new Color(100, 149, 237));
		textField_Password.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		textField_Password.setBounds(82, 408, 925, 30);
		getContentPane().add(textField_Password);

		// Course selection
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lblCourse.setBounds(83, 448, 200, 24);
		getContentPane().add(lblCourse);

		JComboBox<String> comboBox_Course = new JComboBox<>();
		comboBox_Course.setForeground(new Color(100, 149, 237));
		comboBox_Course.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		comboBox_Course.setModel(new DefaultComboBoxModel<>(new String[] { "Bachelors In Computer Science", "Masters In Computer Science", "PHD ", "Masters In Management", "Post Doctoral" }));
		comboBox_Course.setBounds(82, 484, 925, 30);
		// Custom renderer for ComboBox
		comboBox_Course.setRenderer(new CustomComboBoxRenderer());
		getContentPane().add(comboBox_Course);

		// Branch selection
		JLabel lebelCourse = new JLabel("Branch");
		lebelCourse.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		lebelCourse.setBounds(83, 524, 200, 24);
		getContentPane().add(lebelCourse);

		JComboBox<String> comboBox_Branch = new JComboBox<>();
		comboBox_Branch.setModel(new DefaultComboBoxModel<>(new String[] { "Computer Science", "Management", "Data Science",
				"Cyber Security" }));
		comboBox_Branch.setForeground(new Color(100, 149, 237));
		comboBox_Branch.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
		comboBox_Branch.setBounds(82, 560, 925, 30);
		// Custom renderer for ComboBox
		comboBox_Branch.setRenderer(new CustomComboBoxRenderer());
		getContentPane().add(comboBox_Branch);

		// Buttons
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBorder(new LineBorder(new Color(255, 69, 0), 2, true));
		btnClose.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		btnClose.setBounds(477, 736, 154, 55);
		btnClose.setBackground(new Color(255, 69, 0));
		btnClose.setForeground(Color.BLACK
		);
		btnClose.setFocusPainted(false);
		btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnClose.setForeground(Color.WHITE);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnClose.setForeground(Color.BLACK);
			}
		});
		getContentPane().add(btnClose);

		JButton buttonProceed = new JButton("CONTINUE");
		buttonProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_Name.getText().isEmpty() || textField_Email.getText().isEmpty()
						|| String.valueOf(textField_Password.getPassword()).isEmpty() || textField_Roll.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill the form to proceed");
				} else {
					S.setName(textField_Name.getText());
					S.setEmail(textField_Email.getText());
					S.setRollNo(textField_Roll.getText());
					S.setCourse(String.valueOf(comboBox_Course.getSelectedItem()));
					S.setBranch(String.valueOf(comboBox_Branch.getSelectedItem()));
					S.setPassword(String.valueOf(textField_Password.getPassword()));
					Instruction frame1 = new Instruction(S, (int) getLocationOnScreen().getX(), (int) getLocationOnScreen().getY());
					JOptionPane.showMessageDialog(null, "Registered Successfully");
					frame1.setVisible(true);
					setVisible(false);
				}
			}
		});
		buttonProceed.setBorder(new LineBorder(new Color(100, 149, 237), 2, true));
		buttonProceed.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		buttonProceed.setBounds(691, 736, 150, 55);
		buttonProceed.setBackground(new Color(100, 149, 237));
		buttonProceed.setForeground(Color.BLACK);
		buttonProceed.setFocusPainted(false);
		buttonProceed.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				buttonProceed.setForeground(Color.WHITE);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				buttonProceed.setForeground(Color.BLACK);
			}
		});
		getContentPane().add(buttonProceed);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Form frame = new Student_Form(500, 100);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

class CustomComboBoxRenderer extends JLabel implements ListCellRenderer<String> {
	private Font font;

	public CustomComboBoxRenderer() {
		setOpaque(true);
		font = new Font("Helvetica Neue", Font.PLAIN, 20);
	}

	public Component getListCellRendererComponent(
			JList<? extends String> list, String value, int index, boolean isSelected, boolean cellHasFocus) {
		setText(value);

		Color backgroundColor = isSelected ? new Color(100, 149, 237) : Color.WHITE;
		Color foregroundColor = isSelected ? Color.WHITE : new Color(100, 149, 237);

		setBackground(backgroundColor);
		setForeground(foregroundColor);
		setFont(font);
		return this;
	}
}
