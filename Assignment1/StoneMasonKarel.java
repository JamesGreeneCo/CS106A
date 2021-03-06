/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	
	private static final long serialVersionUID = 1L;

	// You fill in this part
	public void run()	{
		while (frontIsClear())	{
			moveUpwards();
			moveAcross();
			moveDownwards();
			downwardsAcross();
		}
	}
	private void moveUpwards()	{
		turnLeft();
		while (frontIsClear())	{
			if (noBeepersPresent())	{
				putBeeper();	
			}
			move();
		}
	}
	private void moveAcross()	{
		turnRight();
			for (int i=0; i<4; i++)	{
				move();
			}
		
	}
	private void moveDownwards()	{
		turnRight();
		while (frontIsClear())	{
			if (noBeepersPresent())	{
				putBeeper();
			}
			move();
		}
	}
	private void downwardsAcross()	{
		turnLeft();
		if (frontIsClear())	{
			for (int i=0; i<4; i++)	{
				move();
			}
		}
	}

}
