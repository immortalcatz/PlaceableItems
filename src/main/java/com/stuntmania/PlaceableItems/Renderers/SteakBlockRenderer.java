package com.stuntmania.PlaceableItems.Renderers;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.stuntmania.PlaceableItems.PlaceableItems;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class SteakBlockRenderer extends TileEntitySpecialRenderer {

	IModelCustom model = AdvancedModelLoader.loadModel(new ResourceLocation(PlaceableItems.MODID, "Steak.obj"));
	ResourceLocation texture = new ResourceLocation(PlaceableItems.MODID, "textures/blocks/steak.png");

	@Override
	public void renderTileEntityAt(TileEntity entity, double x, double y, double z, float p_147500_8_) {
		bindTexture(texture);

		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 0.05F, (float) z + 0.5F);
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(2, 2, 2);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
