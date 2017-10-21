package com.n00blib.demo;

import com.jogamp.opengl.GL2;
import com.n00blib.general.GameSystem;
import com.n00blib.object.Object;

public class Player extends Object {
	
	public boolean left=false, right=false, up=false, down=false;

	public Player(double x, double y, GameSystem system) {
		super(x, y, 0, false, system); // This creates a non-solid (non-collidable) object at x:x y:y z:0.
		setMask(-16, -16, 32, 32); // This sets the collsion box for the player, relative to its coordinates.
	}
	
	public void update() {
		dx = (right? 2:0) - (left? 2:0); // This calculates the delta x (x movement) of the player.
		dy = (down? 2:0) - (up? 2:0); // This calculates the delta y (y movement) of the player.
		
		super.update(); // This applies the delta x and delta y.
	}
	
	public void draw(GL2 gl) {
		// This is called by the super.draw(gl) in MyGameSystem.
		
		master.setColor(0, 0, 0, 1); // Sets the color to black.
		master.drawRect(x-16, y-16, x+16, y+16); // Draws a rectangle from (x-16, y-16) to (x+16, y+16). 
	}

}
