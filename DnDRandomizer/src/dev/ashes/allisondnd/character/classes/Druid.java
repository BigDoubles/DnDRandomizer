package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Druid extends DndClass implements IClasses {

	public Druid() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.FolkH, 6);
		addBackground(Backgrounds.FolkHBG, 8);
		addBackground(Backgrounds.GuildArt, 9);
		addBackground(Backgrounds.GuildArtBG, 10);
		addBackground(Backgrounds.GuildMerch, 11);
		addBackground(Backgrounds.Hermit, 13);
		addBackground(Backgrounds.HermitBG, 15);
		addBackground(Backgrounds.Outlander, 16);
		addBackground(Backgrounds.OutlanderBG, 17);
		addBackground(Backgrounds.Pirate, 18);
		addBackground(Backgrounds.Sage, 19);
		addBackground(Backgrounds.SageBG, 20);
		addBackground(Backgrounds.Sailor, 21);
		addBackground(Backgrounds.SailorBG, 22);
	}
	
	@Override
	public String toString() {
		return "Druid";
	}
	
	static enum subclasses{
		Land("Circle of the Land"),
		Moon("Circle of the Moon");

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
