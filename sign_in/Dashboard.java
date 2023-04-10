package sign_in;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.management.loading.PrivateClassLoader;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private Home home;
	private panel_CS1 pn_cs1;
	private panel_CS2 pn_cs2;
	private panel_CS3 pn_cs3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(58, 105, 56));
		contentPane.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		home = new Home();
		//home.setBounds(248, 5, 1, 1);
		pn_cs1 = new panel_CS1();
		//pn_cs1.setBounds(254, 5, 1, 1);
		pn_cs2 = new panel_CS2();
		//pn_cs2.setBounds(260, 5, 1, 1);
		pn_cs3 = new panel_CS3();
		//pn_cs3.setBounds(266, 5, 1, 1);
		
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(192, 192, 192)));
		panel_menu.setBackground(new Color(43, 81, 45));
		panel_menu.setBounds(0, 0, 190, 500);
		contentPane.add(panel_menu);
		panel_menu.setLayout(null);
		
		JLabel lb_icon_user = new JLabel("");
		lb_icon_user.setIcon(new ImageIcon("D:\\JAVA\\icon\\user 64.png"));
		
		lb_icon_user.setBounds(65, 22, 64, 71);
		panel_menu.add(lb_icon_user);
		
		JPanel panel_home = new JPanel();
		panel_home.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_home.setBackground(new Color(62, 142, 62));
		panel_home.addMouseListener(new PanelButtonMounseAdapter(panel_home) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(home);
			}
		});
			
		panel_home.setBounds(0, 130, 190, 60);
		panel_menu.add(panel_home);
		panel_home.setLayout(null);
		
		JLabel lb_home = new JLabel("HOME");
		lb_home.setForeground(new Color(255, 255, 255));
		lb_home.setHorizontalAlignment(SwingConstants.CENTER);
		lb_home.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_home.setBounds(70, 10, 60, 40);
		panel_home.add(lb_home);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("D:\\JAVA\\icon\\icon home.png"));
		lblNewLabel_2_4.setForeground(Color.WHITE);
		lblNewLabel_2_4.setBounds(20, 10, 45, 40);
		panel_home.add(lblNewLabel_2_4);
		
		JPanel panel_Coso1 = new JPanel();
		panel_Coso1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_Coso1.setBackground(new Color(62, 142, 62));
		panel_Coso1.addMouseListener(new PanelButtonMounseAdapter(panel_Coso1) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pn_cs1);
			}
		});
		panel_Coso1.setBounds(0, 190, 190, 60);
		panel_menu.add(panel_Coso1);
		panel_Coso1.setLayout(null);
		
		JLabel lb_Coso_1 = new JLabel("CƠ SỞ 1");
		lb_Coso_1.setHorizontalAlignment(SwingConstants.CENTER);
		lb_Coso_1.setForeground(Color.WHITE);
		lb_Coso_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_Coso_1.setBounds(70, 10, 70, 40);
		panel_Coso1.add(lb_Coso_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("D:\\JAVA\\icon\\icon cơ sở.png"));
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setBounds(20, 10, 45, 40);
		panel_Coso1.add(lblNewLabel_2_3);
		
		JPanel panel_Coso2 = new JPanel();
		panel_Coso2.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_Coso2.setBackground(new Color(62, 142, 62));
		panel_Coso2.addMouseListener(new PanelButtonMounseAdapter(panel_Coso2) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pn_cs2);
			}
		});
		panel_Coso2.setBounds(0, 250, 190, 60);
		panel_menu.add(panel_Coso2);
		panel_Coso2.setLayout(null);
		
		JLabel lb_Coso_2 = new JLabel("CƠ SỞ 2");
		lb_Coso_2.setHorizontalAlignment(SwingConstants.CENTER);
		lb_Coso_2.setForeground(Color.WHITE);
		lb_Coso_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_Coso_2.setBounds(70, 10, 70, 40);
		panel_Coso2.add(lb_Coso_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("D:\\JAVA\\icon\\icon cơ sở.png"));
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBounds(20, 10, 45, 40);
		panel_Coso2.add(lblNewLabel_2_2);
		
		JPanel panel_Coso3 = new JPanel();
		panel_Coso3.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_Coso3.setBackground(new Color(62, 142, 62));
		panel_Coso3.addMouseListener(new PanelButtonMounseAdapter(panel_Coso3) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(pn_cs3);
			}
		});
		panel_Coso3.setBounds(0, 310, 190, 60);
		panel_menu.add(panel_Coso3);
		panel_Coso3.setLayout(null);
		
		JLabel lb_Coso_3 = new JLabel("CƠ SỞ 3");
		lb_Coso_3.setHorizontalAlignment(SwingConstants.CENTER);
		lb_Coso_3.setForeground(Color.WHITE);
		lb_Coso_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_Coso_3.setBounds(70, 10, 70, 40);
		panel_Coso3.add(lb_Coso_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\JAVA\\icon\\icon cơ sở.png"));
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(20, 10, 45, 40);
		panel_Coso3.add(lblNewLabel_2_1);
		
		JPanel panel_signout = new JPanel();
		panel_signout.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_signout.setBackground(new Color(62, 142, 62));
		panel_signout.addMouseListener(new PanelButtonMounseAdapter(panel_signout));
		panel_signout.setBounds(0, 370, 190, 60);
		panel_menu.add(panel_signout);
		panel_signout.setLayout(null);
																
		JLabel lb_exit = new JLabel("SIGN OUT");
		lb_exit.setHorizontalAlignment(SwingConstants.CENTER);
		lb_exit.addMouseListener(new PanelButtonMounseAdapter(panel_signout){
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Bạn muốn đăng xuất?")== 0) {
					demo_login_user frame_signin = new demo_login_user();
					frame_signin.setVisible(true);
					Dashboard.this.dispose();
				}
				
			}
		});
		lb_exit.setForeground(Color.WHITE);
		lb_exit.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb_exit.setBounds(70, 10, 80, 40);
		panel_signout.add(lb_exit);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon("D:\\JAVA\\icon\\sign out.png"));
		lblNewLabel_2.setBounds(20, 10, 38, 40);
		panel_signout.add(lblNewLabel_2);
		
		JLabel lb_name_user = new JLabel("khadeptrai123");
		lb_name_user.setHorizontalAlignment(SwingConstants.CENTER);
		lb_name_user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb_name_user.setForeground(new Color(255, 255, 255));
		lb_name_user.setBounds(10, 90, 170, 30);
		panel_menu.add(lb_name_user);
		
		JLabel lb_user = new JLabel("");
		lb_user.setBounds(0, 0, 190, 132);
		panel_menu.add(lb_user);
		
		JLabel label_exit = new JLabel("X");
		label_exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Bạn muốn đóng chương trình?", "Xác nhận", JOptionPane.YES_NO_OPTION)==0) {
					Dashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_exit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_exit.setForeground(Color.WHITE);
			}
		});
		label_exit.setForeground(new Color(248, 248, 255));
		label_exit.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_exit.setBounds(730, 0, 20, 27);
		contentPane.add(label_exit);
		
		JPanel panel_Main_content = new JPanel();
		panel_Main_content.setBounds(210, 25, 515, 450);
		contentPane.add(panel_Main_content);
		panel_Main_content.setLayout(null);
		//add panel 
		panel_Main_content.add(home);
		panel_Main_content.add(pn_cs1);
		panel_Main_content.add(pn_cs2);
		panel_Main_content.add(pn_cs3);
		
		menuClicked(home);
	      }
	
	public void menuClicked(JPanel panel) {
		home.setVisible(false);
		pn_cs1.setVisible(false);
		pn_cs2.setVisible(false);
		pn_cs3.setVisible(false);
		
		panel.setVisible(true);
	}
	
		private class PanelButtonMounseAdapter extends MouseAdapter{
			JPanel panel;
			public	PanelButtonMounseAdapter(JPanel panel) {
				this.panel=panel;
			}							
			@Override
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(112,128,144));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(44,79,79));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(62,142,62));
			}
			@Override
			public void  mouseReleased(MouseEvent e) {
				panel.setBackground(new Color(112,128,144));
			}	
	  }
}
