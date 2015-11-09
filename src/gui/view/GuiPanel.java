package gui.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import gui.controller.GuiController;

/**
 * @author akin8529
 * @version 0.1 Nov 9, 2015 Basic contructor setup.
 */
public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;

	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		firstButton = new JButton("Do not click this button");

		firstTextField = new JTextField("You can type words in here");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Loads content into the panel.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout); // Needs to be the first line of the setupPanel helper method.
		this.add(firstButton);
		this.add(firstTextField);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 148, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 116, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -6, SpringLayout.NORTH, firstButton);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, 0, SpringLayout.EAST, firstButton);

	}

	private void setupListeners()
	{

	}
}
