package com.google.p034ar.sceneform.rendering;

import com.google.android.filament.proguard.UsedByNative;
@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.Texture */
/* loaded from: classes6.dex */
public class Texture {

    /* renamed from: a */
    public final TextureInternalData f73904a;

    @UsedByNative("material_java_wrappers.h")
    /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler */
    /* loaded from: classes6.dex */
    public static class Sampler {

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter */
        /* loaded from: classes6.dex */
        public enum MagFilter {
            NEAREST,
            LINEAR
        }

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter */
        /* loaded from: classes6.dex */
        public enum MinFilter {
            NEAREST,
            LINEAR,
            NEAREST_MIPMAP_NEAREST,
            LINEAR_MIPMAP_NEAREST,
            NEAREST_MIPMAP_LINEAR,
            LINEAR_MIPMAP_LINEAR
        }

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode */
        /* loaded from: classes6.dex */
        public enum WrapMode {
            CLAMP_TO_EDGE,
            REPEAT,
            MIRRORED_REPEAT
        }
    }

    @UsedByNative("material_java_wrappers.h")
    private Texture(TextureInternalData textureInternalData) {
        this.f73904a = textureInternalData;
    }
}
