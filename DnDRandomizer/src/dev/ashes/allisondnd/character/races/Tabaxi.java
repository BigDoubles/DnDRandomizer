package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;

public class Tabaxi extends Race {
	public Tabaxi() {
		super(Races.TABAXI);
		addClass(new Bard(), 3);
		addClass(new Cleric(), 4);
		addClass(new Fighter(), 5);
		addClass(new Monk(), 7);
		addClass(new Paladin(), 9);
		addClass(new Ranger(), 11);
		addClass(new Rogue(), 13);
		addClass(new Sorcerer(), 15);
		addClass(new Warlock(), 17);
	}
}
