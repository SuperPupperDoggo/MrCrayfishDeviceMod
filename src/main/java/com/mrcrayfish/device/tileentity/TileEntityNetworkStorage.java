package com.mrcrayfish.device.tileentity;

import com.mrcrayfish.device.core.io.FileSystem;
import com.mrcrayfish.device.util.TileEntityUtil;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityNetworkStorage extends TileEntityNetworkDevice
{
	//private FileSystem fileSystem;

	@Override
	public String getDeviceName()
	{
		return "Network Storage";
	}

	@Override
	public void update() 
	{
		super.update();
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		/*if(compound.hasKey("file_system"))
		{
			this.fileSystem = new FileSystem(this, compound.getCompoundTag("file_system"));
		}*/
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		super.writeToNBT(compound);

		/*if(fileSystem != null)
		{
			compound.setTag("file_system", fileSystem.toTag());
		}*/
		return compound;
	}

	@Override
	public NBTTagCompound writeSyncTag()
	{
		NBTTagCompound tag = super.writeSyncTag();

		return tag;
	}

	@Override
	public double getMaxRenderDistanceSquared() 
	{
		return 16384;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getRenderBoundingBox() 
	{
		return INFINITE_EXTENT_AABB;
	}

	/*public FileSystem getFileSystem()
	{
		if(fileSystem == null)
		{
			fileSystem = new FileSystem(this, new NBTTagCompound());
		}
		return fileSystem;
	}*/

}
