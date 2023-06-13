package com.google.android.filament;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* loaded from: classes5.dex */
public class Colors {

    /* renamed from: com.google.android.filament.Colors$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C174371 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$Conversion;
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$RgbaType;

        static {
            int[] iArr = new int[Conversion.values().length];
            $SwitchMap$com$google$android$filament$Colors$Conversion = iArr;
            try {
                iArr[Conversion.ACCURATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$Conversion[Conversion.FAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RgbaType.values().length];
            $SwitchMap$com$google$android$filament$Colors$RgbaType = iArr2;
            try {
                iArr2[RgbaType.SRGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_SRGB.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$android$filament$Colors$RgbaType[RgbaType.PREMULTIPLIED_LINEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum Conversion {
        ACCURATE,
        FAST
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LinearColor {
    }

    /* loaded from: classes5.dex */
    public enum RgbType {
        SRGB,
        LINEAR
    }

    /* loaded from: classes5.dex */
    public enum RgbaType {
        SRGB,
        LINEAR,
        PREMULTIPLIED_SRGB,
        PREMULTIPLIED_LINEAR
    }

    private Colors() {
    }

    public static float[] cct(float f) {
        float[] fArr = new float[3];
        nCct(f, fArr);
        return fArr;
    }

    public static float[] illuminantD(float f) {
        float[] fArr = new float[3];
        nIlluminantD(f, fArr);
        return fArr;
    }

    private static native void nCct(float f, float[] fArr);

    private static native void nIlluminantD(float f, float[] fArr);

    public static float[] toLinear(RgbType rgbType, float f, float f2, float f3) {
        return toLinear(rgbType, new float[]{f, f2, f3});
    }

    public static float[] toLinear(RgbType rgbType, float[] fArr) {
        return rgbType == RgbType.LINEAR ? fArr : toLinear(Conversion.ACCURATE, fArr);
    }

    public static float[] toLinear(RgbaType rgbaType, float f, float f2, float f3, float f4) {
        return toLinear(rgbaType, new float[]{f, f2, f3, f4});
    }

    public static float[] toLinear(RgbaType rgbaType, float[] fArr) {
        int i = C174371.$SwitchMap$com$google$android$filament$Colors$RgbaType[rgbaType.ordinal()];
        if (i == 1) {
            toLinear(Conversion.ACCURATE, fArr);
        } else if (i != 2) {
            return i != 3 ? fArr : toLinear(Conversion.ACCURATE, fArr);
        }
        float f = fArr[3];
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        return fArr;
    }

    public static float[] toLinear(Conversion conversion, float[] fArr) {
        int i = C174371.$SwitchMap$com$google$android$filament$Colors$Conversion[conversion.ordinal()];
        int i2 = 0;
        if (i == 1) {
            while (i2 < 3) {
                float f = fArr[i2];
                fArr[i2] = f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
                i2++;
            }
        } else if (i == 2) {
            while (i2 < 3) {
                fArr[i2] = (float) Math.sqrt(fArr[i2]);
                i2++;
            }
        }
        return fArr;
    }
}
