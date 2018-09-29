package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	private JButton[] buttons;
	private JButton btnReset;
	private JButton btnIs;
	private JTextField taDisplay;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;

	public Calculator() {
		Container cp=getContentPane();
		cp.setLayout(new BorderLayout());
		BtnListener listener=new BtnListener();
		
		JPanel displayPanel=new JPanel(new FlowLayout());
		this.taDisplay=new JTextField("0",10);
		this.taDisplay.setEditable(false);
		displayPanel.add(this.taDisplay);
		
		JPanel buttonsPanel=new JPanel(new GridLayout(4,3));
		this.buttons=new JButton[10];
		for(int i=1;i<this.buttons.length;i++) {
			this.buttons[i]=new JButton(Integer.toString(i));
			//this.buttons[i].setPreferredSize(new Dimension(10,10));
			buttonsPanel.add(this.buttons[i]);
			this.buttons[i].addActionListener(listener);
		}
		this.btnReset=new JButton("C");
		this.btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				taDisplay.setText("0");
			}
		});
		buttonsPanel.add(this.btnReset);
		this.buttons[0]=new JButton("0");
		buttonsPanel.add(this.buttons[0]);
		this.buttons[0].addActionListener(listener);
		this.btnIs=new JButton("=");
		buttonsPanel.add(this.btnIs);
		
		JPanel opPanel=new JPanel(new GridLayout(1,4));
		this.btnAdd=new JButton("+");
		opPanel.add(this.btnAdd);
		this.btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		this.btnSub=new JButton("-");
		opPanel.add(this.btnSub);
		this.btnMul=new JButton("*");
		opPanel.add(this.btnMul);
		this.btnDiv=new JButton("/");
		opPanel.add(this.btnDiv);

		
		cp.add(buttonsPanel,BorderLayout.SOUTH);
		cp.add(opPanel,BorderLayout.CENTER);
		cp.add(displayPanel,BorderLayout.NORTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		setSize(500,500);
		setVisible(true);
	}
	
	public class BtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(taDisplay.getText().equals("0")) {
				taDisplay.setText(arg0.getActionCommand());
			}else{
				taDisplay.setText(taDisplay.getText()+arg0.getActionCommand());
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Calculator();
			}
			
		});

	}

}
