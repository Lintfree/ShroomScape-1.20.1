package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.ShroomScape.ID
import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.PackOutput
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.DoorBlock
import net.minecraft.world.level.block.TrapDoorBlock
import net.minecraftforge.client.model.generators.ItemModelBuilder
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject


class ModItemModelProvider (output: PackOutput, existingFileHelper: ExistingFileHelper) : ItemModelProvider(output, ID, existingFileHelper) {
	override fun registerModels() {
		buttonItem(ModBlocks.RED_SHROOM_BUTTON, ResourceLocation("minecraft", "block/red_mushroom_block"))
		buttonItem(ModBlocks.BROWN_SHROOM_BUTTON, ResourceLocation("minecraft", "block/brown_mushroom_block"))
		buttonItem(ModBlocks.SHROOM_STEM_BUTTON, ResourceLocation("minecraft", "block/mushroom_stem"))

		fenceItem(ModBlocks.RED_SHROOM_FENCE, ResourceLocation("minecraft", "block/red_mushroom_block"))
		fenceItem(ModBlocks.BROWN_SHROOM_FENCE, ResourceLocation("minecraft", "block/brown_mushroom_block"))
		fenceItem(ModBlocks.SHROOM_STEM_FENCE, ResourceLocation("minecraft", "block/mushroom_stem"))

		wallItem(ModBlocks.RED_SHROOM_WALL, ResourceLocation("minecraft", "block/red_mushroom_block"))
		wallItem(ModBlocks.BROWN_SHROOM_WALL, ResourceLocation("minecraft", "block/brown_mushroom_block"))
		wallItem(ModBlocks.SHROOM_STEM_WALL, ResourceLocation("minecraft", "block/mushroom_stem"))

		simpleBlockItem(ModBlocks.RED_SHROOM_STAIRS)
		simpleBlockItem(ModBlocks.BROWN_SHROOM_STAIRS)
		simpleBlockItem(ModBlocks.SHROOM_STEM_STAIRS)

		simpleBlockItem(ModBlocks.RED_SHROOM_SLAB)
		simpleBlockItem(ModBlocks.BROWN_SHROOM_SLAB)
		simpleBlockItem(ModBlocks.SHROOM_STEM_SLAB)

		simpleBlockItem(ModBlocks.RED_SHROOM_PRESSURE_PLATE)
		simpleBlockItem(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE)
		simpleBlockItem(ModBlocks.SHROOM_STEM_PRESSURE_PLATE)

		simpleBlockItem(ModBlocks.RED_SHROOM_FENCE_GATE)
		simpleBlockItem(ModBlocks.BROWN_SHROOM_FENCE_GATE)
		simpleBlockItem(ModBlocks.SHROOM_STEM_FENCE_GATE)

		doorBlockItem(ModBlocks.RED_SHROOM_DOOR)
		doorBlockItem(ModBlocks.BROWN_SHROOM_DOOR)
		doorBlockItem(ModBlocks.SHROOM_STEM_DOOR)

		trapdoorItem(ModBlocks.RED_SHROOM_TRAPDOOR)
		trapdoorItem(ModBlocks.BROWN_SHROOM_TRAPDOOR)
		trapdoorItem(ModBlocks.SHROOM_STEM_TRAPDOOR)

	}

	private fun buttonItem(block: RegistryObject<Block>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/button_inventory"))
			.texture("texture", baseBlock)

	}

	private fun fenceItem(block: RegistryObject<Block>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/fence_inventory"))
			.texture("texture", baseBlock)
	}

	private fun wallItem(block: RegistryObject<Block>, baseBlock: ResourceLocation) {
		withExistingParent(block.id.path, mcLoc("block/wall_inventory"))
			.texture("wall", baseBlock)
	}

	private fun doorBlockItem(item: RegistryObject<DoorBlock>): ItemModelBuilder {
		return withExistingParent(item.id.path, mcLoc("item/generated"))
			.texture("layer0", modLoc("item/" + item.id.path))
	}

	fun simpleBlockItem(block: RegistryObject<Block>) {
		this.withExistingParent(
			ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.path)
		)
	}

	fun trapdoorItem(block: RegistryObject<TrapDoorBlock>) {
		this.withExistingParent(
			ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()) !!.getPath() + "_bottom")
		)
	}
}


			//ForgeRegistries.BLOCKS.getKey(block.get()) !!.path,
			//modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get())!!.path + "_bottom")




