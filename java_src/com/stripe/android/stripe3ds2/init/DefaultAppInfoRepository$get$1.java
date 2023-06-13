package com.stripe.android.stripe3ds2.init;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository", m28418f = "DefaultAppInfoRepository.kt", m28417i = {0}, m28416l = {61}, m28415m = "get", m28414n = {"this"}, m28413s = {"L$0"})
/* loaded from: classes7.dex */
public final class DefaultAppInfoRepository$get$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultAppInfoRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$get$1(DefaultAppInfoRepository defaultAppInfoRepository, Continuation<? super DefaultAppInfoRepository$get$1> continuation) {
        super(continuation);
        this.this$0 = defaultAppInfoRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.get(this);
    }
}
