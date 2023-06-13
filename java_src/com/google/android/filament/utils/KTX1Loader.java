package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\bJ)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0082 ¨\u0006\u001d"}, m28432d2 = {"Lcom/google/android/filament/utils/KTX1Loader;", "", "()V", "createIndirectLight", "Lcom/google/android/filament/IndirectLight;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/google/android/filament/utils/KTX1Loader$Options;", "createSkybox", "Lcom/google/android/filament/Skybox;", "createTexture", "Lcom/google/android/filament/Texture;", "getSphericalHarmonics", "", "nCreateIndirectLight", "", "nativeEngine", "remaining", "", "srgb", "", "nCreateKTXTexture", "nCreateSkybox", "nGetSphericalHarmonics", "outSphericalHarmonics", "Options", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KTX1Loader {
    public static final KTX1Loader INSTANCE = new KTX1Loader();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/google/android/filament/utils/KTX1Loader$Options;", "", "()V", "srgb", "", "getSrgb", "()Z", "setSrgb", "(Z)V", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Options {
        private boolean srgb;

        public final boolean getSrgb() {
            return this.srgb;
        }

        public final void setSrgb(boolean z) {
            this.srgb = z;
        }
    }

    private KTX1Loader() {
    }

    public static /* synthetic */ IndirectLight createIndirectLight$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createIndirectLight(engine, buffer, options);
    }

    public static /* synthetic */ Skybox createSkybox$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createSkybox(engine, buffer, options);
    }

    public static /* synthetic */ Texture createTexture$default(KTX1Loader kTX1Loader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return kTX1Loader.createTexture(engine, buffer, options);
    }

    private final native long nCreateIndirectLight(long j, Buffer buffer, int i, boolean z);

    private final native long nCreateKTXTexture(long j, Buffer buffer, int i, boolean z);

    private final native long nCreateSkybox(long j, Buffer buffer, int i, boolean z);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int i, float[] fArr);

    public final IndirectLight createIndirectLight(Engine engine, Buffer buffer, Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new IndirectLight(nCreateIndirectLight(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    public final Skybox createSkybox(Engine engine, Buffer buffer, Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Skybox(nCreateSkybox(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    public final Texture createTexture(Engine engine, Buffer buffer, Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        return new Texture(nCreateKTXTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getSrgb()));
    }

    public final float[] getSphericalHarmonics(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        float[] fArr = new float[27];
        if (!nGetSphericalHarmonics(buffer, buffer.remaining(), fArr)) {
            return null;
        }
        return fArr;
    }
}
