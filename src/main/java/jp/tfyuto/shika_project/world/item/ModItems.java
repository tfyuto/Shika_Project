package jp.tfyuto.shika_project.world.item;

import jp.tfyuto.shika_project.Shika_Project;
import jp.tfyuto.shika_project.world.level.block.ModBlocks;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.crafting.conditions.TrueCondition;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , Shika_Project.MOD_ID);
    public static final RegistryObject<Item> EAT_TOFU =
            ITEMS.register("tofu",()->new TeleportStaff(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SHIKASENBEI =
            ITEMS.register("shikasenbei",()->new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(1)
                            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 10), 0.5F)
                            .alwaysEat()
                            .meat()
                            .fast()
                            .build()
                    ).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SHIKASENBEI_MOTO =
            ITEMS.register("shikasenbei_moto",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SENBEI_ORE =
            ITEMS.register("senbei_block",()->new BlockItem(ModBlocks.SENBEI_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> COMPACT_SENBEI_ORE =
            ITEMS.register("compact_senbei_block",()->new BlockItem(ModBlocks.COMPACT_SENBEI_BLOCK.get(),
                    new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    //new_tool
    public static final RegistryObject<Item> NORMAL_SHIKA_SHOVEL =
            ITEMS.register("shika_shovel",
                    ()->new ShovelItem(ModTiers.NORMAL_SHIKA,1.5F,-3.0F,
                            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> NORMAL_SHIKA_PICKAXE =
            ITEMS.register("shika_pickaxe",
                    ()->new PickaxeItem(ModTiers.NORMAL_SHIKA, 1 , 2.8F,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> NORMAL_SHIKA_SWORD =
            ITEMS.register("shika_sword",
                    ()->new SwordItem(ModTiers.NORMAL_SHIKA,4,-2.6F,
                            new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> NORMAL_SHIKA_AXE =
            ITEMS.register("shika_axe",
                    ()->new AxeItem(ModTiers.NORMAL_SHIKA,1,-2.8F,
                            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));


    public static final RegistryObject<Item> NORMAL_SHIKA_HOE =
            ITEMS.register("shika_hoe",
                    ()->new HoeItem(ModTiers.NORMAL_SHIKA,-3,0.0F,
                            new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ANTLER =
            ITEMS.register("antler",()->new Item(new Item.Properties()
                    .rarity(Rarity.UNCOMMON)
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(1)
                            .effect(()-> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,200,1),1.0F)
                            .alwaysEat()
                            .meat()
                            .fast()
                            .build()
                    ).tab(CreativeModeTab.TAB_FOOD)));

}

