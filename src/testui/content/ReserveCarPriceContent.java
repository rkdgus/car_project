package testui.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import testui.common.VTextFieldComponent;


@SuppressWarnings("serial")
public class ReserveCarPriceContent extends JPanel {
	private JLabel carImg;
	private JPanel carReservePanel;
	private JPanel carValuePanel;

	/**
	 * Create the panel.
	 */
	public ReserveCarPriceContent() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(new BorderLayout(0, 0));

		carImg = new JLabel("");
		carImg.setHorizontalAlignment(SwingConstants.CENTER);
		carImg.setIcon(new ImageIcon("C:\\Users\\DGIT3-10\\Desktop\\차-1\\impala.jpg"));
		add(carImg);

		carReservePanel = new JPanel();
		carReservePanel.setBorder(new EmptyBorder(0, 5, 0, 5));
		add(carReservePanel, BorderLayout.SOUTH);
		carReservePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		VTextFieldComponent carPrice = new VTextFieldComponent("차량요금");
		carReservePanel.add(carPrice);

		VTextFieldComponent insurance = new VTextFieldComponent("보험료");
		carReservePanel.add(insurance);

		VTextFieldComponent discountPrice = new VTextFieldComponent("할인금액");
		carReservePanel.add(discountPrice);

		VTextFieldComponent finalPrice = new VTextFieldComponent("총 결제금액");
		carReservePanel.add(finalPrice);

		JButton btnReserve = new JButton("예약");
		carReservePanel.add(btnReserve);

		carValuePanel = new JPanel();
		add(carValuePanel, BorderLayout.NORTH);
		carValuePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblCarName = new JLabel("소나타");
		lblCarName.setFont(new Font("굴림", Font.BOLD, 17));
		lblCarName.setHorizontalAlignment(SwingConstants.CENTER);
		carValuePanel.add(lblCarName);

		JLabel lblCaValue = new JLabel("오토/휘발유");
		carValuePanel.add(lblCaValue);

	}

}
