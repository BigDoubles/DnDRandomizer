package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Paladin;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.races.Dwarf;

public class DwarfMountain extends Dwarf {

	public DwarfMountain() {
		setSubrace(Subraces.DWARFMOUNTAIN);
		addClass(new Barbarian(), 3);
		addClass(new Fighter(), 6);
		addClass(new Monk(), 7);
		addClass(new Paladin(), 8);
		addClass(new Ranger(), 9);
		addClass(new Sorcerer(), 10);
	}

}
