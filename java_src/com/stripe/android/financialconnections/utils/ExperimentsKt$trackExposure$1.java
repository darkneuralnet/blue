package com.stripe.android.financialconnections.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.utils.ExperimentsKt", m28418f = "Experiments.kt", m28417i = {}, m28416l = {26}, m28415m = "trackExposure", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ExperimentsKt$trackExposure$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ExperimentsKt$trackExposure$1(Continuation<? super ExperimentsKt$trackExposure$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ExperimentsKt.trackExposure(null, null, null, this);
    }
}
