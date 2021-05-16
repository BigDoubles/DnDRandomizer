package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.classes.Barbarian;
import dev.ashes.allisondnd.character.classes.Bard;
import dev.ashes.allisondnd.character.classes.Fighter;
import dev.ashes.allisondnd.character.classes.Monk;
import dev.ashes.allisondnd.character.classes.Ranger;
import dev.ashes.allisondnd.character.classes.Rogue;
import dev.ashes.allisondnd.character.classes.Sorcerer;
import dev.ashes.allisondnd.character.races.Elf;

public class ElfSea extends Elf {

	public ElfSea() {
		setSubrace(Subraces.ELFSEA);
		addClass(new Barbarian(), 1);
		addClass(new Bard(), 2);
		addClass(new Fighter(), 4);
		addClass(new Monk(), 6);
		addClass(new Ranger(), 8);
		addClass(new Rogue(), 10);
		addClass(new Sorcerer(), 11);
	}

}
