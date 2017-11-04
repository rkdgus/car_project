package testui.content;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import testui.calendar.CalendarFrame;
import testui.common.TextFieldPanel;

@SuppressWarnings("serial")
public class ReserveHeaderContent extends JPanel {

	private String startDay;
	private String lastDay;
	private String startTime;
	private String lastTime;
	private JComboBox<String> startTimeCom;
	private JComboBox<String> finalTimeCom;
	private TextFieldPanel totalTimePanel;
	private CalendarFrame cf;
	private SimpleDateFormat simpleDate;
	private SimpleDateFormat simpleTime;
	private Date date;
	private String toDay;
	private String presentTime;
	private TextFieldPanel startPanel;
	private TextFieldPanel finalPanel;

	public ReserveHeaderContent() {

		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);

		JLabel home = new JLabel("아이티 렌트카");
		home.setBounds(12, 0, 81, 24);
		add(home);

		startPanel = new TextFieldPanel("대여일  ");
		startPanel.setBounds(12, 31, 213, 35);
		add(startPanel);
		startPanel.setFocusable(false);

		totalTimePanel = new TextFieldPanel("총  ");
		totalTimePanel.setBounds(642, 31, 122, 35);
		add(totalTimePanel);
		totalTimePanel.getTextField().setText("0");

		JLabel lblNewLabel = new JLabel("시간");
		lblNewLabel.setBounds(765, 31, 68, 35);
		add(lblNewLabel);

		JButton btnSearch = new JButton("차량검색");
		btnSearch.setBounds(833, 22, 122, 41);
		add(btnSearch);

		finalPanel = new TextFieldPanel("반납일  ");
		finalPanel.setBounds(314, 31, 213, 35);
		add(finalPanel);
		finalPanel.setFocusable(false);

		String[] timeArr = { "시간선택", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00",
				"13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30",
				"19:00", "19:30", "20:00", "20:30", "21:00" };

		DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(timeArr);
		DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>(timeArr);
		startTimeCom = new JComboBox<String>(model1);
		startTimeCom.setBounds(231, 31, 88, 35);
		add(startTimeCom);

		finalTimeCom = new JComboBox<String>(model2);
		finalTimeCom.setBounds(533, 31, 88, 35);
		add(finalTimeCom);

		startPanel.getTextField().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				viewCalender(startPanel);

			}
		});

		startPanel.getTextField().addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
			}

			@Override
			public void focusGained(FocusEvent e) {
				setDayTime(startPanel, finalPanel);
				startPanel.getTextField().setFocusable(false);
				startTimeCom.setSelectedIndex(0);
			}

		});

		finalPanel.getTextField().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				viewCalender(finalPanel);

			}
		});

		finalPanel.getTextField().addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
			}

			@Override
			public void focusGained(FocusEvent e) {
				finalPanel.getTextField().setFocusable(false);
				setDayTime(startPanel, finalPanel);
				finalTimeCom.setSelectedIndex(0);
			}

		});

		startTimeCom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setDayTime(startPanel, finalPanel);
			}
		});

		finalTimeCom.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setDayTime(startPanel, finalPanel);
			}
		});

		simpleDate = new SimpleDateFormat("yyyy/MM/dd");
		simpleTime = new SimpleDateFormat("HH:mm");
		date = new Date();
		toDay = simpleDate.format(date);
		presentTime = simpleTime.format(date);

		tfSetting(startPanel, finalPanel);

	}

	private void tfSetting(TextFieldPanel startPanel, TextFieldPanel finalPanel) {
		startPanel.getTextField().setFocusable(false);
		finalPanel.getTextField().setFocusable(false);

		startPanel.getTextField().setText(toDay);
		finalPanel.getTextField().setText(toDay);

		startDay = toDay;
		startTime = presentTime;
		lastDay = toDay;
		lastTime = presentTime;

	}

	private void setDayTime(TextFieldPanel startPanel, TextFieldPanel finalPanel) {
		Date date1 = simpleDate.parse(toDay, new ParsePosition(0));
		Date date2 = simpleDate.parse(startPanel.getTextField().getText(), new ParsePosition(0));

		Date time1 = simpleTime.parse(presentTime, new ParsePosition(0));
		Date time2 = simpleTime.parse((String) startTimeCom.getSelectedItem(), new ParsePosition(0));
		if (time2 == null) {
			time2 = time1;
		}
		if (date1.getTime() > date2.getTime()) {
			JOptionPane.showMessageDialog(null, toDay + " 이후로 선택하세요");
			startPanel.getTextField().setText(toDay);
			return;
		} else if (date1.getTime() == date2.getTime()) {
			if (time1.getTime() > time2.getTime()) {
				JOptionPane.showMessageDialog(null, presentTime + " 이후로 선택하세요");
				startTimeCom.setSelectedIndex(0);
				return;
			}
		}

		startDay = startPanel.getTextField().getText();
		startTime = startTimeCom.getSelectedItem().toString();
		lastDay = finalPanel.getTextField().getText();
		lastTime = finalTimeCom.getSelectedItem().toString();

		if (startTime.equals("시간선택") || lastTime.equals("시간선택")) {
			totalTimePanel.getTextField().setText("0");
			return;
		}

		setTotalTime();

	}

	private void viewCalender(TextFieldPanel TfPanel) {
		cf = new CalendarFrame(TfPanel.getTextField());
		cf.setVisible(true);
		TfPanel.getTextField().setFocusable(true);
		TfPanel.getTextField().requestFocus();
	}

	private void setTotalTime() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		Date sDay = sf.parse(startDay + " " + startTime, new ParsePosition(0));
		long sTime = sDay.getTime();

		Date fDate = sf.parse(lastDay + " " + lastTime, new ParsePosition(0));
		long fTime = fDate.getTime();
		long mills = fTime - sTime;
		long hour = mills / 3600000;

		if (fTime <= sTime) {
			JOptionPane.showMessageDialog(null, "반납일이 대여일보다 뒤여야 합니다");
			totalTimePanel.getTextField().setText("0");
			finalPanel.getTextField().setText(toDay);
			finalTimeCom.setSelectedIndex(0);
			return;
		}

		totalTimePanel.getTextField().setText(String.valueOf(hour));

	}
}