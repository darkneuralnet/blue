package com.google.android.filament.utils;

import com.google.android.filament.gltfio.FilamentAsset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class ModelViewer$populateScene$popRenderables$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ FilamentAsset $asset;
    final /* synthetic */ Ref.IntRef $count;
    final /* synthetic */ ModelViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelViewer$populateScene$popRenderables$1(Ref.IntRef intRef, FilamentAsset filamentAsset, ModelViewer modelViewer) {
        super(0);
        this.$count = intRef;
        this.$asset = filamentAsset;
        this.this$0 = modelViewer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int[] iArr;
        Ref.IntRef intRef = this.$count;
        FilamentAsset filamentAsset = this.$asset;
        iArr = this.this$0.readyRenderables;
        intRef.element = filamentAsset.popRenderables(iArr);
        return Boolean.valueOf(this.$count.element != 0);
    }
}
