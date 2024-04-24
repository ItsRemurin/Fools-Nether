package com.itsremurin.data;

import com.itsremurin.FoolsNetherMod;
import com.itsremurin.data.biome.FoolsBiomeData;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class FoolsDynamicRegistryProvider extends FabricDynamicRegistryProvider {
    public FoolsDynamicRegistryProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        FoolsBiomeData.bootstrap(entries);
    }

    @Override
    public @NotNull String getName() {
        return FoolsNetherMod.MOD_ID;
    }
}
