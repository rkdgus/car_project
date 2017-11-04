package testui.content;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CarListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CarListPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 46, 588, 656);
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		ReserveAddCarContent panel_2 = new ReserveAddCarContent();
		JScrollPane scrollPane = new JScrollPane(panel_2, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		panel.add(scrollPane, BorderLayout.CENTER);
		
	
		
	


		
	}
}
