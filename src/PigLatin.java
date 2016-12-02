import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.ws.soap.AddressingFeature;

public class PigLatin implements ActionListener {
	public static void main(String[] args) {
PigLatin pl = new PigLatin();
pl.j();
	}

	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton();
	JTextField jtf = new JTextField();
	JTextField tf = new JTextField();


	void j() {
		jf.add(jp);
		jp.add(tf);
		tf.setPreferredSize(new Dimension (200,20));
		jp.add(jb);
		jb.setText("Translate");
		jp.add(jtf);
		jf.setVisible(true);
jtf.setPreferredSize(new Dimension (200,20));
		jf.setSize(800, 400);
jb.addActionListener(this);


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 PigLatinConverter latin = new PigLatinConverter();
		 String piggy = latin.translate(tf.getText());
		 jtf.setText(piggy);
	}

}
