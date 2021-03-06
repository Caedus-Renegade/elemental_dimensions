package caedus.mod.objects.blocks.machines.furnace.copper;

import caedus.mod.util.Reference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class CopperFurnaceGui extends GuiContainer {
	
	private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/gui/copper_furnace.png");
	private final InventoryPlayer player;
	private final TileEntityCopperFurnace tileentity;
	
	public CopperFurnaceGui(InventoryPlayer player, TileEntityCopperFurnace tileentity)
	{
		super(new ContainerCopperFurnace(player, tileentity));
		this.player = player;
		this.tileentity = tileentity;
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
	{
		String tileName = this.tileentity.getDisplayName().getUnformattedText();
		this.fontRenderer.drawString(tileName, (this.xSize /2 - this.fontRenderer.getStringWidth(tileName) / 2), 6, 4210752);
		this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
	{
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
		this.mc.getTextureManager().bindTexture(TEXTURES);
		int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
		
		if (TileEntityCopperFurnace.isBurning(tileentity))
		{
			int k = this.getBurnLeftScaled(13);
			this.drawTexturedModalRect(i + 56, j + 36 + 12 - k, 176, 12 - k, 14, k + 1);
		}
		
		int l = this.getCookProgressScaled(24);
        this.drawTexturedModalRect(i + 79, j + 34, 176, 14, l + 1, 16);
		
	}
	
	private int getBurnLeftScaled(int pixels)
	{
		int i = this.tileentity.getField(1);
		
		if (i == 0) i = 160;
		return this.tileentity.getField(0) * pixels / i;
	}
	
	private int getCookProgressScaled(int pixels)
	{
		int i = this.tileentity.getField(2);
		int j = this.tileentity.getField(3);
		return j != 0 && i != 0 ? i * pixels /j : 0;
	}
	
	public void drawScreen(int mouseX, int mouseY, float partialTicks) 
	{ 
		this.drawDefaultBackground(); 
		super.drawScreen(mouseX, mouseY, partialTicks); 
		this.renderHoveredToolTip(mouseX, mouseY); 
	}

}