package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
/**
 * @author akin8529
 * @version 0.x Nov 9,2015
 * 
 */
public class GuiFrame extends JFrame
{
	private GuiController baseController;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
	}
}
