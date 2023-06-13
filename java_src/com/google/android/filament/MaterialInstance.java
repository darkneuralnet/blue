package com.google.android.filament;

import com.google.android.filament.Colors;
import com.google.android.filament.Material;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.proguard.UsedByNative;
@UsedByNative("AssetLoader.cpp")
/* loaded from: classes5.dex */
public class MaterialInstance {
    private static final Material.CullingMode[] sCullingModeValues = Material.CullingMode.values();
    static final int[] sStencilFaceMapping = {1, 2, 3};
    private Material mMaterial;
    private String mName;
    private long mNativeMaterial;
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public enum BooleanElement {
        BOOL,
        BOOL2,
        BOOL3,
        BOOL4
    }

    /* loaded from: classes5.dex */
    public enum FloatElement {
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        MAT3,
        MAT4
    }

    /* loaded from: classes5.dex */
    public enum IntElement {
        INT,
        INT2,
        INT3,
        INT4
    }

    /* loaded from: classes5.dex */
    public enum StencilFace {
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    /* loaded from: classes5.dex */
    public enum StencilOperation {
        KEEP,
        ZERO,
        REPLACE,
        INCR_CLAMP,
        INCR_WRAP,
        DECR_CLAMP,
        DECR_WRAP,
        INVERT
    }

    public MaterialInstance(Engine engine, long j) {
        this.mNativeObject = j;
        this.mNativeMaterial = nGetMaterial(j);
    }

    public static MaterialInstance duplicate(MaterialInstance materialInstance, String str) {
        long nDuplicate = nDuplicate(materialInstance.mNativeObject, str);
        if (nDuplicate != 0) {
            return new MaterialInstance(materialInstance.getMaterial(), nDuplicate);
        }
        throw new IllegalStateException("Couldn't duplicate MaterialInstance");
    }

    private static native long nDuplicate(long j, String str);

    private static native int nGetCullingMode(long j);

    private static native float nGetMaskThreshold(long j);

    private static native long nGetMaterial(long j);

    private static native String nGetName(long j);

    private static native float nGetSpecularAntiAliasingThreshold(long j);

    private static native float nGetSpecularAntiAliasingVariance(long j);

    private static native boolean nIsColorWriteEnabled(long j);

    private static native boolean nIsDepthCullingEnabled(long j);

    private static native boolean nIsDepthWriteEnabled(long j);

    private static native boolean nIsDoubleSided(long j);

    private static native boolean nIsStencilWriteEnabled(long j);

    private static native void nSetBooleanParameterArray(long j, String str, int i, boolean[] zArr, int i2, int i3);

    private static native void nSetColorWrite(long j, boolean z);

    private static native void nSetCullingMode(long j, long j2);

    private static native void nSetDepthCulling(long j, boolean z);

    private static native void nSetDepthWrite(long j, boolean z);

    private static native void nSetDoubleSided(long j, boolean z);

    private static native void nSetFloatParameterArray(long j, String str, int i, float[] fArr, int i2, int i3);

    private static native void nSetIntParameterArray(long j, String str, int i, int[] iArr, int i2, int i3);

    private static native void nSetMaskThreshold(long j, float f);

    private static native void nSetParameterBool(long j, String str, boolean z);

    private static native void nSetParameterBool2(long j, String str, boolean z, boolean z2);

    private static native void nSetParameterBool3(long j, String str, boolean z, boolean z2, boolean z3);

    private static native void nSetParameterBool4(long j, String str, boolean z, boolean z2, boolean z3, boolean z4);

    private static native void nSetParameterFloat(long j, String str, float f);

    private static native void nSetParameterFloat2(long j, String str, float f, float f2);

    private static native void nSetParameterFloat3(long j, String str, float f, float f2, float f3);

    private static native void nSetParameterFloat4(long j, String str, float f, float f2, float f3, float f4);

    private static native void nSetParameterInt(long j, String str, int i);

    private static native void nSetParameterInt2(long j, String str, int i, int i2);

    private static native void nSetParameterInt3(long j, String str, int i, int i2, int i3);

    private static native void nSetParameterInt4(long j, String str, int i, int i2, int i3, int i4);

    private static native void nSetParameterTexture(long j, String str, long j2, int i);

    private static native void nSetPolygonOffset(long j, float f, float f2);

    private static native void nSetScissor(long j, int i, int i2, int i3, int i4);

