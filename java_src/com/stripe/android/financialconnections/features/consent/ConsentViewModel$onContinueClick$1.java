package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GoNext;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.consent.ConsentViewModel$onContinueClick$1", m28418f = "ConsentViewModel.kt", m28417i = {}, m28416l = {73, 74}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class ConsentViewModel$onContinueClick$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConsentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentViewModel$onContinueClick$1(ConsentViewModel consentViewModel, Continuation<? super ConsentViewModel$onContinueClick$1> continuation) {
        super(1, continuation);
        this.this$0 = consentViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ConsentViewModel$onContinueClick$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        AcceptConsent acceptConsent;
        GoNext goNext;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    goNext = this.this$0.goNext;
                    GoNext.invoke$default(goNext, ((FinancialConnectionsSessionManifest) obj).getNextPane(), null, 2, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((Result) obj).m116792unboximpl();
        } else {
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.ConsentAgree consentAgree = FinancialConnectionsEvent.ConsentAgree.INSTANCE;
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(consentAgree, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        acceptConsent = this.this$0.acceptConsent;
        this.label = 2;
        obj = acceptConsent.invoke(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        goNext = this.this$0.goNext;
        GoNext.invoke$default(goNext, ((FinancialConnectionsSessionManifest) obj).getNextPane(), null, 2, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((ConsentViewModel$onContinueClick$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
