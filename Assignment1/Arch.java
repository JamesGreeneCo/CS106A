/*
 * File: Arch.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class Arch extends SuperKarel {
	
	private static final long serialVersionUID = 1L;
	public void run () {
		while (frontIsClear()) {
			moveUpwards();
			upwardsAcross();
			moveDownwards();
			downwardsAcross();
		}
	}
	private void moveUpwards()	{
		turnLeft();
		while (frontIsClear())	{
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
	}
	private void upwardsAcross()	{
		turnRight();
		if (frontIsClear())	{
			for (int i = 0; i < 4; i++)	{
				move();
			}
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
			for (int i = 0; i < 4; i++)	{
				move();
			}
		}
	}
}
	

	
	