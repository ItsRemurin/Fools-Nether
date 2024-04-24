package com.itsremurin.world.level.biome;

import com.itsremurin.FoolsNetherMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public abstract class FoolsBiomes {
    public static final ResourceKey<Biome> SULFUR_FIELDS = register("sulfur_fields");

    private static ResourceKey<Biome> register(String string) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(FoolsNetherMod.MOD_ID, string));
    }

    public static void Init() {

    }
}
