package dev.ashes.allisondnd.character;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
	private List<IClasses> classes;
	private List<Integer> classWeights;
	private String raceName;

	public Race(String name) {
		classes = new ArrayList<IClasses>();
		classWeights = new ArrayList<Integer>();
		raceName = name;
	}
	
	protected final void addClass(IClasses name, int weight) {
		classes.add(name);
		classWeights.add(weight);
	}

	
	public String getRaceName() {
		return raceName;
	}
	
	public String getRaceInfo() {
		String info = raceName + ": ";
		for(int x = 0; x < classes.size(); x++) {
			info += classes.get(x).getName() + " (" + classWeights.get(x) + "), ";
		}
		return info.substring(0, info.length()-2);
	}

	/* TODO ensure that functionality is correct
	 * Takes a random "dice" roll and returns the value that is greatest without going over
	 */
	public String getClassName(int roll) {
		if(roll <= classWeights.get(0)) return classes.get(0).getName();
		for(int x = 1; x < classWeights.size(); x++) {
			if(classWeights.get(x-1) < roll && roll <= classWeights.get(x))
				return classes.get(x).getName();
		}
		return "Invalid Dice Roll";
	}
	
	// Returns max value for a dice roll
	public int getMaxDiceValue() {
		return classWeights.get(classWeights.size()-1);
	}
}
