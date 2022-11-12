package com.example.examplemod.entity.ghost;

import com.example.examplemod.GhostEntity;
import com.example.examplemod.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderGhost extends RenderLiving<EntityGhost> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/entity/ghost/ghost.png");

    public RenderGhost(RenderManager manager) {
        super(manager, new GhostEntity(), 0.0f);

      }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityGhost entity) {
        return TEXTURE;
    }


}
