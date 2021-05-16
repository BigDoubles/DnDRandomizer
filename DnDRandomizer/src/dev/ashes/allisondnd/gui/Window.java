package dev.ashes.allisondnd.gui;

import java.awt.FlowLayout;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.races.Races;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private List<Race> raceList;

	private JPanel racePanel, subracePanel, classPanel;
	private JLabel raceLabel, subraceLabel, classLabel;
	private JComboBox<String> raceBox, subraceBox, classBox;
	private JButton randomEverything, randomRace, randomSubrace, randomClass;

	Random r;

	public Window(List<Race> races) {
		super("DnD Randomizer");
		raceList = races;
		r = new Random();

		this.setLayout(new FlowLayout());
		racePanel = new JPanel();
		subracePanel = new JPanel();
		classPanel = new JPanel();

		raceLabel = new JLabel("Race: ");
		subraceLabel = new JLabel("SubRace: ");
		classLabel = new JLabel("Class: ");

		raceBox = new JComboBox<String>();
		subraceBox = new JComboBox<String>();
		classBox = new JComboBox<String>();

		randomEverything = new JButton("Randomize Literally Everything");
		randomRace = new JButton("Randomize Only Race");
		randomSubrace = new JButton("Randomize Only Subrace");
		randomClass = new JButton("Randomize Only Class");

		raceBox.addItem(" - ");
		for (Races f : Races.values()) {
			raceBox.addItem(f.getName());
		}

		// Action event listener for buttons
		randomRace.addActionListener(e -> {
			// Removes the - for the blank option in the Combo box while still randomizing it
			raceBox.setSelectedItem(raceBox.getItemAt(r.nextInt(raceBox.getItemCount() - 1) + 1));
		});

		racePanel.add(raceLabel);
		racePanel.add(raceBox);
		racePanel.add(randomRace);
		subracePanel.add(subraceLabel);
		subracePanel.add(subraceBox);
		subracePanel.add(randomSubrace);
		classPanel.add(classLabel);
		classPanel.add(classBox);
		classPanel.add(randomClass);

		this.add(randomEverything);
		this.add(racePanel);
		this.add(subracePanel);
		this.add(classPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 380);
		this.setResizable(false);
		this.setVisible(true);
	}

}
