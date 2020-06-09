package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {
	
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
Robot nugget = new Robot();
nugget.setX(25);
nugget.setY(410);
        // 3. Put the robot's pen down
nugget.penDown();
nugget.setRandomPenColor();
nugget.setPenWidth(10);
        // 6. Make the robot move as fast as possible
nugget.setSpeed(10000);

        // 5. Use a for loop to repeat everything below 4 times. 
for(int i=0; i<9; i++) {

        //         2. Move your robot 200 pixels
nugget.move(200);

        //         4. Turn the robot 90 degrees to the right

    	nugget.turn(40);
    		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides), pentagon (5-sides), decagon (10-sides)).
   
}    
    }
}