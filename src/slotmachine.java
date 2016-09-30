import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	JLabel e = new JLabel();
	JLabel l = new JLabel();
	JLabel a = new JLabel();
	JLabel b = new JLabel();
	
public static void main(String[] args) {
slotmachine slot = new slotmachine();
slot.slotmachine();

}
public void slotmachine() {
	
	JFrame j = new JFrame();
	j.setVisible(true);

	JPanel p = new JPanel();
	
	JButton c = new JButton();
	j.add(p);
	p.add(l);
	p.add(a);
	p.add(b);
	p.add(c);
	c.setText("click"
			+ "");
	j.setSize(600, 200);
	b.setText("Click to have a chance to 1000000000000000 crispy high fives!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
c.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent event) {
	// TODO Auto-generated method stub
	int first = new Random().nextInt(3);
	int second = new Random().nextInt(3);
	int third = new Random().nextInt(3);
	l.setText(first + "");
	a.setText(second + "");
	b.setText(third + "");
	if(first==second&&second==third){
		e.setText("you win");
		
	}else{  
		e.setText("Nope");
		
	}
}
}
