package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTPanelDemo extends Frame{
	private Button[] btnNumbers;
	private Button btnHash, btnStar;
	private TextField tfDisplay;
	
	public AWTPanelDemo() {
		Panel panelDisplay=new Panel(new FlowLayout());
		this.tfDisplay=new TextField("0",20);
		panelDisplay.add(this.tfDisplay);
		
		Panel panelButtons=new Panel(new GridLayout(4,3));
		this.btnNumbers=new Button[10];
		for(int i=1;i<this.btnNumbers.length;i++) {
			this.btnNumbers[i]=new Button(Integer.toString(i));
			panelButtons.add(this.btnNumbers[i]);
		}
		
		this.btnStar=new Button("*");
		panelButtons.add(this.btnStar);
		this.btnNumbers[0]=new Button("0");
		panelButtons.add(this.btnNumbers[0]);
		this.btnHash=new Button("#");
		panelButtons.add(this.btnHash);
		
		setLayout(new BorderLayout());
		add(panelDisplay,BorderLayout.NORTH);
		add(panelButtons,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		setTitle("AWTPanelDemo");
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWTPanelDemo();
	}

}
