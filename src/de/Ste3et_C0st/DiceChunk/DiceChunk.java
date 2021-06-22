package de.Ste3et_C0st.DiceChunk;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class DiceChunk{
	
	public boolean canBuild(Location loc, Player player) {return true;}
	public UUID getOwner(Location loc) {return null;}
	public static DiceChunk getInstance(){return null;}
}