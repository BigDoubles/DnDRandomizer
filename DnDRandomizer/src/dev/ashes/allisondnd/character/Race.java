package dev.ashes.allisondnd.character;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
	private List<String> subRace;
	private List<String> classes;
	private List<Integer> classWeights;
	private String raceName;

	public Race(String name) {
		subRace = new ArrayList<String>();
		classes = new ArrayList<String>();
		classWeights = new ArrayList<Integer>();
		raceName = name;
	}
	
	protected final void addRace(String race) {
		subRace.add(race);
	}
	
	protected final void addClass(String name, int weight) {
		classes.add(name);
		classWeights.add(weight);
	}

	public final String[] getSubraces() {
		String[] list = new String[subRace.size()];
		for(int x = 0; x < list.length; x++) {
			list[x] = subRace.get(x);
		}
		return list;
	}

	public final String getRaceName() {
		return raceName;
	}
}
