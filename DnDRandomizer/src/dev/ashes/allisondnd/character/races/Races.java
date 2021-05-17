package dev.ashes.allisondnd.character.races;

public enum Races {
	AARAKOCRA("Aarakocra*"),
	AASIMAR("Aasimar*"),
	BUGBEAR("Bugbear*"),
	DRAGONBORN("Dragonborn"),
	DWARF("Dwarf"),
	ELF("Elf"),
	FIRBOLG("Firbolg*"),
	GENASI("Genasi*"),
	GNOME("Gnome"),
	GOBLIN("Goblin*"),
	GOLIATH("Goliath*"),
	HALFELF("Half-Elf"),
	HALFLING("Halfling"),
	HALFORC("Half-Orc"),
	HOBGOBLIN("Hobgoblin*"),
	HUMAN("Human"),
	KENKU("Kenku*"),
	ORCOFEXANDRIA("Orc of Exandria*"),
	TABAXI("Tabaxi*"),
	TIEFLING("Tiefling"),
	TORTLE("Tortle*");
	
	private String name;
	
	private Races(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
