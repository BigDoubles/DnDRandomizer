package dev.ashes.allisondnd.character.classes;

import java.util.ArrayList;
import java.util.List;

import dev.ashes.allisondnd.character.IClasses;
import dev.ashes.allisondnd.character.Backgrounds;
import dev.ashes.allisondnd.character.DndClass;

public class Barbarian extends DndClass implements IClasses {
	
	public Barbarian() {
		addBackground(Backgrounds.Faceless, 1);
		addBackground(Backgrounds.FolkH, 3);
		addBackground(Backgrounds.FolkHBG, 5);
		addBackground(Backgrounds.Outlander, 7);
		addBackground(Backgrounds.OutlanderBG, 9);
		addBackground(Backgrounds.Pirate, 11);
		addBackground(Backgrounds.Sailor, 13);
		addBackground(Backgrounds.SailorBG, 15);
		addBackground(Backgrounds.Soldier, 17);
		addBackground(Backgrounds.SoldierBG, 19);
	}
	
	@Override
	public String toString() {
		return "Barbarian";
	}

	static enum subclasses{
		PathoftheBerserker("Path of the Berserker"),
		PathoftheTotemWarrior("Path of the Totem Warrior");

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
