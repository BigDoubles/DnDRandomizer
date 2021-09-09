package dev.ashes.allisondnd.character;

public enum Backgrounds {
	Acolyte("Acolyte"),
	AcolyteBG("Acolyte - Baldur's Gate*"),
	Charlatan("Charlatan"),
	CharlatanBG("Charlatan - Baldur's Gate*"),
	Criminal("Criminal"),
	CriminalBG("Criminal - Baldur's Gate*"),
	Entertainer("Entertainer"),
	EntertainerBG("Entertainer - Baldur's Gate*"),
	Faceless("Faceless*"),
	FolkH("Folk Hero"),
	FolkHBG("Folk Hero - Baldur's Gate*"),
	Grinner("Grinner*"),
	GuildArt("Guild Artisan"),
	GuildArtBG("Guild Artisan - Baldur's Gate*"),
	GuildMerch("Guild Merchant"),
	Haunted("Haunted One*"),
	Hermit("Hermit"),
	HermitBG("Hermit - Baldur's Gate*"),
	Knight("Knight"),
	Noble("Noble"),
	NobleBG("Noble - Baldur's Gate*"),
	Outlander("Outlander"),
	OutlanderBG("Outlander - Baldur's Gate*"),
	Pirate("Pirate"),
	Sage("Sage"),
	SageBG("Sage - Baldur's Gate*"),
	Sailor("Sailor"),
	SailorBG("Sailor - Baldur's Gate*"),
	Soldier("Soldier"),
	SoldierBG("Soldier - Baldur's Gate*"),
	Spy("Spy"),
	Urchin("Urchin"),
	UrchinBG("Urchin - Baldur's Gate*"),
	VolstruckerAgent("Volstrucker Agent*");
	
	
	private String name;
	
	private Backgrounds(String s) {
		name = s;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
