
package net.mcreator.trintestmodone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinmagicoretoolstestShovelItem extends TrinTestMODOneElements.ModElement {
	@ObjectHolder("trintestmodone:trinmagicoretoolstestshovel")
	public static final Item block = null;
	public TrinmagicoretoolstestShovelItem(TrinTestMODOneElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("trinmagicoretoolstestshovel"));
	}
}
