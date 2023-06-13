package com.google.android.filament;

import com.google.android.filament.Texture;
/* loaded from: classes5.dex */
public class RenderTarget {
    private static final int ATTACHMENT_COUNT = AttachmentPoint.values().length;
    private static final Texture.CubemapFace[] sCubemapFaceValues = Texture.CubemapFace.values();
    private long mNativeObject;
    private final Texture[] mTextures;

    /* loaded from: classes5.dex */
    public enum AttachmentPoint {
        COLOR,
        COLOR1,
        COLOR2,
        COLOR3,
        COLOR4,
        COLOR5,
        COLOR6,
        COLOR7,
        DEPTH
    }

    /* loaded from: classes5.dex */
    public static class Builder {
        private final BuilderFinalizer mFinalizer;
        private final long mNativeBuilder;
        private final Texture[] mTextures = new Texture[RenderTarget.ATTACHMENT_COUNT];

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
                RenderTarget.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = RenderTarget.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public RenderTarget build(Engine engine) {
            long nBuilderBuild = RenderTarget.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new RenderTarget(nBuilderBuild, this);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }

        public Builder face(AttachmentPoint attachmentPoint, Texture.CubemapFace cubemapFace) {
            RenderTarget.nBuilderFace(this.mNativeBuilder, attachmentPoint.ordinal(), cubemapFace.ordinal());
            return this;
        }

        public Builder layer(AttachmentPoint attachmentPoint, int i) {
            RenderTarget.nBuilderLayer(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        public Builder mipLevel(AttachmentPoint attachmentPoint, int i) {
            RenderTarget.nBuilderMipLevel(this.mNativeBuilder, attachmentPoint.ordinal(), i);
            return this;
        }

        public Builder texture(AttachmentPoint attachmentPoint, Texture texture) {
            long j;
            this.mTextures[attachmentPoint.ordinal()] = texture;
            long j2 = this.mNativeBuilder;
            int ordinal = attachmentPoint.ordinal();
            if (texture != null) {
                j = texture.getNativeObject();
            } else {
                j = 0;
            }
            RenderTarget.nBuilderTexture(j2, ordinal, j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFace(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayer(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMipLevel(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTexture(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nGetFace(long j, int i);

    private static native int nGetLayer(long j, int i);

    private static native int nGetMipLevel(long j, int i);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public Texture.CubemapFace getFace(AttachmentPoint attachmentPoint) {
        return sCubemapFaceValues[nGetFace(getNativeObject(), attachmentPoint.ordinal())];
    }

    public int getLayer(AttachmentPoint attachmentPoint) {
        return nGetLayer(getNativeObject(), attachmentPoint.ordinal());
    }

    public int getMipLevel(AttachmentPoint attachmentPoint) {
        return nGetMipLevel(getNativeObject(), attachmentPoint.ordinal());
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }

    public Texture getTexture(AttachmentPoint attachmentPoint) {
        return this.mTextures[attachmentPoint.ordinal()];
    }

    private RenderTarget(long j, Builder builder) {
        int i = ATTACHMENT_COUNT;
        Texture[] textureArr = new Texture[i];
        this.mTextures = textureArr;
        this.mNativeObject = j;
        System.arraycopy(builder.mTextures, 0, textureArr, 0, i);
    }
}
