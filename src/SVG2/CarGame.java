package SVG2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel lable1;
	private JLabel lable2;
	private JLabel lable3;
	int x1 = 100, x2 = 100, x3 = 100;

	class MyThread extends Thread {
		public void run() {
			for(int i = 0; i<120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int) (Math.random() * 10);
				lable1.setBounds(x1, 0, 100, 100);
				x2 += (int) (Math.random() * 10);
				lable2.setBounds(x2, 50, 100, 100);
				x3 += (int) (Math.random() * 10);
				lable3.setBounds(x3, 100, 100, 100);
			}
		}

		public void CarGame(){
			setTitle("CarRace");
			setSize(600, 200);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			lable1 = new JLabel();
			lable1.setIcon(new ImageIcon("img/car1.png"));
			lable2 = new JLabel();
			lable2.setIcon(new ImageIcon("img/car2.png"));
			lable3 = new JLabel();
			lable3.setIcon(new ImageIcon("img/car3.png"));
			add(lable1);
			add(lable2);
			add(lable3);
			lable1.setBounds(100, 0, 100, 100);
			lable2.setBounds(100, 50, 100, 100);
			lable3.setBounds(100, 100, 100, 100);
			(new MyThread()).start();
			setVisible(true);
		}

	}

	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
}
