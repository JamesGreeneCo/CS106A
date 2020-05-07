/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	private static final long serialVersionUID = 1L;
	
	//methods - defining new commands for Karel to (maybe) run
	// You fill in this part
	
	public void run() {
		topIsBlocked();
		runEast();
	}
	private void topIsBlocked() {
		while(leftIsBlocked()) {
			turnRight();
			move();
		}
		turnWest();
	}
	private void turnWest() {
		while (facingSouth()) {
			turnLeft();
		}
	}
	private void runEast() {
		while(facingEast()) {
			frontCleared();
		}
	}
	private void frontCleared() {
		while(frontIsClear()) {
			beeperPresent();
			move();
		}
	}
	private void beeperPresent() {
		while(beepersPresent()) {
			pickBeeper();
		}
	}

}
