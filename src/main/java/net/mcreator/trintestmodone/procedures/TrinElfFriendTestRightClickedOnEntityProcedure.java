package net.mcreator.trintestmodone.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinElfFriendTestRightClickedOnEntityProcedure extends TrinTestMODOneElements.ModElement {
	public TrinElfFriendTestRightClickedOnEntityProcedure(TrinTestMODOneElements instance) {
		super(instance, 21);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies)
	{
	
		if (dependencies.get("entity") == null)
		{
			System.err.println("Failed to load dependency entity for procedure TrinElfFriendTestRightClickedOnEntity!");
			return;
		}
		
		if (dependencies.get("itemstack") == null)
		{
			System.err.println("Failed to load dependency itemstack for procedure TrinElfFriendTestRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		
		if (((true) == (true)))
		{
			{
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().sendMessage(new StringTextComponent("hey, elf boy here"));
			}
			
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel((int) 5);
				
			itemstack.addEnchantment(Enchantments.PROTECTION, (int) 10);
		}
	}
}
