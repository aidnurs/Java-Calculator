package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame implements ActionListener{
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator() {
		setLayout(new FlowLayout());
		
		this.lblInput=new Label("Enter an integer:");
		add(this.lblInput);
		this.tfInput=new TextField(10);
		this.tfInput.setEditable(true);
		add(this.tfInput);
		this.tfInput.addActionListener(this);
		
		this.lblOutput=new Label("The Accumulated Sum is:");
		add(this.lblOutput);
		this.tfOutput=new TextField(10);
		this.tfOutput.setEditable(false);
		add(this.tfOutput);
		
		setTitle("AWTAccumulator");
		setSize(350,120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AWTAccumulator app=new AWTAccumulator();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int number=Integer.parseInt(this.tfInput.getText());
		this.sum+=number;
		this.tfInput.setText("");
		this.tfOutput.setText(this.sum+"");
	}
	
}
