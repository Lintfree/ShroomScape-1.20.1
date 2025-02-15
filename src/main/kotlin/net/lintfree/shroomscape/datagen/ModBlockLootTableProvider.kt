package net.lintfree.shroomscape.datagen

import net.minecraft.data.PackOutput
import net.minecraft.data.loot.LootTableProvider
import net.minecraft.data.loot.LootTableProvider.SubProviderEntry
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets
import java.util.function.Supplier


object ModBlockLootTableProvider {
	fun create(output: PackOutput): LootTableProvider {
		return LootTableProvider(
			output, mutableSetOf<ResourceLocation?>(), listOf<SubProviderEntry?>(
				SubProviderEntry(Supplier { ModBlockLootTables() }, LootContextParamSets.BLOCK)
			)
		)
	}
}