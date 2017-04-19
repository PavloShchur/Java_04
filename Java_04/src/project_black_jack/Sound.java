package project_black_jack;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {
	public void playSound_01() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("D:/MusicPlayer/KissesinParadise.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public void playSound_02() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("D:/MusicPlayer/UpbeatFunk.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

	public void playSound_03() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("D:/MusicPlayer/UpbeatFunk.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}
}
