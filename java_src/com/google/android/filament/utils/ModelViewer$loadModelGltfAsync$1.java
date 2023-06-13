package com.google.android.filament.utils;

import com.google.android.filament.gltfio.FilamentAsset;
import java.nio.Buffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.google.android.filament.utils.ModelViewer$loadModelGltfAsync$1", m28418f = "ModelViewer.kt", m28417i = {}, m28416l = {219}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes5.dex */
public final class ModelViewer$loadModelGltfAsync$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Buffer> $callback;
    int label;
    final /* synthetic */ ModelViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModelViewer$loadModelGltfAsync$1(ModelViewer modelViewer, Function1<? super String, ? extends Buffer> function1, Continuation<? super ModelViewer$loadModelGltfAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = modelViewer;
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModelViewer$loadModelGltfAsync$1(this.this$0, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((ModelViewer$loadModelGltfAsync$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object fetchResources;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ModelViewer modelViewer = this.this$0;
            FilamentAsset asset = modelViewer.getAsset();
            Intrinsics.checkNotNull(asset);
            Function1<String, Buffer> function1 = this.$callback;
            this.label = 1;
            fetchResources = modelViewer.fetchResources(asset, function1, this);
            if (fetchResources == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
