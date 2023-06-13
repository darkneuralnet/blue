package com.stripe.android.financialconnections.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.GetManifest", m28418f = "GetManifest.kt", m28417i = {}, m28416l = {17}, m28415m = "invoke", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class GetManifest$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetManifest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetManifest$invoke$1(GetManifest getManifest, Continuation<? super GetManifest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getManifest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
