
package net.iceworks.arcanesouls.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.iceworks.arcanesouls.init.ArcaneSoulsModFluids;

public class SoulLavaItem extends BucketItem {
	public SoulLavaItem() {
		super(ArcaneSoulsModFluids.SOUL_LAVA, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
