package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Sorcerer extends DndClass implements IClasses {

	public Sorcerer() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.Charlatan, 5);
		addBackground(Backgrounds.CharlatanBG, 6);
		addBackground(Backgrounds.Criminal, 7);
		addBackground(Backgrounds.CriminalBG, 8);
		addBackground(Backgrounds.Faceless, 10);
		addBackground(Backgrounds.Grinner, 11);
		addBackground(Backgrounds.GuildArt, 13);
		addBackground(Backgrounds.GuildArtBG, 15);
		addBackground(Backgrounds.GuildMerch, 17);
		addBackground(Backgrounds.Hermit, 18);
		addBackground(Backgrounds.HermitBG, 19);
		addBackground(Backgrounds.Knight, 20);
		addBackground(Backgrounds.Noble, 21);
		addBackground(Backgrounds.NobleBG, 22);
		addBackground(Backgrounds.Sage, 23);
		addBackground(Backgrounds.SageBG, 24);
		addBackground(Backgrounds.Soldier, 25);
		addBackground(Backgrounds.SoldierBG, 26);
		addBackground(Backgrounds.Spy, 27);
		addBackground(Backgrounds.VolstruckerAgent, 28);
	}
	
	@Override
	public String toString() {
		return "Sorcerer";
	}
	
	static enum subclasses{
		C1("Draconic Bloodline"),
		C2("Wild Magic");

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
