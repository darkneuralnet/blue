package com.google.android.filament;

import com.google.android.filament.VertexBuffer;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.KotlinVersion;
/* loaded from: classes5.dex */
public class RenderableManager {
    private static final String LOG_TAG = "Filament";
    private static final VertexBuffer.VertexAttribute[] sVertexAttributeValues = VertexBuffer.VertexAttribute.values();
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* loaded from: classes5.dex */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                RenderableManager.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder(int i) {
            long nCreateBuilder = RenderableManager.nCreateBuilder(i);
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Builder blendOrder(int i, int i2) {
            RenderableManager.nBuilderBlendOrder(this.mNativeBuilder, i, i2);
            return this;
        }

        public Builder boundingBox(Box box) {
            RenderableManager.nBuilderBoundingBox(this.mNativeBuilder, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
            return this;
        }

        public void build(Engine engine, @Entity int i) {
            if (RenderableManager.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject(), i)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Renderable component for entity " + i + ", see log.");
        }

        public Builder castShadows(boolean z) {
            RenderableManager.nBuilderCastShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder channel(int i) {
            RenderableManager.nBuilderChannel(this.mNativeBuilder, i);
            return this;
        }

        public Builder culling(boolean z) {
            RenderableManager.nBuilderCulling(this.mNativeBuilder, z);
            return this;
        }

        public Builder enableSkinningBuffers(boolean z) {
            RenderableManager.nEnableSkinningBuffers(this.mNativeBuilder, z);
            return this;
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i2, int i3, int i4, int i5) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3, i4, i5);
            return this;
        }

        public Builder globalBlendOrderEnabled(int i, boolean z) {
            RenderableManager.nBuilderGlobalBlendOrderEnabled(this.mNativeBuilder, i, z);
            return this;
        }

        public Builder instances(int i) {
            RenderableManager.nBuilderInstances(this.mNativeBuilder, i);
            return this;
        }

        public Builder layerMask(int i, int i2) {
            RenderableManager.nBuilderLayerMask(this.mNativeBuilder, i & KotlinVersion.MAX_COMPONENT_VALUE, i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            return this;
        }

        public Builder lightChannel(int i, boolean z) {
            RenderableManager.nBuilderLightChannel(this.mNativeBuilder, i, z);
            return this;
        }

        public Builder material(int i, MaterialInstance materialInstance) {
            RenderableManager.nBuilderMaterial(this.mNativeBuilder, i, materialInstance.getNativeObject());
            return this;
        }

        public Builder morphing(int i) {
            RenderableManager.nBuilderMorphing(this.mNativeBuilder, i);
            return this;
        }

        public Builder priority(int i) {
            RenderableManager.nBuilderPriority(this.mNativeBuilder, i);
            return this;
        }

        public Builder receiveShadows(boolean z) {
            RenderableManager.nBuilderReceiveShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder screenSpaceContactShadows(boolean z) {
            RenderableManager.nBuilderScreenSpaceContactShadows(this.mNativeBuilder, z);
            return this;
        }

        public Builder skinning(SkinningBuffer skinningBuffer, int i, int i2) {
            RenderableManager.nBuilderSkinningBuffer(this.mNativeBuilder, skinningBuffer != null ? skinningBuffer.getNativeObject() : 0L, i, i2);
            return this;
        }

        public Builder morphing(int i, int i2, MorphTargetBuffer morphTargetBuffer, int i3, int i4) {
            RenderableManager.nBuilderSetMorphTargetBufferAt(this.mNativeBuilder, i, i2, morphTargetBuffer.getNativeObject(), i3, i4);
            return this;
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i2, int i3) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i2, i3);
            return this;
        }

        public Builder skinning(int i) {
            RenderableManager.nBuilderSkinning(this.mNativeBuilder, i);
            return this;
        }

        public Builder morphing(int i, int i2, MorphTargetBuffer morphTargetBuffer) {
            RenderableManager.nBuilderSetMorphTargetBufferAt(this.mNativeBuilder, i, i2, morphTargetBuffer.getNativeObject(), 0, morphTargetBuffer.getVertexCount());
            return this;
        }

        public Builder skinning(int i, Buffer buffer) {
            if (RenderableManager.nBuilderSkinningBones(this.mNativeBuilder, i, buffer, buffer.remaining()) >= 0) {
                return this;
            }
            throw new BufferOverflowException();
        }

        public Builder geometry(int i, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
            RenderableManager.nBuilderGeometry(this.mNativeBuilder, i, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject());
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum PrimitiveType {
        POINTS(0),
        LINES(1),
        LINE_STRIP(3),
        TRIANGLES(4),
        TRIANGLE_STRIP(5);
        
        private final int mType;

        PrimitiveType(int i) {
            this.mType = i;
        }

        public int getValue() {
            return this.mType;
        }
    }

    public RenderableManager(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBlendOrder(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoundingBox(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannel(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCulling(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGeometry(long j, int i, int i2, long j2, long j3, int i3, int i4, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGlobalBlendOrderEnabled(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInstances(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayerMask(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMaterial(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMorphing(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPriority(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReceiveShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderScreenSpaceContactShadows(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSetMorphTargetBufferAt(long j, int i, int i2, long j2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinning(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nBuilderSkinningBones(long j, int i, Buffer buffer, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSkinningBuffer(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i);

    private static native void nDestroy(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nEnableSkinningBuffers(long j, boolean z);

    private static native void nGetAxisAlignedBoundingBox(long j, int i, float[] fArr, float[] fArr2);

    private static native int nGetEnabledAttributesAt(long j, int i, int i2);

    private static native int nGetInstance(long j, int i);

    private static native boolean nGetLightChannel(long j, int i, int i2);

    private static native long nGetMaterialInstanceAt(long j, int i, int i2);

    private static native int nGetMorphTargetCount(long j, int i);

    private static native int nGetPrimitiveCount(long j, int i);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsShadowCaster(long j, int i);

    private static native boolean nIsShadowReceiver(long j, int i);

    private static native void nSetAxisAlignedBoundingBox(long j, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private static native void nSetBlendOrderAt(long j, int i, int i2, int i3);

    private static native int nSetBonesAsMatrices(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native int nSetBonesAsQuaternions(long j, int i, Buffer buffer, int i2, int i3, int i4);

    private static native void nSetCastShadows(long j, int i, boolean z);

    private static native void nSetChannel(long j, int i, int i2);

    private static native void nSetCulling(long j, int i, boolean z);

    private static native void nSetGeometryAt(long j, int i, int i2, int i3, long j2, long j3, int i4, int i5);

    private static native void nSetGlobalBlendOrderEnabledAt(long j, int i, int i2, boolean z);

    private static native void nSetLayerMask(long j, int i, int i2, int i3);

    private static native void nSetLightChannel(long j, int i, int i2, boolean z);

    private static native void nSetMaterialInstanceAt(long j, int i, int i2, long j2);

    private static native void nSetMorphTargetBufferAt(long j, int i, int i2, int i3, long j2, int i4, int i5);

    private static native void nSetMorphWeights(long j, int i, float[] fArr, int i2);

    private static native void nSetPriority(long j, int i, int i2);

    private static native void nSetReceiveShadows(long j, int i, boolean z);

    private static native void nSetScreenSpaceContactShadows(long j, int i, boolean z);

    private static native void nSetSkinningBuffer(long j, int i, long j2, int i2, int i3);

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    public Box getAxisAlignedBoundingBox(@EntityInstance int i, Box box) {
        if (box == null) {
            box = new Box();
        }
        nGetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter(), box.getHalfExtent());
        return box;
    }

    public Set<VertexBuffer.VertexAttribute> getEnabledAttributesAt(@EntityInstance int i, int i2) {
        int nGetEnabledAttributesAt = nGetEnabledAttributesAt(this.mNativeObject, i, i2);
        EnumSet noneOf = EnumSet.noneOf(VertexBuffer.VertexAttribute.class);
        VertexBuffer.VertexAttribute[] vertexAttributeArr = sVertexAttributeValues;
        for (int i3 = 0; i3 < vertexAttributeArr.length; i3++) {
            if (((1 << i3) & nGetEnabledAttributesAt) != 0) {
                noneOf.add(vertexAttributeArr[i3]);
            }
        }
        return Collections.unmodifiableSet(noneOf);
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public boolean getLightChannel(@EntityInstance int i, int i2) {
        return nGetLightChannel(this.mNativeObject, i, i2);
    }

    public MaterialInstance getMaterialInstanceAt(@EntityInstance int i, int i2) {
        return new MaterialInstance(nGetMaterialInstanceAt(this.mNativeObject, i, i2));
    }

    public int getMorphTargetCount(@EntityInstance int i) {
        return nGetMorphTargetCount(this.mNativeObject, i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public int getPrimitiveCount(@EntityInstance int i) {
        return nGetPrimitiveCount(this.mNativeObject, i);
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isShadowCaster(@EntityInstance int i) {
        return nIsShadowCaster(this.mNativeObject, i);
    }

    public boolean isShadowReceiver(@EntityInstance int i) {
        return nIsShadowReceiver(this.mNativeObject, i);
    }

    public void setAxisAlignedBoundingBox(@EntityInstance int i, Box box) {
        nSetAxisAlignedBoundingBox(this.mNativeObject, i, box.getCenter()[0], box.getCenter()[1], box.getCenter()[2], box.getHalfExtent()[0], box.getHalfExtent()[1], box.getHalfExtent()[2]);
    }

    public void setBlendOrderAt(@EntityInstance int i, int i2, int i3) {
        nSetBlendOrderAt(this.mNativeObject, i, i2, i3);
    }

    public void setBonesAsMatrices(@EntityInstance int i, Buffer buffer, int i2, int i3) {
        if (nSetBonesAsMatrices(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setBonesAsQuaternions(@EntityInstance int i, Buffer buffer, int i2, int i3) {
        if (nSetBonesAsQuaternions(this.mNativeObject, i, buffer, buffer.remaining(), i2, i3) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setCastShadows(@EntityInstance int i, boolean z) {
        nSetCastShadows(this.mNativeObject, i, z);
    }

    public void setChannel(@EntityInstance int i, int i2) {
        nSetChannel(this.mNativeObject, i, i2);
    }

    public void setCulling(@EntityInstance int i, boolean z) {
        nSetCulling(this.mNativeObject, i, z);
    }

    public void setGeometryAt(@EntityInstance int i, int i2, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer, int i3, int i4) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), i3, i4);
    }

    public void setGlobalBlendOrderEnabledAt(@EntityInstance int i, int i2, boolean z) {
        nSetGlobalBlendOrderEnabledAt(this.mNativeObject, i, i2, z);
    }

    public void setLayerMask(@EntityInstance int i, int i2, int i3) {
        nSetLayerMask(this.mNativeObject, i, i2, i3);
    }

    public void setLightChannel(@EntityInstance int i, int i2, boolean z) {
        nSetLightChannel(this.mNativeObject, i, i2, z);
    }

    public void setMaterialInstanceAt(@EntityInstance int i, int i2, MaterialInstance materialInstance) {
        int requiredAttributesAsInt = materialInstance.getMaterial().getRequiredAttributesAsInt();
        if ((nGetEnabledAttributesAt(this.mNativeObject, i, i2) & requiredAttributesAsInt) != requiredAttributesAsInt) {
            Platform platform = Platform.get();
            platform.warn("setMaterialInstanceAt() on primitive " + i2 + " of Renderable at " + i + ": declared attributes " + getEnabledAttributesAt(i, i2) + " do no satisfy required attributes " + materialInstance.getMaterial().getRequiredAttributes());
        }
        nSetMaterialInstanceAt(this.mNativeObject, i, i2, materialInstance.getNativeObject());
    }

    public void setMorphTargetBufferAt(@EntityInstance int i, int i2, int i3, MorphTargetBuffer morphTargetBuffer, int i4, int i5) {
        nSetMorphTargetBufferAt(this.mNativeObject, i, i2, i3, morphTargetBuffer.getNativeObject(), i4, i5);
    }

    public void setMorphWeights(@EntityInstance int i, float[] fArr, int i2) {
        nSetMorphWeights(this.mNativeObject, i, fArr, i2);
    }

    public void setPriority(@EntityInstance int i, int i2) {
        nSetPriority(this.mNativeObject, i, i2);
    }

    public void setReceiveShadows(@EntityInstance int i, boolean z) {
        nSetReceiveShadows(this.mNativeObject, i, z);
    }

    public void setScreenSpaceContactShadows(@EntityInstance int i, boolean z) {
        nSetScreenSpaceContactShadows(this.mNativeObject, i, z);
    }

    public void setSkinningBuffer(@EntityInstance int i, SkinningBuffer skinningBuffer, int i2, int i3) {
        nSetSkinningBuffer(this.mNativeObject, i, skinningBuffer.getNativeObject(), i2, i3);
    }

    public void setGeometryAt(@EntityInstance int i, int i2, PrimitiveType primitiveType, VertexBuffer vertexBuffer, IndexBuffer indexBuffer) {
        nSetGeometryAt(this.mNativeObject, i, i2, primitiveType.getValue(), vertexBuffer.getNativeObject(), indexBuffer.getNativeObject(), 0, indexBuffer.getIndexCount());
    }

    public void setMorphTargetBufferAt(@EntityInstance int i, int i2, int i3, MorphTargetBuffer morphTargetBuffer) {
        nSetMorphTargetBufferAt(this.mNativeObject, i, i2, i3, morphTargetBuffer.getNativeObject(), 0, morphTargetBuffer.getVertexCount());
    }
}
