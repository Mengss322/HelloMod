package io.github.csmd.hello_mod;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@SuppressWarnings({"all"})
@Mod("hello_mod")
@Mod.EventBusSubscriber
public class Main {

    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        Player entity = event.getEntity();
        Level level = entity.level();

        System.out.println("Minecraft start!!! 🤪");
    }

}
