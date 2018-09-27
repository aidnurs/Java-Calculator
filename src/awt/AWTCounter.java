package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener{
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	public AWTCounter() {
		setLayout(new FlowLayout());
		
		this.lblCount=new Label("Counter");
		add(this.lblCount);
		this.tfCount=new TextField(this.count+"",10);
		tfCount.setEditable(false);
		add(this.tfCount);
		this.btnCount=new Button("Count");
		add(this.btnCount);
		
		this.btnCount.addActionListener(this);
		
		setTitle("AWT Counter");
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		AWTCounter app=new AWTCounter();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		++this.count;
		tfCount.setText(this.count+"");
	}
	
}
