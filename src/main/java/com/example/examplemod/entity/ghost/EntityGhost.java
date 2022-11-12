package com.example.examplemod.entity.ghost;

import com.example.examplemod.Util.SoundsHandler;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntityGhost extends EntityCreature

{

    public EntityGhost(World worldIn) {
        super(worldIn);
        this.setSize(width, height);
    }

    @Override
    protected void initEntityAI(){
        this.tasks.addTask(2, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAIWander(this, 0.6));
        this.tasks.addTask(2, new EntityAIAvoidEntity<>(this, EntityMob.class, 4.0F, 2.2D, 2.2D));
        this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.tasks.addTask(2, new EntityAIAttackMelee(this, 1D,false));
    }


    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.215);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
    }





        @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsHandler.Ghost_Death;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsHandler.Ghost_Ambient;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundsHandler.Ghost_Hurt;
    }

    @Nullable
    @Override
    protected ResourceLocation getLootTable() {
        return super.getLootTable();
    }
}
