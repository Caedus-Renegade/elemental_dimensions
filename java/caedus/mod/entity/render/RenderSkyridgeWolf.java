package caedus.mod.entity.render;

import caedus.mod.entity.EntitySkyridgeWolf;
import caedus.mod.entity.model.ModelSkyridgeWolf;
import caedus.mod.util.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSkyridgeWolf extends RenderLiving<EntitySkyridgeWolf>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/skyridge_wolf.png");
	
	public RenderSkyridgeWolf(RenderManager manager)
	{
		super(manager, new ModelSkyridgeWolf(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitySkyridgeWolf entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntitySkyridgeWolf entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
	
}
