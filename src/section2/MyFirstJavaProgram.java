package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot r0bb = new Robot();
		r0bb.penDown();
		r0bb.setSpeed(100);
		r0bb.move(100);
		r0bb.turn(90);
		r0bb.move(100);
		r0bb.turn(90);
		r0bb.move(100);
		r0bb.turn(90);
		r0bb.move(100);
		r0bb.moveTo(100,100);
	}
}
