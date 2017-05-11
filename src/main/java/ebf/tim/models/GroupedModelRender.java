package ebf.tim.models;

import ebf.tim.models.tmt.ModelRendererTurbo;
import ebf.tim.utility.RailUtility;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h2>grouped model render</h2>
 * renders several geometry as if they are one, good for grouping geometry together to display inventory contents and use percentage.
 * also used to render blocks since they are often rendered as a group rather than individually.
 *         Can still be used to render blocks individually.
 * @author Eternal Blue Flame
 */
public class GroupedModelRender {

    /**tag for all the cargo to render as a block, similar to what enderman does.
     * NOTE: this supports grouping, parts with the same exact name will represent the same percentage of inventory used.
     * NOTE 2: order is defined in the model geometry order, not by name, so be sure they are organized properly in your editor.
     * EXAMPLE: (tagRenderBlockCargo + "myblock5") and (tagRenderBlockCargo + "myblock2")
     * what is shown in the example will be two separate groups, each representing half the inventory, with 5 actually being the first because it was defined first.*/
    public static final String tagRenderBlockCargo = "renderblock";
    /**tag for all the cargo to render from the model, but as representation of inventory use.
     * NOTE: this supports grouping, parts with the same exact name will represent the same percentage of inventory used.
     * NOTE 2: order is defined in the model geometry order, not by name, so be sure they are organized properly in your editor.
     * EXAMPLE: (tagRenderModelCargo + "myblock5") and (tagRenderModelCargo + "myblock2")
     * what is shown in the example will be two separate groups, each representing half the inventory, with 5 actually being the first because it was defined first.*/
    public static final String tagRenderModelCargo = "rendercrate";

    /**if it should be rendered as a normal block from the inventory, similar to enderman, or part of the model*/
    private boolean isBlock;
    /**a reference to the geometry we will modify in this sub-class*/
    private List<ModelRendererTurbo> boxRefrence = new ArrayList<ModelRendererTurbo>();

    /**
     * used to add geometry to the group.
     * @param boxToRender the geometry to add
     * @param block if the geometry scale should be used to render a block rather than the actual geometry
     * @return returns this instance of GroupedModelRender
     */
    public GroupedModelRender add(ModelRendererTurbo boxToRender, boolean block){
        boxRefrence.add(boxToRender);
        isBlock = block;
        return this;
    }

    /**
     * to add more allowed types extend this function and add more circumstances before calling super.
     * @param modelReference the geometry to check
     * @return if the box refrence can be added
     */
    public static boolean canAdd(ModelRendererTurbo modelReference){
        return (modelReference.boxName.contains(tagRenderModelCargo) || modelReference.boxName.contains(tagRenderBlockCargo));
    }

    /**
     * to add more allowed types extend this function and add more circumstances before calling super.
     * @param modelReference the geometry to check
     * @return if the box is supposed to be rendered as a block or as part of the model.
     */
    public static boolean isBlock(ModelRendererTurbo modelReference){
        return (modelReference.boxName.contains(tagRenderBlockCargo) || modelReference.boxName.contains(tagRenderBlockCargo));
    }

    /**
     * used to actually render the models in this group, either as actual blocks, or as a part of the host model.
     * if you wanna change this stuff in your own mod you'll have to make you're own render that extends our RenderEntity.
     * @param field_147909_c the RenderBlocks variable from the render class, since it's private.
     * @param blockStack the Itemstack to render as a block.
     * @param render the render class used for binding the texture.
     * @param entityRenderScale the scale to render at.
     */
    public void doRender(RenderBlocks field_147909_c, ItemStack blockStack, RenderEntity render, float entityRenderScale){
        if (isBlock) {
            //render a block in place of the geometry.
            // bind the texture
            render.bindTexture(TextureMap.locationBlocksTexture);
            for (ModelRendererTurbo block : boxRefrence) {
                GL11.glPushMatrix();
                //define position from model
                GL11.glTranslated(((block.offsetX + block.rotationPointX) / 16),
                        ((block.offsetY + block.rotationPointY) / 16),
                        ((block.offsetZ + block.rotationPointZ) / 16));
                //define the rotation from the model
                GL11.glRotated(block.rotateAngleX * RailUtility.degreesD, 1, 0, 0);
                GL11.glRotated(block.rotateAngleY * RailUtility.degreesD, 0, 1, 0);
                GL11.glRotated(block.rotateAngleZ * RailUtility.degreesD, 0, 0, 1);
                //define scale based on the model
                GL11.glScaled(block.xScale - 0.0175, block.yScale - 0.0175, block.zScale - 0.0175);
                //now actually render the block.
                field_147909_c.renderBlockAsItem( Block.getBlockFromItem(blockStack.getItem()), blockStack.getItemDamage(), 1.0f);
                GL11.glPopMatrix();
            }
        } else {
            //render the geometry normally if it's not a block.
            render.bindTexture(render.getEntityTexture(null));
            for (ModelRendererTurbo block : boxRefrence) {
                block.render(entityRenderScale);
            }
        }
    }


    /**returns the group name*/
    public String getGroupName(){
        return boxRefrence.size()>0?boxRefrence.get(0).boxName:"";
    }

}