package com.google.android.filament.gltfio;
/* loaded from: classes5.dex */
public class Animator {
    private long mNativeObject;

    public Animator(long j) {
        this.mNativeObject = j;
    }

    private static native void nApplyAnimation(long j, int i, float f);

    private static native void nApplyCrossFade(long j, int i, float f, float f2);

    private static native int nGetAnimationCount(long j);

    private static native float nGetAnimationDuration(long j, int i);

    private static native String nGetAnimationName(long j, int i);

    private static native void nResetBoneMatrices(long j);

    private static native void nUpdateBoneMatrices(long j);

    public void applyAnimation(int i, float f) {
        nApplyAnimation(getNativeObject(), i, f);
    }

    public void applyCrossFade(int i, float f, float f2) {
        nApplyCrossFade(getNativeObject(), i, f, f2);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getAnimationCount() {
        return nGetAnimationCount(getNativeObject());
    }

    public float getAnimationDuration(int i) {
        return nGetAnimationDuration(getNativeObject(), i);
    }

    public String getAnimationName(int i) {
        return nGetAnimationName(getNativeObject(), i);
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Using Animator on destroyed asset");
    }

    public void resetBoneMatrices() {
        nResetBoneMatrices(getNativeObject());
    }

    public void updateBoneMatrices() {
        nUpdateBoneMatrices(getNativeObject());
    }
}
