package com.itsremurin;

import com.itsremurin.world.level.biome.FoolsBiomes;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.biome.Biomes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoolsNetherMod implements ModInitializer {

	public static final String MOD_ID = "fools_nether";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	@SuppressWarnings("UnstableApiUsage")
	public void onInitialize() {
		if(!FabricDataGenHelper.ENABLED) FoolsBiomes.Init();
	}
}