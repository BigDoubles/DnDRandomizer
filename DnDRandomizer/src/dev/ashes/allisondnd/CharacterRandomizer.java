package dev.ashes.allisondnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.races.Aarakocra;
import dev.ashes.allisondnd.character.races.Bugbear;
import dev.ashes.allisondnd.character.races.Dragonborn;
import dev.ashes.allisondnd.character.races.Dwarf;
import dev.ashes.allisondnd.character.races.Elf;
import dev.ashes.allisondnd.character.races.Firbolg;
import dev.ashes.allisondnd.character.races.Genasi;
import dev.ashes.allisondnd.character.races.Gnome;
import dev.ashes.allisondnd.character.races.Goblin;
import dev.ashes.allisondnd.character.races.Goliath;
import dev.ashes.allisondnd.character.races.HalfElf;
import dev.ashes.allisondnd.character.races.HalfOrc;
import dev.ashes.allisondnd.character.races.Halfling;
import dev.ashes.allisondnd.character.races.Hobgoblin;
import dev.ashes.allisondnd.character.races.Human;
import dev.ashes.allisondnd.character.races.Kenku;
import dev.ashes.allisondnd.character.races.OrcOfExandria;
import dev.ashes.allisondnd.character.races.Tabaxi;
import dev.ashes.allisondnd.character.races.Tiefling;
import dev.ashes.allisondnd.character.races.Tortle;
import dev.ashes.allisondnd.character.races.sub.Fallen;
import dev.ashes.allisondnd.character.races.sub.Protector;

public class CharacterRandomizer {

	private static List<Race> races = new ArrayList<>();

	public static void main(String[] args) {
		addRaces();
		Random r = new Random();
		Race f = new Fallen();
		for(int x = 0; x < 17; x++) {
			int d = r.nextInt(f.getMaxDiceValue())+1;
			System.out.println("Dice " + (x+1) + ": " + f.getClassName(x+1));
		}
	}

	private static void addRaces() {
		races.add(new Aarakocra());
		races.add(new Fallen());
		races.add(new Protector());
		/*races.add(new Bugbear());
		races.add(new Dragonborn());
		races.add(new Dwarf());
		races.add(new Elf());
		races.add(new Firbolg());
		races.add(new Genasi());
		races.add(new Gnome());
		races.add(new Goblin());
		races.add(new Goliath());
		races.add(new HalfElf());
		races.add(new Halfling());
		races.add(new HalfOrc());
		races.add(new Hobgoblin());
		races.add(new Human());
		races.add(new Kenku());
		races.add(new OrcOfExandria());
		races.add(new Tabaxi());
		races.add(new Tiefling());
		races.add(new Tortle());*/
	}

}
