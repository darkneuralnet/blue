package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.MaterialInstance;
/* loaded from: classes5.dex */
public class FilamentInstance {
    private Animator mAnimator = null;
    private FilamentAsset mAsset;
    private long mNativeObject;

    public FilamentInstance(FilamentAsset filamentAsset, long j) {
        this.mAsset = filamentAsset;
        this.mNativeObject = j;
    }

    private static native void nApplyMaterialVariant(long j, int i);

    private static native void nAttachSkin(long j, int i, int i2);

    private static native void nDetachSkin(long j, int i, int i2);

    private static native long nGetAnimator(long j);

    private static native void nGetEntities(long j, int[] iArr);

    private static native int nGetEntityCount(long j);

    private static native int nGetJointCountAt(long j, int i);

    private static native void nGetJointsAt(long j, int i, int[] iArr);

    private static native int nGetMaterialInstanceCount(long j);

    private static native void nGetMaterialInstances(long j, long[] jArr);

    private static native int nGetMaterialVariantCount(long j);

    private static native void nGetMaterialVariantNames(long j, String[] strArr);

    private static native int nGetRoot(long j);

    private static native int nGetSkinCount(long j);

    private static native void nGetSkinNames(long j, String[] strArr);

    public void applyMaterialVariant(int i) {
        nApplyMaterialVariant(this.mNativeObject, i);
    }

    public void attachSkin(int i, @Entity int i2) {
        nAttachSkin(getNativeObject(), i, i2);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public void detachSkin(int i, @Entity int i2) {
        nDetachSkin(getNativeObject(), i, i2);
    }

    public Animator getAnimator() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            return animator;
        }
        Animator animator2 = new Animator(nGetAnimator(this.mNativeObject));
        this.mAnimator = animator2;
        return animator2;
    }

    public FilamentAsset getAsset() {
        return this.mAsset;
    }

    @Entity
    public int[] getEntities() {
        int[] iArr = new int[nGetEntityCount(this.mNativeObject)];
        nGetEntities(this.mNativeObject, iArr);
        return iArr;
    }

    public int getJointCountAt(int i) {
        return nGetJointCountAt(getNativeObject(), i);
    }

    @Entity
    public int[] getJointsAt(int i) {
        int[] iArr = new int[getJointCountAt(i)];
        nGetJointsAt(getNativeObject(), i, iArr);
        return iArr;
    }

    public MaterialInstance[] getMaterialInstances() {
        int nGetMaterialInstanceCount = nGetMaterialInstanceCount(this.mNativeObject);
        MaterialInstance[] materialInstanceArr = new MaterialInstance[nGetMaterialInstanceCount];
        long[] jArr = new long[nGetMaterialInstanceCount];
        nGetMaterialInstances(this.mNativeObject, jArr);
        Engine engine = this.mAsset.getEngine();
        for (int i = 0; i < nGetMaterialInstanceCount; i++) {
            materialInstanceArr[i] = new MaterialInstance(engine, jArr[i]);
        }
        return materialInstanceArr;
    }

    public String[] getMaterialVariantNames() {
        String[] strArr = new String[nGetMaterialVariantCount(this.mNativeObject)];
        nGetMaterialVariantNames(this.mNativeObject, strArr);
        return strArr;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getRoot() {
        return nGetRoot(this.mNativeObject);
    }

    public int getSkinCount() {
        return nGetSkinCount(getNativeObject());
    }

    public String[] getSkinNames() {
        String[] strArr = new String[getSkinCount()];
        nGetSkinNames(getNativeObject(), strArr);
        return strArr;
    }
}
