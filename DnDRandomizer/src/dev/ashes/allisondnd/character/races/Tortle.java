package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;

public class Tortle extends Race {
	public Tortle() {
		super(Races.TORTLE);
		addClass(new Barbarian(), 2);
		addClass(new Cleric(), 4);
		addClass(new Druid(), 6);
		addClass(new Fighter(), 8);
		addClass(new Monk(), 10);
		addClass(new Paladin(), 12);
		addClass(new Ranger(), 14);
		addClass(new Warlock(), 15);
		addClass(new Wizard(), 16);
	}
}
