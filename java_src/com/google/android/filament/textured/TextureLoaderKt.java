package com.google.android.filament.textured;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t\u001a\u0010\u0010\b\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"SKIP_BITMAP_COPY", "", "format", "Lcom/google/android/filament/Texture$Format;", "bitmap", "Landroid/graphics/Bitmap;", "internalFormat", "Lcom/google/android/filament/Texture$InternalFormat;", "type", "Lcom/google/android/filament/textured/TextureType;", "loadTexture", "Lcom/google/android/filament/Texture;", "engine", "Lcom/google/android/filament/Engine;", "resources", "Landroid/content/res/Resources;", "resourceId", "", "Lcom/google/android/filament/Texture$Type;", "filament-utils-android_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class TextureLoaderKt {
    public static final boolean SKIP_BITMAP_COPY = true;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextureType.values().length];
            try {
                iArr[TextureType.COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextureType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextureType.DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Texture.Format format(Bitmap bitmap) {
        String name = bitmap.getConfig().name();
        switch (name.hashCode()) {
            case -189895305:
                if (name.equals("ALPHA_8")) {
                    return Texture.Format.ALPHA;
                }
                break;
            case 223337875:
                if (name.equals("ARGB_8888")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1717230432:
                if (name.equals("RGBA_F16")) {
                    return Texture.Format.RGBA;
                }
                break;
            case 1857362722:
                if (name.equals("RGB_565")) {
                    return Texture.Format.RGB;
                }
                break;
        }
        throw new IllegalArgumentException("Unknown bitmap configuration");
    }

    private static final Texture.InternalFormat internalFormat(TextureType textureType) {
        int i = WhenMappings.$EnumSwitchMapping$0[textureType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return Texture.InternalFormat.RGBA8;
                }
                throw new NoWhenBranchMatchedException();
            }
            return Texture.InternalFormat.RGBA8;
        }
        return Texture.InternalFormat.SRGB8_A8;
    }

    public static final Texture loadTexture(Engine engine, Resources resources, int i, TextureType type) {
        boolean z;
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(type, "type");
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (type == TextureType.COLOR) {
            z = true;
        } else {
            z = false;
        }
        options.inPremultiplied = z;
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i, options);
        Texture build = new Texture.Builder().width(decodeResource.getWidth()).height(decodeResource.getHeight()).sampler(Texture.Sampler.SAMPLER_2D).format(internalFormat(type)).levels(KotlinVersion.MAX_COMPONENT_VALUE).build(engine);
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .w…           .build(engine)");
        TextureHelper.setBitmap(engine, build, 0, decodeResource);
        build.generateMipmaps(engine);
        return build;
    }

    private static final Texture.Type type(Bitmap bitmap) {
        String name = bitmap.getConfig().name();
        switch (name.hashCode()) {
            case -189895305:
                if (name.equals("ALPHA_8")) {
                    return Texture.Type.USHORT;
                }
                break;
            case 223337875:
                if (name.equals("ARGB_8888")) {
                    return Texture.Type.UBYTE;
                }
                break;
            case 1717230432:
                if (name.equals("RGBA_F16")) {
                    return Texture.Type.HALF;
                }
                break;
            case 1857362722:
                if (name.equals("RGB_565")) {
                    return Texture.Type.USHORT_565;
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported bitmap configuration");
    }
}
