package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAccumulator extends JFrame{
	private JTextField tfInput, tfOutput;
	private int sum=0;
	
	public SwingAccumulator() {
		Container panel=getContentPane();
		
		panel.setLayout(new GridLayout(2,2,5,5));
		
		panel.add(new JLabel("Enter int"));
		this.tfInput=new JTextField(10);
		panel.add(this.tfInput);
		panel.add(new JLabel("The Accumulated Sum is: "));
		this.tfOutput=new JTextField(10);
		this.tfOutput.setEditable(false);
		panel.add(this.tfOutput);
		this.tfInput.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int number=Integer.parseInt(tfInput.getText());
				sum+=number;
				tfInput.setText("");
				tfOutput.setText(sum+"");
			}
			
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("SwingAccumulator");
		setSize(350,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SwingAccumulator();
			}
		});
	}

}
