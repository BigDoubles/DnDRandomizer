package dev.ashes.allisondnd.character.races.sub;

public enum Subraces {
	AASIMARFALLEN("Fallen"),
	AASIMARPROTECTOR("Protector"),
	AASIMARSCOURGE("Scourge"),
	DRAGONDRACONBLOOD("Draconblood"),
	DRAGONRAVENITE("Ravenite"),
	DWARFDUERGAR("Duergar"),
	DWARFHILL("Hill"),
	DWARFMOUNTAIN("Mountain"),
	ELFDARK("Dark"),
	ELFELADRIN("Eladrin"),
	ELFHIGHTYPE1("Type One High"),
	ELFHIGHTYPE2("Type Two High"),
	ELFPALLID("Pallid"),
	ELFSEA("Sea"),
	ELFWOOD("Wood"),
	GENASIAIR("Air"),
	GENASIEARTH("Earth"),
	GENASIFIRE("Fire"),
	GENASIWATER("Water"),
	GNOMEFOREST("Forest"),
	GNOMEROCK("Rock"),
	HALFLINGLIGHTFOOT("Lightfoot"),
	HALFLINGLOTUSDEN("Lotusden"),
	HALFLINGSTOUT("Stout"),
	HUMANCALISHITE("Calishite"),
	HUMANCHONDATHAN("Chondathan"),
	HUMANDAMARAN("Damaran"),
	HUMANILLUSKAN("Illuskan"),
	HUMANMULAN("Mulan"),
	HUMANRASHEMI("Rashemi"),
	HUMANSHOU("Shou"),
	HUMANTETHYRIAN("Tethyrian"),
	HUMANTURAMI("Turami");
	
	private String name;
	
	private Subraces(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