    private static native void nSetSpecularAntiAliasingThreshold(long j, float f);

    private static native void nSetSpecularAntiAliasingVariance(long j, float f);

    private static native void nSetStencilCompareFunction(long j, long j2, long j3);

    private static native void nSetStencilOpDepthFail(long j, long j2, long j3);

    private static native void nSetStencilOpDepthStencilPass(long j, long j2, long j3);

    private static native void nSetStencilOpStencilFail(long j, long j2, long j3);

    private static native void nSetStencilReadMask(long j, int i, long j2);

    private static native void nSetStencilReferenceValue(long j, int i, long j2);

    private static native void nSetStencilWrite(long j, boolean z);

    private static native void nSetStencilWriteMask(long j, int i, long j2);

    private static native void nUnsetScissor(long j);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Material.CullingMode getCullingMode() {
        return sCullingModeValues[nGetCullingMode(getNativeObject())];
    }

    public float getMaskThreshold() {
        return nGetMaskThreshold(getNativeObject());
    }

    public Material getMaterial() {
        if (this.mMaterial == null) {
            this.mMaterial = new Material(this.mNativeMaterial);
        }
        return this.mMaterial;
    }

    public String getName() {
        if (this.mName == null) {
            this.mName = nGetName(getNativeObject());
        }
        return this.mName;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed MaterialInstance");
    }

    public float getSpecularAntiAliasingThreshold() {
        return nGetSpecularAntiAliasingThreshold(getNativeObject());
    }

    public float getSpecularAntiAliasingVariance() {
        return nGetSpecularAntiAliasingVariance(getNativeObject());
    }

    public boolean isColorWriteEnabled() {
        return nIsColorWriteEnabled(getNativeObject());
    }

    public boolean isDepthCullingEnabled() {
        return nIsDepthCullingEnabled(getNativeObject());
    }

    public boolean isDepthWriteEnabled() {
        return nIsDepthWriteEnabled(getNativeObject());
    }

    public boolean isDoubleSided() {
        return nIsDoubleSided(getNativeObject());
    }

    public boolean isStencilWriteEnabled() {
        return nIsStencilWriteEnabled(getNativeObject());
    }

    public void setColorWrite(boolean z) {
        nSetColorWrite(getNativeObject(), z);
    }

    public void setCullingMode(Material.CullingMode cullingMode) {
        nSetCullingMode(getNativeObject(), cullingMode.ordinal());
    }

    public void setDepthCulling(boolean z) {
        nSetDepthCulling(getNativeObject(), z);
    }

    public void setDepthWrite(boolean z) {
        nSetDepthWrite(getNativeObject(), z);
    }

    public void setDoubleSided(boolean z) {
        nSetDoubleSided(getNativeObject(), z);
    }

    public void setMaskThreshold(float f) {
        nSetMaskThreshold(getNativeObject(), f);
    }

    public void setParameter(String str, boolean z) {
        nSetParameterBool(getNativeObject(), str, z);
    }

    public void setPolygonOffset(float f, float f2) {
        nSetPolygonOffset(getNativeObject(), f, f2);
    }

    public void setScissor(int i, int i2, int i3, int i4) {
        nSetScissor(getNativeObject(), i, i2, i3, i4);
    }

    public void setSpecularAntiAliasingThreshold(float f) {
        nSetSpecularAntiAliasingThreshold(getNativeObject(), f);
    }

    public void setSpecularAntiAliasingVariance(float f) {
        nSetSpecularAntiAliasingVariance(getNativeObject(), f);
    }

