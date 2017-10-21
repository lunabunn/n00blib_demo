package com.n00blib.demo;

import com.n00blib.general.Game;

public class MyGame {
	public static void main(String[] args) {
		Game game = new Game();
		game.setTitle("My Game"); // Sets the title of the Game Window to "My Game"
		game.setFPS(60); // Sets the FPS to 60. Unnecessary as default FPS is 60, but added for demonstration.
		game.setSize(500, 500); // Sets the size of the Game Window to 500*500
		// game.setSize(new Dimension(500, 500)); // Alternative to above call
		game.setGameSystem(new MyGameSystem()); // Set Game System to a newly created instance of MyGameSystem
		game.launch(); // Launch our game
	}
}
