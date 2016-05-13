

	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.InputStream;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import javazoom.jl.decoder.JavaLayerException;
	import javazoom.jl.player.advanced.AdvancedPlayer;

	/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
	 * 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/

	public class Jukebox implements Runnable, ActionListener {
		 Song seeyou = new Song("Wiz Khalifa - See You Again ft. Charlie Puth [Official Video] Furious 7 Soundtrack.mp3"); 
	    Song immortal = new Song("Fall Out Boy - Immortals (From Big Hero 6).mp3");
	    Song batblood = new Song("BAT BLOOD - A Batman V Superman AND Bad Blood PARODY ft. Batman.mp3");
		JButton stuff = new JButton();
		JButton other = new JButton();
		JButton bat = new JButton();
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Jukebox());
		}

	           public void run() {

			// 3. Find an mp3 on your computer or on the Internet.
	        	   
			// 4. Create a Song
	        	 
			/*
			 * 6. Create a user interface for your Jukebox so that the user can to
			 * choose which song to play. You can use can use a different button for
			 * each song, or a picture of the album cover. When the button or album
			 * cover is clicked, stop the currently playing song, and play the one
			 * that was selected.
			 */
	         JFrame see = new JFrame();
	         JPanel lololol = new JPanel();
	    
	         see.setVisible(true);
	         see.setSize(500, 500);
	        see.add(lololol);
	        lololol.add(stuff);
	        stuff.setText("See you again");
	        lololol.add(bat);
	        lololol.add(other);
	        other.setText("Immortals");
	        bat.setText("Bat Blood");
	         
	           other.addActionListener(this);
	           stuff.addActionListener(this);
	           bat.addActionListener(this);
	           }
		private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

		/* Use this method to add album covers to your Panel. */
		private JLabel loadImage(String fileName) {
			URL imageURL = getClass().getResource(fileName);
			Icon icon = new ImageIcon(imageURL);
			return new JLabel(icon);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(stuff)) {
				seeyou.play();
				
			}
			if (e.getSource().equals(other)) {
				immortal.play();
			}
			if (e.getSource().equals(bat)) {
				batblood.play();
				
			}
		}

	}

	class Song {

		private int duration;
		private String songAddress;
		private AdvancedPlayer mp3Player;
		private InputStream songStream;

		/**
		 * Songs can be constructed from files on your computer or Internet
		 * addresses.
		 * 
		 * Examples: <code> 
		 * 		new Song("everywhere.mp3"); 	//from default package 
		 * 		new Song("/Users/joonspoon/music/Vampire Weekend - Modern Vampires of the City/03 Step.mp3"); 
		 * 		new	Song("http://freedownloads.last.fm/download/569264057/Get%2BGot.mp3"); 
		 * </code>
		 */
		public Song(String songAddress) {
			this.songAddress = songAddress;
		}

		public void play() {
			loadFile();
			if (songStream != null) {
				loadPlayer();
				startSong();
			} else
				System.err.println("Unable to load file: " + songAddress);
		}

		public void setDuration(int seconds) {
			this.duration = seconds * 100;
		}

		public void stop() {
			if (mp3Player != null)
				mp3Player.close();
		}

		private void startSong() {
			Thread t = new Thread() {
				public void run() {
					try {
						if (duration > 0)
							mp3Player.play(duration);
						else
							mp3Player.play();
					} catch (Exception e) {
					}
				}
			};
			t.start();
		}

		private void loadPlayer() {
			try {
				this.mp3Player = new AdvancedPlayer(songStream);
			} catch (Exception e) {
			}
		}

		private void loadFile() {
			if (songAddress.contains("http"))
				this.songStream = loadStreamFromInternet();
			else
				this.songStream = loadStreamFromComputer();
		}

		private InputStream loadStreamFromInternet() {
			try {
				return new URL(songAddress).openStream();
			} catch (Exception e) {
				return null;
			}
		}

		private InputStream loadStreamFromComputer() {
			try {
				return new FileInputStream(songAddress);
			} catch (FileNotFoundException e) {
				return this.getClass().getResourceAsStream(songAddress);
			}
		}
	}



