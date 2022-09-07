
package net.mcreator.tbcm.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.tbcm.item.ItemCoffeeBeans;
import net.mcreator.tbcm.ElementsTbcmMod;

@ElementsTbcmMod.ModElement.Tag
public class TabTraditionalBrCoffeeAndMore extends ElementsTbcmMod.ModElement {
	public TabTraditionalBrCoffeeAndMore(ElementsTbcmMod instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtraditional_br_coffee_and_more") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCoffeeBeans.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
