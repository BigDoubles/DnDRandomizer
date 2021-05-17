package dev.ashes.allisondnd.character;

import dev.ashes.allisondnd.character.races.Races;
import dev.ashes.allisondnd.character.races.sub.Subraces;

/*
 *  This class is to delegate all handling of subraces,
 *  as they would be the exact same in every main race
 *  class with a subrace
 * */
public abstract class Subrace extends Race {

	protected Subraces subrace;

	// Takes main race from abstract race class
	public Subrace(Races race) {
		super(race);
	}

	@Override
	public String getFullRaceName() {
		return subrace.toString() + " " + mainRace.toString();
	}

	protected void setSubrace(Subraces sub) {
		subrace = sub;
	}
	
	public Subraces getSubrace() {
		return subrace;
	}
}
