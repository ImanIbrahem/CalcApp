import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;



public class CalcView extends JFrame{
	
	public JButton[] buttons ;
	public JLabel [] l ;
	public JTextField []t ;
	public JPanel p1,p2,p3,p4,keys ;
	public static final String []names = { "+","-","/","*"};
	public String label [] = {"First Number      ","Second Number","Result                "};

	
	public CalcView  ()
	{
		super ("Product");
		
		p1 = new JPanel ();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		keys = new JPanel();
		
		buttons = new JButton [names.length];
		t=new JTextField[3];
		l = new JLabel [label.length];
		
		for (int j=0 ;j<label.length;j++)
		{
			l[j]=new JLabel (label[j]);
			t[j]=new JTextField (10);
		}
		for (int i=0 ;i<names.length;i++)
		{
			buttons[i]=new JButton(names[i]);
		}
		keys.setLayout(new GridLayout(4,1));
		p1.add(l[0]); p1.add(t[0]);
		p2.add(l[1]); p2.add(t[1]);
		p3.add(buttons[0]); p3.add(buttons[1]); p3.add(buttons[2]); p3.add(buttons[3]);
		p4.add(l[2]); p4.add(t[2]);
		
		keys.add(p1);
		keys.add(p2);
		keys.add(p3);
		keys.add(p4);

		add(keys, BorderLayout.CENTER);
		//setSize (100,500);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (500,200);
		setVisible(true);
		
	}
	
	public double getFN() {
		double FN ;
		FN = Double.parseDouble(t[0].getText());
		return FN;
		
	}
	public double getSE() {
		double SE ;
		SE = Double.parseDouble(t[1].getText());
		return SE;
		
	}

	public void SetRes(double res) {
		t[2].setText(Double.toString(res));		
	}
}
