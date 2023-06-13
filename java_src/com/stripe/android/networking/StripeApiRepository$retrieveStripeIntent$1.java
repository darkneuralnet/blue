package com.stripe.android.networking;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.networking.StripeApiRepository", m28418f = "StripeApiRepository.kt", m28417i = {}, m28416l = {SyslogConstants.LOG_LOCAL7, 191}, m28415m = "retrieveStripeIntent$payments_core_release", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class StripeApiRepository$retrieveStripeIntent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StripeApiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$retrieveStripeIntent$1(StripeApiRepository stripeApiRepository, Continuation<? super StripeApiRepository$retrieveStripeIntent$1> continuation) {
        super(continuation);
        this.this$0 = stripeApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveStripeIntent$payments_core_release(null, null, null, this);
    }
}
