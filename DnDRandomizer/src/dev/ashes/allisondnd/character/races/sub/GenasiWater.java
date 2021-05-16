package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Genasi;

public class GenasiWater extends Genasi {
	public GenasiWater() {
		setSubrace(Subraces.GENASIWATER);
		addClass(new Barbarian(), 1);
		addClass(new Cleric(), 3);
		addClass(new Druid(), 5);
		addClass(new Fighter(), 6);
		addClass(new Monk(), 7);
		addClass(new Paladin(), 8);
		addClass(new Ranger(), 9);
		addClass(new Sorcerer(), 10);
		addClass(new Warlock(), 11);
		addClass(new Wizard(), 12);
	}
}
