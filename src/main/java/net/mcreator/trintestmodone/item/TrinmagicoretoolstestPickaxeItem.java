
package net.mcreator.trintestmodone.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinmagicoretoolstestPickaxeItem extends TrinTestMODOneElements.ModElement {
	@ObjectHolder("trintestmodone:trinmagicoretoolstestpickaxe")
	public static final Item block = null;
	public TrinmagicoretoolstestPickaxeItem(TrinTestMODOneElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1323;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("trinmagicoretoolstestpickaxe"));
	}
}
