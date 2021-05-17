package dev.ashes.allisondnd.character.races.sub;

import dev.ashes.allisondnd.character.races.Races;

public enum Subraces {
	AASIMARFALLEN("Fallen", Races.AASIMAR),
	AASIMARPROTECTOR("Protector", Races.AASIMAR),
	AASIMARSCOURGE("Scourge", Races.AASIMAR),
	DRAGONDRACONBLOOD("Draconblood*", Races.DRAGONBORN),
	DRAGONDRAGONBORN("Dragonborn", Races.DRAGONBORN),
	DRAGONRAVENITE("Ravenite*", Races.DRAGONBORN),
	DWARFDUERGAR("Duergar", Races.DWARF),
	DWARFHILL("Hill", Races.DWARF),
	DWARFMOUNTAIN("Mountain", Races.DWARF),
	ELFDARK("Dark", Races.ELF),
	ELFELADRIN("Eladrin", Races.ELF),
	ELFHIGHTYPE1GRAY("Gray Type One High", Races.ELF),
	ELFHIGHTYPE1SILVANESTI("Silvanesti Type One High", Races.ELF),
	ELFHIGHTYPE1VALLEY("Valley Type One High", Races.ELF),
	ELFHIGHTYPE2HIGH("High Type Two High", Races.ELF),
	ELFHIGHTYPE1SUN("Sun Type One High", Races.ELF),
	ELFHIGHTYPE2QUALINESTI("Qualinesti Type Two High", Races.ELF),
	ELFHIGHTYPE2MOON("Moon Type Two High", Races.ELF),
	ELFPALLID("Pallid*", Races.ELF),
	ELFSEA("Sea*", Races.ELF),
	ELFWOOD("Wood", Races.ELF),
	GENASIAIR("Air", Races.GENASI),
	GENASIEARTH("Earth", Races.GENASI),
	GENASIFIRE("Fire", Races.GENASI),
	GENASIWATER("Water", Races.GENASI),
	GNOMEFOREST("Forest", Races.GNOME),
	GNOMEROCK("Rock", Races.GNOME),
	HALFLINGLIGHTFOOT("Lightfoot", Races.HALFLING),
	HALFLINGLOTUSDEN("Lotusden*", Races.HALFLING),
	HALFLINGSTOUT("Stout", Races.HALFLING),
	HUMANCALISHITE("Calishite", Races.HUMAN),
	HUMANCHONDATHAN("Chondathan", Races.HUMAN),
	HUMANDAMARAN("Damaran", Races.HUMAN),
	HUMANILLUSKAN("Illuskan", Races.HUMAN),
	HUMANMULAN("Mulan", Races.HUMAN),
	HUMANRASHEMI("Rashemi", Races.HUMAN),
	HUMANSHOU("Shou", Races.HUMAN),
	HUMANTETHYRIAN("Tethyrian", Races.HUMAN),
	HUMANTURAMI("Turami", Races.HUMAN);
	
	private String name;
	private Races parent;
	
	private Subraces(String n, Races r) {
		name = n;
		parent = r;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public Races getParent() {
		return parent;
	}
}
