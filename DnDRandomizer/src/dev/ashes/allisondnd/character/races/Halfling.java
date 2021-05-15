package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Halfling extends Race {
	public Halfling(String sub) {
		super(sub + " " + Races.HALFLING.getName());
	}
}
