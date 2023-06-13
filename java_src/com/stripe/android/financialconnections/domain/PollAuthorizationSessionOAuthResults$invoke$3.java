package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
@Metadata(m28433d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults$invoke$3", m28418f = "PollAuthorizationSessionOAuthResults.kt", m28417i = {}, m28416l = {29}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PollAuthorizationSessionOAuthResults$invoke$3 extends SuspendLambda implements Function1<Continuation<? super MixedOAuthParams>, Object> {
    final /* synthetic */ FinancialConnectionsAuthorizationSession $session;
    int label;
    final /* synthetic */ PollAuthorizationSessionOAuthResults this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAuthorizationSessionOAuthResults$invoke$3(PollAuthorizationSessionOAuthResults pollAuthorizationSessionOAuthResults, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, Continuation<? super PollAuthorizationSessionOAuthResults$invoke$3> continuation) {
        super(1, continuation);
        this.this$0 = pollAuthorizationSessionOAuthResults;
        this.$session = financialConnectionsAuthorizationSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PollAuthorizationSessionOAuthResults$invoke$3(this.this$0, this.$session, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        FinancialConnectionsRepository financialConnectionsRepository;
        FinancialConnectionsSheet.Configuration configuration;
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
            financialConnectionsRepository = this.this$0.repository;
            configuration = this.this$0.configuration;
            String financialConnectionsSessionClientSecret = configuration.getFinancialConnectionsSessionClientSecret();
            String id = this.$session.getId();
            this.label = 1;
            obj = financialConnectionsRepository.postAuthorizationSessionOAuthResults(financialConnectionsSessionClientSecret, id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super MixedOAuthParams> continuation) {
        return ((PollAuthorizationSessionOAuthResults$invoke$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
