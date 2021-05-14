package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;

public class Bugbear extends Race {

	public Bugbear() {
		super("Bugbear");
		addClass(new Barbarian(), 2);
		addClass(new Bard(), 3);
		addClass(new Fighter(), 6);
		addClass(new Monk(), 9);
		addClass(new Paladin(), 10);
		addClass(new Ranger(), 13);
		addClass(new Rogue(), 15);
	}

}
