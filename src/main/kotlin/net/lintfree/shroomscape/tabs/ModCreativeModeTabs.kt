package net.lintfree.shroomscape.tabs

import net.lintfree.shroomscape.ShroomScape
import net.lintfree.shroomscape.block.ModBlocks
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.CreativeModeTabs
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items.RED_MUSHROOM
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent
import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.RegistryObject


class ModCreativeModeTabs {
	val TAB_REGISTRY: DeferredRegister<CreativeModeTab> =
		DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShroomScape.ID)

	val SHROOM_TAB: RegistryObject<CreativeModeTab> = TAB_REGISTRY.register("shroom_tab") {
		CreativeModeTab.builder()
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.icon { ItemStack(RED_MUSHROOM) }
			.title(Component.translatable("creativetab.shroom_tab"))

			.displayItems { pParameters, pOutput ->
				pOutput.accept(ModBlocks.RED_SHROOM_STAIRS.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_STAIRS.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_STAIRS.get())
				pOutput.accept(ModBlocks.RED_SHROOM_SLAB.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_SLAB.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_SLAB.get())
				pOutput.accept(ModBlocks.RED_SHROOM_PRESSURE_PLATE.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_PRESSURE_PLATE.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_PRESSURE_PLATE.get())
				pOutput.accept(ModBlocks.RED_SHROOM_BUTTON.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_BUTTON.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_BUTTON.get())
				pOutput.accept(ModBlocks.RED_SHROOM_FENCE.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_FENCE.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_FENCE.get())
				pOutput.accept(ModBlocks.RED_SHROOM_FENCE_GATE.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_FENCE_GATE.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_FENCE_GATE.get())
				pOutput.accept(ModBlocks.RED_SHROOM_WALL.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_WALL.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_WALL.get())
				pOutput.accept(ModBlocks.RED_SHROOM_DOOR.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_DOOR.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_DOOR.get())
				pOutput.accept(ModBlocks.RED_SHROOM_TRAPDOOR.get())
				pOutput.accept(ModBlocks.BROWN_SHROOM_TRAPDOOR.get())
				pOutput.accept(ModBlocks.SHROOM_STEM_TRAPDOOR.get())
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
	}

	companion object {
		fun register(bus: IEventBus) {
			ModCreativeModeTabs().apply {
				TAB_REGISTRY.register(bus)
				bus.addListener(::addCreative)
			}
		}
	}
}


