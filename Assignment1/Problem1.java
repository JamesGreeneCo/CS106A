/*
 * Problem 1:
 * 
 * 
 */

import stanford.karel.*;

public class Problem1 extends SuperKarel {
	private static final long serialVersionUID = 1L;

	public void run() {
		northeast();
		frontClear();
		south();
		move();
		if (frontIsBlocked()) {
			turnRight();
		}
	}
	
	private void northeast() {
		if (facingEast()) {
			turnRight();
			move();
			turnLeft();
			
		}
	}
	private void frontClear()  {
		while(noBeepersPresent()) {
			move();
			
		}
		if (beepersPresent()) {
			pickBeeper();
			turnRight();
			turnRight();
			northwest();
		}
		
	}
	private void northwest() {
		while (facingWest()) {
			while (frontIsClear()) {
				move();
			}
			turnRight();
		}
	}
	private void south() {
		if (facingSouth()) {
			turnRight();
			while (frontIsClear()) {
				move();
			}
		}
	}
	
	
}