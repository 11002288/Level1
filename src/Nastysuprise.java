import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nastysuprise implements ActionListener {
public static void main(String[] args) {
	Nastysuprise ns = new Nastysuprise();
	ns.Nasty();
	
	
}
JButton Jb = new JButton();
JButton jb = new JButton();

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
  void Nasty(){
JFrame jf = new JFrame();
jf.setVisible(true);
JPanel jp = new JPanel();
jf.setSize(100, 100);
Jb = new JButton();
jb = new JButton();
jf.add(jp);
jp.add(Jb);
jp.add(jb );
Jb.setText("Trick");
jb.setText("Treat");
jb.addActionListener(this);
	
	
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (Jb.equals(e.getSource())) {
		
	
	showPictureFromTheInternet("http://jtf.org/wp-content/uploads/2015/08/hillary-clinton-laughing.jpg");
	}
	if (jb.equals(e.getSource())) {
		
	
	showPictureFromTheInternet("https://i.ytimg.com/vi/z4v0pUcd5VM/maxresdefault.jpg");
}}
	
	
	
	
	
}

