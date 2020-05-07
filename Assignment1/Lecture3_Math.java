/*
 * File: DoubleBeepers.java
 * 
 * Karel doubles the number of beepers on the corner directly
 * in front of him in the world. He then returns to his
 * original position/orientation.
 */


import stanford.karel.*;

public class Lecture3_Math extends SuperKarel {
	private static final long serialVersionUID = 1L;
 
	public void run() {
		move();
		DoubleBeepersInPile();
		moveBackward();
	}
	
	private void moveBackward() {
		turnAround();
		move();
		turnAround();
	}
	private void DoubleBeepersInPile() {
		while (beepersPresent()) {
			pickBeeper();
			PutTwoBeepersNextDoor();
		}
		MovePileNextDoorBack();
	}
	private void PutTwoBeepersNextDoor() {
		move();
		putBeeper();
		putBeeper();
		moveBackward();
	}
	
	private void MovePileNextDoorBack() {
		move();
		while (beepersPresent()) {
			MoveOneBeeperBack();
		}
		moveBackward();
	}
	private void MoveOneBeeperBack() {
		pickBeeper();
		moveBackward();
		putBeeper();
		move();
	}
	
	
}