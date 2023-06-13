package com.google.android.filament;
/* loaded from: classes5.dex */
public class TextureSampler {
    int mSampler;

    /* renamed from: com.google.android.filament.TextureSampler$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C174471 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$TextureSampler$MagFilter;

        static {
            int[] iArr = new int[MagFilter.values().length];
            $SwitchMap$com$google$android$filament$TextureSampler$MagFilter = iArr;
            try {
                iArr[MagFilter.NEAREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$TextureSampler$MagFilter[MagFilter.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum CompareFunction {
        LESS_EQUAL,
        GREATER_EQUAL,
        LESS,
        GREATER,
        EQUAL,
        NOT_EQUAL,
        ALWAYS,
        NEVER
    }

    /* loaded from: classes5.dex */
    public enum CompareMode {
        NONE,
        COMPARE_TO_TEXTURE
    }

    /* loaded from: classes5.dex */
    public static final class EnumCache {
        static final MinFilter[] sMinFilterValues = MinFilter.values();
        static final MagFilter[] sMagFilterValues = MagFilter.values();
        static final WrapMode[] sWrapModeValues = WrapMode.values();
        static final CompareMode[] sCompareModeValues = CompareMode.values();
        static final CompareFunction[] sCompareFunctionValues = CompareFunction.values();
    }

    /* loaded from: classes5.dex */
    public enum MagFilter {
        NEAREST,
        LINEAR
    }

    /* loaded from: classes5.dex */
    public enum MinFilter {
        NEAREST,
        LINEAR,
        NEAREST_MIPMAP_NEAREST,
        LINEAR_MIPMAP_NEAREST,
        NEAREST_MIPMAP_LINEAR,
        LINEAR_MIPMAP_LINEAR
    }

    /* loaded from: classes5.dex */
    public enum WrapMode {
        CLAMP_TO_EDGE,
        REPEAT,
        MIRRORED_REPEAT
    }

    public TextureSampler() {
        this(MinFilter.LINEAR_MIPMAP_LINEAR, MagFilter.LINEAR, WrapMode.REPEAT);
    }

    private static MinFilter minFilterFromMagFilter(MagFilter magFilter) {
        if (C174471.$SwitchMap$com$google$android$filament$TextureSampler$MagFilter[magFilter.ordinal()] != 1) {
            return MinFilter.LINEAR;
        }
        return MinFilter.NEAREST;
    }

    private static native int nCreateCompareSampler(int i, int i2);

    private static native int nCreateSampler(int i, int i2, int i3, int i4, int i5);

    private static native float nGetAnisotropy(int i);

    private static native int nGetCompareFunction(int i);

    private static native int nGetCompareMode(int i);

    private static native int nGetMagFilter(int i);

    private static native int nGetMinFilter(int i);

    private static native int nGetWrapModeR(int i);

    private static native int nGetWrapModeS(int i);

    private static native int nGetWrapModeT(int i);

    private static native int nSetAnisotropy(int i, float f);

    private static native int nSetCompareFunction(int i, int i2);

    private static native int nSetCompareMode(int i, int i2);

    private static native int nSetMagFilter(int i, int i2);

    private static native int nSetMinFilter(int i, int i2);

    private static native int nSetWrapModeR(int i, int i2);

    private static native int nSetWrapModeS(int i, int i2);

    private static native int nSetWrapModeT(int i, int i2);

    public float getAnisotropy() {
        return nGetAnisotropy(this.mSampler);
    }

    public CompareFunction getCompareFunction() {
        return EnumCache.sCompareFunctionValues[nGetCompareFunction(this.mSampler)];
    }

    public CompareMode getCompareMode() {
        return EnumCache.sCompareModeValues[nGetCompareMode(this.mSampler)];
    }

    public MagFilter getMagFilter() {
        return EnumCache.sMagFilterValues[nGetMagFilter(this.mSampler)];
    }

    public MinFilter getMinFilter() {
        return EnumCache.sMinFilterValues[nGetMinFilter(this.mSampler)];
    }

    public WrapMode getWrapModeR() {
        return EnumCache.sWrapModeValues[nGetWrapModeR(this.mSampler)];
    }

    public WrapMode getWrapModeS() {
        return EnumCache.sWrapModeValues[nGetWrapModeS(this.mSampler)];
    }

    public WrapMode getWrapModeT() {
        return EnumCache.sWrapModeValues[nGetWrapModeT(this.mSampler)];
    }

    public void setAnisotropy(float f) {
        this.mSampler = nSetAnisotropy(this.mSampler, f);
    }

    public void setCompareFunction(CompareFunction compareFunction) {
        this.mSampler = nSetCompareFunction(this.mSampler, compareFunction.ordinal());
    }

    public void setCompareMode(CompareMode compareMode) {
        this.mSampler = nSetCompareMode(this.mSampler, compareMode.ordinal());
    }

    public void setMagFilter(MagFilter magFilter) {
        this.mSampler = nSetMagFilter(this.mSampler, magFilter.ordinal());
    }

    public void setMinFilter(MinFilter minFilter) {
        this.mSampler = nSetMinFilter(this.mSampler, minFilter.ordinal());
    }

    public void setWrapModeR(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeR(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeS(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeS(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeT(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeT(this.mSampler, wrapMode.ordinal());
    }

    public TextureSampler(MagFilter magFilter) {
        this(magFilter, WrapMode.CLAMP_TO_EDGE);
    }

    public TextureSampler(MagFilter magFilter, WrapMode wrapMode) {
        this(minFilterFromMagFilter(magFilter), magFilter, wrapMode);
    }

    public TextureSampler(MinFilter minFilter, MagFilter magFilter, WrapMode wrapMode) {
        this(minFilter, magFilter, wrapMode, wrapMode, wrapMode);
    }

    public TextureSampler(MinFilter minFilter, MagFilter magFilter, WrapMode wrapMode, WrapMode wrapMode2, WrapMode wrapMode3) {
        this.mSampler = 0;
        this.mSampler = nCreateSampler(minFilter.ordinal(), magFilter.ordinal(), wrapMode.ordinal(), wrapMode2.ordinal(), wrapMode3.ordinal());
    }

    public TextureSampler(CompareMode compareMode) {
        this(compareMode, CompareFunction.LESS_EQUAL);
    }

    public TextureSampler(CompareMode compareMode, CompareFunction compareFunction) {
        this.mSampler = 0;
        this.mSampler = nCreateCompareSampler(compareMode.ordinal(), compareFunction.ordinal());
    }
}
