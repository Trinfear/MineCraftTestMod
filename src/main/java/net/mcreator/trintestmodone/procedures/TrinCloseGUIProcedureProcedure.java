package net.mcreator.trintestmodone.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinCloseGUIProcedureProcedure extends TrinTestMODOneElements.ModElement {
	public TrinCloseGUIProcedureProcedure(TrinTestMODOneElements instance) {
		super(instance, 24);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrinCloseGUIProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
