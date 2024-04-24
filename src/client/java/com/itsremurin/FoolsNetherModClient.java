package com.itsremurin;

import com.itsremurin.renderer.FoolsItemBlockRenderTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.biome.v1.NetherBiomes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.biome.MultiNoiseBiomeSourceParameterList;

public class FoolsNetherModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		FoolsItemBlockRenderTypes.Init();
	}
}