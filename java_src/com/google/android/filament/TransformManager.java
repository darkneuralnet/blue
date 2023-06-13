package com.google.android.filament;
/* loaded from: classes5.dex */
public class TransformManager {
    private long mNativeObject;

    public TransformManager(long j) {
        this.mNativeObject = j;
    }

    private static native void nCommitLocalTransformTransaction(long j);

    private static native int nCreate(long j, int i);

    private static native int nCreateArray(long j, int i, int i2, float[] fArr);

    private static native int nCreateArrayFp64(long j, int i, int i2, double[] dArr);

    private static native void nDestroy(long j, int i);

    private static native int nGetChildCount(long j, int i);

    private static native void nGetChildren(long j, int i, int[] iArr, int i2);

    private static native int nGetInstance(long j, int i);

    private static native int nGetParent(long j, int i);

    private static native void nGetTransform(long j, int i, float[] fArr);

    private static native void nGetTransformFp64(long j, int i, double[] dArr);

    private static native void nGetWorldTransform(long j, int i, float[] fArr);

    private static native void nGetWorldTransformFp64(long j, int i, double[] dArr);

    private static native boolean nHasComponent(long j, int i);

    private static native boolean nIsAccurateTranslationsEnabled(long j);

    private static native void nOpenLocalTransformTransaction(long j);

    private static native void nSetAccurateTranslationsEnabled(long j, boolean z);

    private static native void nSetParent(long j, int i, int i2);

    private static native void nSetTransform(long j, int i, float[] fArr);

    private static native void nSetTransformFp64(long j, int i, double[] dArr);

    public void commitLocalTransformTransaction() {
        nCommitLocalTransformTransaction(this.mNativeObject);
    }

    @EntityInstance
    public int create(@Entity int i) {
        return nCreate(this.mNativeObject, i);
    }

    public void destroy(@Entity int i) {
        nDestroy(this.mNativeObject, i);
    }

    public int getChildCount(@EntityInstance int i) {
        return nGetChildCount(this.mNativeObject, i);
    }

    @Entity
    public int[] getChildren(@EntityInstance int i, int[] iArr) {
        if (iArr == null) {
            iArr = new int[getChildCount(i)];
        }
        if (iArr.length > 0) {
            nGetChildren(this.mNativeObject, i, iArr, iArr.length);
        }
        return iArr;
    }

    @EntityInstance
    public int getInstance(@Entity int i) {
        return nGetInstance(this.mNativeObject, i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Entity
    public int getParent(@EntityInstance int i) {
        return nGetParent(this.mNativeObject, i);
    }

    public float[] getTransform(@EntityInstance int i, float[] fArr) {
        float[] assertMat4f = Asserts.assertMat4f(fArr);
        nGetTransform(this.mNativeObject, i, assertMat4f);
        return assertMat4f;
    }

    public float[] getWorldTransform(@EntityInstance int i, float[] fArr) {
        float[] assertMat4f = Asserts.assertMat4f(fArr);
        nGetWorldTransform(this.mNativeObject, i, assertMat4f);
        return assertMat4f;
    }

    public boolean hasComponent(@Entity int i) {
        return nHasComponent(this.mNativeObject, i);
    }

    public boolean isAccurateTranslationsEnabled() {
        return nIsAccurateTranslationsEnabled(this.mNativeObject);
    }

    public void openLocalTransformTransaction() {
        nOpenLocalTransformTransaction(this.mNativeObject);
    }

    public void setAccurateTranslationsEnabled(boolean z) {
        nSetAccurateTranslationsEnabled(this.mNativeObject, z);
    }

    public void setParent(@EntityInstance int i, @EntityInstance int i2) {
        nSetParent(this.mNativeObject, i, i2);
    }

    public void setTransform(@EntityInstance int i, float[] fArr) {
        Asserts.assertMat4fIn(fArr);
        nSetTransform(this.mNativeObject, i, fArr);
    }

    @EntityInstance
    public int create(@Entity int i, @EntityInstance int i2, float[] fArr) {
        return nCreateArray(this.mNativeObject, i, i2, fArr);
    }

    @EntityInstance
    public int create(@Entity int i, @EntityInstance int i2, double[] dArr) {
        return nCreateArrayFp64(this.mNativeObject, i, i2, dArr);
    }

    public double[] getTransform(@EntityInstance int i, double[] dArr) {
        double[] assertMat4 = Asserts.assertMat4(dArr);
        nGetTransformFp64(this.mNativeObject, i, assertMat4);
        return assertMat4;
    }

    public double[] getWorldTransform(@EntityInstance int i, double[] dArr) {
        double[] assertMat4 = Asserts.assertMat4(dArr);
        nGetWorldTransformFp64(this.mNativeObject, i, assertMat4);
        return assertMat4;
    }

    public void setTransform(@EntityInstance int i, double[] dArr) {
        Asserts.assertMat4In(dArr);
        nSetTransformFp64(this.mNativeObject, i, dArr);
    }
}
