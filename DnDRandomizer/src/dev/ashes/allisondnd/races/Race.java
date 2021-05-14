package dev.ashes.allisondnd.races;

import java.util.ArrayList;
import java.util.List;

public abstract class Race {
	protected List<String> subRace;
	protected String raceName;
	
	public Race(String name) {
		subRace = new ArrayList<String>();
		raceName = name;
	}
	
	public final List<String> getRaces() {
		return subRace;
	}
	
	public final String getRaceName() {
		return raceName;
	}
}
