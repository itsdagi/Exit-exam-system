import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questions extends JFrame {

	JPanel contentPane;
	private int Count;
	private ListOfQuestions Ques = new ListOfQuestions();

	public Questions(Student temp, int X, int Y) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Questions");
		setResizable(false);
		Student S = temp;
		setBounds(X, Y, 1108, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		contentPane.setBackground(Color.WHITE); // Set background color for modern look
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Count = 0;

		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(12, 13, 137, 148);
		contentPane.add(lblIcon);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 174, 1066, 13);
		contentPane.add(separator);

		JLabel questionTitle = new JLabel("Question :");
		questionTitle.setFont(new Font("Arial", Font.BOLD, 24));
		questionTitle.setHorizontalAlignment(SwingConstants.CENTER);
		questionTitle.setBounds(66, 184, 193, 46);
		questionTitle.setForeground(new Color(60, 63, 65)); // Modern text color
		contentPane.add(questionTitle);

		JPanel forQuestionPanel = new JPanel();
		forQuestionPanel.setBounds(64, 243, 1014, 174);
		forQuestionPanel.setBackground(Color.WHITE);
		forQuestionPanel.setBorder(new MatteBorder(5, 5, 15, 5, new Color(200, 200, 200, 150))); // Shadow effect
		forQuestionPanel.setLayout(null);
		contentPane.add(forQuestionPanel);

		JLabel lblQuestion = new JLabel(Ques.getQuestion(Count));
		lblQuestion.setForeground(new Color(44, 62, 80)); // Modern color
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQuestion.setBounds(20, 20, 974, 134);
		forQuestionPanel.add(lblQuestion);

		JPanel numberPanel = new JPanel();
		numberPanel.setBounds(271, 186, 56, 46);
		numberPanel.setBackground(new Color(52, 152, 219));
		numberPanel.setLayout(new BorderLayout());
		contentPane.add(numberPanel);

		JLabel lblNumber = new JLabel(String.valueOf(Count + 1));
		lblNumber.setForeground(Color.WHITE);
		lblNumber.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		numberPanel.add(lblNumber, BorderLayout.CENTER);

		JLabel lblOptions_title = new JLabel("Options :");
		lblOptions_title.setFont(new Font("Arial", Font.BOLD, 24));
		lblOptions_title.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptions_title.setBounds(66, 444, 193, 46);
		lblOptions_title.setForeground(new Color(60, 63, 65)); // Modern text color
		contentPane.add(lblOptions_title);

		JPanel optionsPanel = new JPanel();
		optionsPanel.setBounds(64, 503, 1014, 174);
		optionsPanel.setBackground(Color.WHITE);
		optionsPanel.setBorder(new MatteBorder(5, 5, 15, 5, new Color(200, 200, 200, 150))); // Shadow effect
		optionsPanel.setLayout(null);
		contentPane.add(optionsPanel);

		JLabel lblOptions = new JLabel(Ques.getOptions(Count));
		lblOptions.setForeground(new Color(41, 128, 185)); // Modern color
		lblOptions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOptions.setHorizontalAlignment(SwingConstants.LEFT);
		lblOptions.setBounds(20, 20, 974, 134);
		optionsPanel.add(lblOptions);

		ButtonGroup bg = new ButtonGroup();

		JRadioButton rdbtnA = new JRadioButton("A");
		customizeRadioButton(rdbtnA);
		rdbtnA.setBounds(138, 686, 127, 25);
		bg.add(rdbtnA);
		contentPane.add(rdbtnA);

		JRadioButton rdbtnB = new JRadioButton("B");
		customizeRadioButton(rdbtnB);
		rdbtnB.setBounds(349, 686, 127, 25);
		bg.add(rdbtnB);
		contentPane.add(rdbtnB);

		JRadioButton rdbtnC = new JRadioButton("C");
		customizeRadioButton(rdbtnC);
		rdbtnC.setBounds(621, 686, 127, 25);
		bg.add(rdbtnC);
		contentPane.add(rdbtnC);

		JRadioButton rdbtnD = new JRadioButton("D");
		customizeRadioButton(rdbtnD);
		rdbtnD.setBounds(844, 686, 127, 25);
		bg.add(rdbtnD);
		contentPane.add(rdbtnD);

		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNext.setForeground(Color.BLACK);
		btnNext.setBounds(826, 766, 165, 53);
		contentPane.add(btnNext);

		JLabel lblAmericanCollege = new JLabel("American College of Technology");
		lblAmericanCollege.setForeground(new Color(44, 62, 80));
		lblAmericanCollege.setFont(new Font("Consolas", Font.BOLD, 30));
		lblAmericanCollege.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmericanCollege.setBounds(161, 13, 917, 53);
		contentPane.add(lblAmericanCollege);

		JLabel lblEnglishQuiz = new JLabel("Exam");
		lblEnglishQuiz.setForeground(new Color(41, 128, 185));
		lblEnglishQuiz.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEnglishQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglishQuiz.setBounds(301, 118, 533, 46);
		contentPane.add(lblEnglishQuiz);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(208, 101, 847, 13);
		contentPane.add(separator_1);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnA.isSelected())
					S.setAnswer(Count, "A");

				if (rdbtnB.isSelected())
					S.setAnswer(Count, "B");

				if (rdbtnC.isSelected())
					S.setAnswer(Count, "C");

				if (rdbtnD.isSelected())
					S.setAnswer(Count, "D");

				Count++;
				bg.clearSelection();

				if (Count == 4) {
					btnNext.setText("Submit");
					btnNext.setForeground(Color.BLUE);
					btnNext.setBackground(Color.GREEN);
				}

				if (Count == 5) {
					Result frame3 = new Result(S, (int) getLocationOnScreen().getX(), (int) getLocationOnScreen().getY());
					JOptionPane.showMessageDialog(null, "Test Completed Successfully!");
					frame3.setVisible(true);
					setVisible(false);
				}
				lblQuestion.setText(Ques.getQuestion(Count));
				lblNumber.setText(String.valueOf(Count + 1));
				lblOptions.setText(Ques.getOptions(Count));
			}
		});
	}

	private void customizeRadioButton(JRadioButton radioButton) {
		radioButton.setFont(new Font("Arial", Font.PLAIN, 20));
		radioButton.setForeground(new Color(60, 63, 65));
		// Set modern icons for radio buttons
		radioButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\dagim\\Downloads\\FinalProjectTextApp\\src\\images\\icons8-radio-button-48.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		radioButton.setSelectedIcon(new ImageIcon(new ImageIcon("C:\\Users\\dagim\\Downloads\\FinalProjectTextApp\\src\\images\\icons8-radio-button-100.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		radioButton.setOpaque(false);
	}
}
