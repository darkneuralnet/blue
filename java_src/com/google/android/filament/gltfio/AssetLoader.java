package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import java.nio.Buffer;
/* loaded from: classes5.dex */
public class AssetLoader {
    private Engine mEngine;
    private MaterialProvider mMaterialCache;
    private long mNativeObject;

    public AssetLoader(Engine engine, MaterialProvider materialProvider, EntityManager entityManager) {
        long nCreateAssetLoader = nCreateAssetLoader(engine.getNativeObject(), materialProvider, entityManager.getNativeObject());
        this.mNativeObject = nCreateAssetLoader;
        if (nCreateAssetLoader != 0) {
            this.mEngine = engine;
            this.mMaterialCache = materialProvider;
            return;
        }
        throw new IllegalStateException("Unable to parse glTF asset.");
    }

    private static native long nCreateAsset(long j, Buffer buffer, int i);

    private static native long nCreateAssetLoader(long j, Object obj, long j2);

    private static native long nCreateInstance(long j, long j2);

    private static native long nCreateInstancedAsset(long j, Buffer buffer, int i, long[] jArr);

    private static native void nDestroyAsset(long j, long j2);

    private static native void nDestroyAssetLoader(long j);

    private static native void nEnableDiagnostics(long j, boolean z);

    public FilamentAsset createAsset(Buffer buffer) {
        long nCreateAsset = nCreateAsset(this.mNativeObject, buffer, buffer.remaining());
        if (nCreateAsset != 0) {
            return new FilamentAsset(this.mEngine, nCreateAsset);
        }
        return null;
    }

    public FilamentInstance createInstance(FilamentAsset filamentAsset) {
        long nCreateInstance = nCreateInstance(this.mNativeObject, filamentAsset.getNativeObject());
        if (nCreateInstance == 0) {
            return null;
        }
        return new FilamentInstance(filamentAsset, nCreateInstance);
    }

    public FilamentAsset createInstancedAsset(Buffer buffer, FilamentInstance[] filamentInstanceArr) {
        int length = filamentInstanceArr.length;
        long[] jArr = new long[length];
        long nCreateInstancedAsset = nCreateInstancedAsset(this.mNativeObject, buffer, buffer.remaining(), jArr);
        if (nCreateInstancedAsset == 0) {
            return null;
        }
        FilamentAsset filamentAsset = new FilamentAsset(this.mEngine, nCreateInstancedAsset);
        for (int i = 0; i < length; i++) {
            filamentInstanceArr[i] = new FilamentInstance(filamentAsset, jArr[i]);
        }
        return filamentAsset;
    }

    public void destroy() {
        nDestroyAssetLoader(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void destroyAsset(FilamentAsset filamentAsset) {
        nDestroyAsset(this.mNativeObject, filamentAsset.getNativeObject());
        filamentAsset.clearNativeObject();
    }

    public void enableDiagnostics(boolean z) {
        nEnableDiagnostics(this.mNativeObject, z);
    }
}
