package testui.common;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class VTextFieldComponent extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public VTextFieldComponent(String str) {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		add(textField);
		textField.setColumns(10);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	

}
