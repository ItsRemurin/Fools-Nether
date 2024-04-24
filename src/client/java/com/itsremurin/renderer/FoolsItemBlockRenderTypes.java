package com.itsremurin.renderer;

import com.google.common.collect.Maps;
import net.minecraft.Util;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.Map;

public class FoolsItemBlockRenderTypes {
    private static final Map<Block, RenderType> TYPE_BY_BLOCK = Util.make(Maps.newHashMap(), (hashMap) -> {

        });

    public static void Init() {}
}
