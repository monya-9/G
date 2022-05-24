package G10L2;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MyFrame2 extends JFrame{
	private JButton button;
	private JLabel lable;
	private boolean onOff = true;

	public MyFrame2() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		JPanel panel = new JPanel();
		this.setLayout(new FlowLayout());
		button = new JButton("버튼을 누르시오");
		lable = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener2());
		this.add(button);
		panel.add(lable);
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(onOff == true) {
				lable.setText("켜짐");
				onOff = false;
			}else {
				lable.setText("꺼짐");
				onOff = true;
			}
			
//			if(e.getSource() == button) {
//				lable.setText("마침내 버튼이 눌려졌습니다.");
//				
//			}
		}
	}
}

public class ActionEventTest2 {
	public static void main(String[] args) {
		MyFrame2 t = new MyFrame2();
	}
}
