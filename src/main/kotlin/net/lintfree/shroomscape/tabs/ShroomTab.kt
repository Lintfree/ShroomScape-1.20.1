package net.lintfree.shroomscape.tabs

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.ItemStack
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.RegistryObject

class ShroomTab {
	val CREATIVE_MODE_TABS: DeferredRegister<CreativeModeTab> = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShroomScape.ID)

	val SHROOM_TAB: RegistryObject<CreativeModeTab> = CREATIVE_MODE_TABS.register("shroom_tab") { ->
		CreativeModeTab.builder().icon { ItemStack(ModBlocks.RED_SHROOM_STAIRS.get().asItem()) }
			.title(Component.translatable("ShroomScape"))
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.icon { ItemStack(ModBlocks.RED_SHROOM_STAIRS.get().asItem()) }
			.displayItems { itemDisplayParameters, output ->
				output.accept(ModBlocks.RED_SHROOM_STAIRS.get())
				output.accept(ModBlocks.BROWN_SHROOM_STAIRS.get())
				output.accept(ModBlocks.SHROOM_STEM_STAIRS.get())
				output.accept(ModBlocks.RED_SHROOM_SLAB.get())
				output.accept(ModBlocks.BROWN_SHROOM_SLAB.get())
				output.accept(ModBlocks.SHROOM_STEM_SLAB.get())
				output.accept(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
				output.accept(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
				output.accept(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())
				output.accept(ModBlocks.RED_SHROOM_BUTTON.get())
				output.accept(ModBlocks.BROWN_SHROOM_BUTTON.get())
				output.accept(ModBlocks.SHROOM_STEM_BUTTON.get())
				output.accept(ModBlocks.RED_SHROOM_FENCE.get())
				output.accept(ModBlocks.BROWN_SHROOM_FENCE.get())
				output.accept(ModBlocks.SHROOM_STEM_FENCE.get())
				output.accept(ModBlocks.RED_SHROOM_FENCE_GATE.get())
				output.accept(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
				output.accept(ModBlocks.SHROOM_STEM_FENCE_GATE.get())
				output.accept(ModBlocks.RED_SHROOM_WALL.get())
				output.accept(ModBlocks.BROWN_SHROOM_WALL.get())
				output.accept(ModBlocks.SHROOM_STEM_WALL.get())
				output.accept(ModBlocks.RED_SHROOM_DOOR.get())
				output.accept(ModBlocks.BROWN_SHROOM_DOOR.get())
				output.accept(ModBlocks.SHROOM_STEM_DOOR.get())
				output.accept(ModBlocks.RED_SHROOM_TRAPDOOR.get())
				output.accept(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
				output.accept(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
			}.build()
	}

		fun addCreative(event: BuildCreativeModeTabContentsEvent) {
			if (event.tabKey == CreativeModeTabs.BUILDING_BLOCKS) {
				event.accept(ModBlocks.SHROOM_STEM_STAIRS.get())
				event.accept(ModBlocks.RED_SHROOM_STAIRS.get())
				event.accept(ModBlocks.BROWN_SHROOM_STAIRS.get())
				event.accept(ModBlocks.SHROOM_STEM_SLAB.get())
				event.accept(ModBlocks.RED_SHROOM_SLAB.get())
				event.accept(ModBlocks.BROWN_SHROOM_SLAB.get())
				event.accept(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())
				event.accept(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
				event.accept(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
				event.accept(ModBlocks.SHROOM_STEM_BUTTON.get())
				event.accept(ModBlocks.RED_SHROOM_BUTTON.get())
				event.accept(ModBlocks.BROWN_SHROOM_BUTTON.get())
				event.accept(ModBlocks.SHROOM_STEM_FENCE.get())
				event.accept(ModBlocks.RED_SHROOM_FENCE.get())
				event.accept(ModBlocks.BROWN_SHROOM_FENCE.get())
				event.accept(ModBlocks.SHROOM_STEM_FENCE_GATE.get())
				event.accept(ModBlocks.RED_SHROOM_FENCE_GATE.get())
				event.accept(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
				event.accept(ModBlocks.SHROOM_STEM_WALL.get())
				event.accept(ModBlocks.RED_SHROOM_WALL.get())
				event.accept(ModBlocks.BROWN_SHROOM_WALL.get())
				event.accept(ModBlocks.SHROOM_STEM_DOOR.get())
				event.accept(ModBlocks.RED_SHROOM_DOOR.get())
				event.accept(ModBlocks.BROWN_SHROOM_DOOR.get())
				event.accept(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
				event.accept(ModBlocks.RED_SHROOM_TRAPDOOR.get())
				event.accept(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
			}
			//if (event.tabKey == CreativeModeTabs.INGREDIENTS) {
			//event.accept(ModItems.EXAMPLE_ITEM)	}
		}

}
