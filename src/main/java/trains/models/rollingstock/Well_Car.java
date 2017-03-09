package trains.models.rollingstock;
//Exported java file
//Keep in mind that you still need to fill in some blanks
// - ZeuX

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import trains.models.tmt.ModelRendererTurbo;

public class Well_Car extends ModelBase
{
	public Well_Car()
	{
		Bottom1 = new ModelRendererTurbo(this, 300, 0);
		Bottom1.addBox(0F, 0F, 0F, 20, 1, 86, 0F);
		Bottom1.setRotationPoint(-10F, 22F, -42F);
		Bottom1.rotateAngleX = 0F;
		Bottom1.rotateAngleY = 0F;
		Bottom1.rotateAngleZ = 0F;
		Side1 = new ModelRendererTurbo(this, 0, 118);
		Side1.addBox(0F, 0F, 0F, 1, 4, 112, 0F);
		Side1.setRotationPoint(-11F, 14F, -55F);
		Side1.rotateAngleX = 0F;
		Side1.rotateAngleY = 0F;
		Side1.rotateAngleZ = 0F;
		Side2 = new ModelRendererTurbo(this, 0, 0);
		Side2.addBox(0F, 0F, 0F, 1, 4, 112, 0F);
		Side2.setRotationPoint(10F, 14F, -55F);
		Side2.rotateAngleX = 0F;
		Side2.rotateAngleY = 0F;
		Side2.rotateAngleZ = 0F;
		SideLow1 = new ModelRendererTurbo(this, 0, 236);
		SideLow1.addBox(0F, 0F, 0F, 1, 5, 88, 0F);
		SideLow1.setRotationPoint(-11F, 18F, -43F);
		SideLow1.rotateAngleX = 0F;
		SideLow1.rotateAngleY = 0F;
		SideLow1.rotateAngleZ = -0.1745329F;
		SideLow2 = new ModelRendererTurbo(this, 0, 332);
		SideLow2.addBox(-1F, 0F, -44F, 1, 5, 88, 0F);
		SideLow2.setRotationPoint(11F, 18F, 1F);
		SideLow2.rotateAngleX = 0F;
		SideLow2.rotateAngleY = 0F;
		SideLow2.rotateAngleZ = 0.1745329F;
		Buttom2 = new ModelRendererTurbo(this, 274, 88);
		Buttom2.addBox(0F, 0F, 0F, 20, 1, 13, 0F);
		Buttom2.setRotationPoint(-10F, 17F, -55F);
		Buttom2.rotateAngleX = 0F;
		Buttom2.rotateAngleY = 0F;
		Buttom2.rotateAngleZ = 0F;
		Front1 = new ModelRendererTurbo(this, 228, 97);
		Front1.addBox(0F, 0F, 0F, 20, 5, 1, 0F);
		Front1.setRotationPoint(-10F, 18F, -43F);
		Front1.rotateAngleX = 0F;
		Front1.rotateAngleY = 0F;
		Front1.rotateAngleZ = 0F;
		Bogie1 = new ModelRendererTurbo(this, 465, 215);
		Bogie1.addBox(0F, 0F, 0F, 10, 5, 10, 0F);
		Bogie1.setRotationPoint(-5F, 18F, -55F);
		Bogie1.rotateAngleX = 0F;
		Bogie1.rotateAngleY = 0F;
		Bogie1.rotateAngleZ = 0F;
		Front2 = new ModelRendererTurbo(this, 228, 114);
		Front2.addBox(0F, 0F, 0F, 20, 3, 1, 0F);
		Front2.setRotationPoint(-10F, 14F, -55F);
		Front2.rotateAngleX = 0F;
		Front2.rotateAngleY = 0F;
		Front2.rotateAngleZ = 0F;
		Back1 = new ModelRendererTurbo(this, 228, 89);
		Back1.addBox(0F, 0F, 0F, 20, 5, 1, 0F);
		Back1.setRotationPoint(-10F, 18F, 44F);
		Back1.rotateAngleX = 0F;
		Back1.rotateAngleY = 0F;
		Back1.rotateAngleZ = 0F;
		Bottom5 = new ModelRendererTurbo(this, 344, 88);
		Bottom5.addBox(0F, 0F, 0F, 20, 1, 13, 0F);
		Bottom5.setRotationPoint(-10F, 17F, 44F);
		Bottom5.rotateAngleX = 0F;
		Bottom5.rotateAngleY = 0F;
		Bottom5.rotateAngleZ = 0F;
		Back2 = new ModelRendererTurbo(this, 228, 106);
		Back2.addBox(0F, 0F, 0F, 20, 3, 1, 0F);
		Back2.setRotationPoint(-10F, 14F, 56F);
		Back2.rotateAngleX = 0F;
		Back2.rotateAngleY = 0F;
		Back2.rotateAngleZ = 0F;
		Bogie2 = new ModelRendererTurbo(this, 465, 235);
		Bogie2.addBox(0F, 0F, 0F, 10, 5, 10, 0F);
		Bogie2.setRotationPoint(-5F, 18F, 47F);
		Bogie2.rotateAngleX = 0F;
		Bogie2.rotateAngleY = 0F;
		Bogie2.rotateAngleZ = 0F;
		Wheel1 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel1.addBox(0F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel1.setRotationPoint(-6F, 21.5F, -46.5F);
		Wheel1.rotateAngleX = 0F;
		Wheel1.rotateAngleY = 0F;
		Wheel1.rotateAngleZ = 0F;
		Wheel2 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel2.addBox(0F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel2.setRotationPoint(-6F, 21.5F, -53.5F);
		Wheel2.rotateAngleX = 0F;
		Wheel2.rotateAngleY = 0F;
		Wheel2.rotateAngleZ = 0F;
		Wheel3 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel3.addBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel3.setRotationPoint(6F, 21.5F, -53.5F);
		Wheel3.rotateAngleX = 0F;
		Wheel3.rotateAngleY = 0F;
		Wheel3.rotateAngleZ = 0F;
		Wheel4 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel4.addBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel4.setRotationPoint(6F, 21.5F, -46.5F);
		Wheel4.rotateAngleX = 0F;
		Wheel4.rotateAngleY = 0F;
		Wheel4.rotateAngleZ = 0F;
		Wheel5 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel5.addBox(0F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel5.setRotationPoint(-6F, 21.5F, 55.5F);
		Wheel5.rotateAngleX = 0F;
		Wheel5.rotateAngleY = 0F;
		Wheel5.rotateAngleZ = 0F;
		Wheel6 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel6.addBox(0F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel6.setRotationPoint(-6F, 21.5F, 48.5F);
		Wheel6.rotateAngleX = 0F;
		Wheel6.rotateAngleY = 0F;
		Wheel6.rotateAngleZ = 0F;
		Wheel7 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel7.addBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel7.setRotationPoint(6F, 21.5F, 55.5F);
		Wheel7.rotateAngleX = 0F;
		Wheel7.rotateAngleY = 0F;
		Wheel7.rotateAngleZ = 0F;
		Wheel8 = new ModelRendererTurbo(this, 482, 252, "wheel");
		Wheel8.addBox(-1F, -2.5F, -2.5F, 1, 5, 5, 0F);
		Wheel8.setRotationPoint(6F, 21.5F, 48.5F);
		Wheel8.rotateAngleX = 0F;
		Wheel8.rotateAngleY = 0F;
		Wheel8.rotateAngleZ = 0F;
		TopWalk1 = new ModelRendererTurbo(this, 456, 264);
		TopWalk1.addBox(0F, 0F, 0F, 20, 1, 5, 0F);
		TopWalk1.setRotationPoint(-10F, 14F, -54F);
		TopWalk1.rotateAngleX = 0F;
		TopWalk1.rotateAngleY = 0F;
		TopWalk1.rotateAngleZ = 0F;
		TopWalk2 = new ModelRendererTurbo(this, 456, 264);
		TopWalk2.addBox(0F, 0F, 0F, 20, 1, 5, 0F);
		TopWalk2.setRotationPoint(-10F, 14F, 51F);
		TopWalk2.rotateAngleX = 0F;
		TopWalk2.rotateAngleY = 0F;
		TopWalk2.rotateAngleZ = 0F;
		Handbrack1 = new ModelRendererTurbo(this, 456, 274);
		Handbrack1.addBox(0F, 0F, 0F, 1, 6, 1, 0F);
		Handbrack1.setRotationPoint(-9F, 8F, -50F);
		Handbrack1.rotateAngleX = 0F;
		Handbrack1.rotateAngleY = 0F;
		Handbrack1.rotateAngleZ = 0F;
		Handbrack2 = new ModelRendererTurbo(this, 456, 285);
		Handbrack2.addBox(0F, 0F, 0F, 3, 3, 0, 0F);
		Handbrack2.setRotationPoint(-10F, 8F, -50F);
		Handbrack2.rotateAngleX = 0F;
		Handbrack2.rotateAngleY = 0F;
		Handbrack2.rotateAngleZ = 0F;
		Coupler1 = new ModelRendererTurbo(this, 454, 304);
		Coupler1.addBox(0F, 0F, 0F, 1, 2, 3, 0F);
		Coupler1.setRotationPoint(-1F, 18F, -58F);
		Coupler1.rotateAngleX = 0F;
		Coupler1.rotateAngleY = 0F;
		Coupler1.rotateAngleZ = 0F;
		Coupler2 = new ModelRendererTurbo(this, 454, 312);
		Coupler2.addBox(0F, 0F, 0F, 1, 2, 1, 0F);
		Coupler2.setRotationPoint(0F, 18F, -58F);
		Coupler2.rotateAngleX = 0F;
		Coupler2.rotateAngleY = 0F;
		Coupler2.rotateAngleZ = 0F;
		Coupler3 = new ModelRendererTurbo(this, 454, 304);
		Coupler3.addBox(10F, 5F, 0F, 1, 2, 3, 0F);
		Coupler3.setRotationPoint(-10F, 13F, 57F);
		Coupler3.rotateAngleX = 0F;
		Coupler3.rotateAngleY = 0F;
		Coupler3.rotateAngleZ = 0F;
		Coupler4 = new ModelRendererTurbo(this, 454, 312);
		Coupler4.addBox(0F, 0F, 0F, 1, 2, 1, 0F);
		Coupler4.setRotationPoint(-1F, 18F, 59F);
		Coupler4.rotateAngleX = 0F;
		Coupler4.rotateAngleY = 0F;
		Coupler4.rotateAngleZ = 0F;
		Container1 = new ModelRendererTurbo(this, 228, 124, "crate1");
		Container1.addBox(0F, 0F, 0F, 18, 18, 84, 0F);
		Container1.setRotationPoint(-9F, 4F, -41F);
		Container1.rotateAngleX = 0F;
		Container1.rotateAngleY = 0F;
		Container1.rotateAngleZ = 0F;
		Container2 = new ModelRendererTurbo(this, 228, 230, "crate2");
		Container2.addBox(0F, 0F, -14F, 18, 18, 84, 0F);
		Container2.setRotationPoint(-9F, -14F, -27F);
		Container2.rotateAngleX = 0F;
		Container2.rotateAngleY = 0F;
		Container2.rotateAngleZ = 0F;
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Bottom1.render(f5);
		Side1.render(f5);
		Side2.render(f5);
		SideLow1.render(f5);
		SideLow2.render(f5);
		Buttom2.render(f5);
		Front1.render(f5);
		Bogie1.render(f5);
		Front2.render(f5);
		Back1.render(f5);
		Bottom5.render(f5);
		Back2.render(f5);
		Bogie2.render(f5);
		Wheel1.render(f5);
		Wheel2.render(f5);
		Wheel3.render(f5);
		Wheel4.render(f5);
		Wheel5.render(f5);
		Wheel6.render(f5);
		Wheel7.render(f5);
		Wheel8.render(f5);
		TopWalk1.render(f5);
		TopWalk2.render(f5);
		Handbrack1.render(f5);
		Handbrack2.render(f5);
		Coupler1.render(f5);
		Coupler2.render(f5);
		Coupler3.render(f5);
		Coupler4.render(f5);
		Container1.render(f5);
		Container2.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	//fields
	public ModelRendererTurbo Bottom1;
	public ModelRendererTurbo Side1;
	public ModelRendererTurbo Side2;
	public ModelRendererTurbo SideLow1;
	public ModelRendererTurbo SideLow2;
	public ModelRendererTurbo Buttom2;
	public ModelRendererTurbo Front1;
	public ModelRendererTurbo Bogie1;
	public ModelRendererTurbo Front2;
	public ModelRendererTurbo Back1;
	public ModelRendererTurbo Bottom5;
	public ModelRendererTurbo Back2;
	public ModelRendererTurbo Bogie2;
	public ModelRendererTurbo Wheel1;
	public ModelRendererTurbo Wheel2;
	public ModelRendererTurbo Wheel3;
	public ModelRendererTurbo Wheel4;
	public ModelRendererTurbo Wheel5;
	public ModelRendererTurbo Wheel6;
	public ModelRendererTurbo Wheel7;
	public ModelRendererTurbo Wheel8;
	public ModelRendererTurbo TopWalk1;
	public ModelRendererTurbo TopWalk2;
	public ModelRendererTurbo Handbrack1;
	public ModelRendererTurbo Handbrack2;
	public ModelRendererTurbo Coupler1;
	public ModelRendererTurbo Coupler2;
	public ModelRendererTurbo Coupler3;
	public ModelRendererTurbo Coupler4;
	public ModelRendererTurbo Container1;
	public ModelRendererTurbo Container2;
}
