
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
public class ItemCoffeeMacchiato extends ElementsTbcmMod.ModElement {
	@GameRegistry.ObjectHolder("tbcm:coffee_macchiato")
	public static final Item block = null;
	public ItemCoffeeMacchiato(ElementsTbcmMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tbcm:coffee_macchiato", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("coffee_macchiato");
			setRegistryName("coffee_macchiato");
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
