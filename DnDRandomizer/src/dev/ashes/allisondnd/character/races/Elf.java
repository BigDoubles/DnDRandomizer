package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Elf extends Race {
	public Elf(String name) {
		super(name + " " + Races.ELF.getName());
	}

}
