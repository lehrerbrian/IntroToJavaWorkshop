package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
System.out.println("hello world!");
Robot  robot485= new Robot("mini");	
		robot485.moveTo(250, 189);
robot485.penDown();
robot485.setPenColor(Color.CYAN);		
robot485.move(110);		
robot485.turn(90);
robot485.setPenColor(Color.GREEN);
robot485.move(110);		
robot485.turn(90);
robot485.setPenColor(Color.YELLOW);
robot485.move(110);		
robot485.turn(90);
robot485.setPenColor(Color.black);
robot485.move(110);		
		
	}
}
