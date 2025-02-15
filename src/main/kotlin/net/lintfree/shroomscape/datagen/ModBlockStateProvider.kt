package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape.ID
import net.lintfree.shroomscape.block.ModBlocks
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.BROWN_SHROOM_STAIRS
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.RED_SHROOM_STAIRS
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_SLAB
import net.lintfree.shroomscape.block.ModBlocks.SHROOM_STEM_STAIRS
import net.minecraft.data.PackOutput
import net.minecraft.world.level.block.*
import net.minecraft.world.level.block.Blocks.*
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.client.model.generators.ModelFile.UncheckedModelFile
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.RegistryObject

class ModBlockStateProvider (output: PackOutput, existingFileHelper: ExistingFileHelper) : BlockStateProvider(output, ID, existingFileHelper){

	// This is the function that will be called to generate the blockstates and models for the blocks
	override fun registerStatesAndModels() {
		stairsBlock(RED_SHROOM_STAIRS.get() as StairBlock, blockTexture(RED_MUSHROOM_BLOCK))
		stairsBlock(BROWN_SHROOM_STAIRS.get() as StairBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		stairsBlock(SHROOM_STEM_STAIRS.get() as StairBlock?, blockTexture(MUSHROOM_STEM))
		blockItem(RED_SHROOM_STAIRS)
		blockItem(BROWN_SHROOM_STAIRS)
		blockItem(SHROOM_STEM_STAIRS)

		slabBlock(RED_SHROOM_SLAB.get() as SlabBlock, blockTexture(RED_MUSHROOM_BLOCK), blockTexture(RED_MUSHROOM_BLOCK))
		slabBlock(BROWN_SHROOM_SLAB.get() as SlabBlock, blockTexture(BROWN_MUSHROOM_BLOCK), blockTexture(BROWN_MUSHROOM_BLOCK))
		slabBlock(SHROOM_STEM_SLAB.get() as SlabBlock, blockTexture(MUSHROOM_STEM), blockTexture(MUSHROOM_STEM))
		blockItem(RED_SHROOM_SLAB)
		blockItem(BROWN_SHROOM_SLAB)
		blockItem(SHROOM_STEM_SLAB)

		pressurePlateBlock(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(RED_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		pressurePlateBlock(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get() as PressurePlateBlock, blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
		blockItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

		buttonBlock(ModBlocks.RED_SHROOM_BUTTON.get() as ButtonBlock, blockTexture(RED_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.BROWN_SHROOM_BUTTON.get() as ButtonBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		buttonBlock(ModBlocks.SHROOM_STEM_BUTTON.get() as ButtonBlock, blockTexture(MUSHROOM_STEM))

		fenceBlock(ModBlocks.RED_SHROOM_FENCE.get() as FenceBlock, blockTexture(RED_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.BROWN_SHROOM_FENCE.get() as FenceBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceBlock(ModBlocks.SHROOM_STEM_FENCE.get() as FenceBlock, blockTexture(MUSHROOM_STEM))

		fenceGateBlock(ModBlocks.RED_SHROOM_FENCE_GATE.get() as FenceGateBlock, blockTexture(RED_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.BROWN_SHROOM_FENCE_GATE.get() as FenceGateBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		fenceGateBlock(ModBlocks.SHROOM_STEM_FENCE_GATE.get() as FenceGateBlock, blockTexture(MUSHROOM_STEM))
		blockItem(ModBlocks.RED_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.BROWN_SHROOM_FENCE_GATE)
		blockItem(ModBlocks.SHROOM_STEM_FENCE_GATE)

		wallBlock(ModBlocks.RED_SHROOM_WALL.get() as WallBlock, blockTexture(RED_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.BROWN_SHROOM_WALL.get() as WallBlock, blockTexture(BROWN_MUSHROOM_BLOCK))
		wallBlock(ModBlocks.SHROOM_STEM_WALL.get() as WallBlock, blockTexture(MUSHROOM_STEM))

		doorBlockWithRenderType(ModBlocks.RED_SHROOM_DOOR.get(), modLoc("block/red_shroom_door_bottom"), modLoc("block/red_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.BROWN_SHROOM_DOOR.get(), modLoc("block/brown_shroom_door_bottom"), modLoc( "block/brown_shroom_door_top"), ("cutout"))
		doorBlockWithRenderType( ModBlocks.SHROOM_STEM_DOOR.get(), modLoc("block/shroom_stem_door_bottom"), modLoc( "block/shroom_stem_door_top"), ("cutout"))

		trapdoorBlockWithRenderType(ModBlocks.RED_SHROOM_TRAPDOOR.get(), modLoc("block/red_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.BROWN_SHROOM_TRAPDOOR.get(), modLoc("block/brown_shroom_trapdoor"), true, "cutout")
		trapdoorBlockWithRenderType(ModBlocks.SHROOM_STEM_TRAPDOOR.get(), modLoc("block/shroom_stem_trapdoor"), true, "cutout")
	}

	fun blockWithItem(blockRegistryObject: RegistryObject<Block>) {
		simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()))
	}

	fun blockItem(blockRegistryObject: RegistryObject<Block>) {
		simpleBlockItem(blockRegistryObject.get(), UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path))
	}

	fun blockItem(blockRegistryObject: RegistryObject<TrapDoorBlock>, appendix: String) {
		simpleBlockItem(
			blockRegistryObject.get(),
			UncheckedModelFile("shroom_craft:block/" + blockRegistryObject.id.path + appendix)
			//appendix is used for additional info used in the models like the trapdoor
		)
	}
}