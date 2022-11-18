
package net.mcreator.tbcm.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.tbcm.creativetab.TabTraditionalBrCoffeeAndMore;
import net.mcreator.tbcm.ElementsTbcmMod;

@ElementsTbcmMod.ModElement.Tag
public class ItemCoffeeLatte extends ElementsTbcmMod.ModElement {
	@GameRegistry.ObjectHolder("tbcm:coffee_latte")
	public static final Item block = null;
	public ItemCoffeeLatte(ElementsTbcmMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tbcm:coffee_latte", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 1f, false);
			setUnlocalizedName("coffee_latte");
			setRegistryName("coffee_latte");
			setAlwaysEdible();
			setCreativeTab(TabTraditionalBrCoffeeAndMore.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}
	}
}
