package com.stripe.android.financialconnections.features.partnerauth;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", m28418f = "PartnerAuthViewModel.kt", m28417i = {0, 1, 1, 2, 2, 3}, m28416l = {205, 206, 209, 211}, m28415m = "completeAuthorizationSession", m28414n = {"this", "this", "authSession", "this", "authSession", "this"}, m28413s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$completeAuthorizationSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$completeAuthorizationSession$1(PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$completeAuthorizationSession$1> continuation) {
        super(continuation);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object completeAuthorizationSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        completeAuthorizationSession = this.this$0.completeAuthorizationSession(this);
        return completeAuthorizationSession;
    }
}