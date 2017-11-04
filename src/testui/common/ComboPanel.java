package testui.common;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import testui.calendar.CalendarFrame;

@SuppressWarnings("serial")
public class ComboPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */

	public ComboPanel(String str) {
		setLayout(new GridLayout(1, 1, 0, 0));

		JLabel lblNewLabel = new JLabel(str);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(lblNewLabel);

		Date date = new Date();

		SimpleDateFormat day = new SimpleDateFormat("yyyy/MM/dd");
		textField = new JTextField(day.format(date));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CalendarFrame cf = new CalendarFrame(textField);
				cf.setVisible(true);

			}
		});
		add(textField);
		textField.setColumns(10);
		textField.setFocusable(false);
		String[] arr = { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30",
				"14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00",
				"19:30", "20:00", "20:30", "21:00" };
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(arr);
		JComboBox<String> comboBox = new JComboBox<String>(model);
		add(comboBox);
		
		
		String start="2017/11/01 10:00"; 
		String fin="2017/11/3 10:00"; 
		Calendar tempcal=Calendar.getInstance(); 
		SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:mm"); 
		Date startday=sf.parse(start, new ParsePosition(0)); 
		long startTime=startday.getTime(); //현재의 시간 설정	
		Calendar cal=Calendar.getInstance(); 
		Date endDate=sf.parse(fin, new ParsePosition(0)); 
		long endTime=endDate.getTime(); 
		long mills=endTime-startTime; //분으로 변환 
		long hour=mills/3600000; 
		
		StringBuffer diffTime=new StringBuffer(); 
		diffTime.append( hour).append("시  ").append(mills); 
		System.out.println(diffTime.toString());

	}

}
