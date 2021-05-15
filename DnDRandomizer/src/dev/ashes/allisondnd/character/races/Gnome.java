package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Gnome extends Race {

	public Gnome(String sub) {
		super(sub + " " + Races.GNOME.getName());
	}

}