    public void setStencilCompareFunction(TextureSampler.CompareFunction compareFunction, StencilFace stencilFace) {
        nSetStencilCompareFunction(getNativeObject(), compareFunction.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpDepthFail(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpDepthFail(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpDepthStencilPass(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpDepthStencilPass(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilOpStencilFail(StencilOperation stencilOperation, StencilFace stencilFace) {
        nSetStencilOpStencilFail(getNativeObject(), stencilOperation.ordinal(), sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilReadMask(int i, StencilFace stencilFace) {
        nSetStencilReadMask(getNativeObject(), i, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilReferenceValue(int i, StencilFace stencilFace) {
        nSetStencilReferenceValue(getNativeObject(), i, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void setStencilWrite(boolean z) {
        nSetStencilWrite(getNativeObject(), z);
    }

    public void setStencilWriteMask(int i, StencilFace stencilFace) {
        nSetStencilWriteMask(getNativeObject(), i, sStencilFaceMapping[stencilFace.ordinal()]);
    }

    public void unsetScissor() {
        nUnsetScissor(getNativeObject());
    }

    public void setParameter(String str, float f) {
        nSetParameterFloat(getNativeObject(), str, f);
    }

    public void setStencilReadMask(int i) {
        setStencilReadMask(i, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilReferenceValue(int i) {
        setStencilReferenceValue(i, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilWriteMask(int i) {
        setStencilWriteMask(i, StencilFace.FRONT_AND_BACK);
    }

    public void setParameter(String str, int i) {
        nSetParameterInt(getNativeObject(), str, i);
    }

    public MaterialInstance(Material material, long j) {
        this.mMaterial = material;
        this.mNativeMaterial = material.getNativeObject();
        this.mNativeObject = j;
    }

    public void setParameter(String str, boolean z, boolean z2) {
        nSetParameterBool2(getNativeObject(), str, z, z2);
    }

    public void setStencilCompareFunction(TextureSampler.CompareFunction compareFunction) {
        setStencilCompareFunction(compareFunction, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpDepthFail(StencilOperation stencilOperation) {
        setStencilOpDepthFail(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpDepthStencilPass(StencilOperation stencilOperation) {
        setStencilOpDepthStencilPass(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setStencilOpStencilFail(StencilOperation stencilOperation) {
        setStencilOpStencilFail(stencilOperation, StencilFace.FRONT_AND_BACK);
    }

    public void setParameter(String str, float f, float f2) {
        nSetParameterFloat2(getNativeObject(), str, f, f2);
    }

    public void setParameter(String str, int i, int i2) {
        nSetParameterInt2(getNativeObject(), str, i, i2);
    }

    public void setParameter(String str, boolean z, boolean z2, boolean z3) {
        nSetParameterBool3(getNativeObject(), str, z, z2, z3);
    }

    public MaterialInstance(long j) {
        this.mNativeObject = j;
        this.mNativeMaterial = nGetMaterial(j);
    }

    public void setParameter(String str, float f, float f2, float f3) {
        nSetParameterFloat3(getNativeObject(), str, f, f2, f3);
    }

    public void setParameter(String str, int i, int i2, int i3) {
        nSetParameterInt3(getNativeObject(), str, i, i2, i3);
    }

    public void setParameter(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        nSetParameterBool4(getNativeObject(), str, z, z2, z3, z4);
    }

    public void setParameter(String str, float f, float f2, float f3, float f4) {
        nSetParameterFloat4(getNativeObject(), str, f, f2, f3, f4);
    }

    public void setParameter(String str, int i, int i2, int i3, int i4) {
        nSetParameterInt4(getNativeObject(), str, i, i2, i3, i4);
    }

    public void setParameter(String str, Texture texture, TextureSampler textureSampler) {
        nSetParameterTexture(getNativeObject(), str, texture.getNativeObject(), textureSampler.mSampler);
    }

    public void setParameter(String str, BooleanElement booleanElement, boolean[] zArr, int i, int i2) {
        nSetBooleanParameterArray(getNativeObject(), str, booleanElement.ordinal(), zArr, i, i2);
    }

    public void setParameter(String str, IntElement intElement, int[] iArr, int i, int i2) {
        nSetIntParameterArray(getNativeObject(), str, intElement.ordinal(), iArr, i, i2);
    }

    public void setParameter(String str, FloatElement floatElement, float[] fArr, int i, int i2) {
        nSetFloatParameterArray(getNativeObject(), str, floatElement.ordinal(), fArr, i, i2);
    }

    public void setParameter(String str, Colors.RgbType rgbType, float f, float f2, float f3) {
        float[] linear = Colors.toLinear(rgbType, f, f2, f3);
        nSetParameterFloat3(getNativeObject(), str, linear[0], linear[1], linear[2]);
    }

    public void setParameter(String str, Colors.RgbaType rgbaType, float f, float f2, float f3, float f4) {
        float[] linear = Colors.toLinear(rgbaType, f, f2, f3, f4);
        nSetParameterFloat4(getNativeObject(), str, linear[0], linear[1], linear[2], linear[3]);
    }
}
