/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	
	private static final long serialVersionUID = 1L;

	// You fill in this part
	public void run()	{
		while (frontIsClear())	{
		moveForwards();
		moveUpwards();
		moveBackwards();
		startUpwards();
		}
	}
	private void moveForwards()	{
		putBeeper();
		while (frontIsClear())	{
			move();
			if (frontIsClear())	{
				move();
				putBeeper();
			}
		}
	}
	private void startUpwards()	{
		turnRight();
		if (frontIsClear())	{
			//print("working");
			move();
			turnRight();
		}
	}
	private void moveBackwards()	{
		if (beepersPresent())	{
			moveBackwardsEven();
		} else	{
			moveBackwardsOdd();
		}
	}
	private void moveBackwardsEven()	{
		if (frontIsClear())	{
		move();
		while (frontIsClear())	{
			move();
			putBeeper();
			move();
		}
		}
	}
	private void moveBackwardsOdd()	{
		while (frontIsClear())	{
			move();
			putBeeper();
			move();
		}
	}
	private void moveUpwards()	{
		if (beepersPresent())	{
			upwardsOdd();
		} else	{
			upwardsEven();
		}
	}
	private void upwardsOdd()	{
		turnLeft();
		if (frontIsClear()) {
			move();
			turnLeft();
		}
	}
	private void upwardsEven()	{
		turnLeft();
		if (frontIsClear())	{
			move();
			turnLeft();
			putBeeper();
		}
	}
	
}
	
