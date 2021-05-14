package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;

public class Arakocra extends Race {
	public Arakocra() {
		super("Arakocra");
		addRace("Fallen");
		addRace("Protector");
		addRace("Scourge");

		addClass("Bard", 1);
		addClass("Cleric", 3);
		addClass("Druid ", 5);
		addClass("Fighter", 6);
		addClass("Monk", 9);
		addClass("Paladin", 10);
		addClass("Ranger", 13);
		addClass("Rogue", 15);
		addClass("Warlock", 16);
		addClass("Wizard", 17);
	}
}
