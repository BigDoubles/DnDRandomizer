package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;

public class Tiefling extends Race {
	public Tiefling() {
		super(Races.TIEFLING);
		addClass(new Bard(), 2);
		addClass(new Cleric(), 3);
		addClass(new Druid(), 4);
		addClass(new Paladin(), 6);
		addClass(new Rogue(), 7);
		addClass(new Sorcerer(), 9);
		addClass(new Warlock(), 11);
		addClass(new Wizard(), 13);
	}
}
