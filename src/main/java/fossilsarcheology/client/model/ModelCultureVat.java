
package fossilsarcheology.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
/**
public class ModelCultureVat extends ModelBase {
    // fields
    ModelRenderer main;
    ModelRenderer bottom;
    ModelRenderer opening;
    ModelRenderer opening1;

    public ModelCultureVat() {
        textureWidth = 64;
        textureHeight = 128;

        main = new ModelRenderer(this, 0, 0);
        main.addBox(-8F, -14F, -8F, 16, 14, 16);
        main.setRotationPoint(0F, 22F, 0F);
        main.setTextureSize(64, 128);
        main.mirror = true;
        setRotation(main, 0F, 0F, 0F);
        bottom = new ModelRenderer(this, 0, 30);
        bottom.addBox(-8F, 0F, -8F, 16, 2, 16);
        bottom.setRotationPoint(0F, 22F, 0F);
        bottom.setTextureSize(64, 128);
        bottom.mirror = true;
        setRotation(bottom, 0F, 0F, 0F);
        opening = new ModelRenderer(this, 0, 48);
        opening.addBox(-4F, 0F, -4F, 8, 0, 8);
        opening.setRotationPoint(0F, 8F, 0F);
        opening.setTextureSize(64, 128);
        opening.mirror = true;
        setRotation(opening, 0F, 0F, 0F);
        opening1 = new ModelRenderer(this, -8, 48);
        opening1.addBox(-4F, 0F, -4F, 8, 0, 8);
        opening1.setRotationPoint(0F, 8.0001F, 0F);
        opening1.setTextureSize(64, 128);
        opening1.mirror = true;
    }

    public void render(float f5) {
        GL11.glPushMatrix();
        opening.render(f5);
        opening1.render(f5);
        bottom.render(f5);
        main.render(f5);
        GL11.glPopMatrix();
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
*/
// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ModelCultureVat extends ModelBase {
    private final ModelRenderer Glass;
    private final ModelRenderer right_r1;
    private final ModelRenderer back_r1;
    private final ModelRenderer front_r1;
    private final ModelRenderer bb_main;

    public ModelCultureVat() {
        textureWidth = 128;
        textureHeight = 128;

        Glass = new ModelRenderer(this);
        Glass.setRotationPoint(7.0F, 19.0F, 0.0F);
        Glass.cubeList.add(new ModelBox(Glass, 32, 24, 1.0F, -26.0F, -8.0F, 0, 29, 16, 0.0F));

        right_r1 = new ModelRenderer(this);
        right_r1.setRotationPoint(-14.0F, 0.0F, 0.0F);
        Glass.addChild(right_r1);
        setRotationAngle(right_r1, 0.0F, 3.1416F, 0.0F);
        right_r1.cubeList.add(new ModelBox(right_r1, 32, 24, 1.0F, -26.0F, -8.0F, 0, 29, 16, 0.0F));

        back_r1 = new ModelRenderer(this);
        back_r1.setRotationPoint(-7.0F, 0.0F, -9.0F);
        Glass.addChild(back_r1);
        setRotationAngle(back_r1, 0.0F, -1.5708F, 0.0F);
        back_r1.cubeList.add(new ModelBox(back_r1, 32, 24, 1.0F, -26.0F, -8.0F, 0, 29, 16, 0.0F));

        front_r1 = new ModelRenderer(this);
        front_r1.setRotationPoint(-7.0F, 0.0F, 7.0F);
        Glass.addChild(front_r1);
        setRotationAngle(front_r1, 0.0F, -1.5708F, 0.0F);
        front_r1.cubeList.add(new ModelBox(front_r1, 32, 24, 1.0F, -26.0F, -8.0F, 0, 29, 16, 0.0F));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F));
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 18, -8.0F, -32.0F, -8.0F, 16, 1, 16, 0.0F));
    }

    public void render(float f5) {
        Glass.render(f5);
        bb_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}