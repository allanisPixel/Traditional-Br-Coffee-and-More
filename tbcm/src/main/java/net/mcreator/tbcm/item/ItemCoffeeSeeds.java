
package net.mcreator.tbcm.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.tbcm.creativetab.TabTraditionalBrCoffeeAndMore;
import net.mcreator.tbcm.ElementsTbcmMod;

@ElementsTbcmMod.ModElement.Tag
public class ItemCoffeeSeeds extends ElementsTbcmMod.ModElement {
	@GameRegistry.ObjectHolder("tbcm:coffee_seeds")
	public static final Item block = null;
	public ItemCoffeeSeeds(ElementsTbcmMod instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tbcm:coffee_seeds", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("coffee_seeds");
			setRegistryName("coffee_seeds");
			setCreativeTab(TabTraditionalBrCoffeeAndMore.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
