package dev.ashes.allisondnd.character.races;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Sorcerer;

public class Goliath extends Race {

	public Goliath() {
		super(Races.GOLIATH);
		addClass(new Barbarian(), 3);
		addClass(new Fighter(), 6);
		addClass(new Monk(), 7);
		addClass(new Paladin(), 8);
		addClass(new Ranger(), 9);
		addClass(new Sorcerer(), 10);
	}

}
