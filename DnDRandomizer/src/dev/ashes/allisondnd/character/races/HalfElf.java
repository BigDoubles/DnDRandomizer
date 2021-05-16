package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;

public class HalfElf extends Race {
	public HalfElf() {
		super(Races.HALFELF);
		addClass(new Barbarian(), 3);
		addClass(new Bard(), 6);
		addClass(new Cleric(), 9);
		addClass(new Druid(), 12);
		addClass(new Fighter(), 16);
		addClass(new Monk(), 20);
		addClass(new Paladin(), 24);
		addClass(new Ranger(), 28);
		addClass(new Rogue(), 31);
		addClass(new Sorcerer(), 34);
		addClass(new Warlock(), 37);
		addClass(new Wizard(), 40);
	}
}
