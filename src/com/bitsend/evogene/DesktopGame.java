package com.bitsend.evogene;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopGame {
	public static void main(String[] args) {
		new LwjglApplication(new Game(), "Game", 1200, 800, false);
	}
}