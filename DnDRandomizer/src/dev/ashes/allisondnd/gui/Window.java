package dev.ashes.allisondnd.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dev.ashes.allisondnd.character.IClasses;
import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.Subrace;
import dev.ashes.allisondnd.character.races.Races;
import dev.ashes.allisondnd.character.races.sub.Subraces;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private List<Race> raceList;

	private JPanel racePanel, subracePanel, classPanel, subclassPanel;
	private JLabel raceLabel, subraceLabel, classLabel, subclassLabel;
	private JTextField totalName;
	
	private JComboBox<Races> raceBox;
	private JComboBox<Subraces> subraceBox;
	private JComboBox<IClasses> classBox;
	private JComboBox<String> subclassBox;
	private JButton randomRace, randomSubrace, randomClass, randomSubclass;

	Random r;

	public Window(List<Race> races) {
		super("DnD Randomizer");
		raceList = races;
		r = new Random();

		this.setLayout(new FlowLayout());
		racePanel = new JPanel();
		subracePanel = new JPanel();
		classPanel = new JPanel();
		subclassPanel = new JPanel();

		raceLabel = new JLabel("Race: ");
		subraceLabel = new JLabel("SubRace: ");
		classLabel = new JLabel("Class: ");
		subclassLabel = new JLabel("Subclass: ");

		raceBox = new JComboBox<Races>();
		subraceBox = new JComboBox<Subraces>();
		classBox = new JComboBox<IClasses>();
		subclassBox = new JComboBox<String>();

		randomRace = new JButton("Randomize Race/Subrace/Classes");
		randomSubrace = new JButton("Randomize Only Subrace/Classes");
		randomClass = new JButton("Randomize Only Class/Subclass");
		randomSubclass = new JButton("Randomize Only Subclass");

		totalName = new JTextField();
		totalName.setEditable(false);
		totalName.setPreferredSize(new Dimension(500, 20));
		
		for (Races race : Races.values()) {
			raceBox.addItem(race);
		}
		
		// TODO fix this for pressing button as checklist is null for some reason, but n
		// Action event listener for buttons
		randomRace.addActionListener(a -> {
			randomizeRace();
			updateSubraceBox();
			randomizeSubrace();
			updateClassBox();
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateTotalName();
		});
		randomSubrace.addActionListener(a -> {
			updateSubraceBox();
			randomizeSubrace();
			updateClassBox();
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateTotalName();
		});
		randomClass.addActionListener(a -> {
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateTotalName();
		});
		randomSubclass.addActionListener(a -> {
			randomizeSubclass();
			updateTotalName();
		});
		
		
		// When choosing a new main race, set subraceBox to have subraces that are below it, if applicable
		raceBox.addActionListener(a -> {
			updateSubraceBox();
			updateClassBox();
			updateSubclassBox();
			updateTotalName();
		});
		subraceBox.addActionListener(a -> {
			updateClassBox();
			updateSubclassBox();
			updateTotalName();
		});
		classBox.addActionListener(a -> {
			updateSubclassBox();
			updateTotalName();
		});
		subclassBox.addActionListener(a -> {
			updateTotalName();
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
		subclassPanel.add(subclassLabel);
		subclassPanel.add(subclassBox);
		subclassPanel.add(randomSubclass);

		
		this.add(totalName);
		this.add(racePanel);
		this.add(subracePanel);
		this.add(classPanel);
		this.add(subclassPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 380);
		this.setResizable(false);
		
		updateClassBox();
		updateSubclassBox();
		updateTotalName();
		
		this.setVisible(true);
	}
	
	private void randomizeRace() {
		raceBox.setSelectedItem(raceBox.getItemAt(r.nextInt(raceBox.getItemCount())));
	}
	
	private void randomizeSubrace() {
		if(subraceBox.getItemCount() > 0) {
			subraceBox.setSelectedItem(subraceBox.getItemAt(r.nextInt(subraceBox.getItemCount())));
		}
	}
	
	private void randomizeClass() {
		Race actualRace = null;
		for(Race r : raceList) {
			if(r.getMainRace() == raceBox.getSelectedItem()) {
				if(r instanceof Subrace) {
					if( ((Subrace) r).getSubrace() == subraceBox.getSelectedItem()){
						actualRace = r;
						break;
					}
				}else {
					actualRace = r;
					break;
				}
			}
		}
		classBox.setSelectedItem(actualRace.getRandomClass());
	}
	
	private void randomizeSubclass() {
		if(subclassBox.getItemCount() > 0) {
			subclassBox.setSelectedItem(subclassBox.getItemAt(r.nextInt(subclassBox.getItemCount())));
		}
	}
	
	private void updateSubraceBox() {
		subraceBox.removeAllItems();
		for(Subraces race : Subraces.values()) {
			if(race.getParent() == raceBox.getSelectedItem()) subraceBox.addItem(race);
		}
	}
	
	private void updateClassBox() {
		
		List<IClasses> classList = null;
		classBox.removeAllItems();
		for(Race r : raceList) {
			if(r.getMainRace() == raceBox.getSelectedItem()) {
				if(r instanceof Subrace) {
					if( ((Subrace) r).getSubrace() == subraceBox.getSelectedItem()){
						classList = r.getClassesList();
						break;
					}
				}else {
					classList = r.getClassesList();
					break;
				}
			}
		}
		if(classList == null) return;
		for(IClasses c : classList) {
			classBox.addItem(c);
		}
	}
	
	private void updateSubclassBox() {
		if(classBox.getSelectedItem() == null) return;
		subclassBox.removeAllItems();
		List<String> subclasses = ((IClasses) classBox.getSelectedItem()).getSubClasses();
		for(String s : subclasses) subclassBox.addItem(s);
	}
	
	private void updateTotalName() {
		if(raceBox.getSelectedItem() == null || classBox.getSelectedItem() == null) return;
		
		if(subraceBox.getSelectedItem() == null) {
			totalName.setText(raceBox.getSelectedItem().toString());
		}else {
			totalName.setText(subraceBox.getSelectedItem().toString() + " " + raceBox.getSelectedItem().toString());
		}
		totalName.setText(totalName.getText() + ", " + classBox.getSelectedItem().toString() + " - " + subclassBox.getSelectedItem());
	}
}
