package com.google.android.filament;
/* loaded from: classes5.dex */
public class ToneMapper {
    private final long mNativeObject;

    /* loaded from: classes5.dex */
    public static class ACES extends ToneMapper {
        public ACES() {
            super(ToneMapper.nCreateACESToneMapper());
        }
    }

    /* loaded from: classes5.dex */
    public static class ACESLegacy extends ToneMapper {
        public ACESLegacy() {
            super(ToneMapper.nCreateACESLegacyToneMapper());
        }
    }

    /* loaded from: classes5.dex */
    public static class Filmic extends ToneMapper {
        public Filmic() {
            super(ToneMapper.nCreateFilmicToneMapper());
        }
    }

    /* loaded from: classes5.dex */
    public static class Generic extends ToneMapper {
        public Generic() {
            this(1.55f, 0.18f, 0.215f, 10.0f);
        }

        public float getContrast() {
            return ToneMapper.nGenericGetContrast(getNativeObject());
        }

        public float getHdrMax() {
            return ToneMapper.nGenericGetHdrMax(getNativeObject());
        }

        public float getMidGrayIn() {
            return ToneMapper.nGenericGetMidGrayIn(getNativeObject());
        }

        public float getMidGrayOut() {
            return ToneMapper.nGenericGetMidGrayOut(getNativeObject());
        }

        public void setContrast(float f) {
            ToneMapper.nGenericSetContrast(getNativeObject(), f);
        }

        public void setHdrMax(float f) {
            ToneMapper.nGenericSetHdrMax(getNativeObject(), f);
        }

        public void setMidGrayIn(float f) {
            ToneMapper.nGenericSetMidGrayIn(getNativeObject(), f);
        }

        public void setMidGrayOut(float f) {
            ToneMapper.nGenericSetMidGrayOut(getNativeObject(), f);
        }

        public Generic(float f, float f2, float f3, float f4) {
            super(ToneMapper.nCreateGenericToneMapper(f, f2, f3, f4));
        }
    }

    /* loaded from: classes5.dex */
    public static class Linear extends ToneMapper {
        public Linear() {
            super(ToneMapper.nCreateLinearToneMapper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESLegacyToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateFilmicToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateGenericToneMapper(float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    private static native void nDestroyToneMapper(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetContrast(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetHdrMax(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayIn(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayOut(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetContrast(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetHdrMax(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayIn(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayOut(long j, float f);

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(this.mNativeObject);
        }
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed ToneMapper");
    }

    private ToneMapper(long j) {
        this.mNativeObject = j;
    }
}
