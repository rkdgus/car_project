package testui.content;

import javax.swing.JPanel;
import testui.common.ComboBoxComponent;
import javax.swing.JLabel;
import java.awt.Font;
import testui.common.RadioComponent;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class ReserveLeftContent extends JPanel {


	public ReserveLeftContent() {
		setBorder(null);
		setLayout(null);
		
		ComboBoxComponent panel = new ComboBoxComponent("제조회사  ");
		panel.setBounds(45, 59, 191, 36);
		add(panel);
		
		ComboBoxComponent comboBoxComponent = new ComboBoxComponent("연료종류  ");
		comboBoxComponent.setBounds(45, 131, 191, 36);
		add(comboBoxComponent);
		
		ComboBoxComponent comboBoxComponent_1 = new ComboBoxComponent("연식  ");
		comboBoxComponent_1.setBounds(45, 210, 191, 36);
		add(comboBoxComponent_1);
		
		ComboBoxComponent comboBoxComponent_2 = new ComboBoxComponent("인승  ");
		comboBoxComponent_2.setBounds(45, 290, 191, 36);
		add(comboBoxComponent_2);
		
		ComboBoxComponent comboBoxComponent_3 = new ComboBoxComponent("상세 차 검색  ");
		comboBoxComponent_3.setBounds(45, 369, 191, 36);
		add(comboBoxComponent_3);
		
		RadioComponent panel_2 = new RadioComponent("변속기", "오토", "수동");
		panel_2.setBounds(45, 437, 205, 70);
		add(panel_2);
		
		RadioComponent radioComponent = new RadioComponent("자차 보험", "포함", "비포함");
		radioComponent.setBounds(45, 527, 205, 70);
		add(radioComponent);

	}
}
