package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Fighter extends DndClass implements IClasses {

	public Fighter() {
		addBackground(Backgrounds.Acolyte, 1);
		addBackground(Backgrounds.AcolyteBG, 2);
		addBackground(Backgrounds.Entertainer, 3);
		addBackground(Backgrounds.EntertainerBG, 4);
		addBackground(Backgrounds.Faceless, 5);
		addBackground(Backgrounds.FolkH, 7);
		addBackground(Backgrounds.FolkHBG, 9);
		addBackground(Backgrounds.GuildArt, 10);
		addBackground(Backgrounds.GuildArtBG, 11);
		addBackground(Backgrounds.GuildMerch, 12);
		addBackground(Backgrounds.Knight, 13);
		addBackground(Backgrounds.Noble, 14);
		addBackground(Backgrounds.NobleBG, 15);
		addBackground(Backgrounds.Outlander, 17);
		addBackground(Backgrounds.OutlanderBG, 19);
		addBackground(Backgrounds.Pirate, 21);
		addBackground(Backgrounds.Sage, 22);
		addBackground(Backgrounds.SageBG, 23);
		addBackground(Backgrounds.Sailor, 25);
		addBackground(Backgrounds.SailorBG, 27);
		addBackground(Backgrounds.Soldier, 29);
		addBackground(Backgrounds.SoldierBG, 31);
		addBackground(Backgrounds.Haunted, 33);
	}
	
	@Override
	public String toString() {
		return "Fighter";
	}
	
	static enum subclasses{
		Champion("Champion"),
		Master("Battle Master"),
		Echo("Echo Knight*"),
		Eldritch("Eldritch Knight");

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
