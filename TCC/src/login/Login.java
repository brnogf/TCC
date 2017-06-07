package login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private String login;
	private String senha;
	private String isLogado = "não";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void informarCredenciais(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public void entrar() {
		if ("user".equals(login) && "pass".equals(senha)) {
			JMenuBar menuBar = new JMenuBar();
			JMenu menu =  new JMenu("Funcionalidades");
			menuBar.add(menu);
			JMenuItem item1 = new JMenuItem("Item 1");
			menu.add(item1);
			this.setJMenuBar(menuBar);
			isLogado = "sim";
		} else {
			this.setJMenuBar(null);
			isLogado = "não";
		}
	}

	public boolean isLogado() {
		// TODO Auto-generated method stub
		return isLogado.equals("sim");
	}

}
