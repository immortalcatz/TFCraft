package TFC.Blocks;

import java.util.ArrayList;
import java.util.Random;

import TFC.Core.Helper;
import TFC.Core.PlayerInfo;
import TFC.Core.PlayerManagerTFC;
import TFC.Core.TFCSettings;
import TFC.Core.TFC_Core;
import TFC.Items.ItemChisel;
import TFC.Items.ItemHammer;
import TFC.TileEntities.TileEntityPartial;
import TFC.TileEntities.TileEntityTerraFirepit;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.World;
import net.minecraft.src.mod_TFC_Core;

public class BlockStalactite extends BlockSlab
{

    public BlockStalactite(int par1)
    {
        super(par1);
        // TODO Auto-generated constructor stub
    }

    public void randomDisplayTick(World world, int i, int j, int k, Random random)
    {
        if (((((TileEntityPartial)world.getBlockTileEntity(i, j, k)).extraData >> 24) & 0x1) == 1 &&random.nextInt(500) == 0)
        {
            float f = (float)i + 0.5F;
            float f1 = (float)j + 0.1F + random.nextFloat() * 6F / 16F;
            float f2 = (float)k + 0.5F;
            float f3 = 0.52F;
            
            float f4 = random.nextFloat() * 0.6F;
            float f5 = random.nextFloat() * -0.6F;
            float f6 = random.nextFloat() * -0.6F;
            world.spawnParticle("water", f+f4 - 0.3F, f1,  f2 + f5 + 0.3F, 0.0D, -0.005D, 0.0D);
        }
    }
}
