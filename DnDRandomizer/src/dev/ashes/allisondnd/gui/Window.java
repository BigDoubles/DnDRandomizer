package dev.ashes.allisondnd.gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;

	private JComboBox race, subrace, dndclass;
	public Window() {
		super("DnD Randomizer");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1080, 720);
		this.setVisible(true);
	}

}
