import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener{
	public static void main(String[] args)  {
	cutenessTV t = new cutenessTV();
	t.showTV();
	}
	JFrame j = new JFrame();
	JPanel b = new JPanel();
	JButton o = new JButton();
	JButton y = new JButton();
	JButton z = new JButton();
	void showTV(){
		j.setSize(60, 500);
		j.setVisible(true);
		b.setVisible(true);
		o.setVisible(true);
		y.setVisible(true);	
		z.setVisible(true);
		j.add(b);
		b.add(o);
		b.add(y);
		b.add(z);
		o.setText("Docks");
     	y.setText("Hog");
     	z.setText("Unicycle");
     	o.addActionListener(this);
     	y.addActionListener(this);
     	z.addActionListener(this);
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if (pressed.equals(o)) {
			showDucks();
		}
		if (pressed.equals(y)) {
			showFrog();
		}
		if (pressed.equals(z)) {
		showFluffyUnicorns();	
		}
	}
	

}
