package testui.calendar;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CalendarFrame extends JFrame {

	private JPanel contentPane;
	private JTextField firstDateField;

	public CalendarFrame(JTextField firstDateField) {
		this.firstDateField = firstDateField;

		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 306, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		CalendarComponent calendarPanel = new CalendarComponent(this, firstDateField);
		contentPane.add(calendarPanel, BorderLayout.NORTH);
	
	
	}
}
