package jp.tfyuto.shika_project.world.level.block;

import jp.tfyuto.shika_project.Shika_Project;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS , Shika_Project.MOD_ID);

    public static final RegistryObject<Block> SENBEI_BLOCK =
            BLOCKS.register("senbei_block",()->new OreBlock(
                    BlockBehaviour.Properties
                        .of(Material.WOOD)
                        .requiresCorrectToolForDrops()
                        .strength(3.0f,3.0f),
                    UniformInt.of(0,0)
            ));

    public static final RegistryObject<Block> COMPACT_SENBEI_BLOCK =
            BLOCKS.register("compact_senbei_block",()->new OreBlock(
                    BlockBehaviour.Properties
                            .of(Material.WOOD)
                            .requiresCorrectToolForDrops()
                            .strength(3.0f,3.0f),
                    UniformInt.of(0,0)
            ));
}
