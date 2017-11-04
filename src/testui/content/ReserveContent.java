package testui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class ReserveContent extends JPanel implements ActionListener {
	private	ImageIcon img;
	
	
	
	/**
	 * Create the panel.
	 */
	public ReserveContent() {

		setBounds(new Rectangle(0, 0, 500, 500));
		setLayout(null);
		
		ReserveLeftContent panel_3 = new ReserveLeftContent();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC0C1\uC138\uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(0, 79, 302, 672);
		add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(310, 112, 664, 639);
		add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel_4.add(scrollPane);
		
		ReserveAddCarContent panel_8 = new ReserveAddCarContent();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(panel_8);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		ReserveHeaderContent panel = new ReserveHeaderContent();
		panel.setBounds(0, 0, 980, 75);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(310, 77, 664, 35);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnB = new JButton("소형");
		btnB.setBounds(399, 79, 74, 29);
		add(btnB);
		
		JButton btnC = new JButton("중형");
		btnC.setBounds(485, 79, 74, 29);
		add(btnC);
		
		JButton btnD = new JButton("고급");
		btnD.setBounds(583, 79, 74, 29);
		add(btnD);
		
		JButton btnA = new JButton("경차");
		btnA.setBounds(310, 79, 74, 29);
		add(btnA);
		
		JButton btnE = new JButton("RV/SUV");
		btnE.setBounds(675, 79, 86, 29);
		add(btnE);
		
		JButton btnF = new JButton("수입차");
		btnF.setBounds(786, 79, 74, 29);
		add(btnF);
		
		JButton btnG = new JButton("승합차");
		btnG.setBounds(888, 79, 74, 29);
		add(btnG);
		img = new ImageIcon("D:\\workspace\\workspace_java\\testProject\\src\\testProject\\ui\\car1.jpg");

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}





}
