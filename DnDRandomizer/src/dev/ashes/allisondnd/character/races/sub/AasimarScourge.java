package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.races.Aasimar;

public class AasimarScourge extends Aasimar {
	public AasimarScourge() {
		super(Subraces.AASIMARSCOURGE.getName());
		addClass(new Barbarian(), 1);
		addClass(new Bard(), 3);
		addClass(new Cleric(), 4);
		addClass(new Fighter(), 5);
		addClass(new Paladin(), 7);
		addClass(new Sorcerer(), 10);
		addClass(new Warlock(), 12);
	}
}
