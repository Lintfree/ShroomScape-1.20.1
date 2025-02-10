package net.lintfree.shroomscape.item

import net.lintfree.shroomscape.ShroomScape
import net.minecraft.world.item.Item
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

object ModItems {

	val ITEM_REGISTRY: DeferredRegister<Item> = DeferredRegister.create(ForgeRegistries.ITEMS, ShroomScape.ID)
}