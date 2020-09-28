import stanford.karel.*;

/*Notes:
 * 
 * snooze - use following Syntax to repeat calls
 * for (int i=0;i<3;i++){
 * 		turnLeft();
 * }
 * While - Complete a Task until its is no longer possible
 * While (frontIsClear){
 * 		move()
 * }
 * If/else - When one thing is not possible, the other will 
 * be completed instead.
 * if (neepersPresent()){
 * 		pickBeeper();
 * } else {
 * 		putBeeper();
 * }

*/

public class VotingBox extends SuperKarel {

	public void run() {
		 while (frontIsClear()) {
			 move();
			 if (noBeepersPresent()) {
				 lookBothWays();  
				}
			 move();
		 }
		 }
	
	/*
	 * Karel looks both ways and steps into the corner and grabs a "chad" 
	 * if one is there, then turns around to check the other side be for 
	 * he moves on. 
	 */
	private void lookBothWays() {
		turnLeft();
		move();
		while (beepersPresent()) {
			pickBeeper();
			}
		turnAround();
		move();
		move();
		while (beepersPresent()) {
			pickBeeper();
			}
		turnAround();
		move();
		turnRight();
		}
	
}
	