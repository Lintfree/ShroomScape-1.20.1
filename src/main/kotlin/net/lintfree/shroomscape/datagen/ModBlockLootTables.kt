package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.data.loot.BlockLootSubProvider
import net.minecraft.world.flag.FeatureFlags


class ModBlockLootTables : BlockLootSubProvider(emptySet(), FeatureFlags.REGISTRY.allFlags()) {

	override fun generate() {
	this.dropSelf(ModBlocks.RED_SHROOM_STAIRS.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_STAIRS.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_STAIRS.get())

	this.add(ModBlocks.RED_SHROOM_SLAB.get()) { block -> createSlabItemTable(ModBlocks.RED_SHROOM_SLAB.get()) }
	this.add(ModBlocks.BROWN_SHROOM_SLAB.get()) { block -> createSlabItemTable(ModBlocks.BROWN_SHROOM_SLAB.get()) }
	this.add(ModBlocks.SHROOM_STEM_SLAB.get()) { block -> createSlabItemTable(ModBlocks.SHROOM_STEM_SLAB.get()) }

	this.dropSelf(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

	this.dropSelf(ModBlocks.RED_SHROOM_BUTTON.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_BUTTON.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_BUTTON.get())

	this.dropSelf(ModBlocks.RED_SHROOM_FENCE.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_FENCE.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_FENCE.get())

	this.dropSelf(ModBlocks.RED_SHROOM_FENCE_GATE.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_FENCE_GATE.get())

	this.dropSelf(ModBlocks.RED_SHROOM_WALL.get())
	this.dropSelf(ModBlocks.BROWN_SHROOM_WALL.get())
	this.dropSelf(ModBlocks.SHROOM_STEM_WALL.get())

	this.add(ModBlocks.RED_SHROOM_DOOR.get()) { block -> createDoorTable(ModBlocks.RED_SHROOM_DOOR.get()) }
	this.add(ModBlocks.BROWN_SHROOM_DOOR.get()) { block -> createDoorTable(ModBlocks.BROWN_SHROOM_DOOR.get()) }
	this.add(ModBlocks.SHROOM_STEM_DOOR.get()) { block -> createDoorTable(ModBlocks.SHROOM_STEM_DOOR.get()) }
	}

	//override fun getKnownBlocks(): Iterable<Block?> {
		//return ModBlocks.getEntries().stream().map(RegistryObject::get)::iterator
}
