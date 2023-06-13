package com.stripe.android.financialconnections.features.success;

import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.success.SuccessViewModel$completeSession$1", m28418f = "SuccessViewModel.kt", m28417i = {}, m28416l = {126}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class SuccessViewModel$completeSession$1 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsSession>, Object> {
    int label;
    final /* synthetic */ SuccessViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel$completeSession$1(SuccessViewModel successViewModel, Continuation<? super SuccessViewModel$completeSession$1> continuation) {
        super(1, continuation);
        this.this$0 = successViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SuccessViewModel$completeSession$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
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
            completeFinancialConnectionsSession = this.this$0.completeFinancialConnectionsSession;
            this.label = 1;
            obj = CompleteFinancialConnectionsSession.invoke$default(completeFinancialConnectionsSession, null, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super FinancialConnectionsSession> continuation) {
        return ((SuccessViewModel$completeSession$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
