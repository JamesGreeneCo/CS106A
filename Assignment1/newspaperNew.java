import stanford.karel.*;


public class newspaperNew extends SuperKarel	{
	
	private static final long serialVersionUID = 1L;

	public void run()	{
		beeper();
	}
	public void beeper()	{
		if(facingEast())	{
			turnRight();
			if(facingSouth())	{
				move();
				if(leftIsBlocked())	{
					turnLeft();
					
				}
				moving();
			}
		}
	}
	public void moving()	{
		while(facingEast()){
			while(noBeepersPresent())	{
				move();
			}
		}
	}
	
	
}