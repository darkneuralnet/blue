package com.google.android.filament;
/* loaded from: classes5.dex */
public class ColorGrading {
    long mNativeObject;

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
                ColorGrading.nDestroyBuilder(this.mNativeObject);
            }
        }

        public Builder() {
            long nCreateBuilder = ColorGrading.nCreateBuilder();
            this.mNativeBuilder = nCreateBuilder;
            this.mFinalizer = new BuilderFinalizer(nCreateBuilder);
        }

        public ColorGrading build(Engine engine) {
            long nBuilderBuild = ColorGrading.nBuilderBuild(this.mNativeBuilder, engine.getNativeObject());
            if (nBuilderBuild != 0) {
                return new ColorGrading(nBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create ColorGrading");
        }

        public Builder channelMixer(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderChannelMixer(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder contrast(float f) {
            ColorGrading.nBuilderContrast(this.mNativeBuilder, f);
            return this;
        }

        public Builder curves(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderCurves(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder dimensions(int i) {
            ColorGrading.nBuilderDimensions(this.mNativeBuilder, i);
            return this;
        }

        public Builder exposure(float f) {
            ColorGrading.nBuilderExposure(this.mNativeBuilder, f);
            return this;
        }

        public Builder format(LutFormat lutFormat) {
            ColorGrading.nBuilderFormat(this.mNativeBuilder, lutFormat.ordinal());
            return this;
        }

        public Builder gamutMapping(boolean z) {
            ColorGrading.nBuilderGamutMapping(this.mNativeBuilder, z);
            return this;
        }

        public Builder luminanceScaling(boolean z) {
            ColorGrading.nBuilderLuminanceScaling(this.mNativeBuilder, z);
            return this;
        }

        public Builder nightAdaptation(float f) {
            ColorGrading.nBuilderNightAdaptation(this.mNativeBuilder, f);
            return this;
        }

        public Builder quality(QualityLevel qualityLevel) {
            ColorGrading.nBuilderQuality(this.mNativeBuilder, qualityLevel.ordinal());
            return this;
        }

        public Builder saturation(float f) {
            ColorGrading.nBuilderSaturation(this.mNativeBuilder, f);
            return this;
        }

        public Builder shadowsMidtonesHighlights(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
            Asserts.assertFloat4In(fArr);
            Asserts.assertFloat4In(fArr2);
            Asserts.assertFloat4In(fArr3);
            Asserts.assertFloat4In(fArr4);
            ColorGrading.nBuilderShadowsMidtonesHighlights(this.mNativeBuilder, fArr, fArr2, fArr3, fArr4);
            return this;
        }

        public Builder slopeOffsetPower(float[] fArr, float[] fArr2, float[] fArr3) {
            Asserts.assertFloat3In(fArr);
            Asserts.assertFloat3In(fArr2);
            Asserts.assertFloat3In(fArr3);
            ColorGrading.nBuilderSlopeOffsetPower(this.mNativeBuilder, fArr, fArr2, fArr3);
            return this;
        }

        public Builder toneMapper(ToneMapper toneMapper) {
            ColorGrading.nBuilderToneMapper(this.mNativeBuilder, toneMapper.getNativeObject());
            return this;
        }

        public Builder toneMapping(ToneMapping toneMapping) {
            ColorGrading.nBuilderToneMapping(this.mNativeBuilder, toneMapping.ordinal());
            return this;
        }

        public Builder vibrance(float f) {
            ColorGrading.nBuilderVibrance(this.mNativeBuilder, f);
            return this;
        }

        public Builder whiteBalance(float f, float f2) {
            ColorGrading.nBuilderWhiteBalance(this.mNativeBuilder, f, f2);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum LutFormat {
        INTEGER,
        FLOAT
    }

    /* loaded from: classes5.dex */
    public enum QualityLevel {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    /* loaded from: classes5.dex */
    public enum ToneMapping {
        LINEAR,
        ACES_LEGACY,
        ACES,
        FILMIC,
        DISPLAY_RANGE
    }

    public ColorGrading(long j) {
        this.mNativeObject = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannelMixer(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderContrast(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCurves(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDimensions(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExposure(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGamutMapping(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLuminanceScaling(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNightAdaptation(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderQuality(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSaturation(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowsMidtonesHighlights(long j, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSlopeOffsetPower(long j, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapper(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapping(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVibrance(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWhiteBalance(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    public void clearNativeObject() {
        this.mNativeObject = 0L;
    }

    public long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("Calling method on destroyed ColorGrading");
    }
}
