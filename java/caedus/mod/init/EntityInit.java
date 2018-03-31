package caedus.mod.init;

import caedus.mod.Main;
import caedus.mod.entity.EntitySkyridgeWolf;
import caedus.mod.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("skyridge_wolf", EntitySkyridgeWolf.class, Reference.ENTITY_SKYRIDGE_WOLF, 10, 11206570, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
