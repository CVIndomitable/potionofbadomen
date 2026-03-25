package net.fabricmc.potionofbadomen;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.effcts.loot;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class potionofbadomen implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("potionofbadomen");

	public static final RegistryEntry<net.minecraft.entity.effect.StatusEffect> LOOT_EFFECT =
		Registry.registerReference(
			Registries.STATUS_EFFECT,
			Identifier.of("potionofbadomen", "loot"),
			new loot()
		);

	public static final RegistryEntry<Potion> LOOT =
		Registry.registerReference(
			Registries.POTION,
			Identifier.of("potionofbadomen", "loot"),
			new Potion("loot", new StatusEffectInstance(LOOT_EFFECT, 2000))
		);

	@Override
	public void onInitialize() {
		LOGGER.info("御机嫌よう，即将开始注册物品");

		// 注册酿造配方：粗制药水 + 白色旗帜 = 不详之兆药水
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.WHITE_BANNER, LOOT);
		});
	}
}
