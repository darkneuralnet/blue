package com.google.android.filament;
/* loaded from: classes5.dex */
public class Scene {
    private IndirectLight mIndirectLight;
    private long mNativeObject;
    private Skybox mSkybox;

    public Scene(long j) {
        this.mNativeObject = j;
    }

    private static native void nAddEntities(long j, int[] iArr);

    private static native void nAddEntity(long j, int i);

    private static native int nGetLightCount(long j);

    private static native int nGetRenderableCount(long j);

    private static native boolean nHasEntity(long j, int i);

    private static native void nRemove(long j, int i);

    private static native void nRemoveEntities(long j, int[] iArr);

    private static native void nSetIndirectLight(long j, long j2);

    private static native void nSetSkybox(long j, long j2);

    public void addEntities(@Entity int[] iArr) {
        nAddEntities(getNativeObject(), iArr);
    }

    public void addEntity(@Entity int i) {
        nAddEntity(getNativeObject(), i);
    }

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public IndirectLight getIndirectLight() {
        return this.mIndirectLight;
    }

    public int getLightCount() {
        return nGetLightCount(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Scene");
    }

    public int getRenderableCount() {
        return nGetRenderableCount(getNativeObject());
    }

    public Skybox getSkybox() {
        return this.mSkybox;
    }

    public boolean hasEntity(@Entity int i) {
        return nHasEntity(getNativeObject(), i);
    }

    @Deprecated
    public void remove(@Entity int i) {
        removeEntity(i);
    }

    public void removeEntities(@Entity int[] iArr) {
        nRemoveEntities(getNativeObject(), iArr);
    }

    public void removeEntity(@Entity int i) {
        nRemove(getNativeObject(), i);
    }

    public void setIndirectLight(IndirectLight indirectLight) {
        long j;
        this.mIndirectLight = indirectLight;
        long nativeObject = getNativeObject();
        IndirectLight indirectLight2 = this.mIndirectLight;
        if (indirectLight2 != null) {
            j = indirectLight2.getNativeObject();
        } else {
            j = 0;
        }
        nSetIndirectLight(nativeObject, j);
    }

    public void setSkybox(Skybox skybox) {
        long j;
        this.mSkybox = skybox;
        long nativeObject = getNativeObject();
        Skybox skybox2 = this.mSkybox;
        if (skybox2 != null) {
            j = skybox2.getNativeObject();
        } else {
            j = 0;
        }
        nSetSkybox(nativeObject, j);
    }
}
