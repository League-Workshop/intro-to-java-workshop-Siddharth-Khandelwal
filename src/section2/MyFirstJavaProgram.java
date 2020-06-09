package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot nugget = new Robot();
nugget.penDown();
nugget.setPenColor(Color.green);
nugget.setSpeed(100);
for(int i=0; i<4; i++) {
nugget.move(200);
nugget.turn(90);		
	}
}
}