import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Instruction extends JFrame {

	private JPanel contentPane;

	public Instruction(Student student, int X, int Y) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Instructions");
		setResizable(false);
		setBounds(X, Y, 1108, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel titleLabel = new JLabel("Shoulds and should Nots!");
		titleLabel.setForeground(new Color(255, 87, 51));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Helvetica Neue", Font.BOLD, 60));
		titleLabel.setBounds(300, 15, 743, 148);
		getContentPane().add(titleLabel);

		JLabel logoLabel = new JLabel("");
		logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		logoLabel.setBounds(69, 13, 159, 161);
		contentPane.add(logoLabel);

		Image logoImage = new ImageIcon(this.getClass().getResource("/images/should.png")).getImage();
		logoLabel.setIcon(new ImageIcon(logoImage));

		JTextArea instructionsTextArea = new JTextArea();
		instructionsTextArea.setOpaque(false);
		instructionsTextArea.setForeground(Color.DARK_GRAY);
		instructionsTextArea.setLineWrap(true);
		instructionsTextArea.setText(
				"😄 Welcome to the Exam! 😄\n\n" +
						"📜 Instructions 📜\n\n" +
						"🍀 You have a limited time to finish the exam.\n\n" +
						"🧐 There are 5 questions, each worth 1 mark.\n\n" +
						"📊 Total marks: 5\n\n" +
						"📵 No electronic gadgets allowed (e.g., calculators, mobile phones, pagers). 📵\n\n" +
						"💡 Fun Tips 💡\n\n" +
						"If a question seems tough, just pretend you're solving a puzzle  😆\n" +
						"Remember, a smile is your best tool, even in an exam. 😁\n" +
						"Think of each question as a delicious piece of Cake —enjoy it! 🍽️\n"
		);
		instructionsTextArea.setFont(new Font("Helvetica Neue", Font.PLAIN, 24));
		instructionsTextArea.setEditable(false);
		instructionsTextArea.setBounds(12, 201, 1066, 527);
		getContentPane().add(instructionsTextArea);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 176, 1066, 12);
		getContentPane().add(separator);

		JButton proceedButton = new JButton("PROCEED");
		proceedButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Questions questionsFrame = new Questions(student, (int) getLocationOnScreen().getX(), (int) getLocationOnScreen().getY());
				questionsFrame.setVisible(true);
				setVisible(false);
			}
		});
		proceedButton.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		proceedButton.setBorder(null);
		proceedButton.setBounds(475, 757, 159, 59);
		proceedButton.setBackground(new Color(100, 149, 237));
		proceedButton.setForeground(Color.WHITE);
		contentPane.add(proceedButton);
	}
}
