package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nJ)\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¨\u0006\u0012"}, m28432d2 = {"Lcom/google/android/filament/utils/HDRLoader;", "", "()V", "createTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "buffer", "Ljava/nio/Buffer;", "options", "Lcom/google/android/filament/utils/HDRLoader$Options;", "nCreateHDRTexture", "", "nativeEngine", "remaining", "", "format", "Options", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class HDRLoader {
    public static final HDRLoader INSTANCE = new HDRLoader();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lcom/google/android/filament/utils/HDRLoader$Options;", "", "()V", "desiredFormat", "Lcom/google/android/filament/Texture$InternalFormat;", "getDesiredFormat", "()Lcom/google/android/filament/Texture$InternalFormat;", "setDesiredFormat", "(Lcom/google/android/filament/Texture$InternalFormat;)V", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Options {
        private Texture.InternalFormat desiredFormat = Texture.InternalFormat.RGB16F;

        public final Texture.InternalFormat getDesiredFormat() {
            return this.desiredFormat;
        }

        public final void setDesiredFormat(Texture.InternalFormat internalFormat) {
            Intrinsics.checkNotNullParameter(internalFormat, "<set-?>");
            this.desiredFormat = internalFormat;
        }
    }

    private HDRLoader() {
    }

    public static /* synthetic */ Texture createTexture$default(HDRLoader hDRLoader, Engine engine, Buffer buffer, Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new Options();
        }
        return hDRLoader.createTexture(engine, buffer, options);
    }

    private final native long nCreateHDRTexture(long j, Buffer buffer, int i, int i2);

    public final Texture createTexture(Engine engine, Buffer buffer, Options options) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        long nCreateHDRTexture = nCreateHDRTexture(engine.getNativeObject(), buffer, buffer.remaining(), options.getDesiredFormat().ordinal());
        if (nCreateHDRTexture == 0) {
            return null;
        }
        return new Texture(nCreateHDRTexture);
    }
}
