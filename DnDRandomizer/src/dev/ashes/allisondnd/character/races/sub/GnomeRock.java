package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Druid;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.classes.Wizard;
import dev.ashes.allisondnd.character.races.Gnome;

public class GnomeRock extends Gnome {
	public GnomeRock() {
		super(Subraces.GNOMEROCK.getName());
		addClass(new Barbarian(), 1);
		addClass(new Druid(), 2);
		addClass(new Fighter(), 3);
		addClass(new Rogue(), 4);
		addClass(new Sorcerer(), 5);
		addClass(new Wizard(), 7);
	}
}
