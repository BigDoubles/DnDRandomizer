package dev.ashes.allisondnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.races.sub.Aarakocra;
import dev.ashes.allisondnd.character.races.sub.AasimarFallen;
import dev.ashes.allisondnd.character.races.sub.AasimarProtector;
import dev.ashes.allisondnd.character.races.sub.AasimarScourge;
import dev.ashes.allisondnd.character.races.sub.Bugbear;
import dev.ashes.allisondnd.character.races.sub.DragonDraconblood;
import dev.ashes.allisondnd.character.races.sub.DragonDragonborn;
import dev.ashes.allisondnd.character.races.sub.DragonRavenite;
import dev.ashes.allisondnd.character.races.sub.DwarfDuergar;
import dev.ashes.allisondnd.character.races.sub.DwarfHill;
import dev.ashes.allisondnd.character.races.sub.DwarfMountain;
import dev.ashes.allisondnd.character.races.sub.ElfDark;
import dev.ashes.allisondnd.character.races.sub.ElfEladrin;
import dev.ashes.allisondnd.character.races.sub.ElfHighType1;
import dev.ashes.allisondnd.character.races.sub.ElfHighType2;
import dev.ashes.allisondnd.character.races.sub.ElfPallid;
import dev.ashes.allisondnd.character.races.sub.ElfSea;
import dev.ashes.allisondnd.character.races.sub.ElfType1;
import dev.ashes.allisondnd.character.races.sub.ElfType2;
import dev.ashes.allisondnd.character.races.sub.ElfWood;
import dev.ashes.allisondnd.character.races.sub.Firbolg;

public class CharacterRandomizer {

	private static List<Race> races = new ArrayList<>();

	public static void main(String[] args) {
		addRaces();
		
		//Window w = new Window();
		
		Random r = new Random();
		
		for(Race race : races) {
			System.out.println(race.getRaceName());
		}
	}

	private static void addRaces() {
		races.add(new Aarakocra());
		races.add(new AasimarFallen());
		races.add(new AasimarProtector());
		races.add(new AasimarScourge());
		races.add(new Bugbear());
		races.add(new DragonDraconblood());
		races.add(new DragonDragonborn());
		races.add(new DragonRavenite());
		races.add(new DwarfDuergar());
		races.add(new DwarfHill());
		races.add(new DwarfMountain());
		races.add(new ElfDark());
		races.add(new ElfEladrin());
		races.add(new ElfHighType1(ElfType1.GRAY));
		races.add(new ElfHighType1(ElfType1.SILVANESTI));
		races.add(new ElfHighType1(ElfType1.SUN));
		races.add(new ElfHighType1(ElfType1.VALLEY));
		races.add(new ElfHighType2(ElfType2.HIGH));
		races.add(new ElfHighType2(ElfType2.MOON));
		races.add(new ElfHighType2(ElfType2.QUALINESTI));
		races.add(new ElfPallid());
		races.add(new ElfSea());
		races.add(new ElfWood());
		races.add(new Firbolg());
		
	}

}
