package com.itsremurin.data.biome;

import com.itsremurin.world.level.biome.FoolsBiomes;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.world.level.biome.Biomes;

public class FoolsBiomeData {
    public static void bootstrap(FabricDynamicRegistryProvider.Entries entries) {
        entries.add(FoolsBiomes.SULFUR_FIELDS, FoolsNetherBiomes.sulfurFields(entries.placedFeatures(), entries.configuredCarvers()));
    }
}
