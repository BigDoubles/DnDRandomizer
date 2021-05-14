package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Elf;

public class Eladrin extends Elf {

	public Eladrin() {
		super("Eladrin");
		addClass(new Bard(), 1);
		addClass(new Druid(), 2);
		addClass(new Fighter(), 3);
		addClass(new Monk(), 5);
		addClass(new Ranger(), 7);
		addClass(new Rogue(), 10);
		addClass(new Wizard(), 12);
	}

}
