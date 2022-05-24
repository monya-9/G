package G10L;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
	}

}

class MyFrame extends JFrame{
	private JButton button;
	public MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		this.setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�");
		button.addActionListener(new MyListener());
		this.add(button);
		this.setVisible(true);
	}
}

public class ActionEventTest {
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
