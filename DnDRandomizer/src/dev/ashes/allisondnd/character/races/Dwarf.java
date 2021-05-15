package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Dwarf extends Race {
	public Dwarf(String name) {
		super(name + " " + Races.DWARF.getName());
	}
}
