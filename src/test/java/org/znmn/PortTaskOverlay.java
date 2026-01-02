package org.znmn;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PortTaskOverlay
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PortTaskOverlayPlugin.class);
		RuneLite.main(args);
	}
}