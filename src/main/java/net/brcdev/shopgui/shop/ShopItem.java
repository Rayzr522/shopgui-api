package net.brcdev.shopgui.shop;

import net.brcdev.shopgui.player.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ShopItem {
  double getBuyPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount);

  double getSellPriceForAmount(Shop shop, Player player, PlayerData playerData, int amount);

  ItemStack getItem();
}
