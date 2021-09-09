package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Cleric extends DndClass implements IClasses {

	public Cleric() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.GuildArt, 6);
		addBackground(Backgrounds.GuildArtBG, 8);
		addBackground(Backgrounds.GuildMerch, 10);
		addBackground(Backgrounds.Hermit, 12);
		addBackground(Backgrounds.HermitBG, 14);
		addBackground(Backgrounds.Knight, 16);
		addBackground(Backgrounds.Noble, 18);
		addBackground(Backgrounds.NobleBG, 20);
		addBackground(Backgrounds.Sage, 21);
		addBackground(Backgrounds.SageBG, 22);
		addBackground(Backgrounds.Haunted, 24);
	}
	
	@Override
	public String toString() {
		return "Cleric";
	}
	
	static enum subclasses{
		Knowledge("Knowledge"),
		Life("Life"),
		Light("Light"),
		Nature("Nature"),
		Tempest("Tempest"),
		Trickery("Trickery"),
		War("War");

		private String title;
		
		private subclasses(String s) {
			title = "Domain of " + s;
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
