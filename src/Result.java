import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Result extends JFrame {

	private JPanel contentPane;

	public Result(Student temp, int X, int Y) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Result");
		setResizable(false);
		Student S = temp;
		setBounds(X, Y, 1108, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(0, 0, 450, 288);
		contentPane.add(lblIcon);
		Image logo = new ImageIcon(this.getClass().getResource("/images/ActLogo.png")).getImage();
		lblIcon.setIcon(new ImageIcon(logo));
		ListOfQuestions Ques = new ListOfQuestions();
		S.Check(Ques.getAnswer());

		JLabel lblNewLabel = new JLabel("RESULT");
		lblNewLabel.setForeground(new Color(52, 152, 219));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(319, 161, 683, 90);
		contentPane.add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(22, 280, 1056, 10);
		contentPane.add(separator);

		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Consolas", Font.BOLD, 25));
		lblName.setBounds(27, 317, 68, 39);
		contentPane.add(lblName);


		JLabel lblCourse = new JLabel("Program");
		lblCourse.setFont(new Font("Consolas", Font.BOLD, 25));
		lblCourse.setBounds(632, 389, 106, 39);
		contentPane.add(lblCourse);

		JLabel lblCourse_field = new JLabel("");
		lblCourse_field.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCourse_field.setText(S.getCourse());
		lblCourse_field.setBounds(797, 387, 245, 39);
		contentPane.add(lblCourse_field);


		JLabel lblBranch = new JLabel("Course");
		lblBranch.setFont(new Font("Consolas", Font.BOLD, 25));
		lblBranch.setBounds(22, 457, 206, 39);
		contentPane.add(lblBranch);

		JLabel lblBranch_field = new JLabel("");
		lblBranch_field.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBranch_field.setText(S.getBranch());
		lblBranch_field.setBounds(169, 464, 451, 36);
		contentPane.add(lblBranch_field);

		JLabel lblRollNo = new JLabel("ID ");
		lblRollNo.setFont(new Font("Consolas", Font.BOLD, 25));
		lblRollNo.setBounds(22, 393, 118, 35);
		contentPane.add(lblRollNo);

		JLabel lblRollNo_field = new JLabel("");
		lblRollNo_field.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRollNo_field.setText(S.getRollNo());
		lblRollNo_field.setBounds(169, 390, 225, 39);
		contentPane.add(lblRollNo_field);

		JLabel lblMarks = new JLabel("Score");
		lblMarks.setForeground(new Color(52, 152, 219));
		lblMarks.setFont(new Font("Consolas", Font.BOLD, 25));
		lblMarks.setBounds(206, 554, 106, 39);
		contentPane.add(lblMarks);

		JLabel lblMarks_field = new JLabel("");
		lblMarks_field.setForeground(new Color(46, 204, 113));
		lblMarks_field.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMarks_field.setText(String.valueOf(S.getMarks()));
		lblMarks_field.setBounds(381, 554, 151, 39);
		contentPane.add(lblMarks_field);

		JButton btnClose = new JButton("Yey Am Done");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClose.setBounds(797, 748, 157, 67);
		btnClose.setBackground(new Color(52, 152, 219));
		btnClose.setForeground(Color.BLACK);
		btnClose.setFocusPainted(false);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnClose);

		JLabel label = new JLabel("American College Of Technology");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(192, 57, 43));
		label.setFont(new Font("Consolas", Font.BOLD, 30));
		label.setBounds(289, 13, 801, 67);
		contentPane.add(label);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(313, 134, 765, 13);
		contentPane.add(separator_1);
	}
}

