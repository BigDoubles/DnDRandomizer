package dev.ashes.allisondnd;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Race;
import dev.ashes.allisondnd.character.races.Aarakocra;
import dev.ashes.allisondnd.character.races.Bugbear;
import dev.ashes.allisondnd.character.races.Firbolg;
import dev.ashes.allisondnd.character.races.Goblin;
import dev.ashes.allisondnd.character.races.Goliath;
import dev.ashes.allisondnd.character.races.HalfElf;
import dev.ashes.allisondnd.character.races.HalfOrc;
import dev.ashes.allisondnd.character.races.Hobgoblin;
import dev.ashes.allisondnd.character.races.Kenku;
import dev.ashes.allisondnd.character.races.OrcOfExandria;
import dev.ashes.allisondnd.character.races.Tabaxi;
import dev.ashes.allisondnd.character.races.Tiefling;
import dev.ashes.allisondnd.character.races.Tortle;
import dev.ashes.allisondnd.character.races.sub.AasimarFallen;
import dev.ashes.allisondnd.character.races.sub.AasimarProtector;
import dev.ashes.allisondnd.character.races.sub.AasimarScourge;
import dev.ashes.allisondnd.character.races.sub.DragonDraconblood;
import dev.ashes.allisondnd.character.races.sub.DragonDragonborn;
import dev.ashes.allisondnd.character.races.sub.DragonRavenite;
import dev.ashes.allisondnd.character.races.sub.DwarfDuergar;
import dev.ashes.allisondnd.character.races.sub.DwarfHill;
import dev.ashes.allisondnd.character.races.sub.DwarfMountain;
import dev.ashes.allisondnd.character.races.sub.ElfDark;
import dev.ashes.allisondnd.character.races.sub.ElfEladrin;
import dev.ashes.allisondnd.character.races.sub.ElfHigh;
import dev.ashes.allisondnd.character.races.sub.ElfPallid;
import dev.ashes.allisondnd.character.races.sub.ElfSea;
import dev.ashes.allisondnd.character.races.sub.ElfWood;
import dev.ashes.allisondnd.character.races.sub.GenasiAir;
import dev.ashes.allisondnd.character.races.sub.GenasiEarth;
import dev.ashes.allisondnd.character.races.sub.GenasiFire;
import dev.ashes.allisondnd.character.races.sub.GenasiWater;
import dev.ashes.allisondnd.character.races.sub.GnomeForest;
import dev.ashes.allisondnd.character.races.sub.GnomeRock;
import dev.ashes.allisondnd.character.races.sub.HalflingLightfoot;
import dev.ashes.allisondnd.character.races.sub.HalflingLotusden;
import dev.ashes.allisondnd.character.races.sub.HalflingStout;
import dev.ashes.allisondnd.character.races.sub.HumanCalishite;
import dev.ashes.allisondnd.character.races.sub.HumanChondathan;
import dev.ashes.allisondnd.character.races.sub.HumanDamaran;
import dev.ashes.allisondnd.character.races.sub.HumanIlluskan;
import dev.ashes.allisondnd.character.races.sub.HumanMulan;
import dev.ashes.allisondnd.character.races.sub.HumanRashemi;
import dev.ashes.allisondnd.character.races.sub.HumanShou;
import dev.ashes.allisondnd.character.races.sub.HumanTethyrian;
import dev.ashes.allisondnd.character.races.sub.HumanTurami;
import dev.ashes.allisondnd.character.races.sub.Subraces;
import dev.ashes.allisondnd.gui.Window;

public class CharacterRandomizer {

	private static List<Race> races = new ArrayList<>();

	public static void main(String[] args) {
		addRaces();

		new Window(races);
	}

	private static void addRaces() {
		races.add(new Aarakocra());
		races.add(new Bugbear());
		races.add(new Firbolg());
		races.add(new Goblin());
		races.add(new Goliath());
		races.add(new HalfElf());
		races.add(new HalfOrc());
		races.add(new Hobgoblin());
		races.add(new Kenku());
		races.add(new OrcOfExandria());
		races.add(new Tabaxi());
		races.add(new Tiefling());
		races.add(new Tortle());

		races.add(new AasimarFallen());
		races.add(new AasimarProtector());
		races.add(new AasimarScourge());
		races.add(new DragonDraconblood());
		races.add(new DragonDragonborn());
		races.add(new DragonRavenite());
		races.add(new DwarfDuergar());
		races.add(new DwarfHill());
		races.add(new DwarfMountain());
		races.add(new ElfDark());
		races.add(new ElfEladrin());
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE1GRAY));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE1SILVANESTI));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE1SUN));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE1VALLEY));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE2HIGH));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE2MOON));
		races.add(new ElfHigh(Subraces.ELFHIGHTYPE2QUALINESTI));
		races.add(new ElfPallid());
		races.add(new ElfSea());
		races.add(new ElfWood());
		races.add(new GenasiAir());
		races.add(new GenasiEarth());
		races.add(new GenasiFire());
		races.add(new GenasiWater());
		races.add(new GnomeForest());
		races.add(new GnomeRock());
		races.add(new HalflingLightfoot());
		races.add(new HalflingLotusden());
		races.add(new HalflingStout());
		races.add(new HumanCalishite());
		races.add(new HumanChondathan());
		races.add(new HumanDamaran());
		races.add(new HumanIlluskan());
		races.add(new HumanMulan());
		races.add(new HumanRashemi());
		races.add(new HumanShou());
		races.add(new HumanTethyrian());
		races.add(new HumanTurami());
	}

}
