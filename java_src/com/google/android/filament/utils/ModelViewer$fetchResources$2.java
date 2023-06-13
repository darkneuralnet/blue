package com.google.android.filament.utils;

import com.google.android.filament.gltfio.FilamentAsset;
import com.google.android.filament.gltfio.ResourceLoader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.google.android.filament.utils.ModelViewer$fetchResources$2", m28418f = "ModelViewer.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes5.dex */
public final class ModelViewer$fetchResources$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FilamentAsset $asset;
    final /* synthetic */ HashMap<String, Buffer> $items;
    int label;
    final /* synthetic */ ModelViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelViewer$fetchResources$2(HashMap<String, Buffer> hashMap, ModelViewer modelViewer, FilamentAsset filamentAsset, Continuation<? super ModelViewer$fetchResources$2> continuation) {
        super(2, continuation);
        this.$items = hashMap;
        this.this$0 = modelViewer;
        this.$asset = filamentAsset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModelViewer$fetchResources$2(this.$items, this.this$0, this.$asset, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((ModelViewer$fetchResources$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResourceLoader resourceLoader;
        ResourceLoader resourceLoader2;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            for (Map.Entry<String, Buffer> entry : this.$items.entrySet()) {
                resourceLoader2 = this.this$0.resourceLoader;
                resourceLoader2.addResourceData(entry.getKey(), entry.getValue());
            }
            resourceLoader = this.this$0.resourceLoader;
            resourceLoader.asyncBeginLoad(this.$asset);
            this.this$0.animator = this.$asset.getInstance().getAnimator();
            this.$asset.releaseSourceData();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
