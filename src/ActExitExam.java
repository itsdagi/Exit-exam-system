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

	private JFrame exitSys;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                ActExitExam window = new ActExitExam();
                window.exitSys.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
	}
	public ActExitExam() {
		initialize();
	}

	private void initialize() {
		exitSys = new JFrame();
		exitSys.setResizable(false);
		exitSys.setTitle("Exit Exam System");
		exitSys.setBounds(160, 40, 1108, 896);
		exitSys.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		exitSys.getContentPane().setLayout(null);

		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(330, 250, 454, 354);
		exitSys.getContentPane().add(lblLogo);

		Image logo = new ImageIcon(this.getClass().getResource("/images/ActLogo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(logo));

		JLabel actGroup = new JLabel("AMERICAN COLLEGE OF TECHNOLOGY & MANAGEMENT");
		actGroup.setForeground(Color.BLACK);
		actGroup.setBackground(Color.WHITE);
		actGroup.setFont(new Font("Consolas", Font.BOLD, 35));
		actGroup.setHorizontalAlignment(SwingConstants.CENTER);
		actGroup.setBounds(204, 13, 862, 88);
		exitSys.getContentPane().add(actGroup);

		JLabel label = new JLabel("Addis Ababa, Ethiopia");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Consolas", Font.BOLD, 25));
		label.setBounds(429, 90, 474, 39);
		exitSys.getContentPane().add(label);

		JSeparator separator = new JSeparator();
		separator.setBounds(326, 142, 635, 13);
		exitSys.getContentPane().add(separator);

		JLabel lblQuizSystem = new JLabel("Exit Exam System");
		lblQuizSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuizSystem.setForeground(new Color(255,77,1));
		lblQuizSystem.setFont(new Font("Tahoma", Font.BOLD, 90));
		lblQuizSystem.setBounds(168, 168, 890, 124);
		exitSys.getContentPane().add(lblQuizSystem);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(174, 305, 831, 13);
		exitSys.getContentPane().add(separator_1);

		JButton startBtn = new JButton("Begin");
		startBtn.setFont(new Font("Times New Roman", Font.BOLD, 50));
		startBtn.setBounds(427, 600, 254, 88);
		startBtn.setBackground(new Color(0, 120, 215));
		startBtn.setForeground(Color.WHITE);
		startBtn.setUI(new MetalButtonUI() {
			protected ColorUIResource getDisabledTextColor() {
				return new ColorUIResource(Color.GRAY);
			}
		});
		startBtn.setBorder(BorderFactory.createCompoundBorder(
				BorderFactory.createLineBorder(Color.DARK_GRAY, 2),
				BorderFactory.createLineBorder(Color.LIGHT_GRAY, 5)
		));

		startBtn.setFocusPainted(false);
		startBtn.setContentAreaFilled(false);
		startBtn.setOpaque(true);
		startBtn.setVerticalAlignment(SwingConstants.CENTER);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student_Form frame0 = new Student_Form((int) exitSys.getLocationOnScreen().getX(),
						(int) exitSys.getLocationOnScreen().getY());
				frame0.setVisible(true);
				exitSys.setVisible(false);
			}
		});
		exitSys.getContentPane().add(startBtn);

      ImageIcon icon = new ImageIcon("src/images/icon.png");
	  exitSys.setIconImage(icon.getImage());
	}
}
