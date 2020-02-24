package fr.maxdu660.ExempleMod.init;

import fr.maxdu660.ExempleMod.ExempleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExempleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ExempleMod.MOD_ID)

public class ItemInit 
{

	public static final Item exemple_item = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("exemple_item"));
	}
	
}
