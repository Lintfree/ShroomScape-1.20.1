package net.lintfree.shroomscape.block

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.item.ModItems
import net.minecraft.sounds.SoundEvents
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.Blocks.*
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.properties.BlockSetType
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject
import java.util.function.Supplier

object ModBlocks {
        val BLOCK_REGISTRY: DeferredRegister<Block> = DeferredRegister.create(ForgeRegistries.BLOCKS, ShroomScape.ID)

    val RED_SHROOM_STAIRS = registerBlock("red_shroom_stairs") { ->
        StairBlock({RED_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_STAIRS = registerBlock("brown_shroom_stairs") { ->
        StairBlock({BROWN_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_STAIRS = registerBlock("shroom_stem_stairs") { ->
        StairBlock({RED_MUSHROOM_BLOCK.defaultBlockState()}, BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_SLAB: RegistryObject<Block> = registerBlock("red_shroom_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_SLAB: RegistryObject<Block> = registerBlock("brown_shroom_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_SLAB: RegistryObject<Block> = registerBlock("shroom_stem_slab") {
        SlabBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_PRESSURE_PLATE: RegistryObject<Block> = registerBlock("red_shroom_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO)
    }

    val BROWN_SHROOM_PRESSURE_PLATE: RegistryObject<Block> = registerBlock("brown_shroom_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO)
    }

    val SHROOM_STEM_PRESSURE_PLATE: RegistryObject<Block> = registerBlock("shroom_stem_pressure_plate") {
        PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
            BlockBehaviour.Properties.copy(MUSHROOM_STEM)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO)
    }

    val RED_SHROOM_BUTTON: RegistryObject<Block> = registerBlock("red_shroom_button") {
        ButtonBlock(
            BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO,10,true)
    }

    val BROWN_SHROOM_BUTTON: RegistryObject<Block> = registerBlock("brown_shroom_button") {
        ButtonBlock(
            BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO,10,true)
    }

    val SHROOM_STEM_BUTTON: RegistryObject<Block> = registerBlock("shroom_stem_button") {
        ButtonBlock(
            BlockBehaviour.Properties.copy(MUSHROOM_STEM)
                .sound(SoundType.FUNGUS), BlockSetType.BAMBOO,10,true)
    }

    val RED_SHROOM_FENCE: RegistryObject<Block> = registerBlock("red_shroom_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_FENCE: RegistryObject<Block> = registerBlock("brown_shroom_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_FENCE: RegistryObject<Block> = registerBlock("shroom_stem_fence") {
        FenceBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS))
    }

    val RED_SHROOM_FENCE_GATE: RegistryObject<Block> = registerBlock("red_shroom_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE)
    }

    val BROWN_SHROOM_FENCE_GATE: RegistryObject<Block> = registerBlock("brown_shroom_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE)
    }

    val SHROOM_STEM_FENCE_GATE: RegistryObject<Block> = registerBlock("shroom_stem_fence_gate") {
        FenceGateBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE)
    }

    val RED_SHROOM_WALL: RegistryObject<Block> = registerBlock("red_shroom_wall") {
        WallBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK).sound(SoundType.FUNGUS))
    }

    val BROWN_SHROOM_WALL: RegistryObject<Block> = registerBlock("brown_shroom_wall") {
        WallBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK).sound(SoundType.FUNGUS))
    }

    val SHROOM_STEM_WALL: RegistryObject<Block> = registerBlock("shroom_stem_wall") {
        WallBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM).sound(SoundType.FUNGUS))
    }

    val  RED_SHROOM_DOOR: RegistryObject<Block> = registerBlock("red_shroom_door") {
        DoorBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS)
            .noOcclusion(), BlockSetType.BAMBOO)
    }

    val  BROWN_SHROOM_DOOR: RegistryObject<Block> = registerBlock("brown_shroom_door") {
        DoorBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS)
            .noOcclusion(), BlockSetType.BAMBOO)
    }

    val  SHROOM_STEM_DOOR: RegistryObject<Block> = registerBlock("shroom_stem_door") {
        DoorBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS)
            .noOcclusion(), BlockSetType.BAMBOO)
    }

    val RED_SHROOM_TRAPDOOR: RegistryObject<Block> = registerBlock("red_shroom_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.copy(RED_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS).noOcclusion(), BlockSetType.BAMBOO)
    }

    val BROWN_SHROOM_TRAPDOOR: RegistryObject<Block> = registerBlock("brown_shroom_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.copy(BROWN_MUSHROOM_BLOCK)
            .sound(SoundType.FUNGUS).noOcclusion(), BlockSetType.BAMBOO)
    }

    val SHROOM_STEM_TRAPDOOR: RegistryObject<Block> = registerBlock("shroom_stem_trapdoor") {
        TrapDoorBlock(BlockBehaviour.Properties.copy(MUSHROOM_STEM)
            .sound(SoundType.FUNGUS).noOcclusion(), BlockSetType.BAMBOO)
    }

    private fun <T : Block?> registerBlock(blockName: String, blockSupplier: Supplier<T>): RegistryObject<T> {
        val registeredBlock: RegistryObject<T> = BLOCK_REGISTRY.register(blockName, blockSupplier)
        registerBlockItem(blockName, registeredBlock)
        return registeredBlock
    }

    private fun <T: Block?>registerBlockItem(blockName: String, block: RegistryObject<T>) {
        ModItems.ITEM_REGISTRY.register(blockName) { -> BlockItem(block.get(), Item.Properties()) }
    }
}