package com.stripe.android.financialconnections.features.partnerauth;

import ch.qos.logback.core.net.SyslogConstants;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel", m28418f = "PartnerAuthViewModel.kt", m28417i = {0, 1, 1, 2, 3, 4, 5, 5}, m28416l = {178, 179, SyslogConstants.LOG_LOCAL7, 185, 186, 193}, m28415m = "onAuthCancelled", m28414n = {"this", "this", "authSession", "this", "this", "this", "this", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0", "L$1"})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$onAuthCancelled$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$onAuthCancelled$1(PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$onAuthCancelled$1> continuation) {
        super(continuation);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object onAuthCancelled;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        onAuthCancelled = this.this$0.onAuthCancelled(this);
        return onAuthCancelled;
    }
}
