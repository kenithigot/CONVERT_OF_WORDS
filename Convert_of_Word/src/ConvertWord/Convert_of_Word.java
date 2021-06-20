package ConvertWord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class Convert_of_Word {

	private JFrame frame;
	private JTextField txtField_1;
	private JTextField txtField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Convert_of_Word window = new Convert_of_Word();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Convert_of_Word() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(169, 169, 169));
		frame.setBounds(100, 100, 796, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_Q = new JButton("Q");
		btn_Q.setBackground(new Color(95, 158, 160));
		btn_Q.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +17 + " ");
				txtField_1.setText(txtField_1.getText() +"Q" );
				
			
			}
		});
		btn_Q.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Q.setBounds(25, 148, 56, 42);
		frame.getContentPane().add(btn_Q);
		
		JButton btn_W = new JButton("W");
		btn_W.setBackground(new Color(95, 158, 160));
		btn_W.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +23 + " ");
				txtField_1.setText(txtField_1.getText() +"W" );
			}
		});
		btn_W.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_W.setBounds(91, 148, 56, 42);
		frame.getContentPane().add(btn_W);
		
		JButton btn_E = new JButton("E");
		btn_E.setBackground(new Color(95, 158, 160));
		btn_E.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +5 + " ");
				txtField_1.setText(txtField_1.getText() +"E" );
			}
		});
		btn_E.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_E.setBounds(157, 148, 56, 42);
		frame.getContentPane().add(btn_E);
		
		JButton btn_R = new JButton("R");
		btn_R.setBackground(new Color(95, 158, 160));
		btn_R.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +18 + " ");
				txtField_1.setText(txtField_1.getText() +"R" );
			}
		});
		btn_R.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_R.setBounds(223, 148, 56, 42);
		frame.getContentPane().add(btn_R);
		
		JButton btn_T = new JButton("T");
		btn_T.setBackground(new Color(95, 158, 160));
		btn_T.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +20 + " ");
				txtField_1.setText(txtField_1.getText() +"T" );
			}
		});
		btn_T.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_T.setBounds(289, 148, 56, 42);
		frame.getContentPane().add(btn_T);
		
		JButton btn_Y = new JButton("Y");
		btn_Y.setBackground(new Color(95, 158, 160));
		btn_Y.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +25 + " ");
				txtField_1.setText(txtField_1.getText() +"Y" );
			}
		});
		btn_Y.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Y.setBounds(355, 148, 56, 42);
		frame.getContentPane().add(btn_Y);
		
		JButton btn_U = new JButton("U");
		btn_U.setBackground(new Color(95, 158, 160));
		btn_U.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_U.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +21 + " ");
				txtField_1.setText(txtField_1.getText() +"U" );
			}
		});
		btn_U.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_U.setBounds(421, 148, 56, 42);
		frame.getContentPane().add(btn_U);
		
		JButton btn_I = new JButton("I");
		btn_I.setBackground(new Color(95, 158, 160));
		btn_I.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_I.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +9 + " ");
				txtField_1.setText(txtField_1.getText() +"I" );
			}
		});
		btn_I.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_I.setBounds(487, 148, 56, 42);
		frame.getContentPane().add(btn_I);
		
		JButton btn_O = new JButton("O");
		btn_O.setBackground(new Color(95, 158, 160));
		btn_O.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_O.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +15 + " ");
				txtField_1.setText(txtField_1.getText() +"O" );
			}
		});
		btn_O.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_O.setBounds(553, 148, 56, 42);
		frame.getContentPane().add(btn_O);
		
		JButton btn_P = new JButton("P");
		btn_P.setBackground(new Color(95, 158, 160));
		btn_P.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +16 + " ");
				txtField_1.setText(txtField_1.getText() +"P" );
			}
		});
		btn_P.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_P.setBounds(620, 148, 56, 42);
		frame.getContentPane().add(btn_P);
		
		JButton btn_A = new JButton("A");
		btn_A.setBackground(new Color(95, 158, 160));
		btn_A.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +1 + " ");
				txtField_1.setText(txtField_1.getText() +"A" );
			}
		});
		btn_A.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_A.setBounds(48, 201, 56, 42);
		frame.getContentPane().add(btn_A);
		
		JButton btn_S = new JButton("S");
		btn_S.setBackground(new Color(95, 158, 160));
		btn_S.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +19 + " ");
				txtField_1.setText(txtField_1.getText() +"S" );
			}
		});
		btn_S.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_S.setBounds(114, 201, 56, 42);
		frame.getContentPane().add(btn_S);
		
		JButton btn_D = new JButton("D");
		btn_D.setBackground(new Color(95, 158, 160));
		btn_D.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +4 + " ");
				txtField_1.setText(txtField_1.getText() +"D" );
			}
		});
		btn_D.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_D.setBounds(180, 201, 56, 42);
		frame.getContentPane().add(btn_D);
		
		JButton btn_F = new JButton("F");
		btn_F.setBackground(new Color(95, 158, 160));
		btn_F.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_F.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +6 + " ");
				txtField_1.setText(txtField_1.getText() +"F" );
			}
		});
		btn_F.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_F.setBounds(246, 201, 56, 42);
		frame.getContentPane().add(btn_F);
		
		JButton btn_G = new JButton("G");
		btn_G.setBackground(new Color(95, 158, 160));
		btn_G.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_G.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +7 + " ");
				txtField_1.setText(txtField_1.getText() +"G" );
			}
		});
		btn_G.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_G.setBounds(312, 201, 56, 42);
		frame.getContentPane().add(btn_G);
		
		JButton btn_H = new JButton("H");
		btn_H.setBackground(new Color(95, 158, 160));
		btn_H.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_H.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +8 + " ");
				txtField_1.setText(txtField_1.getText() +"H" );
			}
		});
		btn_H.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_H.setBounds(378, 201, 56, 42);
		frame.getContentPane().add(btn_H);
		
		JButton btn_J = new JButton("J");
		btn_J.setBackground(new Color(95, 158, 160));
		btn_J.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_J.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +10 + " ");
				txtField_1.setText(txtField_1.getText() +"J" );
			}
		});
		btn_J.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_J.setBounds(444, 201, 56, 42);
		frame.getContentPane().add(btn_J);
		
		JButton btn_K = new JButton("K");
		btn_K.setBackground(new Color(95, 158, 160));
		btn_K.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_K.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +11 + " ");
				txtField_1.setText(txtField_1.getText() +"K" );
			}
		});
		btn_K.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_K.setBounds(510, 201, 56, 42);
		frame.getContentPane().add(btn_K);
		
		JButton btn_L = new JButton("L");
		btn_L.setBackground(new Color(95, 158, 160));
		btn_L.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +12 + " ");
				txtField_1.setText(txtField_1.getText() +"L" );
			}
		});
		btn_L.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_L.setBounds(576, 201, 56, 42);
		frame.getContentPane().add(btn_L);
		
		JButton btn_Z = new JButton("Z");
		btn_Z.setBackground(new Color(95, 158, 160));
		btn_Z.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Z.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +26 + " ");
				txtField_1.setText(txtField_1.getText() +"Z" );
			}
		});
		btn_Z.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Z.setBounds(73, 254, 56, 42);
		frame.getContentPane().add(btn_Z);
		
		JButton btn_X = new JButton("X");
		btn_X.setBackground(new Color(95, 158, 160));
		btn_X.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +24 + " ");
				txtField_1.setText(txtField_1.getText() +"X" );
			}
		});
		btn_X.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_X.setBounds(139, 254, 56, 42);
		frame.getContentPane().add(btn_X);
		
		JButton btn_C = new JButton("C");
		btn_C.setBackground(new Color(95, 158, 160));
		btn_C.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +3 + " ");
				txtField_1.setText(txtField_1.getText() +"C" );
			}
		});
		btn_C.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_C.setBounds(205, 254, 56, 42);
		frame.getContentPane().add(btn_C);
		
		JButton btn_V = new JButton("V");
		btn_V.setBackground(new Color(95, 158, 160));
		btn_V.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_V.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +22 + " ");
				txtField_1.setText(txtField_1.getText() +"V" );
			}
		});
		btn_V.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_V.setBounds(271, 254, 56, 42);
		frame.getContentPane().add(btn_V);
		
		JButton btn_B = new JButton("B");
		btn_B.setBackground(new Color(95, 158, 160));
		btn_B.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +2 + " ");
				txtField_1.setText(txtField_1.getText() +"B" );
			}
		});
		btn_B.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_B.setBounds(337, 254, 56, 42);
		frame.getContentPane().add(btn_B);
		
		JButton btn_N = new JButton("N");
		btn_N.setBackground(new Color(95, 158, 160));
		btn_N.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_N.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +14 + " ");
				txtField_1.setText(txtField_1.getText() +"N" );
			}
		});
		btn_N.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_N.setBounds(403, 254, 56, 42);
		frame.getContentPane().add(btn_N);
		
		JButton btn_M = new JButton("M");
		btn_M.setBackground(new Color(95, 158, 160));
		btn_M.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_M.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +13 + " ");
				txtField_1.setText(txtField_1.getText() +"M" );
			}
		});
		btn_M.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_M.setBounds(469, 254, 56, 42);
		frame.getContentPane().add(btn_M);
		
		txtField_1 = new JTextField();
		txtField_1.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		txtField_1.setBounds(128, 23, 595, 42);
		frame.getContentPane().add(txtField_1);
		txtField_1.setColumns(10);
		
		JLabel lbl_Results = new JLabel("Results:");
		lbl_Results.setFont(new Font("Tahoma", Font.BOLD, 21));
		lbl_Results.setBounds(37, 84, 110, 28);
		frame.getContentPane().add(lbl_Results);
		
		txtField_2 = new JTextField();
		txtField_2.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		txtField_2.setBounds(128, 81, 595, 42);
		frame.getContentPane().add(txtField_2);
		txtField_2.setColumns(10);
		
		JLabel lbl_Input = new JLabel(" Input:");
		lbl_Input.setFont(new Font("Tahoma", Font.BOLD, 21));
		lbl_Input.setBounds(48, 26, 122, 28);
		frame.getContentPane().add(lbl_Input);
		
		JButton btnSpace = new JButton("SPACE");
		btnSpace.setBackground(new Color(95, 158, 160));
		btnSpace.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +0 + " ");
				txtField_1.setText(txtField_1.getText() +" " );
			}
		});
		btnSpace.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSpace.setBounds(103, 307, 440, 42);
		frame.getContentPane().add(btnSpace);
		
		JButton btn_Comma = new JButton(",");
		btn_Comma.setBackground(new Color(95, 158, 160));
		btn_Comma.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +30 + " ");
				txtField_1.setText(txtField_1.getText() +"," );
			}
		});
		btn_Comma.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Comma.setBounds(535, 254, 56, 42);
		frame.getContentPane().add(btn_Comma);
		
		JButton btn_Period = new JButton(".");
		btn_Period.setBackground(new Color(95, 158, 160));
		btn_Period.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Period.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +40 + " ");
				txtField_1.setText(txtField_1.getText() +"." );
			}
		});
		btn_Period.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Period.setBounds(601, 254, 56, 42);
		frame.getContentPane().add(btn_Period);
		
		JButton btn_Open = new JButton("(");
		btn_Open.setBackground(new Color(95, 158, 160));
		btn_Open.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +70 + " ");
				txtField_1.setText(txtField_1.getText() +"(" );
			}
		});
		btn_Open.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Open.setBounds(565, 307, 56, 42);
		frame.getContentPane().add(btn_Open);
		
		JButton btn_Punctuation = new JButton("!");
		btn_Punctuation.setBackground(new Color(95, 158, 160));
		btn_Punctuation.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Punctuation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +50 + " ");
				txtField_1.setText(txtField_1.getText() +"!" );
			}
		});
		btn_Punctuation.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Punctuation.setBounds(686, 148, 56, 42);
		frame.getContentPane().add(btn_Punctuation);
		
		JButton btn_Question = new JButton("?");
		btn_Question.setBackground(new Color(95, 158, 160));
		btn_Question.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Question.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +60 + " ");
				txtField_1.setText(txtField_1.getText() +"?" );
			}
		});
		btn_Question.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Question.setBounds(667, 254, 56, 42);
		frame.getContentPane().add(btn_Question);
		
		JButton btn_Close = new JButton(")");
		btn_Close.setBackground(new Color(95, 158, 160));
		btn_Close.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_2.setText(txtField_2.getText() +80 + " ");
				txtField_1.setText(txtField_1.getText() +")" );
			}
		});
		btn_Close.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Close.setBounds(632, 307, 56, 42);
		frame.getContentPane().add(btn_Close);
		
		JButton btn_Clear = new JButton("CLEAR");
		btn_Clear.setBackground(new Color(95, 158, 160));
		btn_Clear.setBorder(new BevelBorder(BevelBorder.RAISED, Color.RED, null, null, Color.RED));
		btn_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField_1.setText("");
				txtField_2.setText("");
			}
		});
		btn_Clear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn_Clear.setBounds(642, 201, 116, 42);
		frame.getContentPane().add(btn_Clear);
	}
}
