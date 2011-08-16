package com.bitsend.evogene;

import com.badlogic.gdx.backends.jogl.JoglApplication;


public class DesktopGame {
	public static void main(String[] args) {
		new JoglApplication(new Game(), "Game", 1200, 800, false);
	}
}