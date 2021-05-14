package dev.ashes.allisondnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.ashes.allisondnd.races.Aasimar;
import dev.ashes.allisondnd.races.Arakocra;
import dev.ashes.allisondnd.races.Bugbear;
import dev.ashes.allisondnd.races.Dragonborn;
import dev.ashes.allisondnd.races.Dwarf;
import dev.ashes.allisondnd.races.Elf;
import dev.ashes.allisondnd.races.Firbolg;
import dev.ashes.allisondnd.races.Genasi;
import dev.ashes.allisondnd.races.Gnome;
import dev.ashes.allisondnd.races.Goblin;
import dev.ashes.allisondnd.races.Goliath;
import dev.ashes.allisondnd.races.HalfElf;
import dev.ashes.allisondnd.races.HalfOrc;
import dev.ashes.allisondnd.races.Halfling;
import dev.ashes.allisondnd.races.Hobgoblin;
import dev.ashes.allisondnd.races.Human;
import dev.ashes.allisondnd.races.Kenku;
import dev.ashes.allisondnd.races.OrcOfExandria;
import dev.ashes.allisondnd.races.Race;
import dev.ashes.allisondnd.races.Tabaxi;
import dev.ashes.allisondnd.races.Tiefling;
import dev.ashes.allisondnd.races.Tortle;

public class CharacterRandomizer {

	private static List<Race> races = new ArrayList<>();
	
	public static void main(String[] args) {
		addRaces();
		Random r = new Random();
		for(int a = 0; a < 20; a++)
			System.out.println(a+1 + ": " + races.get(r.nextInt(races.size())).getRaceName());
	}
	
	private static void addRaces() {
		races.add(new Aasimar());
		races.add(new Arakocra());
		races.add(new Bugbear());
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
		races.add(new Tortle());
	}

}
