package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Dragonborn extends Race {
	// Dragonborn can be a plain dragon born so empty sub-type exception needed
	public Dragonborn() {
		super(Races.DRAGONBORN.getName());
	}
	
	public Dragonborn(String name) {
		super(name + " " + Races.DRAGONBORN.getName());
	}
}
