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

public class Checkerboard extends SuperKarel {
	
	private static final long serialVersionUID = 1L;
	
	public void run()	{
		putBeeper();
		beepersEast();
		checkWall();
		while (frontIsClear())	{
			beepersEast();
			beepersWest();
		}
	}
	private void beepersEast()	{
		while (facingEast())	{
			move();
			if (frontIsClear())	{
				move();
				putBeeper();
			}
			upEast();
		}
	}
	private void upEast()	{
		if (frontIsBlocked())	{
			if (noBeepersPresent())	{
				turnLeft();
				if (frontIsClear())	{
					move();
					turnLeft();
					putBeeper();
				}
			} else {
				turnLeft();
				if (frontIsClear())	{
					move();
					turnLeft();
					move();
					putBeeper();
				}
			}
		}
	}
	private void beepersWest()	{
		while (facingWest())	{
			move();
			if (frontIsClear())	{
				move();
				putBeeper();
			}
			upWest();
		}
	}
	private void upWest()	{
		if (frontIsBlocked())	{
			if (noBeepersPresent())	{
				turnRight();
				if (frontIsClear())	{
					move();
					turnRight();
					putBeeper();
				}
			} else {
				turnRight();
				if (frontIsClear())	{
					move();
					turnRight();
					move();
					putBeeper();
				}
			}
		}
	}
	private void checkWall()	{
		if (frontIsBlocked())	{
			turnLeft();
			while (frontIsClear())	{
				move();
				if (frontIsClear())	{
					move();
					putBeeper();
				}
			}
		}
	}
	
}
	
	