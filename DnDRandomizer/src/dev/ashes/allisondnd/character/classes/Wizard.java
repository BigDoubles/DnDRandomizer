package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Wizard extends DndClass implements IClasses {

	public Wizard() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.GuildArt, 5);
		addBackground(Backgrounds.GuildArtBG, 6);
		addBackground(Backgrounds.GuildMerch, 7);
		addBackground(Backgrounds.Hermit, 9);
		addBackground(Backgrounds.HermitBG, 11);
		addBackground(Backgrounds.Knight, 12);
		addBackground(Backgrounds.Noble, 13);
		addBackground(Backgrounds.NobleBG, 14);
		addBackground(Backgrounds.Sage, 16);
		addBackground(Backgrounds.SageBG, 18);
	}
	
	@Override
	public String toString() {
		return "Wizard";
	}

	static enum subclasses{
		C1("Chronurgy Magic*"),
		G1("Graviturgy Magic*"),
		S1("School of Abjuration"),
		S2("School of Conjuration"),
		S3("School of Divination"),
		S4("School of Enchantment"),
		S5("School of Evocation"),
		S6("School of Illusion"),
		S7("School of Necromancy"),
		S8("School of Transmutation");

		private String title;
		
		private subclasses(String s) {
			title = s;
		}
		
		public String toString() {
			return title;
		}
	}

	@Override
	public List<String> getSubClasses() {
		List<String> subs = new ArrayList<String>();
		for(subclasses s : subclasses.values()) {
			subs.add(s.toString());
		}
		return subs;
	}
}
