package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public abstract class Genasi extends Race {
	public Genasi(String sub) {
		super(sub + " " + Races.GENASI.getName());
	}
}
