package testui.content;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class ReserveAddCarContent extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReserveAddCarContent() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		ReserveCarPriceContent panel = new ReserveCarPriceContent();
		add(panel);
		
		ReserveCarPriceContent panel_1 = new ReserveCarPriceContent();
		add(panel_1);
		
		ReserveCarPriceContent ppppp_ = new ReserveCarPriceContent();
		add(ppppp_);
		
		ReserveCarPriceContent ppppp__1 = new ReserveCarPriceContent();
		add(ppppp__1);
		
		ReserveCarPriceContent panel_2 = new ReserveCarPriceContent();
		add(panel_2);

	}
}
