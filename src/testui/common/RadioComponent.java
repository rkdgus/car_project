package testui.common;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class RadioComponent extends JPanel {
	private JRadioButton rdbtnLeft;
	private JRadioButton rdbtnRight;

	public RadioComponent(String srt,String srt1,String srt2) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lbl = new JLabel(srt);
		lbl.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lbl);
		
		rdbtnLeft = new JRadioButton(srt1);
		rdbtnLeft.setSelected(true);
		rdbtnLeft.setHorizontalAlignment(SwingConstants.CENTER);
		add(rdbtnLeft);
		
		rdbtnRight = new JRadioButton(srt2);
		add(rdbtnRight);
		
		ButtonGroup group = new ButtonGroup();

		group.add(rdbtnRight);
		group.add(rdbtnLeft);

	}

	public JRadioButton getRdbtnLeft() {
		return rdbtnLeft;
	}

	public void setRdbtnLeft(JRadioButton rdbtnLeft) {
		this.rdbtnLeft = rdbtnLeft;
	}

	public JRadioButton getRdbtnRight() {
		return rdbtnRight;
	}

	public void setRdbtnRight(JRadioButton rdbtnRight) {
		this.rdbtnRight = rdbtnRight;
	}



}
