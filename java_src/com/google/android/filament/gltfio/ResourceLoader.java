package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import java.nio.Buffer;
/* loaded from: classes5.dex */
public class ResourceLoader {
    private final long mNativeKtx2Provider;
    private final long mNativeObject;
    private final long mNativeStbProvider;

    public ResourceLoader(Engine engine) {
        long nativeObject = engine.getNativeObject();
        long nCreateResourceLoader = nCreateResourceLoader(nativeObject, false);
        this.mNativeObject = nCreateResourceLoader;
        long nCreateStbProvider = nCreateStbProvider(nativeObject);
        this.mNativeStbProvider = nCreateStbProvider;
        long nCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.mNativeKtx2Provider = nCreateKtx2Provider;
        nAddTextureProvider(nCreateResourceLoader, "image/jpeg", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/png", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/ktx2", nCreateKtx2Provider);
    }

    private static native void nAddResourceData(long j, String str, Buffer buffer, int i);

    private static native void nAddTextureProvider(long j, String str, long j2);

    private static native boolean nAsyncBeginLoad(long j, long j2);

    private static native void nAsyncCancelLoad(long j);

    private static native float nAsyncGetLoadProgress(long j);

    private static native void nAsyncUpdateLoad(long j);

    private static native long nCreateKtx2Provider(long j);

    private static native long nCreateResourceLoader(long j, boolean z);

    private static native long nCreateStbProvider(long j);

    private static native void nDestroyResourceLoader(long j);

    private static native void nDestroyTextureProvider(long j);

    private static native void nEvictResourceData(long j);

    private static native boolean nHasResourceData(long j, String str);

    private static native void nLoadResources(long j, long j2);

    public ResourceLoader addResourceData(String str, Buffer buffer) {
        nAddResourceData(this.mNativeObject, str, buffer, buffer.remaining());
        return this;
    }

    public boolean asyncBeginLoad(FilamentAsset filamentAsset) {
        return nAsyncBeginLoad(this.mNativeObject, filamentAsset.getNativeObject());
    }

    public void asyncCancelLoad() {
        nAsyncCancelLoad(this.mNativeObject);
    }

    public float asyncGetLoadProgress() {
        return nAsyncGetLoadProgress(this.mNativeObject);
    }

    public void asyncUpdateLoad() {
        nAsyncUpdateLoad(this.mNativeObject);
    }

    public void destroy() {
        nDestroyResourceLoader(this.mNativeObject);
        nDestroyTextureProvider(this.mNativeStbProvider);
        nDestroyTextureProvider(this.mNativeKtx2Provider);
    }

    public void evictResourceData() {
        nEvictResourceData(this.mNativeObject);
    }

    public boolean hasResourceData(String str) {
        return nHasResourceData(this.mNativeObject, str);
    }

    public ResourceLoader loadResources(FilamentAsset filamentAsset) {
        nLoadResources(this.mNativeObject, filamentAsset.getNativeObject());
        return this;
    }

    public ResourceLoader(Engine engine, boolean z) {
        long nativeObject = engine.getNativeObject();
        long nCreateResourceLoader = nCreateResourceLoader(nativeObject, z);
        this.mNativeObject = nCreateResourceLoader;
        long nCreateStbProvider = nCreateStbProvider(nativeObject);
        this.mNativeStbProvider = nCreateStbProvider;
        long nCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        this.mNativeKtx2Provider = nCreateKtx2Provider;
        nAddTextureProvider(nCreateResourceLoader, "image/jpeg", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/png", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/ktx2", nCreateKtx2Provider);
    }
}
