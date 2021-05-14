package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.races.Elf;

public class Dark extends Elf {

	public Dark() {
		super("Dark");
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
