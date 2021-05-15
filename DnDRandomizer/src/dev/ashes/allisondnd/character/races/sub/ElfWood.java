package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Elf;

public class ElfWood extends Elf {

	public ElfWood() {
		super(Subraces.ELFWOOD.getName());
		addClass(new Bard(), 1);
		addClass(new Cleric(), 3);
		addClass(new Druid(), 5);
		addClass(new Fighter(), 6);
		addClass(new Monk(), 9);
		addClass(new Paladin(), 10);
		addClass(new Ranger(), 13);
		addClass(new Rogue(), 15);
		addClass(new Warlock(), 16);
		addClass(new Wizard(), 17);
	}

}
