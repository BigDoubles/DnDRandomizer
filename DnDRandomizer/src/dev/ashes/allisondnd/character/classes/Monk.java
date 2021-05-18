package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;
import dev.ashes.allisondnd.character.IClasses;

public class Monk extends DndClass implements IClasses {

	public Monk() {
		addBackground(Backgrounds.Acolyte, 2);
		addBackground(Backgrounds.AcolyteBG, 4);
		addBackground(Backgrounds.Criminal, 5);
		addBackground(Backgrounds.CriminalBG, 6);
		addBackground(Backgrounds.Entertainer, 7);
		addBackground(Backgrounds.EntertainerBG, 8);
		addBackground(Backgrounds.GuildArt, 9);
		addBackground(Backgrounds.GuildArtBG, 10);
		addBackground(Backgrounds.GuildMerch, 11);
		addBackground(Backgrounds.Hermit, 12);
		addBackground(Backgrounds.HermitBG, 13);
		addBackground(Backgrounds.Knight, 14);
		addBackground(Backgrounds.Noble, 15);
		addBackground(Backgrounds.NobleBG, 16);
		addBackground(Backgrounds.Outlander, 17);
		addBackground(Backgrounds.OutlanderBG, 18);
		addBackground(Backgrounds.Pirate, 19);
		addBackground(Backgrounds.Sage, 20);
		addBackground(Backgrounds.SageBG, 21);
		addBackground(Backgrounds.Sailor, 22);
		addBackground(Backgrounds.SailorBG, 23);
		addBackground(Backgrounds.Soldier, 24);
		addBackground(Backgrounds.SoldierBG, 25);
		addBackground(Backgrounds.Spy, 26);
		addBackground(Backgrounds.Urchin, 27);
		addBackground(Backgrounds.UrchinBG, 28);
		addBackground(Backgrounds.VolstruckerAgent, 29);
	}
	
	@Override
	public String toString() {
		return "Monk";
	}
	
	static enum subclasses{
		Four("Way of the Four Elements"),
		Hand("Way of the Open Hand"),
		Shadow("Way of the Shadow");

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
