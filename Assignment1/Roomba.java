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

public class Roomba extends SuperKarel {
	
	private static final long serialVersionUID = 1L;
	
	public void run()	{
		for (int a=0; a<3; a++)	{
			longlap();
		}
		shortlap();
	}
	
	public void longlap()	{
		for (int e=0; e<2; e++)	{
		for (int i=0; i<7; i++)	{
			move();
			beeperScan();
			
		}
		runningPos();
	}
		turnRight();
	}
	public void shortlap()	{
		for (int i=0; i<7; i++) {
			move();
			beeperScan();
		}
		facingPos();
		lastrun();
		turnRight();
		turnRight();
		
	}
	public void lastrun()	{
		for (int i=0; i<7; i++)	{
			move();
			beeperScan();
		}
	}
	
	public void runningPos()	{
		while (frontIsBlocked())	{
			facingPos();
		}
	}
	public void beeperScan()	{
		while (beepersPresent())	{
			pickBeeper();
		}
	}
	public void facingPos()	{
		while (facingWest())	{
			turnRight();
			move();
			beeperScan();
			
		}
		while (facingEast())	{
			turnLeft();
			move();
			turnLeft();
			beeperScan();
		}
	}

	
}
