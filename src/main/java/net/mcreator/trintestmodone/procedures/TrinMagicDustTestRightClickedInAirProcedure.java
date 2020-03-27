package net.mcreator.trintestmodone.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.trintestmodone.TrinTestMODOneElements;

@TrinTestMODOneElements.ModElement.Tag
public class TrinMagicDustTestRightClickedInAirProcedure extends TrinTestMODOneElements.ModElement {
	public TrinMagicDustTestRightClickedInAirProcedure(TrinTestMODOneElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrinMagicDustTestRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 5, (false), (false)));
	}
}
