// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package net.coisoetal.ParabensJevinha.entities.animations;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.coisoetal.ParabensJevinha.entities.client.ModAnimationDefinitions;
import net.coisoetal.ParabensJevinha.entities.custom.RobaloEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class RobaloModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart robalo;
	private final ModelPart head;
	private final ModelPart barbatanaD;
	private final ModelPart barbatanaE;
	private final ModelPart cauda;
	private final ModelPart barbatana;

	public RobaloModel(ModelPart root) {
		this.robalo = root.getChild("robalo");
		this.head = robalo.getChild("head");
		this.barbatanaD = robalo.getChild("head").getChild("barbatanaD");
		this.barbatanaE = robalo.getChild("head").getChild("barbatanaE");
		this.cauda = robalo.getChild("cauda");
		this.barbatana = robalo.getChild("cauda").getChild("barbatana");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition robalo = partdefinition.addOrReplaceChild("robalo", CubeListBuilder.create(), PartPose.offset(-1.0F, 23.0F, -2.0F));

		PartDefinition head = robalo.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -6.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(-0.0001F)), PartPose.offset(1.0F, -1.0F, 3.0F));

		PartDefinition barbatanaD = head.addOrReplaceChild("barbatanaD", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.0F, -3.0F));

		PartDefinition barbatanaD_r1 = barbatanaD.addOrReplaceChild("barbatanaD_r1", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition barbatanaE = head.addOrReplaceChild("barbatanaE", CubeListBuilder.create(), PartPose.offset(1.0F, 2.0F, -3.0F));

		PartDefinition barbatanaE_r1 = barbatanaE.addOrReplaceChild("barbatanaE_r1", CubeListBuilder.create().texOffs(9, 0).addBox(0.0F, -2.0F, -1.0F, 0.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cauda = robalo.addOrReplaceChild("cauda", CubeListBuilder.create().texOffs(9, 14).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -1.0F, 3.0F));

		PartDefinition barbatana = cauda.addOrReplaceChild("barbatana", CubeListBuilder.create().texOffs(2, 1).addBox(0.0F, -2.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, -2.0F, 1.0F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(0.0F, 1.0F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 4.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.ROBALO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((RobaloEntity) entity).idleAnimationState, ModAnimationDefinitions.ROBALO_IDLE, ageInTicks, 1f);

	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		robalo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return robalo;
	}
}