package dev.ashes.allisondnd.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.ashes.allisondnd.character.races.Races;

public abstract class Race {
	private List<IClasses> classes;
	private List<Integer> classWeights;
	protected Races mainRace;

	public Race(Races race) {
		classes = new ArrayList<IClasses>();
		classWeights = new ArrayList<Integer>();

		mainRace = race;
	}

	protected final void addClass(IClasses name, int weight) {
		classes.add(name);
		classWeights.add(weight);
	}
	
	public Races getMainRace() {
		return mainRace;
	}
	
	public String getFullRaceName() {
		return mainRace.toString();
	}

	// Returns all info about the race, including class "weights"
	public String getRaceInfo() {
		String info = getFullRaceName() + ": ";
		for (int x = 0; x < classes.size(); x++) {
			info += classes.get(x).toString() + " (" + classWeights.get(x) + "), ";
		}
		return info.substring(0, info.length() - 2);
	}
	
	public List<IClasses> getClassesList(){
		return classes;
	}

	// Simply returns a random class in the list with correct probabilities
	public String getRandomClassName() {
		Random r = new Random();
		return getClassName(r.nextInt(getMaxDiceValue())).toString();
	}
	
	// Simply returns a random class in the list with correct probabilities
	public IClasses getRandomClass() {
		Random r = new Random();
		return getClassName(r.nextInt(getMaxDiceValue()));
	}

	// Returns the value that is greatest without going over
	public IClasses getClassName(int roll) {
		if (roll <= classWeights.get(0))
			return classes.get(0);
		for (int x = 1; x < classWeights.size(); x++) {
			if (classWeights.get(x - 1) < roll && roll <= classWeights.get(x))
				return classes.get(x);
		}
		return null;
	}

	// Returns max value for a dice roll
	public int getMaxDiceValue() {
		return classWeights.get(classWeights.size() - 1);
	}

}
