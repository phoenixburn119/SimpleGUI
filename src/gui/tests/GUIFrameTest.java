/**
 * 
 */
package gui.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import gui.controller.GuiController;
import gui.view.*;

/**
 * @author CodyH
 * @version 0.x Nov 12, 2015
 *
 */
public class GUIFrameTest
{

	private GuiFrame testFrame;
	private GuiPanel testPanel;
	private GuiController testController;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testController = new GuiController();
		testFrame = new GuiFrame(testController);
		testPanel = new GuiPanel(testController);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testFrame = null;
		testPanel = null;
		testController = null;
	}

	/**
	 * Test method for {@link gui.view.GUIFrame#GUIFrame(gui.controller.GUIAppController)}.
	 */
	@Test
	public void testGUIFrame()
	{
		assertTrue(testFrame.getContentPane() instanceof GuiPanel);
		assertTrue(testFrame.isVisible());
		assertTrue(testFrame.getWidth() > 100);
		assertTrue(testFrame.getHeight() > 100);
	}
	

	/**
	 * Test method for {@link gui.view.GUIFrame#getBaseController()}.
	 */
	@Test
	public void testGetBaseController()
	{
		assertNotNull(testFrame.getBaseController());
		assertTrue(testFrame.getBaseController() instanceof GuiController);
	}

}
