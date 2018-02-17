package useful.controller;

import vocab.view.SpanishFrame;
import vocab.model.*;

public class SpanishController
{
	private SpanishFrame mainFrame;
	
	public SpanishController()
	{
		mainFrame = new SpanishFrame(this);
	}
	
	public void start()
	{
		
	}
	public SpanishFrame getSpanishFrame()
	{
		return mainFrame;
	}
}
