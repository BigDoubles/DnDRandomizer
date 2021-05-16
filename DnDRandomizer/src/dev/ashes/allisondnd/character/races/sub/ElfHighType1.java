package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Elf;

public class ElfHighType1 extends Elf {

	public ElfHighType1(ElfType1 et1) {
		super(et1.getName() + " " + Subraces.ELFHIGHTYPE1.getName());
		addClass(new Bard(), 1);
		addClass(new Druid(), 2);
		addClass(new Fighter(), 3);
		addClass(new Monk(), 5);
		addClass(new Ranger(), 7);
		addClass(new Rogue(), 10);
		addClass(new Wizard(), 12);
	}

}
