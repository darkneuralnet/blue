package com.google.p034ar.sceneform.rendering;

import com.google.android.filament.Texture;
import com.google.android.filament.proguard.UsedByNative;
import com.google.p034ar.sceneform.rendering.Texture;
@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.TextureInternalData */
/* loaded from: classes6.dex */
public class TextureInternalData {

    /* renamed from: a */
    public Texture f73908a;

    /* renamed from: b */
    public final Texture.Sampler f73909b;

    @UsedByNative("material_java_wrappers.h")
    public TextureInternalData(com.google.android.filament.Texture texture, Texture.Sampler sampler) {
        this.f73908a = texture;
        this.f73909b = sampler;
    }
}
