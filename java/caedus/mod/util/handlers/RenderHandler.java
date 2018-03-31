package caedus.mod.util.handlers;

import caedus.mod.entity.EntitySkyridgeWolf;
import caedus.mod.entity.render.RenderSkyridgeWolf;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySkyridgeWolf.class, new IRenderFactory<EntitySkyridgeWolf>()
		{
			@Override
			public Render<? super EntitySkyridgeWolf> createRenderFor(RenderManager manager)
			{
				return new RenderSkyridgeWolf(manager);
			}
		});
	}
}
