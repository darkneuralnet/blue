package com.google.android.filament;

import java.nio.BufferOverflowException;
/* loaded from: classes5.dex */
public class MorphTargetBuffer {
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
                MorphTargetBuffer.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = MorphTargetBuffer.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public MorphTargetBuffer build(Engine engine) {
            long nBuilderBuild = MorphTargetBuffer.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new MorphTargetBuffer(nBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create MorphTargetBuffer");
        }

        public Builder count(int i) {
            MorphTargetBuffer.nBuilderCount(this.mNativeBuilder, i);
            return this;
        }

        public Builder vertexCount(int i) {
            MorphTargetBuffer.nBuilderVertexCount(this.mNativeBuilder, i);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetCount(long j);

    private static native int nGetVertexCount(long j);

    private static native int nSetPositionsAt(long j, long j2, int i, float[] fArr, int i2);

    private static native int nSetTangentsAt(long j, long j2, int i, short[] sArr, int i2);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public int getCount() {
        return nGetCount(this.mNativeObject);
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed MorphTargetBuffer");
    }

    public int getVertexCount() {
        return nGetVertexCount(this.mNativeObject);
    }

    public void setPositionsAt(Engine engine, int i, float[] fArr, int i2) {
        if (nSetPositionsAt(this.mNativeObject, engine.getNativeObject(), i, fArr, i2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    public void setTangentsAt(Engine engine, int i, short[] sArr, int i2) {
        if (nSetTangentsAt(this.mNativeObject, engine.getNativeObject(), i, sArr, i2) >= 0) {
            return;
        }
        throw new BufferOverflowException();
    }

    private MorphTargetBuffer(long j) {
        this.mNativeObject = j;
    }
}
