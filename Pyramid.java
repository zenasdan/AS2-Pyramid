/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		//Declaring coordinates for starting the pyramid on the bottom left
		double x = (getWidth() - BRICKS_IN_BASE*BRICK_WIDTH)/2;
		double y = getHeight() - BRICK_HEIGHT;
		addPyramid(x, y);
	}
		//Method to add the pyramid. Starts from bottom and then moves up and to the right.
		private void addPyramid(double x, double y){
			int count = BRICKS_IN_BASE;
			for(int i=0; i<BRICKS_IN_BASE; i++){
				addRow(x, y, count);
				y -= BRICK_HEIGHT;
				x += BRICK_WIDTH/2;
				count--;
			}
		}
		//Method for adding a row. Moves to the right.
		private void addRow(double x, double y, int count){
			for(int i=0; i<count; i++){
				add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
				x += BRICK_WIDTH;
			}
		}
		
}

