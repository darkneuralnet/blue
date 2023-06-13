package com.stripe.android.payments.bankaccount.p044ui;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel", m28418f = "CollectBankAccountViewModel.kt", m28417i = {0, 1, 2}, m28416l = {61, 68, 80, 88}, m28415m = "createFinancialConnectionsSession", m28414n = {"this", "this", "this"}, m28413s = {"L$0", "L$0", "L$0"})
/* renamed from: com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$createFinancialConnectionsSession$1 */
/* loaded from: classes7.dex */
public final class CollectBankAccountViewModel$createFinancialConnectionsSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CollectBankAccountViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountViewModel$createFinancialConnectionsSession$1(CollectBankAccountViewModel collectBankAccountViewModel, Continuation<? super CollectBankAccountViewModel$createFinancialConnectionsSession$1> continuation) {
        super(continuation);
        this.this$0 = collectBankAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createFinancialConnectionsSession(this);
    }
}
