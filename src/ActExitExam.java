import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.MetalButtonUI;

public class ActExitExam {

	private JFrame frmQuizSystem;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ActExitExam window = new ActExitExam();
					window.frmQuizSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ActExitExam() {
		initialize();
	}

	private void initialize() {
		frmQuizSystem = new JFrame();
		frmQuizSystem.setResizable(false);
		frmQuizSystem.setTitle("Exit Exam System");
		frmQuizSystem.setBounds(500, 100, 1108, 896);
		frmQuizSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizSystem.getContentPane().setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(330, 250, 454, 354);
		frmQuizSystem.getContentPane().add(lblLogo);

		Image logo = new ImageIcon(this.getClass().getResource("/images/ActLogo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(logo));

		JLabel lblMadanMohanMalaviya = new JLabel("AMERICAN COLLEGE OF TECHNOLOGY & MANAGEMENT");
		lblMadanMohanMalaviya.setForeground(Color.BLACK);
		lblMadanMohanMalaviya.setBackground(Color.WHITE);
		lblMadanMohanMalaviya.setFont(new Font("Consolas", Font.BOLD, 35));
		lblMadanMohanMalaviya.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadanMohanMalaviya.setBounds(204, 13, 862, 88);
		frmQuizSystem.getContentPane().add(lblMadanMohanMalaviya);

		JLabel label = new JLabel("Addis Ababa, Ethiopia");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.BOLD, 25));
		label.setBounds(429, 90, 474, 39);
		frmQuizSystem.getContentPane().add(label);

		JSeparator separator = new JSeparator();
		separator.setBounds(326, 142, 635, 13);
		frmQuizSystem.getContentPane().add(separator);

		JLabel lblQuizSystem = new JLabel("Exit Exam System");
		lblQuizSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuizSystem.setForeground(new Color(255,77,1));
		lblQuizSystem.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblQuizSystem.setBounds(168, 168, 890, 124);
		frmQuizSystem.getContentPane().add(lblQuizSystem);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(174, 305, 831, 13);
		frmQuizSystem.getContentPane().add(separator_1);

		JButton btnStart = new JButton("Begin");
		btnStart.setFont(new Font("Times New Roman", Font.BOLD, 50));
		btnStart.setBounds(427, 600, 254, 88);
		btnStart.setBackground(new Color(0, 120, 215));
		btnStart.setForeground(Color.WHITE);
		btnStart.setUI(new MetalButtonUI() {
			protected ColorUIResource getDisabledTextColor() {
				return new ColorUIResource(Color.GRAY);
			}
		});
		btnStart.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY, 2),
				BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5)
		));
		btnStart.setFocusPainted(false);
		btnStart.setContentAreaFilled(false);
		btnStart.setOpaque(true);
		btnStart.setVerticalAlignment(SwingConstants.CENTER);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student_Form frame0 = new Student_Form((int) frmQuizSystem.getLocationOnScreen().getX(),
						(int) frmQuizSystem.getLocationOnScreen().getY());
				frame0.setVisible(true);
				frmQuizSystem.setVisible(false);
			}
		});
		frmQuizSystem.getContentPane().add(btnStart);


	}
}
