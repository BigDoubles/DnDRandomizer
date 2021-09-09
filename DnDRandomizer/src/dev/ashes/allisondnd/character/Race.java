package dev.ashes.allisondnd.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.ashes.allisondnd.character.races.Races;

public abstract class Race {
	private List<DndClass> classes;
	private List<Integer> classWeights;
	protected Races mainRace;

	public Race(Races race) {
		classes = new ArrayList<DndClass>();
		classWeights = new ArrayList<Integer>();

		mainRace = race;
	}

	protected final void addClass(DndClass name, int weight) {
		classes.add(name);
		classWeights.add(weight);
	}
	
	public Races getMainRace() {
		return mainRace;
	}
	
	public String getFullRaceName() {
		return mainRace.toString();
	}
	
	public List<DndClass> getClassesList(){
		return classes;
	}

	// Simply returns a random class in the list with correct probabilities
	public String getRandomClassName() {
		return getClassName(getRandomRoll()).toString();
	}
	
	// Simply returns a random class in the list with correct probabilities
	public DndClass getRandomClass() {
		return getClassName(getRandomRoll());
	}

	// Returns the value that is greatest without going over
	public DndClass getClassName(int roll) {
		if (roll <= classWeights.get(0))
			return classes.get(0);
		for (int x = 1; x < classWeights.size(); x++) {
			if (classWeights.get(x - 1) < roll && roll <= classWeights.get(x))
				return classes.get(x);
		}
		return null;
	}

	// Returns max value for a dice roll
	private int getMaxDiceValue() {
		return classWeights.get(classWeights.size() - 1);
	}
	
	// Returns a random dice roll offset by one as Allison's list is not 0 indexed
	private int getRandomRoll() {
		Random r = new Random();
		return r.nextInt(getMaxDiceValue()) + 1;
	}
}
