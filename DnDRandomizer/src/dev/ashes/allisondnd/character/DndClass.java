package dev.ashes.allisondnd.character;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class DndClass implements IClasses{
	// Starred contain both starred and unstarred items
	private List<Backgrounds> backgrounds, bgStarred;
	private List<Integer> bgWeights, bgWeightsStarred;
	
	public DndClass() {
		backgrounds = new ArrayList<Backgrounds>();
		bgWeights = new ArrayList<Integer>();
		bgStarred = new ArrayList<Backgrounds>();
		bgWeightsStarred = new ArrayList<Integer>();
		
	}

	protected final void addBackground(Backgrounds name, int weight) {
		if(!name.toString().contains("*")) {
			backgrounds.add(name);
			bgWeights.add(weight);
		}
		bgStarred.add(name);
		bgWeightsStarred.add(weight);
	}
	
	// Returns backgrounds based on if the function should return from the starred group or not
	public List<Backgrounds> getBackgroundsList(boolean isStarred){
		if(isStarred) return bgStarred;
		return backgrounds;
	}
	
	// Simply returns a random background in the list with correct probabilities
	// isStarred includes the starred values from bgStarred 
	public Backgrounds getRandomBackground(boolean isStarred) {
		Random r = new Random();
		if(isStarred) return getBackground(r.nextInt(getMaxDiceValue(bgWeightsStarred)), bgStarred, bgWeightsStarred);
		return getBackground(r.nextInt(getMaxDiceValue(bgWeights)), backgrounds, bgWeights);
	}

	// Returns the value that is greatest without going over
	private Backgrounds getBackground(int roll, List<Backgrounds> list, List<Integer> weights) {
		if (roll <= bgWeights.get(0))
			return backgrounds.get(0);
		for (int x = 1; x < bgWeights.size(); x++) {
			if (bgWeights.get(x - 1) < roll && roll <= bgWeights.get(x))
				return backgrounds.get(x);
		}
		return null;
	}

	// Returns max value for a dice roll
	private int getMaxDiceValue(List<Integer> list) {
		return list.get(list.size() - 1);
	}
}
