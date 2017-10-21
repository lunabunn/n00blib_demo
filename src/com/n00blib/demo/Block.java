package com.n00blib.demo;

import com.n00blib.object.Object;
import com.jogamp.opengl.GL2;
import com.n00blib.general.GameSystem;

public class Block extends Object {
	public Block(double x, double y, GameSystem system) {
		super(x, y, 0, true, system); // This object is solid!
		setMask(-32, -32, 64, 64);
	}

	public void draw(GL2 gl) {
		master.setColor(0, 0, 0, 1);
		master.drawRect(x-32, y-32, x+32, y+32);
		
	}
}
