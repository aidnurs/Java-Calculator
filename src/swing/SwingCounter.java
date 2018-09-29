package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingCounter extends JFrame{
	private JTextField tfCount;
	private JButton btnCount;
	private int count = 0;
	
	public SwingCounter() {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Counter"));
		this.tfCount=new JTextField("0",10);
		this.tfCount.setEditable(false);
		cp.add(this.tfCount);
		this.btnCount=new JButton("Count");
		cp.add(this.btnCount);
		this.btnCount.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				++count;
				tfCount.setText(count+"");
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SwingCounter");
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new SwingCounter();
			}
			
		});
	}

}
