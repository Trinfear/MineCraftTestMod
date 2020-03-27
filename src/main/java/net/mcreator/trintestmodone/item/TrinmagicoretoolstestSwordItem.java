
package net.mcreator.trintestmodone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinmagicoretoolstestSwordItem extends TrinTestMODOneElements.ModElement {
	@ObjectHolder("trintestmodone:trinmagicoretoolstestsword")
	public static final Item block = null;
	public TrinmagicoretoolstestSwordItem(TrinTestMODOneElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1323;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 20f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("trinmagicoretoolstestsword"));
	}
}
