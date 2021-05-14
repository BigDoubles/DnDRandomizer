package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;

public class Dragonborn extends dev.ashes.allisondnd.character.races.Dragonborn {

	public Dragonborn() {
		super("Dragonborn");
		addClass(new Barbarian(), 2);
		addClass(new Bard(), 4);
		addClass(new Cleric(), 5);
		addClass(new Fighter(), 7);
		addClass(new Monk(), 8);
		addClass(new Paladin(), 11);
		addClass(new Ranger(), 12);
		addClass(new Sorcerer(), 14);
		addClass(new Warlock(), 16);
	}

}
