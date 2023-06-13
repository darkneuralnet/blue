package com.google.android.filament;

import java.nio.Buffer;
/* loaded from: classes5.dex */
public class Stream {
    private static final StreamType[] sStreamTypeValues = StreamType.values();
    private long mNativeEngine;
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* loaded from: classes5.dex */
        public static class BuilderFinalizer {
            private final long mNativeObject;

            public BuilderFinalizer(long j) {
                this.mNativeObject = j;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Stream.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = Stream.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Stream build(Engine engine) {
            long nBuilderBuild = Stream.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new Stream(nBuilderBuild, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }

        public Builder height(int i) {
            Stream.nBuilderHeight(this.mNativeBuilder, i);
            return this;
        }

        public Builder stream(Object obj) {
            if (Platform.get().validateStreamSource(obj)) {
                Stream.nBuilderStreamSource(this.mNativeBuilder, obj);
                return this;
            }
            throw new IllegalArgumentException("Invalid stream source: " + obj);
        }

        public Builder width(int i) {
            Stream.nBuilderWidth(this.mNativeBuilder, i);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum StreamType {
        NATIVE,
        ACQUIRED
    }

    public Stream(long j, Engine engine) {
        this.mNativeObject = j;
        this.mNativeEngine = engine.getNativeObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderStreamSource(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetStreamType(long j);

    private static native long nGetTimestamp(long j);

    private static native int nReadPixels(long j, long j2, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nSetAcquiredImage(long j, long j2, Object obj, Object obj2, Runnable runnable);

    private static native void nSetDimensions(long j, int i, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }

    public StreamType getStreamType() {
        return sStreamTypeValues[nGetStreamType(getNativeObject())];
    }

    public long getTimestamp() {
        return nGetTimestamp(getNativeObject());
    }

    public void setAcquiredImage(Object obj, Object obj2, Runnable runnable) {
        nSetAcquiredImage(getNativeObject(), this.mNativeEngine, obj, obj2, runnable);
    }

    public void setDimensions(int i, int i2) {
        nSetDimensions(getNativeObject(), i, i2);
    }
}
