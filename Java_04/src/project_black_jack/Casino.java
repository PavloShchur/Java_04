package project_black_jack;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Casino {

	{
		playSound_2();
		
	}
	private int money_casino;
	Map<Player, ArrayList<Cards>> map_casino = new HashMap<>();

	public void add_player() {
		System.out.println("Please enter name.");
		String name = Main.scanner.next();
		int money = 500 + (int) (Math.random() * 10000);
		map_casino.put(new Player(name, money), new ArrayList<Cards>());
	}

	public void show_table() {
		for (Map.Entry<Player, ArrayList<Cards>> entry : map_casino.entrySet()) {
			System.out.println(entry);
		}
	}

	public void add_cards() {
		System.out.println("Please enter name of player.");
		String name_of_player = Main.scanner.next();
		Iterator<Entry<Player, ArrayList<Cards>>> iterator = map_casino.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Player, ArrayList<Cards>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name_of_player)) {
				if (entry.getValue().isEmpty()) {
					int i = 0;
					while (i < 2) {
						Cards cards = Cards.values()[(int) (Math.random() * Cards.values().length)];
						entry.getValue().add(cards);
						i++;
					}
					int sum = 0;
					for (int j = 0; j < entry.getValue().size(); j++) {
						sum += entry.getValue().get(j).getValue();
					}

					System.out.println(entry.getKey().getName() + "'s score is: " + sum);

				}
				boolean game = true;
				while (game) {
					System.out.println("Do you want to take another card?");
					String answer = Main.scanner.next();

					if (answer.equalsIgnoreCase("YES")) {
						Cards cards = Cards.values()[(int) (Math.random() * Cards.values().length)];
						entry.getValue().add(cards);
						int sum = 0;
						for (int j = 0; j < entry.getValue().size(); j++) {
							sum += entry.getValue().get(j).getValue();
						}

						if (sum > 21) {
							System.out.println("You lose.");
							playSound();
							game = false;
						}

						if (sum == 21) {
							System.out.println("YOU ARE WINNER!!!!!!!!");
							playSound_1();
						}

						System.out.println(entry.getKey().getName() + "'s score is: " + sum);

					} else if (answer.equalsIgnoreCase("NO")) {
						game = false;
					}
				}
			}
		}
	}

	public void playSound() {
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

	public void playSound_1() {
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

	public void playSound_2() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("D:/MusicPlayer/DesiJourney.wav").getAbsoluteFile());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

}
