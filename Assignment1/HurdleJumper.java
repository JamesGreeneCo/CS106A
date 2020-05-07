/*
 * File: MidpointFindingKarel.java
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

public class HurdleJumper extends SuperKarel {
	
	private static final long serialVersionUID = 1L;
	
	public void run()	{
		for (int i=0; i < 8; i++)	{
			jumpHurdle();
		}
	}
	
	//jumps over one hurdle
	// assumption: karel is at the bottle of the a hurdle, facing East
	// after this code runs, karel will be over the hurdle,
	// at the bottom, still facing East
	public void jumpHurdle()	{
		turnLeft();	// face North
		while (rightIsBlocked())	{
			move();

		}
		// at T-L of hurdle, facing North
		turnRight();
		move();
		turnRight();
		
		// at T-R of hurdle, facing South
		while (frontIsClear())	{
			move();
		}
		
		turnLeft();	//face East
	}
}
