package com.google.android.filament.utils;

import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
/* loaded from: classes5.dex */
public class IBLPrefilterContext {
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public static class EquirectangularToCubemap {
        private long mNativeObject;

        public EquirectangularToCubemap(IBLPrefilterContext iBLPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.nCreateEquirectHelper(iBLPrefilterContext.getNativeObject());
        }

        public void destroy() {
            IBLPrefilterContext.nDestroyEquirectHelper(getNativeObject());
            this.mNativeObject = 0L;
        }

        public long getNativeObject() {
            long j = this.mNativeObject;
            if (j != 0) {
                return j;
            }
            throw new IllegalStateException("Calling method on destroyed EquirectangularToCubemap");
        }

        public Texture run(Texture texture) {
            return new Texture(IBLPrefilterContext.nEquirectHelperRun(getNativeObject(), texture.getNativeObject()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SpecularFilter {
        private long mNativeObject;

        public SpecularFilter(IBLPrefilterContext iBLPrefilterContext) {
            this.mNativeObject = IBLPrefilterContext.nCreateSpecularFilter(iBLPrefilterContext.getNativeObject());
        }

        public void destroy() {
            IBLPrefilterContext.nDestroySpecularFilter(getNativeObject());
            this.mNativeObject = 0L;
        }

        public long getNativeObject() {
            long j = this.mNativeObject;
            if (j != 0) {
                return j;
            }
            throw new IllegalStateException("Calling method on destroyed SpecularFilter");
        }

        public Texture run(Texture texture) {
            return new Texture(IBLPrefilterContext.nSpecularFilterRun(getNativeObject(), texture.getNativeObject()));
        }
    }

    public IBLPrefilterContext(Engine engine) {
        long nCreate = nCreate(engine.getNativeObject());
        this.mNativeObject = nCreate;
        if (nCreate != 0) {
            return;
        }
        throw new IllegalStateException("Couldn't create IBLPrefilterContext");
    }

    private static native long nCreate(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateEquirectHelper(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateSpecularFilter(long j);

    private static native void nDestroy(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyEquirectHelper(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroySpecularFilter(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nEquirectHelperRun(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nSpecularFilterRun(long j, long j2);

    public void destroy() {
        nDestroy(getNativeObject());
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed IBLPrefilterContext");
    }
}
