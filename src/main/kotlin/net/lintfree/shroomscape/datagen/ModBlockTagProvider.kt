package net.lintfree.shroomscape.datagen

import net.lintfree.shroomscape.ShroomScape.ID
import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.core.HolderLookup
import net.minecraft.data.PackOutput
import net.minecraft.tags.BlockTags.*
import net.minecraftforge.common.data.BlockTagsProvider
import net.minecraftforge.common.data.ExistingFileHelper
import java.util.concurrent.CompletableFuture

class ModBlockTagProvider (
	output: PackOutput,
	lookupProvider: CompletableFuture<HolderLookup.Provider>,
	existingFileHelper: ExistingFileHelper) :
	BlockTagsProvider(output, lookupProvider, ID, existingFileHelper){

	override fun addTags(p0: HolderLookup.Provider) {
		tag(FENCES)
			.add(ModBlocks.RED_SHROOM_FENCE.get())
			.add(ModBlocks.BROWN_SHROOM_FENCE.get())
			.add(ModBlocks.SHROOM_STEM_FENCE.get())

		tag(FENCE_GATES)
			.add(ModBlocks.RED_SHROOM_FENCE_GATE.get())
			.add(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
			.add(ModBlocks.SHROOM_STEM_FENCE_GATE.get())

		tag(WALLS)
			.add(ModBlocks.RED_SHROOM_WALL.get())
			.add(ModBlocks.BROWN_SHROOM_WALL.get())
			.add(ModBlocks.SHROOM_STEM_WALL.get())

		tag(BUTTONS)
			.add(ModBlocks.RED_SHROOM_BUTTON.get())
			.add(ModBlocks.BROWN_SHROOM_BUTTON.get())
			.add(ModBlocks.SHROOM_STEM_BUTTON.get())

		tag(STAIRS)
			.add(ModBlocks.RED_SHROOM_STAIRS.get())
			.add(ModBlocks.BROWN_SHROOM_STAIRS.get())
			.add(ModBlocks.SHROOM_STEM_STAIRS.get())

		tag(SLABS)
			.add(ModBlocks.RED_SHROOM_SLAB.get())
			.add(ModBlocks.BROWN_SHROOM_SLAB.get())
			.add(ModBlocks.SHROOM_STEM_SLAB.get())

		tag(DOORS)
			.add(ModBlocks.RED_SHROOM_DOOR.get())
			.add(ModBlocks.BROWN_SHROOM_DOOR.get())
			.add(ModBlocks.SHROOM_STEM_DOOR.get())

		tag(TRAPDOORS)
			.add(ModBlocks.RED_SHROOM_TRAPDOOR.get())
			.add(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
			.add(ModBlocks.SHROOM_STEM_TRAPDOOR.get())

		tag(PRESSURE_PLATES)
			.add(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
			.add(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
			.add(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

		tag(MINEABLE_WITH_AXE)
			.add(ModBlocks.RED_SHROOM_FENCE.get())
			.add(ModBlocks.BROWN_SHROOM_FENCE.get())
			.add(ModBlocks.SHROOM_STEM_FENCE.get())
			.add(ModBlocks.RED_SHROOM_FENCE_GATE.get())
			.add(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
			.add(ModBlocks.SHROOM_STEM_FENCE_GATE.get())
			.add(ModBlocks.RED_SHROOM_BUTTON.get())
			.add(ModBlocks.BROWN_SHROOM_BUTTON.get())
			.add(ModBlocks.SHROOM_STEM_BUTTON.get())
			.add(ModBlocks.RED_SHROOM_DOOR.get())
			.add(ModBlocks.BROWN_SHROOM_DOOR.get())
			.add(ModBlocks.SHROOM_STEM_DOOR.get())
			.add(ModBlocks.RED_SHROOM_TRAPDOOR.get())
			.add(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
			.add(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
			.add(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
			.add(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
			.add(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())

		tag(MINEABLE_WITH_PICKAXE)
			.add(ModBlocks.RED_SHROOM_WALL.get())
			.add(ModBlocks.BROWN_SHROOM_WALL.get())
			.add(ModBlocks.SHROOM_STEM_WALL.get())
			.add(ModBlocks.RED_SHROOM_STAIRS.get())
			.add(ModBlocks.BROWN_SHROOM_STAIRS.get())
			.add(ModBlocks.SHROOM_STEM_STAIRS.get())
			.add(ModBlocks.RED_SHROOM_SLAB.get())
			.add(ModBlocks.BROWN_SHROOM_SLAB.get())
			.add(ModBlocks.SHROOM_STEM_SLAB.get())

	}
}