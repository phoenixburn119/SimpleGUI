package gui.view;

import javax.swing.JFrame;
import gui.controller.GuiController;
/**
 * Creates the Frame for the GUI project.
 * @author akin8529
 * @version 0.x Nov 9,2015 Added areference to the GuiPanel and installed it as the content pane.
 * 
 */
public class GuiFrame extends JFrame
{
	private GuiController baseController;
	private GuiPanel basePanel;
	
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController; //Assign parameter to data member.
		basePanel = new GuiPanel(baseController); //Creates an instance of the GuiPanel with a reference to the contr
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel); 	//Sets teh panel in the GuiFrame, this is REQUIRED!
		this.setResizable(false);			//Usually a good idea but not  required.
		this.setTitle("My Window");
		this.setSize(800,800); 				//Sets the size.
		this.setVisible(true); 				//Must  the last line of code in the setupFrame method.
	}
	
	public GuiController getBaseController()
	{
		return baseController;
	}
}
