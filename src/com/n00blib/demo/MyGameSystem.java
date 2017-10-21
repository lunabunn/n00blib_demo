package com.n00blib.demo;

import java.awt.event.KeyEvent;

import com.jogamp.opengl.GL2;
import com.n00blib.general.GameSystem;

public class MyGameSystem extends GameSystem {
	Player player;
	
	public void gameStart() {
		// This is run when the game starts.
		
		player = new Player(250, 250, this); // This creates the player at the center of the Game Window.
		new Block(100, 100, this);
		new Block(400, 100, this);
		new Block(100, 400, this);
		new Block(400, 400, this);
	}

	public void draw(GL2 gl) {
		// This is called every frame, after update(). Use this event and only this event to draw things.
		
		master.setColor(1, 1, 1, 1); // Sets the color to white
		master.drawRect(0, 0, 500, 500); // Clears the background white.
		
		super.draw(gl); // This renders all the Objects within the game.
	}

	public void update() {
		// This is called every frame, before draw(GL2 gl). Use this to update game elements.
		
		super.update(); // This updates all the Objects within the game.
	}

	public void gameEnd() {
		// This is called when the game ends.
	}

	public void mouseWheelDown() {
		// This is called each time the mouse wheel fully "click"s downwards.

	}

	public void mouseWheelUp() {
		// This is called each time the mouse wheel fully "click"s upwards.

	}

	public void mouseLeftPressed() {
		// This is called each time the left mouse button is pressed.

	}

	public void mouseMiddlePressed() {
		// This is called each time the middle mouse button (mouse wheel) is pressed.

	}

	public void mouseRightPressed() {
		// This is called each time the right mouse button is pressed.

	}

	public void mouseLeftReleased() {
		// This is called each time the left mouse button is released.

	}

	public void mouseMiddleReleased() {
		// This is called each time the middle mouse button (mouse wheel) is released.
		
	}

	public void mouseRightReleased() {
		// This is called each time the right mouse button is released.

	}

	public void keyPressed(int keyCode) {
		// This is called each time a key is pressed.
		
		switch(keyCode) {
		case KeyEvent.VK_LEFT: player.left = true; break;
		case KeyEvent.VK_RIGHT: player.right = true; break;
		case KeyEvent.VK_UP: player.up = true; break;
		case KeyEvent.VK_DOWN: player.down = true; break;
		} // This seems pretty self explanatory.
	}

	public void keyReleased(int keyCode) {
		// This is called each time a key is released.

		switch(keyCode) {
		case KeyEvent.VK_LEFT: player.left = false; break;
		case KeyEvent.VK_RIGHT: player.right = false; break;
		case KeyEvent.VK_UP: player.up = false; break;
		case KeyEvent.VK_DOWN: player.down = false; break;
		} // This seems pretty self explanatory.
	}
}
