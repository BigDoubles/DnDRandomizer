package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Cleric;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Warlock;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Aasimar;

public class AasimarProtector extends Aasimar {
	public AasimarProtector() {
		super(Subraces.AASIMARPROTECTOR.getName());
		addClass(new Bard(), 2);
		addClass(new Cleric(), 5);
		addClass(new Druid(), 7);
		addClass(new Monk(), 8);
		addClass(new Paladin(), 11);
		addClass(new Ranger(), 12);
		addClass(new Sorcerer(), 14);
		addClass(new Warlock(), 17);
		addClass(new Wizard(), 18);
	}
}
