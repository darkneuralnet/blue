package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m28432d2 = {"", "it", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel$logErrors$2", m28418f = "PartnerAuthViewModel.kt", m28417i = {}, m28416l = {101}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class PartnerAuthViewModel$logErrors$2 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PartnerAuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel$logErrors$2(PartnerAuthViewModel partnerAuthViewModel, Continuation<? super PartnerAuthViewModel$logErrors$2> continuation) {
        super(2, continuation);
        this.this$0 = partnerAuthViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PartnerAuthViewModel$logErrors$2 partnerAuthViewModel$logErrors$2 = new PartnerAuthViewModel$logErrors$2(this.this$0, continuation);
        partnerAuthViewModel$logErrors$2.L$0 = obj;
        return partnerAuthViewModel$logErrors$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Logger logger;
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ((Result) obj).m116792unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            logger = this.this$0.logger;
            logger.error("Error fetching payload / posting AuthSession", th);
            financialConnectionsAnalyticsTracker = this.this$0.eventTracker;
            FinancialConnectionsEvent.Error error = new FinancialConnectionsEvent.Error(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH, th);
            this.label = 1;
            if (financialConnectionsAnalyticsTracker.mo116345trackgIAlus(error, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((PartnerAuthViewModel$logErrors$2) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
