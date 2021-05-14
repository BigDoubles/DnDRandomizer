package dev.ashes.allisondnd.character.races.sub;

public enum ElfType1 {
	GRAY("Gray"),
	VALLEY("Valley"),
	SILVANESTI("Silvanesti"),
	SUN("Sun");
	
	private String name;
	
	private ElfType1(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
}
