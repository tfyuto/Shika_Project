package jp.tfyuto.shika_project.world.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class TeleportStaff extends Item {
    public TeleportStaff(Properties properties) {
        super(properties);
    }

    // 前略
    //https://zenn.dev/cyber_hacnosuke/books/minecraft-modding/viewer/adv-item
    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        BlockHitResult ray = getPlayerPOVHitResult(world, player, ClipContext.Fluid.NONE);
        BlockPos lookPos = ray.getBlockPos();
        player.setPos(lookPos.getX(), lookPos.getY(), lookPos.getZ());
        return super.use(world, player, hand);
    }

// 後略
    }

