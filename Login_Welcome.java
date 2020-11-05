import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;
import java.sql.*; 
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;


@SuppressWarnings({ "unused", "serial" })
public class Login_Welcome extends JFrame implements ActionListener 
{

	private JPanel contentPane;
	Button b1,b2,b4;
	public static String name;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// wa9th tsyr al exècution 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Welcome frame = new Login_Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 // Create the frame.
	 
	public Login_Welcome() 
	{
		//setResizable(false);//pour ne peut etre redimensionner
		//System.out.println(name);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblHiwelcome = new JLabel("New text");
		lblHiwelcome.setBounds(99, 11, 209, 62);
		lblHiwelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		// message oblenue lorsque session ouvert
		
		String mssge="Salem ";
		mssge+=name;//t7otli esm
		mssge+="..Welcome !";
		lblHiwelcome.setText(mssge);
		contentPane.add(lblHiwelcome);
		
		b1 = new Button("View Profil");
		b1.setBounds(21, 111, 99, 44);
		b1.addActionListener(this);
		contentPane.add(b1);
		
		b2 = new Button("Edit Profil");
		b2.setBounds(127, 111, 106, 44);
		b2.addActionListener(this);
		contentPane.add(b2);
		
		b4=new Button("Log Out");
		b4.addActionListener(this);
		b4.setFont(new Font("Tahoma", Font.ITALIC, 10));
		b4.setBounds(350, 11, 74, 19);
		contentPane.add(b4);
	}
	
	
	public Login_Welcome(String n)
	{
		name=n;
		//System.out.println(name);
	}
	@Override
	public void actionPerformed(ActionEvent ae)  // ActionEvent  est généré et sa source est  l’objet bouton cliqué. 
	{
			Button bb=(Button)ae.getSource();
			if(bb==b1)
			{
				dispose();
				View_profile nam=new View_profile(name);
				View_profile le=new View_profile();  //View Profile
				
		        le.setVisible(true);
	
	        }
			if(bb==b2)
			{
				dispose();
				Edit_profile nam=new Edit_profile(name);
				Edit_profile ep=new Edit_profile();   //Edit Profile
				ep.setVisible(true);
			}
			
			if(bb==b4)
			{
				dispose();
				Page1 p=new Page1();        //Logs us out ie.gets us back to Page1(Login page)
				p.setVisible(true);
			}
			
	}
}



