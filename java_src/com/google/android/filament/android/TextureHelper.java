package com.google.android.filament.android;

import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
/* loaded from: classes5.dex */
public final class TextureHelper {
    private static final int BITMAP_CONFIG_ALPHA_8 = 0;
    private static final int BITMAP_CONFIG_HARDWARE = 5;
    private static final int BITMAP_CONFIG_RGBA_4444 = 2;
    private static final int BITMAP_CONFIG_RGBA_8888 = 3;
    private static final int BITMAP_CONFIG_RGBA_F16 = 4;
    private static final int BITMAP_CONFIG_RGB_565 = 1;

    /* renamed from: com.google.android.filament.android.TextureHelper$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C174521 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            Bitmap.Config config;
            Bitmap.Config config2;
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr2 = $SwitchMap$android$graphics$Bitmap$Config;
                config2 = Bitmap.Config.RGBA_F16;
                iArr2[config2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr3 = $SwitchMap$android$graphics$Bitmap$Config;
                config = Bitmap.Config.HARDWARE;
                iArr3[config.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private TextureHelper() {
    }

    private static native void nSetBitmap(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6);

    private static native void nSetBitmapWithCallback(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6, Object obj, Runnable runnable);

    public static void setBitmap(Engine engine, Texture texture, int i, Bitmap bitmap) {
        setBitmap(engine, texture, i, 0, 0, texture.getWidth(i), texture.getHeight(i), bitmap);
    }

    private static int toNativeFormat(Bitmap.Config config) {
        int i = C174521.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return i != 6 ? 3 : 5;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void setBitmap(Engine engine, Texture texture, int i, Bitmap bitmap, Object obj, Runnable runnable) {
        setBitmap(engine, texture, i, 0, 0, texture.getWidth(i), texture.getHeight(i), bitmap, obj, runnable);
    }

    public static void setBitmap(Engine engine, Texture texture, int i, int i2, int i3, int i4, int i5, Bitmap bitmap) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), i, i2, i3, i4, i5, bitmap, nativeFormat);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }

    public static void setBitmap(Engine engine, Texture texture, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, Object obj, Runnable runnable) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat != 2 && nativeFormat != 5) {
            nSetBitmapWithCallback(texture.getNativeObject(), engine.getNativeObject(), i, i2, i3, i4, i5, bitmap, nativeFormat, obj, runnable);
            return;
        }
        throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
    }
}
