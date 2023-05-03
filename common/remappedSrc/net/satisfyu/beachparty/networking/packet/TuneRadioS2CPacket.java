package net.satisfyu.beachparty.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.satisfyu.beachparty.util.RadioHelper;

public class TuneRadioS2CPacket {
    public static void receive(Minecraft client, ClientPacketListener handler,
                               FriendlyByteBuf buf, PacketSender responseSender) {
        BlockPos blockPos = buf.readBlockPos();
        int channel = buf.readInt();



        RadioHelper.tune(blockPos, channel);
    }
}
