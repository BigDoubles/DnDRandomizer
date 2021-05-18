package dev.ashes.allisondnd.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;
import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.Subrace;
import dev.ashes.allisondnd.character.races.Races;
import dev.ashes.allisondnd.character.races.sub.Subraces;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private List<Race> raceList;

	private JPanel racePanel, subracePanel, classPanel, subclassPanel, backgroundPanel;
	private JLabel raceLabel, subraceLabel, classLabel, subclassLabel, backgroundLabel;
	private JComboBox<Races> raceBox;
	private JComboBox<Subraces> subraceBox;
	private JComboBox<DndClass> classBox;
	private JComboBox<String> subclassBox;
	private JComboBox<Backgrounds> backgroundBox;
	private JButton randomRace, randomSubrace, randomClass, randomSubclass, randomBackground;
	
	private JTextField totalName;
	private JCheckBox randomCheckbox;
	

	Random r;

	public Window(List<Race> races) {
		super("DnD Randomizer");
		raceList = races;
		r = new Random();

		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		racePanel = new JPanel();
		subracePanel = new JPanel();
		classPanel = new JPanel();
		subclassPanel = new JPanel();
		backgroundPanel = new JPanel();

		raceLabel = new JLabel("Race: ");
		subraceLabel = new JLabel("SubRace: ");
		classLabel = new JLabel("Class: ");
		subclassLabel = new JLabel("Subclass: ");
		backgroundLabel = new JLabel("Backgound: ");

		raceBox = new JComboBox<Races>();
		subraceBox = new JComboBox<Subraces>();
		classBox = new JComboBox<DndClass>();
		subclassBox = new JComboBox<String>();
		backgroundBox = new JComboBox<Backgrounds>();

		randomRace = new JButton("Randomize Everything");
		randomSubrace = new JButton("Randomize Everything but Race");
		randomClass = new JButton("Randomize Only Class/Subclass/BG");
		randomSubclass = new JButton("Randomize Only Subclass");
		randomBackground = new JButton("Randomize Only Background");

		totalName = new JTextField();
		totalName.setEditable(false);
		totalName.setPreferredSize(new Dimension(500, 20));
		
		randomCheckbox = new JCheckBox("Use weighted Randomization (AKA your custom numbers)", true);
		
		for (Races race : Races.values()) {
			raceBox.addItem(race);
		}
		
		// Action event listener for buttons
		randomRace.addActionListener(a -> {
			randomizeRace();
			updateSubraceBox();
			randomizeSubrace();
			updateClassBox();
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateBackgroundBox();
			randomizeBackground();
			updateTotalName();
		});
		randomSubrace.addActionListener(a -> {
			updateSubraceBox();
			randomizeSubrace();
			updateClassBox();
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateBackgroundBox();
			randomizeBackground();
			updateTotalName();
		});
		randomClass.addActionListener(a -> {
			randomizeClass();
			updateSubclassBox();
			randomizeSubclass();
			updateBackgroundBox();
			randomizeBackground();
			updateTotalName();
		});
		randomSubclass.addActionListener(a -> {
			randomizeSubclass();
			updateBackgroundBox();
			randomizeBackground();
			updateTotalName();
		});
		randomBackground.addActionListener(a -> {
			randomizeBackground();
			updateTotalName();
		});
		
		
		// When choosing a new main race, set subraceBox to have subraces that are below it, if applicable
		raceBox.addActionListener(a -> {
			updateSubraceBox();
			updateClassBox();
			updateSubclassBox();
			updateBackgroundBox();
			updateTotalName();
		});
		subraceBox.addActionListener(a -> {
			updateClassBox();
			updateSubclassBox();
			updateBackgroundBox();
			updateTotalName();
		});
		classBox.addActionListener(a -> {
			updateSubclassBox();
			updateBackgroundBox();
			updateBackgroundBox();
			updateTotalName();
		});
		subclassBox.addActionListener(a -> {
			updateBackgroundBox();
			updateTotalName();
		});
		backgroundBox.addActionListener(a -> {
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
		backgroundPanel.add(backgroundLabel);
		backgroundPanel.add(backgroundBox);
		backgroundPanel.add(randomBackground);

		
		this.add(totalName);
		this.add(racePanel);
		this.add(subracePanel);
		this.add(classPanel);
		this.add(subclassPanel);
		this.add(backgroundPanel);
		this.add(randomCheckbox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550, 380);
		this.setResizable(false);
		
		updateClassBox();
		updateSubclassBox();
		updateBackgroundBox();
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
	
	// Randomizes the selected class 
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
		if(randomCheckbox.isSelected())	classBox.setSelectedItem(actualRace.getRandomClass());
		else classBox.setSelectedItem(classBox.getItemAt(r.nextInt(classBox.getItemCount())));
	}
	
	private void randomizeSubclass() {
		if(subclassBox.getItemCount() > 0) {
			subclassBox.setSelectedItem(subclassBox.getItemAt(r.nextInt(subclassBox.getItemCount())));
		}
	}
	
	private void randomizeBackground() {
		if(backgroundBox.getItemCount() > 0) {
			if(randomCheckbox.isSelected()) {
				backgroundBox.setSelectedItem(((DndClass) classBox.getSelectedItem()).getRandomBackground(getStarredItems()));
			}
		}
	}
	
	
	private void updateSubraceBox() {
		subraceBox.removeAllItems();
		for(Subraces race : Subraces.values()) {
			if(race.getParent() == raceBox.getSelectedItem()) subraceBox.addItem(race);
		}
	}
	
	private void updateClassBox() {
		
		List<DndClass> classList = null;
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
		for(DndClass c : classList) {
			classBox.addItem(c);
		}
	}
	
	private void updateSubclassBox() {
		if(classBox.getSelectedItem() == null) return;
		subclassBox.removeAllItems();
		List<String> subclasses = ((IClasses) classBox.getSelectedItem()).getSubClasses();
		for(String s : subclasses) subclassBox.addItem(s);
	}
	
	private void updateBackgroundBox() {
		if(classBox.getSelectedItem() == null || subclassBox.getSelectedItem() == null) return;
		backgroundBox.removeAllItems();
		
		for(Backgrounds bg : ((DndClass) classBox.getSelectedItem()).getBackgroundsList(getStarredItems())) {
			backgroundBox.addItem(bg);
		}
	}
	
	private void updateTotalName() {
		if(raceBox.getSelectedItem() == null || classBox.getSelectedItem() == null || subclassBox.getSelectedItem() == null) return;
		
		if(subraceBox.getSelectedItem() == null) totalName.setText(raceBox.getSelectedItem().toString());
		else totalName.setText(raceBox.getSelectedItem().toString() + ", " + subraceBox.getSelectedItem().toString());
		totalName.setText(totalName.getText() + ", " + classBox.getSelectedItem().toString() + ", " + subclassBox.getSelectedItem() + ", " + backgroundBox.getSelectedItem());
		
		// Add a second * to the second item in title if needed
		String text = totalName.getText();
		if(text.contains("*")) {
			int x = text.indexOf("*");
			String pt1 = text.substring(0, x+1);
			String pt2 = text.substring(x+1);
			
			if(pt2.contains("*")) {
				x = pt2.indexOf("*");
				String pt3 = pt2.substring(0, x+1);
				String pt4 = pt2.substring(x+1);
				totalName.setText(pt1 + pt3 + "*" + pt4);
			}
		}
	}
	
	// Checks if 2 of the items already have stars
	// Used for determining Backgrounds generation
	private boolean getStarredItems() {
		int x = 0;
		if(raceBox.getSelectedItem().toString().contains("*")) x++;
		if(subclassBox.getSelectedItem().toString().contains("*")) x++;
		if(subraceBox.getSelectedItem() != null && subraceBox.getSelectedItem().toString().contains("*")) x++;
		return x < 2;
	}
}
