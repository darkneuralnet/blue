package com.google.android.filament;

import java.nio.Buffer;
import java.nio.BufferOverflowException;
/* loaded from: classes5.dex */
public class SkinningBuffer {
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
                SkinningBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = SkinningBuffer.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public Builder boneCount(int i) {
            SkinningBuffer.nBuilderBoneCount(this.mNativeBuilder, i);
            return this;
        }

        public SkinningBuffer build(Engine engine) {
            long nBuilderBuild = SkinningBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new SkinningBuffer(nBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create SkinningBuffer");
        }

        public Builder initialize(boolean z) {
            SkinningBuffer.nBuilderInitialize(this.mNativeBuilder, z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoneCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInitialize(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetBoneCount(long j);

    private static native int nSetBonesAsMatrices(long j, long j2, Buffer buffer, int i, int i2, int i3);

    private static native int nSetBonesAsQuaternions(long j, long j2, Buffer buffer, int i, int i2, int i3);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getBoneCount() {
        return nGetBoneCount(this.mNativeObject);
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void setBonesAsMatrices(Engine engine, Buffer buffer, int i, int i2) {
        if (nSetBonesAsMatrices(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i, i2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setBonesAsQuaternions(Engine engine, Buffer buffer, int i, int i2) {
        if (nSetBonesAsQuaternions(this.mNativeObject, engine.getNativeObject(), buffer, buffer.remaining(), i, i2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    private SkinningBuffer(long j) {
        this.mNativeObject = j;
    }
}
