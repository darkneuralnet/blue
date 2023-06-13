package com.stripe.android;

import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.DefaultIntentConfirmationInterceptor", m28418f = "IntentConfirmationInterceptor.kt", m28417i = {0, 0, 0, 1, 1, 1, 1}, m28416l = {183, 190}, m28415m = "handleServerSideConfirmation", m28414n = {"this", "paymentMethod", NamedConstantsKt.SHIPPING_VALUES, "this", "paymentMethod", NamedConstantsKt.SHIPPING_VALUES, FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, m28413s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: com.stripe.android.DefaultIntentConfirmationInterceptor$handleServerSideConfirmation$1 */
/* loaded from: classes6.dex */
public final class C18601xad84b495 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultIntentConfirmationInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18601xad84b495(DefaultIntentConfirmationInterceptor defaultIntentConfirmationInterceptor, Continuation<? super C18601xad84b495> continuation) {
        super(continuation);
        this.this$0 = defaultIntentConfirmationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleServerSideConfirmation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleServerSideConfirmation = this.this$0.handleServerSideConfirmation(null, null, false, null, this);
        return handleServerSideConfirmation;
    }
}
