package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
/* loaded from: classes5.dex */
public class BufferObject {
    private long mNativeObject;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;

        /* loaded from: classes5.dex */
        public enum BindingType {
            VERTEX
        }

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
                BufferObject.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = BufferObject.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Builder bindingType(BindingType bindingType) {
            BufferObject.nBuilderBindingType(this.mNativeBuilder, bindingType.ordinal());
            return this;
        }

        public BufferObject build(Engine engine) {
            long nBuilderBuild = BufferObject.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new BufferObject(nBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create BufferObject");
        }

        public Builder size(int i) {
            BufferObject.nBuilderSize(this.mNativeBuilder, i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBindingType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSize(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetByteCount(long j);

    private static native int nSetBuffer(long j, long j2, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getByteCount() {
        return nGetByteCount(getNativeObject());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed BufferObject");
    }

    public void setBuffer(Engine engine, Buffer buffer) {
        setBuffer(engine, buffer, 0, 0, null, null);
    }

    private BufferObject(long j) {
        this.mNativeObject = j;
    }

    public void setBuffer(Engine engine, Buffer buffer, int i, int i2) {
        setBuffer(engine, buffer, i, i2, null, null);
    }

    public void setBuffer(Engine engine, Buffer buffer, int i, int i2, Object obj, Runnable runnable) {
        if (nSetBuffer(getNativeObject(), engine.getNativeObject(), buffer, buffer.remaining(), i, i2 == 0 ? buffer.remaining() : i2, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }
}
