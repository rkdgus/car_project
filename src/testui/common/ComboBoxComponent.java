package testui.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class ComboBoxComponent extends JPanel {
	private JComboBox comboBox;

	
	public ComboBoxComponent(String title) {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lbl = new JLabel(title);
		lbl.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lbl);
		
		comboBox = new JComboBox();
		add(comboBox);

	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


}
