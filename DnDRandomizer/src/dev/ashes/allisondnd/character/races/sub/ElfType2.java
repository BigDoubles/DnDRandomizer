package dev.ashes.allisondnd.character.races.sub;

public enum ElfType2 {
	HIGH("High"), QUALINESTI("Qualinesti"), MOON("Moon");

	private String name;

	private ElfType2(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
}
